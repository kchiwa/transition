package com.abctech.transition.core.dao.schedulerstate;

import com.abctech.transition.core.exception.DAOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 */

@Service
public class HttpFecthSchedulerManager implements IHttpFecthSchedulerManager {

    private static final Logger log = LoggerFactory.getLogger(HttpFecthSchedulerManager.class);
    private static final String ERROR_WHILE_FETCHING_FROM_DATABASE = "Error while fetching from database";

    @Autowired(required = true)
    private SchedulerDAO schedulerDAO;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<HttpFecthSchedulerModel> listRSSFecthScheduler() throws DAOException {
        List<HttpFecthSchedulerModel> modelsList = new ArrayList<HttpFecthSchedulerModel>();
        try {
            modelsList = schedulerDAO.findAll();
        } catch (EmptyResultDataAccessException em) {
            log.debug("Empty result for format findAll() returning null");
            modelsList = Collections.emptyList();
        } catch (DataAccessException e) {
            log.error("ERROR_WHILE_FETCHING_FROM_DATABASE", e);
            throw new DAOException("Got database exception while calling findAll()", e);
        }
        return modelsList;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<HttpFecthSchedulerModel> listActiveRSSFecthScheduler() throws DAOException {
        List<HttpFecthSchedulerModel> modelsList = new ArrayList<HttpFecthSchedulerModel>();
        try {
            modelsList = schedulerDAO.findActiveAll();
        } catch (EmptyResultDataAccessException em) {
            log.debug("Empty result for format findAll() returning null");
            modelsList = Collections.emptyList();
        } catch (DataAccessException e) {
            log.error("ERROR_WHILE_FETCHING_FROM_DATABASE", e);
            throw new DAOException("Got database exception while calling findAll()", e);
        }
        return modelsList;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public HttpFecthSchedulerModel loadById(long id) throws DAOException {

         HttpFecthSchedulerModel model = null;
        try {
            model = schedulerDAO.findById(id);
        } catch (EmptyResultDataAccessException em) {
            log.debug("Empty result for format findAll() returning null");
            model = new HttpFecthSchedulerModel();
        } catch (DataAccessException e) {
            log.error("ERROR_WHILE_FETCHING_FROM_DATABASE", e);
            throw new DAOException("Got database exception while calling findAll()", e);
        }

        return model;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public HttpFecthSchedulerModel loadByClientName(String clientName) throws DAOException {

        HttpFecthSchedulerModel model = null;
        try {
            model = schedulerDAO.findByClientName(clientName);
        } catch (EmptyResultDataAccessException em) {
            log.debug("Empty result for format findAll() returning null");
            model = new HttpFecthSchedulerModel();
        } catch (DataAccessException e) {
            log.error("ERROR_WHILE_FETCHING_FROM_DATABASE", e);
            throw new DAOException("Got database exception while calling findAll()", e);
        }

        return model;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public HttpFecthSchedulerModel save(HttpFecthSchedulerModel model) throws DAOException {

        if(model == null) {
            throw new DAOException("Can not save NULL model.");
        }

        try {
            return schedulerDAO.save(model);
        } catch (DataAccessException e) {
            log.error(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
            throw new DAOException("Got database exception while calling save.", e);
        }
    }

    @Override
    public String getURLFromClientName(String clientName) throws DAOException {
        if(clientName == null || "".equals(clientName)) {
            throw new DAOException("Can not get url fro property file.");
        }
        return  schedulerDAO.getFetchURLFromClientName(clientName);
    }
}
