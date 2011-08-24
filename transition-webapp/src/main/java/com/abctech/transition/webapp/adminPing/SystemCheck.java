package com.abctech.transition.webapp.adminPing;

import com.abctech.transition.core.TransitionProperties;
import com.abctech.transition.core.dao.TransitionSpringContext;
import com.abctech.transition.core.dao.filestate.FileStateModel;
import com.abctech.transition.core.memcached.MemcachedTransactionManager;
import com.abctech.transition.webapp.model.SystemCheckModel;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author Pun (pun@abctech-thailand.com)
 * @since 2011-04-20
 */
public class SystemCheck {
    private static final String OK = "OK\n";
    private static final String FAILED_CAP = "FAILED";
    private static final String TEST_FILE = "/.testFile.test";
    private static final String FAILED = FAILED_CAP + "\n";
    private Logger log = LoggerFactory.getLogger(SystemCheck.class);
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private TransitionProperties transitionProperties;

    @Autowired
    private MemcachedTransactionManager memcachedTransactionManager;

    /**
     * Checking accessibility for system path variable. FTP, media and production paths.
     * Also tries to write and read file. And then remove the test file.
     *
     * @return String result
     */
    public String testAccessibility(SystemCheckModel systemCheckModel) {

        StringBuilder sb = new StringBuilder();
        systemCheckModel.setFtpPath(transitionProperties.getFtpPath());
        systemCheckModel.setMediaPath(transitionProperties.getMediaPath());
        systemCheckModel.setProductionImagePath(transitionProperties.getProductionImagePath());
        systemCheckModel.setProductionFilePath(transitionProperties.getProductionFilePath());
        File testFile = null;
        // Test read/write ftp path
        try {
            testFile = new File(systemCheckModel.getFtpPath() + TEST_FILE);
            sb.append("\tFTPPath (").append(systemCheckModel.getFtpPath()).append(")...  \t\t");

            writeMessageToFile(testFile);
            FileUtils.readFileToString(testFile);
            sb.append(OK);

        } catch (IOException e) {
            sb.append(FAILED);
            systemCheckModel.setFtpPathError(e.getMessage());
            log.error(e.getMessage(), e);
        } finally {
            FileUtils.deleteQuietly(testFile);
        }
        // Test read/write media path
        try {
            testFile = new File(systemCheckModel.getMediaPath() + TEST_FILE);
            sb.append("\tMediaPath (").append(systemCheckModel.getMediaPath()).append(")...  \t\t");
            writeMessageToFile(testFile);
            FileUtils.readFileToString(testFile);
            sb.append(OK);

        } catch (IOException e) {
            sb.append(FAILED);
            systemCheckModel.setMediaPathError(e.getMessage());
            log.error(e.getMessage(), e);
        } finally {
            FileUtils.deleteQuietly(testFile);
        }
        // Test read/write production image path
        try {
            testFile = new File(systemCheckModel.getProductionImagePath() + TEST_FILE);
            sb.append("\tProdImagePath (").append(systemCheckModel.getProductionImagePath()).append(")...  \t");
            writeMessageToFile(testFile);
            FileUtils.readFileToString(testFile);
            sb.append(OK);

        } catch (IOException e) {
            sb.append(FAILED);
            systemCheckModel.setProductionImagePathError(e.getMessage());
            log.error(e.getMessage(), e);
        } finally {
            FileUtils.deleteQuietly(testFile);
        }
        // Test read/write production file path
        try {
            testFile = new File(systemCheckModel.getProductionFilePath() + TEST_FILE);
            sb.append("\tProdFilePath (").append(systemCheckModel.getProductionFilePath()).append(")...  \t");
            writeMessageToFile(testFile);
            FileUtils.readFileToString(testFile);
            sb.append(OK);

        } catch (IOException e) {
            sb.append(FAILED);
            systemCheckModel.setProductionFilePathError(e.getMessage());
            log.error(e.getMessage(), e);
        } finally {
            FileUtils.deleteQuietly(testFile);
        }
        return sb.toString();
    }

    private void writeMessageToFile(File testFile) throws IOException {
        FileUtils.writeStringToFile(testFile, "Test data");
    }

    /**
     * Test database connection and tries to queries for tables in database.
     *
     * @return Database connection status
     */
    public String testDB(SystemCheckModel systemCheckModel) {

        StringBuilder sb = new StringBuilder();
        sb.append("\tDatabase...  \t\t\t\t");
        String testSQL = "SHOW TABLES";
        try {
            List<String> tableList = jdbcTemplate.queryForList(testSQL, String.class);
            if (tableList != null && tableList.size() > 0) {
                sb.append(OK);
            } else {
                sb.append(FAILED_CAP + " (Can connect to database but found no table)\n");
                systemCheckModel.setDbError("Can connect to database but found no table");
                log.error("Can connect to database but found no table.");
            }
        } catch (DataAccessException e) {
            sb.append(FAILED);
            systemCheckModel.setDbError(e.getMessage());
            log.error("Got problem accessing database...", e);
        }
        return sb.toString();
    }

    /**
     * Check MemCached server. Tries to put an object in MemCached and then retrieve.
     *
     * @return String checking result
     */
    public String testMemcached(SystemCheckModel systemCheckModel) {

        StringBuilder sb = new StringBuilder();
        String memcachedServerHost = TransitionSpringContext.getTransitionProperties().getMemcachedServerHost();
        if (memcachedServerHost == null || memcachedServerHost.equals("") || memcachedServerHost.equals("disabled")) {
            sb.append("\tMemcached is disabled!");
            systemCheckModel.setMemCachedError("Disabled");
        } else {
            String testKey = "testKey";
            FileStateModel testAdStateModel = new FileStateModel();
            sb.append("\tMemCached...  \t\t\t\t");
            if (memcachedTransactionManager.set(testKey, testAdStateModel)) {
                FileStateModel fileStateModel = (FileStateModel) memcachedTransactionManager.get(testKey);
                if (fileStateModel != null) {
                    sb.append("OK");
                } else {
                    sb.append(FAILED_CAP + " (Could not get the object from MemCached)");
                    systemCheckModel.setMemCachedError("Could not get the object from MemCached");
                    log.error("Could not get the object from MemCached.");
                }
            } else {
                sb.append(FAILED_CAP + " (Could not connect to MemCached server)");
                systemCheckModel.setMemCachedError("Could not connect to MemCached server");
                log.error("Could not connect to MemCached server.");
            }
        }

        return sb.append("\n").toString();
    }

}
