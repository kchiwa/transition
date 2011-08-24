package com.abctech.transition.webapp.adminPing;

import com.abctech.transition.core.exception.TransitionUnexpectedException;
import com.abctech.transition.webapp.model.SystemCheckModel;
import no.api.hydra.admin.HydraAdminPingQuery;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;

/**
 * @author Pun (pun@abctech-thailand.com)
 * @since 2011-04-20
 */
public class PingTransition implements HydraAdminPingQuery {
    private static final int PASS_SCORE = 90;
    private static final int FULL_SCORE = 100;
    private static final int MAJOR_FAILURE = 45;
    private static final int MINOR_FAILURE = 10;
    //private static final Logger log = LoggerFactory.getLogger(PingTransition.class);
    private ServletContext servletContext;
    private String reason;

    /**
     * Tesing Transition if the app is ready to use. The app is ready to use if it has 90 or more score.
     * If ftp/media/production folders are inaccessible then -45 score
     * If database is not accessible then -45 score
     * If MemCached is not accessible or disabled then -10 score.
     *
     * This mean folders accessibility and database connection is crucial for system. MemCached is optional.
     * .
     * @return Boolean status of the system
     */
    @Override
    public boolean canWebappBeUsed() {
        return upPercentage() >= PASS_SCORE;
    }

    @Override
    public String getAboutInformation() {
        return "Testing if the ftp/media/production folders are accessible, database and MemCached is up. If a folder is \n" +
                "inaccessible or the database is not working, the service is considered as down. MemCached is optional.";
    }

    /**
     *  Status YELLOW when MemCached is disabled or not accessible. MemCached is optional for Transition
     *
     * @return yellowWaterMark level
     */
    @Override
    public int yellowWaterMark() {
        return PASS_SCORE;
    }

    /**
     * Checking system status using SystemCheck. Checking folders accessibility, database connection and MemCached status.
     *
     * @return score of the system
     */
    @Override
    public int upPercentage() {
        ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        if ( ctx == null ) {
            throw new TransitionUnexpectedException("Application context is null. This is illegal, unexpected and just plain wrong.");
        }
        SystemCheck systemCheck = ctx.getBean("systemCheck", SystemCheck.class);
        StringBuilder reasons = new StringBuilder();
        int systemUpPercentage = FULL_SCORE;
        SystemCheckModel systemCheckModel = new SystemCheckModel();
        StringBuilder sb = new StringBuilder();
        sb.append("\nSystem checking ::\n\n");
        sb.append(systemCheck.testAccessibility(systemCheckModel));
        sb.append(systemCheck.testDB(systemCheckModel));
        sb.append(systemCheck.testMemcached(systemCheckModel));
        //systemCheckModel = systemCheck.getSystemCheckModel();
        if ((systemCheckModel.getFtpPathError() != null && systemCheckModel.getFtpPathError().length() > 0) ||
                (systemCheckModel.getMediaPathError() != null && systemCheckModel.getMediaPathError().length() > 0) ||
                (systemCheckModel.getProductionImagePathError() != null && systemCheckModel.getProductionImagePathError().length() > 0) ||
                (systemCheckModel.getProductionFilePathError() != null && systemCheckModel.getProductionFilePathError().length() > 0)) {
            systemUpPercentage -= MAJOR_FAILURE;
            reasons.append("ftp, media and production paths are inaccessible\n");
        }
        if (systemCheckModel.getDbError() != null && systemCheckModel.getDbError().length() > 0) {
            systemUpPercentage -= MAJOR_FAILURE;
            reasons.append(systemCheckModel.getDbError());
        }
        if (systemCheckModel.getMemCachedError() != null && systemCheckModel.getMemCachedError().length() > 0) {
            systemUpPercentage -= MINOR_FAILURE;
            reasons.append(systemCheckModel.getMemCachedError());
        }
        reason = reasons.toString();
        return systemUpPercentage;
    }

    @Override
    public String getReason() {
        return reason;
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

    @Override
    public ServletContext getServletContext() {
        return servletContext;
    }
}
