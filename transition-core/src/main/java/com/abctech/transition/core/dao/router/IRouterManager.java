package com.abctech.transition.core.dao.router;

import com.abctech.transition.core.exception.DAOException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */

@Service
public interface IRouterManager {

    /**
     * Save model to data source
     * @param routerModel
     * @return RouterModel
     * @throws DAOException
     */
    public RouterModel save(RouterModel routerModel) throws DAOException;

    /**
     * Delete model from data source by id
     * @param id
     * @return  boolean success or not
     * @throws DAOException
     */
    public Boolean delete(long id) throws DAOException;

    /**
     * find model by format
     * @param format
     * @return RouterModel
     * @throws DAOException
     */
    public RouterModel findByFormat(String format)  throws DAOException;

    /**
     * load model by id
     * @param id
     * @return RouterModel
     * @throws DAOException
     */
    public RouterModel findById(long id)  throws DAOException;

    /**
     * List all model in data source
     * @return  list of model
     * @throws DAOException
     */
    public List<RouterModel> findAll() throws DAOException;
}
