package com.abctech.transition.core.dao.schedulerstate;

import com.abctech.transition.core.exception.DAOException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IHttpFecthSchedulerManager {

    /**
     * listRSSFecthScheduler for list all scheduler in database
     *
     * @return Lits : list all scheduler in database
     * @throws DAOException
     */
    public List<HttpFecthSchedulerModel> listRSSFecthScheduler() throws DAOException;

     /**
     * listRSSFecthScheduler for list all scheduler in database that active
     *
     * @return Lits : list all scheduler in database that active
     * @throws DAOException
     */
    public List<HttpFecthSchedulerModel> listActiveRSSFecthScheduler() throws DAOException;

    /**
     * load model from client name
     * @param clientName
     * @return RSSFecthSchedulerModel
     * @throws DAOException
     */
    public HttpFecthSchedulerModel loadByClientName(String clientName) throws DAOException;

    /**
     * load model from id
     * @param id
     * @return RSSFecthSchedulerModel
     * @throws DAOException
     */
    public HttpFecthSchedulerModel loadById(long id) throws DAOException;

    /**
     * Save model
     * @param model
     * @return RSSFecthSchedulerModel
     * @throws DAOException
     */
    public HttpFecthSchedulerModel save(HttpFecthSchedulerModel model) throws DAOException;

    /**
     * get url from clientName
     * @param clientName
     * @return String : url
     * @throws DAOException
     */
    public String getURLFromClientName(String clientName)  throws DAOException;

}
