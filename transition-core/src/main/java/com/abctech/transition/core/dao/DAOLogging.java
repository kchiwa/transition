package com.abctech.transition.core.dao;

public class DAOLogging {
    private long startTime;

     /**
     * Factory which give you a starting point to logging
     */
    public static DAOLogging start() {
        DAOLogging daoLogging = new DAOLogging();
        daoLogging.startTime = System.currentTimeMillis();
        return daoLogging;
    }

    /**
     * Get the DAO Logging Information as a string for debug / logging purposes
     *
     * @param information such as function name or class name that using this method
     * @param dataSource DB or Memcached
     * @param numberOfRecord  number of return record
     */
    public String finish(String information, String dataSource, int numberOfRecord) {
        long diffTime = (System.currentTimeMillis() - this.startTime);
        return information + ". Get data from : " + dataSource + " , using time : " + diffTime + " ms. Return : " + numberOfRecord +" Record(s)." ;
    }
}
