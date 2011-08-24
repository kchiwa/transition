package com.abctech.transition.core.dao.search;

import com.abctech.transition.core.dao.filestate.FileStateModel;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pun (pun@abctech-thailand.com)
 * @since 2011-03-08
 */
public class FileFormatInformationBean {
    private static final String ERR = "err";
    private static final String WARNING = "warning";
    private static final String OK = "ok";
    private static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    private static final int THREE_DAYS = 3;
    private static final int ONE_WEEK = 1;
    private String format;
    private String fileName;
    private String createdTime;
    private long timeDifference;
    private long lastUpdateNumber;
    private String lastUpdateUnit;
    private String css = OK;
    private static final int A_THOUSAND = 1000;
    private static final int SIXTY = 60;
    private static final int TWENTY_FOUR = 24;
    private static final int SEVEN = 7;
    private static final int FOUR = 4;
    private static final String SECOND = "second(s) ago";
    private static final String MINUTE = "minute(s) ago";
    private static final String HOUR = "hour(s) ago";
    private static final String DAY = "day(s) ago";
    private static final String WEEK = "week(s) ago";
    private static final String MONTH = "month(s) ago";
    private static final long SECOND_IN_MIL = A_THOUSAND;
    private static final long MINUTE_IN_MIL = SECOND_IN_MIL * SIXTY;
    private static final long HOUR_IN_MIL = MINUTE_IN_MIL * SIXTY;
    private static final long DAY_IN_MIL = HOUR_IN_MIL * TWENTY_FOUR;
    private static final long WEEK_IN_MIL = DAY_IN_MIL * SEVEN;
    private static final long MONTH_IN_MIL = WEEK_IN_MIL * FOUR;

    public FileFormatInformationBean(){}

    public FileFormatInformationBean(FileStateModel fileStateModel){
        this.format = fileStateModel.getCustomerFormat();
        this.fileName = fileStateModel.getFileName();
        DateTimeFormatter formatter = DateTimeFormat.forPattern(DATE_TIME_FORMAT);
        this.createdTime = fileStateModel.getCreatedTime().toString(formatter);
        Long currentTime = new DateTime().getMillis();
        this.timeDifference = currentTime - fileStateModel.getCreatedTime().getMillis();

        if (timeDifference > MONTH_IN_MIL) {
            lastUpdateUnit = MONTH;
            lastUpdateNumber = timeDifference / MONTH_IN_MIL;
            css = ERR;
        } else if (timeDifference > WEEK_IN_MIL) {
            lastUpdateUnit = WEEK;
            lastUpdateNumber = timeDifference / WEEK_IN_MIL;
            if (lastUpdateNumber > ONE_WEEK) {
                css = ERR;
            }
        } else if (timeDifference > DAY_IN_MIL) {
            lastUpdateUnit = DAY;
            lastUpdateNumber = timeDifference / DAY_IN_MIL;
            if (lastUpdateNumber > THREE_DAYS) {
                css = WARNING;
            }
        } else if (timeDifference > HOUR_IN_MIL) {
            lastUpdateUnit = HOUR;
            lastUpdateNumber = timeDifference / HOUR_IN_MIL;
        } else if (timeDifference > MINUTE_IN_MIL) {
            lastUpdateUnit = MINUTE;
            lastUpdateNumber = timeDifference / MINUTE_IN_MIL;
        } else {
            lastUpdateUnit = SECOND;
            lastUpdateNumber = timeDifference / SECOND_IN_MIL;
        }
    }

    public List<FileFormatInformationBean> createFileFormatInformationBeanByList(List<FileStateModel> fileStateModelList){
        List<FileFormatInformationBean> fileFormatInformationBeanList = new ArrayList<FileFormatInformationBean>();
        for (FileStateModel fileStateModel : fileStateModelList) {
            FileFormatInformationBean fileFormatInformationBean = new FileFormatInformationBean(fileStateModel);
            fileFormatInformationBeanList.add(fileFormatInformationBean);
        }
        return fileFormatInformationBeanList;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public long getTimeDifference() {
        return timeDifference;
    }

    public void setTimeDifference(long timeDifference) {
        this.timeDifference = timeDifference;
    }

    public long getLastUpdateNumber() {
        return lastUpdateNumber;
    }

    public void setLastUpdateNumber(long lastUpdateNumber) {
        this.lastUpdateNumber = lastUpdateNumber;
    }

    public String getLastUpdateUnit() {
        return lastUpdateUnit;
    }

    public void setLastUpdateUnit(String lastUpdateUnit) {
        this.lastUpdateUnit = lastUpdateUnit;
    }

    public String getCss() {
        return css;
    }

    public void setCss(String css) {
        this.css = css;
    }
}
