package com.abctech.transition.core.dao;


import com.abctech.transition.core.dao.partnerlogin.PartnerLoginDAO;
import com.abctech.transition.core.dao.valuemap.ValueMapDAO;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.enumeration.FileType;
import com.abctech.transition.core.exception.InternalConsistencyException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;


public class DatabaseCreator {
    private final static Logger log = LoggerFactory.getLogger(DatabaseCreator.class);
    private static final int NOT_FOUND = 0;
    private static final String NEWLINE = "\n\n";
    private boolean production = false;
    private boolean shouldCheckDatabase = true;

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private ValueMapDAO valueMapDAO;
    
    @Autowired
    private PartnerLoginDAO partnerLoginDAO;

    public void setProduction(boolean isProduction) {
        production = isProduction;
    }

    /**
     * This method should only be used in junit tests.
     */
    public synchronized DatabaseCreator dropDatabaseForJunit() {
        shouldCheckDatabase = true;

        jdbcTemplate.execute("DROP TABLE IF EXISTS valuemap;");
        jdbcTemplate.execute("DROP TABLE IF EXISTS mediastate;");
        jdbcTemplate.execute("DROP TABLE IF EXISTS adstate;");
        jdbcTemplate.execute("DROP TABLE IF EXISTS filestate;");
        jdbcTemplate.execute("DROP TABLE if EXISTS clientmap;");
        jdbcTemplate.execute("DROP TABLE if EXISTS errorlog;");
        jdbcTemplate.execute("DROP TABLE if EXISTS partnermap;");
        jdbcTemplate.execute("DROP TABLE if EXISTS partnerlogin; ");
        jdbcTemplate.execute("DROP TABLE if EXISTS ftprouterstatus; ");
        jdbcTemplate.execute("DROP TABLE if EXISTS schedulerstatus; ");
        return this;
    }

    public synchronized void checkDatabase() {
        log.debug("Should we checkDatabase? " + (shouldCheckDatabase ? " yes" : " no"));
        if (shouldCheckDatabase) {
            shouldCheckDatabase = false;
            createDatabaseIfTablesAreMissing();
            clearUnsedPartnermapVAlue_BKK_881_22_23();
            clearOldValuemapIadifestateforsaleForReinsertNewData_BKK_881_22_23();
            clearOldPArtnerLoginIadifestateforsaleForReinsertNewData_BKK_881_22_23();
            populateWithCustomerData();
            alterCronColumnStatusTable_BKK797_021_022();
            //clearOldValueInSchedulerStatusForReInit_BKK797_21_22();
            initSchedulerStatus();
            addReceiptToPartnerLogin_BKK813_21_22();
            cascadeInFileState_BKK876_022_023();
        }
    }

    public void cascadeInFileState_BKK876_022_023() { // NOSONAR Method name is OK here.
        try {
        	//Delete error first
        	jdbcTemplate.execute("DELETE FROM filestate WHERE parent_id NOT IN (SELECT id FROM (SELECT id FROM filestate) AS abc)");
            jdbcTemplate.execute("ALTER TABLE filestate ADD CONSTRAINT FK_parentid_id FOREIGN KEY (parent_id) REFERENCES filestate(id) ON DELETE CASCADE ON UPDATE CASCADE");
        } catch (DataAccessException e) {
           //log.debug("Error while excuting cascade definition!", e);
        }

    }

    /*
    private void createIndexOnFilestate_BKK730_020_021() { // NOSONAR Method name is OK here.
        try {
            jdbcTemplate.execute("CREATE INDEX index_createdtime_on_filestate ON filestate (createdtime);");
        } catch (DataAccessException e) {
            // Already have indexes on filestate....
        }
    }
	*/
    public void newColumnInFileState_BKK769_BKK772_BKK773_BKK774_020_021() { // NOSONAR Method name is OK here.
        //parent_id BIGINT, filetype INT NOT NULL, filepath varchar(120)
        log.debug(NEWLINE);
        try {//check
            jdbcTemplate.queryForInt("SELECT COUNT(parent_id) FROM filestate;");
        } catch (DataAccessException e) { // Doesn't have updatedtime column in valuemap, Added updatedtime to valuemap
            log.debug("Column parent_id does not exist in filestate table. Added column...");
            jdbcTemplate.execute("ALTER TABLE filestate ADD parent_id BIGINT;");
            jdbcTemplate.execute("ALTER TABLE filestate ADD filetype INT NOT NULL;");
            jdbcTemplate.execute("ALTER TABLE filestate ADD filepath varchar(120);");
            jdbcTemplate.execute("UPDATE filestate SET filetype = " + FileType.NO_DEFINE.toNumberValue() + ";");

        }
        log.debug(NEWLINE);
    }

