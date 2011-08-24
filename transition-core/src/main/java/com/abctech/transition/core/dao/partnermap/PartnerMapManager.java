package com.abctech.transition.core.dao.partnermap;

import com.abctech.transition.core.exception.DAOException;
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
public class PartnerMapManager implements IPartnerMapManager {
    private static final Logger log = LoggerFactory.getLogger(PartnerMapManager.class);
    private static final String ERROR_WHILE_FETCHING_FROM_DATABASE = "Error while fetching from database";

    @Autowired
    private PartnerMapDAO partnerMapDAO;

    //@Autowired
    //private DAOLogging daoLogging;

    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public PartnerMapModel save(PartnerMapModel partnerMapModel) throws DAOException {
        if (partnerMapModel == null) {
            return null;
        }
        try {
            return partnerMapDAO.save(partnerMapModel);
        } catch (DuplicateKeyException e) {
            log.error("Identifier name " + partnerMapModel.getIdentifier() + " already exist.");
            throw e;
        } catch (DataAccessException e) {
            log.error(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
            throw new DAOException("Got database exception while calling save() PartnerMapModel", e);
        }
    }

    /**
     * Delete PartnerMap from table
     *
     * @param id to delete
     * @return boolean result
     */
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public Boolean delete(Long id) throws DAOException {
        boolean result;
        try {
            result = partnerMapDAO.deleteById(id);
        } catch (DataAccessException e) {
            log.error(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
            throw new DAOException("Got database exception while calling delete() PartnerMap id " + id, e);
        }
        return result;
    }

    /**
     * Find PartnerMap by id
     *
     * @param id to find
     * @return PartnerMapModel
     */
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public PartnerMapModel findById(Long id) throws DAOException {
        PartnerMapModel partnerMapModel = null;
        try {
            partnerMapModel = partnerMapDAO.findById(id);
        } catch (EmptyResultDataAccessException em) {
            log.debug("Empty result for id " + id + " returning null");
        } catch (DataAccessException e) {
            log.error(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
            throw new DAOException("Got database exception while calling PartnerMap:findById() id = " + id, e);
        }
        return partnerMapModel;
    }

    /**
     * Find PartnerMap by partnerMapId
     *
     * @param partnerMapId to find
     * @return List of PartnerMapModel
     */
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<PartnerMapModel> findByPartnerLoginId(Long partnerMapId) throws DAOException {
        List<Long> ids = partnerMapDAO.findByPartnerLoginId(partnerMapId);
        return getPartnerMapModelByIdList(ids);
    }

    /**
     * Find PartnerMap by identifier
     *
     * @param identifier to find
     * @return PartnerMapModel
     */
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public PartnerMapModel findByIdentifier(String identifier) throws DAOException {
        Long id = partnerMapDAO.findByIdentifier(identifier);
        return findById(id);

    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<PartnerMapModel> getPartnerMapModelByIdList(List<Long> ids) throws DAOException {
        List<PartnerMapModel> partnerMapModel = new ArrayList<PartnerMapModel>();
        if (ids != null && ids.size() > 0) {
            for (Long id : ids) {
                partnerMapModel.add(findById(id));
            }
        }
        return partnerMapModel;
    }

}
