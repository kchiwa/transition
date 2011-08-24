package com.abctech.transition.core.dao.adstate;


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
public class AdStateManager implements IAdStateManager {
	private static final Logger log = LoggerFactory.getLogger(AdStateManager.class);
	private static final String ERROR_WHILE_FETCHING_FROM_DATABASE = "Error while fetching from database";

	@Autowired
	private AdStateDAO adStateDAO;


	/**
	 * Save adstate to table (Insert if it's new or update if it's already exist)
	 *
	 * @param adStateModel to save
	 * @return AdStateModel that just saved
	 */
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public AdStateModel save(AdStateModel adStateModel) throws DAOException {
		AdStateModel result = null;
		if (adStateModel == null) {
			return null;
		}
		try {
			result = adStateDAO.save(adStateModel);
		} catch (DataAccessException e) {
			log.error(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
			throw new DAOException("Got database exception while calling save AdState", e);
		}

		return result;
	}

	/**
	 * Delete adstate from table by id
	 *
	 * @param id to delete
	 * @return boolean result
	 */
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public Boolean delete(Long id) throws DAOException {
		try {
			return adStateDAO.deleteById(id);
		}
		catch (DataAccessException e) {
			log.error(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
			throw new DAOException("Got database exception while calling delete AdState", e);
		}
	}

	/**
	 * Find adstatemodel by id
	 *
	 * @param id to find
	 * @return AdStateModel
	 */
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public AdStateModel findById(Long id) throws DAOException {
		AdStateModel adStateModel = null;
		try {
			adStateModel = adStateDAO.findById(id);
		} catch (EmptyResultDataAccessException em) {
			log.debug("Empty result for id " + id + " returning null");
		} catch (DataAccessException e) {
			log.error(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
			throw new DAOException("Got database exception while calling findById" + id, e);
		}
		return adStateModel;
	}

	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public List<AdStateModel> findByFileStateId(Long fileStateId) throws DAOException {
		List<Long> ids = adStateDAO.findByFileStateId(fileStateId);
		return getAdStateModelByIdList(ids);
	}

	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public List<AdStateModel> getAdStateModelByIdList(List<Long> adStateIds) throws DAOException {
		List<AdStateModel> adState = new ArrayList<AdStateModel>();
		if (adStateIds!=null && adStateIds.size()>0) {
			for (Long id : adStateIds) {
				adState.add(findById(id));
			}
		}
		return adState;
	}

	/**
	 * Find adstate by clientId and clientRef
	 *
	 * @param clientId  to find
	 * @param clientRef to find
	 * @return AdStateModel
	 */
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public AdStateModel findAdStateByClientIdClientRef(int clientId, String clientRef) throws DAOException {
		AdStateModel adStateModel = null;
		try {
			Long id = adStateDAO.findByClientRef(clientId, clientRef);
			adStateModel = findById(id);
		} 
		catch (EmptyResultDataAccessException em) {
			log.debug("Empty result for clientId " + clientId + " and clientRef " + clientRef + " returning null");
		} catch (DataAccessException e) {
			log.error(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
			throw new DAOException("Got database exception while calling findAdStateByClientIdClientRef", e);
		}
		return adStateModel;
	}

    /**
	 * Find adstate by clientId and clientRef
	 *
	 * @param clientId  to find
	 * @return AdStateModel
	 */
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public List<AdStateModel> findActiveAdStateByClientId(int clientId) throws DAOException {
		List<AdStateModel> adStateModel = null;
		try {
			List<Long> ids = adStateDAO.findActiveAdStateByClientId(clientId);
			adStateModel = getAdStateModelByIdList(ids);
		}
		catch (EmptyResultDataAccessException em) {
			log.debug("Empty result for clientId " + clientId + "  returning null");
		} catch (DataAccessException e) {
			log.error(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
			throw new DAOException("Got database exception while calling findActiveAdStateByClientId()", e);
		}
		return adStateModel;
	}

}
