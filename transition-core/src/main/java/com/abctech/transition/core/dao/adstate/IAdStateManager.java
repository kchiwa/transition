package com.abctech.transition.core.dao.adstate;


import com.abctech.transition.core.exception.DAOException;

import java.util.List;

public interface IAdStateManager {
	
    public AdStateModel save(AdStateModel adStateModelParam) throws DAOException;

    /**
     * Delete adstate from table by id
     *
     * @param id to delete
     * @return boolean result
     */
    public Boolean delete(Long id) throws DAOException;
    /**
     * Find adstatemodel by id
     *
     * @param id to find
     * @return AdStateModel
     */
    public AdStateModel findById(Long id) throws DAOException;
    
    public List<AdStateModel> findByFileStateId(Long fileStateId) throws DAOException;

    public List<AdStateModel> getAdStateModelByIdList(List<Long> adStateIds) throws DAOException;

    /**
     * Find adstate  that active by clientId
     *
     * @param clientId  to find
     * @return AdStateModel
     */
    public List<AdStateModel> findActiveAdStateByClientId(int clientId) throws DAOException;

    /**
     * Find adstate by clientId and clientRef
     *
     * @param clientId  to find
     * @param clientRef to find
     * @return AdStateModel
     */
    public AdStateModel findAdStateByClientIdClientRef(int clientId, String clientRef) throws DAOException;

}
