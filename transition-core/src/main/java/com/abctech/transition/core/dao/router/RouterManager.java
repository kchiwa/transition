package com.abctech.transition.core.dao.router;

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
import java.util.List;

@Service
public class RouterManager implements IRouterManager {
    private static final Logger log = LoggerFactory.getLogger(RouterManager.class);
    private static final String ERROR_WHILE_FETCHING_FROM_DATABASE = "Error while fetching from database";

    @Autowired
    private RouterDAO routerDAO;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public RouterModel save(RouterModel routerModel) throws DAOException {
        try {
            return routerDAO.save(routerModel);
        } catch (DataAccessException e) {
            log.error(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
            throw new DAOException("Got database exception while calling save() FileState", e);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public Boolean delete(long id) throws DAOException {
        boolean result = false;
        //make sure to delete the update key
        try {
            result = routerDAO.deleteById(id);
        } catch (DataAccessException e) {
            log.error(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
            throw new DAOException("Got database exception while calling delete() fileState id " + id, e);
        }
        return result;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public RouterModel findByFormat(String format) throws DAOException {
        RouterModel routerModel = new RouterModel();
        try {
            routerModel = routerDAO.findByFormat(format);
        } catch (EmptyResultDataAccessException em) {
            log.debug("Empty result for format " + format + " returning null");
        } catch (DataAccessException e) {
            log.error(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
            throw new DAOException("Got database exception while calling findByFormat() format = " + format, e);
        }
        return routerModel;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public RouterModel findById(long id) throws DAOException {
        RouterModel routerModel = new RouterModel();
        try {
            routerModel = routerDAO.findById(id);
        } catch (EmptyResultDataAccessException em) {
            log.debug("Empty result for id " + id + " returning null");
        } catch (DataAccessException e) {
            log.error(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
            throw new DAOException("Got database exception while calling findById() id = " + id, e);
        }
        return routerModel;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<RouterModel> findAll() throws DAOException {
        List<RouterModel> routerModels = new ArrayList<RouterModel>();
        try {
            routerModels = routerDAO.findAll();
        } catch (EmptyResultDataAccessException em) {
            log.debug("Empty result for format findAll() returning null");
        } catch (DataAccessException e) {
            log.error(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
            throw new DAOException("Got database exception while calling findAll()", e);
        }
        return routerModels;
    }
}