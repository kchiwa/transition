package com.abctech.transition.core.dao.partnerlogin;


import com.abctech.transition.core.dao.DAOLogging;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.memcached.MemcachedTransactionManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class PartnerLoginManager implements  IPartnerLoginManager {
    private static final Logger log = LoggerFactory.getLogger(PartnerLoginManager.class);
    private static final String ERROR_WHILE_FETCHING_FROM_DATABASE = "Error while fetching from database";

    @Autowired
    private PartnerLoginDAO partnerLoginDAO;

    @Autowired
	private MemcachedTransactionManager memcachedTransactionManager;

    /**
     * Save partnerlogin to table (Insert if it's new or update if already exist)
     *
     * @param partnerLoginModel to save
     * @return PartnerLoginModel that just saved
     */
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public PartnerLoginModel save(PartnerLoginModel partnerLoginModel) throws DAOException {
        if (partnerLoginModel == null) {
                    return partnerLoginModel;
                }
        try {
            if (partnerLoginModel.getId() == null) {
                //Insert
                return partnerLoginDAO.add(partnerLoginModel);
            } else {
                //Update
                PartnerLoginModel result = partnerLoginDAO.update(partnerLoginModel);
                //make sure to delete the update key
                memcachedTransactionManager.delete(MemcachedTransactionManager.PARTNER_LOGIN + partnerLoginModel.getId());
                return result;
            }
        } catch (DuplicateKeyException e){
            log.error("Login name " + partnerLoginModel.getLogin() + " already exist.");
             throw new DAOException("Login name " + partnerLoginModel.getLogin() + " already exist.", e);
        } catch (DataAccessException e) {
            log.error(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
            throw new DAOException("Got database exception while calling save() PartnerLoginModel", e);
        }
     }

    /**
     * Delete PartnerLogin from table
     *
     * @param id to delete
     * @return boolean result
     */
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public Boolean delete(Long id) throws DAOException {
        boolean result = false;
        //make sure to delete the update key
        try {
            result = partnerLoginDAO.deleteById(id);
            memcachedTransactionManager.delete(MemcachedTransactionManager.PARTNER_LOGIN + id);
        } catch (DataAccessException e) {
            log.error(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
            throw new DAOException("Got database exception while calling delete() PartnerLogin id " + id, e);
        }
        return result;
    }

    /**
     * Find PartnerLogin by id
     *
     * @param id to find
     * @return PartnerLoginModel
     */
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public PartnerLoginModel findById(Long id) throws DAOException {
        DAOLogging logging = DAOLogging.start();
        PartnerLoginModel partnerLoginModel;
        partnerLoginModel = (PartnerLoginModel) memcachedTransactionManager.get(MemcachedTransactionManager.PARTNER_LOGIN + id);
        try {
            if (partnerLoginModel == null) {
                partnerLoginModel = partnerLoginDAO.findById(id);
                if (partnerLoginModel != null) {
                    memcachedTransactionManager.set(MemcachedTransactionManager.PARTNER_LOGIN + id, partnerLoginModel);
                    log.debug(logging.finish("PartnerLogin:findById()", "DB", 1));
                }
            } else {
                log.debug(logging.finish("PartnerLogin:findById()", "MEMCACHE", 1));
            }
        } catch (EmptyResultDataAccessException em) {
            log.debug("Empty result for id " + id + " returning null");
        } catch (DataAccessException e) {
            log.debug(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
            throw new DAOException("Got database exception while calling PartnerLogin:findById() id = " + id, e);
        }
        return partnerLoginModel;
    }

     /**
     * Find PartnerLogin by id
     *
     * @param customerFormat to find
     * @return  List of PartnerLoginModel
     */
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<PartnerLoginModel> findByCustomerFormat(String customerFormat) throws DAOException {
        DAOLogging logging = DAOLogging.start();
        List<PartnerLoginModel> partnerLoginModel = null;
         try {
            List<Long> ids = partnerLoginDAO.findByCustomerFormat(customerFormat);
            partnerLoginModel = getPartnerLoginModelByIdList(ids);
            log.debug(logging.finish("PartnerLogin:findByCustomerFormat()", "DB", partnerLoginModel.size()));
        } catch (EmptyResultDataAccessException em) {
            log.debug("Empty result for owner returning null");
        } catch (DataAccessException e) {
            log.error(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
            throw new DAOException("Got database exception while calling findByCustomerFormat() customerFormat = " + customerFormat, e);
        }
        return partnerLoginModel;
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public PartnerLoginModel findByLogin(String login) throws DAOException {
        DAOLogging logging = DAOLogging.start();
        PartnerLoginModel partnerLoginModel = null;
         try {
            Long id = partnerLoginDAO.findByLogin(login);
            partnerLoginModel = findById(id);
            log.debug(logging.finish("PartnerLogin:findByLogin()", "DB", 1));
        } catch (EmptyResultDataAccessException em) {
            log.debug("Empty result for owner returning null");
        } catch (DataAccessException e) {
            log.error(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
            throw new DAOException("Got database exception while calling findByLogin() login = " + login, e);
        }
        return partnerLoginModel;
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<PartnerLoginModel> getPartnerLoginModelByIdList(List<Long> ids) throws DAOException {
        List<PartnerLoginModel> partnerLoginModel = new ArrayList<PartnerLoginModel>();
        if (ids != null && ids.size() > 0) {
            for (Long id : ids) {
                partnerLoginModel.add(findById(id));
            }
        }
        return partnerLoginModel;
    }

}
