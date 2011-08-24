package com.abctech.transition.webapp.model;

/**
 * @author Pun (pun@abctech-thailand.com)
 * @since 2011-03-23
 */
public class SystemCheckModel {
    private String ftpPath;
    private String mediaPath;
    private String productionImagePath;
    private String productionFilePath;
    private String ftpPathError;
    private String mediaPathError;
    private String productionImagePathError;
    private String productionFilePathError;
    private String dbError;
    private String memCachedError;

    public String getFtpPath() {
        return ftpPath;
    }

    public void setFtpPath(String ftpPath) {
        this.ftpPath = ftpPath;
    }

    public String getMediaPath() {
        return mediaPath;
    }

    public void setMediaPath(String mediaPath) {
        this.mediaPath = mediaPath;
    }

    public String getFtpPathError() {
        return ftpPathError;
    }

    public void setFtpPathError(String ftpPathError) {
        this.ftpPathError = ftpPathError;
    }

    public String getMediaPathError() {
        return mediaPathError;
    }

    public void setMediaPathError(String mediaPathError) {
        this.mediaPathError = mediaPathError;
    }

    public String getDbError() {
        return dbError;
    }

    public void setDbError(String dbError) {
        this.dbError = dbError;
    }

    public String getMemCachedError() {
        return memCachedError;
    }

    public void setMemCachedError(String memCachedError) {
        this.memCachedError = memCachedError;
    }

    public String getProductionImagePath() {
        return productionImagePath;
    }

    public void setProductionImagePath(String productionImagePath) {
        this.productionImagePath = productionImagePath;
    }

    public String getProductionFilePath() {
        return productionFilePath;
    }

    public void setProductionFilePath(String productionFilePath) {
        this.productionFilePath = productionFilePath;
    }

    public String getProductionImagePathError() {
        return productionImagePathError;
    }

    public void setProductionImagePathError(String productionImagePathError) {
        this.productionImagePathError = productionImagePathError;
    }

    public String getProductionFilePathError() {
        return productionFilePathError;
    }

    public void setProductionFilePathError(String productionFilePathError) {
        this.productionFilePathError = productionFilePathError;
    }
}
