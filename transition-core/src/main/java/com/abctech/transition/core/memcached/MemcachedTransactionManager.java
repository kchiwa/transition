package com.abctech.transition.core.memcached;

import com.abctech.transition.core.TransitionProperties;
import com.danga.MemCached.MemCachedClient;
import com.danga.MemCached.SockIOPool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemcachedTransactionManager implements InitializingBean {

    private static final Logger log = LoggerFactory.getLogger(MemcachedTransactionManager.class);

    private MemCachedClient memCachedClient;
    private boolean cacheEnabled = true;

    @Autowired
    private TransitionProperties transitionProperties;

    private static final int INITIAL_CON_NUMBER = 5;
    private static final int INITIAL_CON_MIN_NUMBER = 5;
    private static final int INITIAL_CON_MAX_NUMBER = 250;
    private static final int MAX_IDLE_TIME = 1000 * 60 * 60 * 6;
    private static final int WAKE_UP_TIME_EVERY = 30;
    private static final int READ_TIMEOUT = 3000;
    private static final int CONNECTION_TIMEOUT = 0;
    private static final int MIN_SIZE_TO_COMPRESSION = 64 * 1024;

    //define key for search in memcached
    public static final String AD_STATE = "adstate_";
    public static final String FILE_STATE = "filestate_";
    public static final String MEDIA_STATE = "mediastate_";
    public static final String PARTNER_LOGIN = "partnerlogin_";
    public static final String PARTNER_MAP = "partnermap_";
    public static final String VALUEMAP = "valuemap_";

    @Override
    public void afterPropertiesSet() {
        memCachedClient = new MemCachedClient();
        // server list and weights
        String memcachedServerHost = transitionProperties.getMemcachedServerHost();
        if (memcachedServerHost == null || memcachedServerHost.equals("") || memcachedServerHost.equals("disabled")) {
            log.warn("Memcached is disabled!");
            cacheEnabled = false;
        }
        if (cacheEnabled) {
            String[] servers = {memcachedServerHost};
            Integer[] weights = {1};
            try {
                // grab an instance of our connection pool
                SockIOPool pool = SockIOPool.getInstance();

                // set the servers and the weights
                pool.setServers(servers);
                pool.setWeights(weights);

                // set some basic pool settings
                // 5 initial, 5 min, and 250 max conns
                // and set the max idle time for a conn
                // to 6 hours
                pool.setInitConn(INITIAL_CON_NUMBER);
                pool.setMinConn(INITIAL_CON_MIN_NUMBER);
                pool.setMaxConn(INITIAL_CON_MAX_NUMBER);
                pool.setMaxIdle(MAX_IDLE_TIME);

                // set the sleep for the maint thread
                // it will wake up every x seconds and
                // maintain the pool size
                pool.setMaintSleep(WAKE_UP_TIME_EVERY);

                // set some TCP settings
                // disable nagle
                // set the read timeout to 3 secs
                // and don’t set a connect timeout
                pool.setNagle(false);
                pool.setSocketTO(READ_TIMEOUT);
                pool.setSocketConnectTO(CONNECTION_TIMEOUT);

                // initialize the connection pool
                pool.initialize();


                // lets set some compression on for the client
                // compress anything larger than 64k
                memCachedClient.setCompressEnable(true);
                memCachedClient.setCompressThreshold(MIN_SIZE_TO_COMPRESSION);

            } catch (Exception ex) {
                log.error("Can not Starting Pool for MemCache check if the MemCache Server is running..... : " + ex.getMessage());
                cacheEnabled = false;
            }
        }
    }

    public MemCachedClient getClient() {
        return memCachedClient;
    }

    public boolean set(String key, Object value) {
        if (!cacheEnabled) {
            return false;
        }
        boolean result = false;
        try {
            result = getClient().set(key, value);
        } catch (Exception ex) {
            log.error("Can not set key = " + key + " with object = " + value.getClass().toString() + " to MemCache " + ex.getMessage());
        }
        return result;
    }

    public Object get(String key) {
        if (!cacheEnabled) {
            return null;
        }
        Object result = null;
        try {
            result = getClient().get(key);
        } catch (Exception ex) {
            log.error("Can not get key = " + key + " : " + ex.getMessage());
        }
        return result;
    }

    public boolean delete(String key) {
        if (!cacheEnabled) {
            return false;
        }
        boolean result = false;
        try {
            if (getClient().keyExists(key)) {
                result = getClient().delete(key);
            }
        } catch (Exception ex) {
            log.error("Can not delete key = " + key + " : " + ex.getMessage());
        }
        return result;
    }

    public boolean clearAll() {
        try {
            return getClient().flushAll();
        } catch (Exception ex) {
            log.error("Can not clear all MemCached : " + ex.getMessage());
        }
        return false;
    }

    // return true cacheEnabled is enable
    public boolean isMemCachedEnable() {
        return cacheEnabled;
    }

}