    /**
     * BKK-637 : Add timestamp (column updatedtime) in valuemap for store updated time.
     */
    public void addValuemapUpdatedTime_BKK637_020_021() { // NOSONAR Method name is OK here.
        // Check column updatedtime in valuemap
        log.debug(NEWLINE);
        try { // if updatedtime does not exist in valuemap. It will make error MySQLSyntaxErrorException
            jdbcTemplate.queryForInt("SELECT COUNT(updatedtime) FROM valuemap;");
        } catch (DataAccessException e) { // Doesn't have updatedtime column in valuemap, Added updatedtime to valuemap
            log.debug("Column updatedtime does not exist in valuemap table. Added column...");
            jdbcTemplate.execute("ALTER TABLE valuemap ADD updatedtime numeric(15) NOT NULL;"); // add updatedtime column
            jdbcTemplate.execute("UPDATE valuemap SET updatedtime = 1311147487320"); // set default timstamp value
            jdbcTemplate.execute("ALTER TABLE valuemap ADD INDEX index_updatedtime_on_valuemap (updatedtime);"); // add index
        }
        log.debug(NEWLINE);
    }

    private void alterCronColumnStatusTable_BKK797_021_022() {      // NOSONAR Method name is OK here.
        try {
            jdbcTemplate.execute(" alter table schedulerstatus modify crontrigger VARCHAR(200); ");
        } catch(Exception e) {  // NOSONAR Don't care, cause only temporary
            // schedulerstatus not exist
        }
    }
    /*
    private void initQuartzStatusData_BKK733_BKK733_020_021() {  // NOSONAR Method name is OK here.
        try {
            jdbcTemplate.queryForRowSet("SELECT * FROM schedulerstatus LIMIT 1");

        } catch (Exception e) { // NOSONAR Don't care, cause only temporary
            jdbcTemplate.update("CREATE TABLE schedulerstatus (id BIGINT AUTO_INCREMENT NOT NULL,schedulername VARCHAR(50) NOT NULL, customerformat VARCHAR(50) NOT NULL, clientname VARCHAR(50) NOT NULL, crontrigger VARCHAR(200) NOT NULL,active INT  NOT NULL,PRIMARY KEY (id))TYPE=INNODB  CHARSET=UTF8 COLLATE utf8_general_ci;");
            initSchedulerStatus();
        }
    }
	*/
    /*
    private void removeURLColumnInQuartzStatusTableIfExist_BKK733_020_021() { // NOSONAR Method name is OK here.
        try {
            jdbcTemplate.update(" alter table schedulerstatus DROP COLUMN url ");
            //jdbcTemplate.update(" DROP TABLE if EXISTS schedulerstatus  ");

        } catch (Exception e) { // NOSONAR Don't care, cause only temporary
            //log.error("Failed to recreate schedulerstatus table.", e);
        }
    }
	*/
    private void createDatabaseIfTablesAreMissing() {
        try {
            for (String tbl : new String[]{"valuemap", "partnerlogin", "partnermap"}) {
                String sql = "SELECT count(*) FROM ";
                // Dummy query will throw exception if it failed:
                jdbcTemplate.queryForInt(sql + tbl);

            }
            // We did not fail, and therefore we presume that the database contains tables and data
            return;
        } catch (DataAccessException ex) {
            // Expected
            log.error(ex.getMessage());
        }
        log.debug("Create tables and populate database with contents, as we did not find a populated table.");
        initDatabase();
    }

    private void initDatabase() {
        log.debug("Initializing database for first time use");
        String sqlFileName = "mysql_transitionstate_script.sql";
        try {
            readAndInsertBySqlStatements(sqlFileName);
        } catch (IOException e) {
            throw new InternalConsistencyException("Could not read " + sqlFileName, e);
        }
    }

