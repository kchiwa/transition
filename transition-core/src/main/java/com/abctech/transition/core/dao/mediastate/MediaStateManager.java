package com.abctech.transition.core.dao.mediastate;

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
public class MediaStateManager implements IMediaStateManager {
	private static final Logger log = LoggerFactory.getLogger(MediaStateManager.class);
	private static final String ERROR_WHILE_FETCHING_FROM_DATABASE = "Error while fetching from database";
	private static final String RETURNING_NULL = " returning null";

	@Autowired
	private MediaStateDAO mediaStateDAO;


	/**
	 * Save mediastate to mediastate table. (Insert new row is it's new or update if already exist)
	 *
	 * @param mediaStateModel to save
	 * @return mediaStateModel that just saved to table
	 */
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public MediaStateModel save(MediaStateModel mediaStateModel) throws DAOException {
		MediaStateModel result = null;
		try {
			result = mediaStateDAO.save(mediaStateModel);
		}
		catch (DataAccessException e) {
			log.error(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
			throw new DAOException("Got database exception while calling save() AdState", e);
		}
		return result;
	}

	/**
	 * Delete mediastate from table by id
	 *
	 * @param id to delete
	 * @return boolean result
	 */
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public Boolean deleteMediaStateById(Long id) throws DAOException {
		try {
			return mediaStateDAO.deleteById(id);
		} catch (DataAccessException e) {
			log.error(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
			throw new DAOException("Got database exception while calling deleteMediaStateById() id = " + id, e);
		}
	}

	/**
	 * Delete mediastate from table by clientId and clientRef
	 *
	 * @param clientRef client ref
	 * @param clientId  client id
	 * @return boolean result
	 */
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public Boolean deleteMediaStateClientRefClientId(String clientRef, int clientId) throws DAOException {
		try {
			//MemcachedTransactionManager.getClient().flushAll();
			List<Long> ids =  mediaStateDAO.getMediaStateIdsByClientRefClientId(clientRef, clientId);
			deleteMediaStateModelByIdList(ids);
		} catch (DataAccessException e) {
			log.error(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
			throw new DAOException("Got database exception while calling deleteMediaStateClientRefClientId()", e);
		}
		return true;
	}

	/**
	 * Find mediastate by id
	 *
	 * @param id to find
	 */
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public MediaStateModel findById(Long id) throws DAOException {
		MediaStateModel mediaStateModel = null;
		try {
			mediaStateModel = mediaStateDAO.findById(id);
		}
		catch (EmptyResultDataAccessException em) {
			log.debug("Empty result for id "+id+ RETURNING_NULL);
		}
		catch (DataAccessException e) {
			log.error(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
			throw new DAOException("Got database exception while calling findById()", e);
		}
		return mediaStateModel;
	}

	/**
	 * Find mediastate by clientId and clientRef
	 *
	 * @param clientId  to find
	 * @param clientRef to find
	 */
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public List<MediaStateModel> findMediaStateByClientIdClientRef(int clientId, String clientRef) throws DAOException {
		List<MediaStateModel> mediaStateModelList = new ArrayList<MediaStateModel>();

		try {
			List<Long> mediaIds = mediaStateDAO.getMediaStateIdsByClientRefClientId(clientRef, clientId);
			mediaStateModelList = getMediaStateModelByIdList(mediaIds);
		} catch (EmptyResultDataAccessException em) {
			log.debug("Empty result for clientId "+clientId+" clientRef = " + clientRef+ RETURNING_NULL);
		} catch (DataAccessException e) {
			log.error(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
			throw new DAOException("Got database exception while calling findMediaStateByClientIdClientRef()" + " mediaState with clientId=" + clientId + " and clientRef=" + clientRef, e);
		}
		return mediaStateModelList;
	}

	/**
	 * Find mediastate by adstate id
	 *
	 * @param adStateId to find
	 */
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public List<MediaStateModel> findMediaStateByAdStateID(Long adStateId) throws DAOException {
		List<MediaStateModel> mediaStateModel = null;
		try {
			List<Long> mediaIds = mediaStateDAO.getMediaStateByAdStateId(adStateId);
			mediaStateModel = getMediaStateModelByIdList(mediaIds);
		}
		catch (EmptyResultDataAccessException em) {
			log.debug("Empty result for adStateId "+adStateId+ RETURNING_NULL);
		}
		catch (DataAccessException e) {
			log.error(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
			throw new DAOException("Got database exception while calling findMediaStateByAdStateID()" + " mediaState with adStateId=" + adStateId , e);
		}
		return mediaStateModel;
	}

	/**
	 * Retrieve a list of MediaStateModel that belong to the client with given clientId.
	 */
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public List<MediaStateModel> findMediaStatesByClientId(int clientId) throws DAOException {
		List<Long>mediaIds = new ArrayList<Long>();
		try {
			mediaIds = mediaStateDAO.getMediaMediaStateIdByClientId(clientId);
		} catch (EmptyResultDataAccessException em) {
			log.debug("Empty result for clientId "+clientId+ RETURNING_NULL);
		} catch (DataAccessException e) {
			log.error(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
			throw new DAOException("Got database exception while calling findMediaStateByClientId()" + " mediaState with clientId=" + clientId , e);
		}
        return getMediaStateModelByIdList(mediaIds);
	}

	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public List<MediaStateModel> getMediaStateModelByIdList(List<Long>mediaIds) throws DAOException {
		List<MediaStateModel> mediastates = new ArrayList<MediaStateModel>();
        // I know that mediaIds shall never be null
        for (Long id : mediaIds) {
            mediastates.add(findById(id));
        }
		return mediastates;
	}

	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public List<MediaStateModel> deleteMediaStateModelByIdList(List<Long>mediaIds) throws DAOException {
		List<MediaStateModel> mediastates = new ArrayList<MediaStateModel>();
		if (mediaIds!=null && mediaIds.size()>0) {
			for (Long id : mediaIds) {
				deleteMediaStateById(id);
			}
		}
		return mediastates;
	}
}
