package com.abctech.transition.core.dao.mediastate;


import com.abctech.transition.core.exception.DAOException;

import java.util.List;

public interface IMediaStateManager {
    /**
     * Save mediastate to mediastate table. (Insert new row is it's new or update if already exist)
     *
     * @param mediaStateModel to save
     * @return mediaStateModel that just saved to table
     */
    public MediaStateModel save(MediaStateModel mediaStateModel) throws DAOException ;

     /**
     * Delete mediastate from table by id
     *
     * @param id to delete
     * @return boolean result
     */
    public Boolean deleteMediaStateById(Long id) throws DAOException ;
    /**
     * Delete mediastate from table by clientId and clientRef
     *
     * @param clientRef client ref
     * @param clientId  client id
     * @return boolean result
     */
    public Boolean deleteMediaStateClientRefClientId(String clientRef, int clientId) throws DAOException ;
    /**
     * Find mediastate by id
     *
     * @param id to find
     * @return mediaStateModel
     */
    public MediaStateModel findById(Long id) throws DAOException;
    /**
     * Find mediastate by clientId and clientRef
     *
     * @param clientId  to find
     * @param clientRef to find
     * @return List<MediaStateModel>
     */
    public List<MediaStateModel> findMediaStateByClientIdClientRef(int clientId, String clientRef) throws DAOException;
     /**
     * Find mediastate by adstate id
     *
     * @param adStateId to find
     * @return List<MediaStateModel>
     */
    public List<MediaStateModel> findMediaStateByAdStateID(Long adStateId) throws DAOException;
    /**
     * Retrieve a list of MediaStateModel that belong to the client with given clientId.
     * @param clientId
     * @return List<MediaStateModel>
     * @throws DAOException
     */
    public List<MediaStateModel> findMediaStatesByClientId(int clientId) throws DAOException;
    
    public List<MediaStateModel> getMediaStateModelByIdList(List<Long>mediaIds) throws DAOException;

    public List<MediaStateModel> deleteMediaStateModelByIdList(List<Long>mediaIds) throws DAOException;
}