    private boolean readAndInsertBySqlStatements(String sqlFileName) throws IOException {
        BufferedInputStream fis = new BufferedInputStream(DatabaseCreator.class.getClassLoader().getResourceAsStream(sqlFileName));
        InputStreamReader is = new InputStreamReader(fis);
        BufferedReader bfr = new BufferedReader(is);
        try {
            String line = bfr.readLine();
            while (line != null) {
                if (!"".equals(line) && !line.startsWith("#")) {
                    if (!production) {
                        // IDENTITY is not understood in Mysql, and AUTO_INCREMENT is not understood by hsql.
                        line = line.replaceAll("AUTO_INCREMENT", "GENERATED ALWAYS AS IDENTITY (START WITH 1)");
                        line = line.replaceAll("LONGTEXT", "LONGVARCHAR");
                        line = line.replaceAll("TYPE=INNODB", " ");
                        line = line.replaceAll("CHARSET=UTF8", " ");
                        line = line.replaceAll("COLLATE utf8_general_ci", " ");
                    }
                    //log.debug("Executing: " + line);
                    jdbcTemplate.execute(line);
                }
                line = bfr.readLine();
            }
        } finally {
            try {
                bfr.close();
                is.close();
                fis.close();
            } catch (IOException e) {
                log.error("Failed to close the streams - not important", e);
            }
        }
        return true;
    }

    /**
     * Check the database if it's contains required data for each customer format.
     * Try to populate with customer data if data is not exists.
     */
    private void populateWithCustomerData() {
        for (CustomerFormat customerFormat : CustomerFormat.values()) {
            if (!customerFormat.toTextValue().equals(CustomerFormat.UNSUPPORTED.toTextValue())) {
                checkForDataExistance(customerFormat);
            }
        }
    }

    /**
     * Check valuemap table if required mapping data is exist.
     * If not exist, then try to populate it data.
     *
     * @param customerFormat to check
     */
    private void checkForDataExistance(CustomerFormat customerFormat) {

        // If there is no data in valuemap, partnerlogin. We can assume that this is new format.
        if (valueMapDAO.countByFormat(customerFormat) == NOT_FOUND && partnerLoginDAO.countByFormat(customerFormat) == NOT_FOUND) {
            StringBuilder filePath = new StringBuilder();
            filePath.append("customer/").append(customerFormat.toTextValue()).append(".sql");
            log.info("\n\n No data found for Customer format \'" + customerFormat.toTextValue() + "\'. Assuming this is a new format. Try to load data from \'" + filePath.toString() + "\'\n");
            try {
                readAndInsertBySqlStatements(filePath.toString());
            } catch (IOException e) {
                throw new InternalConsistencyException("Could not find data file to load for \'" + customerFormat.toTextValue() + "\' (" + filePath.toString() + ")", e);
            }
        }
    }

    /**
     * Init data in schedulerstatus table.
     */
    private void initSchedulerStatus() {

        String sqlFileName = "initschedulerstatus.sql";
        try {
            List rows = jdbcTemplate.queryForList("SELECT * FROM schedulerstatus LIMIT 1");
            if (rows == null || rows.size() == 0) {
                readAndInsertBySqlStatements(sqlFileName);
            }
        } catch (IOException e) {
            throw new InternalConsistencyException("Could not find data file to load for : " + sqlFileName, e);
        } catch (Exception e) {
            throw new InternalConsistencyException("Could not initDatabase data in schedulerstatus", e);
        }
    }

    private void addReceiptToPartnerLogin_BKK813_21_22(){      // NOSONAR Method name is OK here.
        try {
            jdbcTemplate.execute("SELECT receipt FROM partnerlogin ;");
        }catch (Exception e){
            jdbcTemplate.execute("ALTER  TABLE  partnerlogin ADD receipt INT(1) NOT NULL DEFAULT 0;");
        }
    }

    private void clearOldValuemapIadifestateforsaleForReinsertNewData_BKK_881_22_23() {    // NOSONAR Method name is OK here.

        try {

            jdbcTemplate.update(" DELETE FROM valuemap WHERE format = 'iadifestateforsale' ; ");
        } catch (Exception e) {
            throw new InternalConsistencyException("Could not clear data in valuemap", e);
        }
    }

    private void clearOldPArtnerLoginIadifestateforsaleForReinsertNewData_BKK_881_22_23() {    // NOSONAR Method name is OK here.

        try {

            jdbcTemplate.update(" DELETE FROM partnerlogin WHERE customerformat = 'iadifestateforsale' ; ");
        } catch (Exception e) {
            throw new InternalConsistencyException("Could not clear data in partnerlogin", e);
        }
    }

    private void clearUnsedPartnermapVAlue_BKK_881_22_23() {

        try {

            jdbcTemplate.update(" DELETE FROM partnermap WHERE description = 'iadifmmo' ; ");
        } catch (Exception e) {
            throw new InternalConsistencyException("Could not clear data in partnerlogin", e);
        }
    }

}
