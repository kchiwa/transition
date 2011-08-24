package com.abctech.transition.core.dao.filestate;

import com.abctech.transition.core.enumeration.CustomerFormat;
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
public class FileStateManager implements IFileStateManager {

    private static final Logger log = LoggerFactory.getLogger(FileStateManager.class);
    private static final String ERROR_WHILE_FETCHING_FROM_DATABASE = "Error while fetching from database";
    //private DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");

    @Autowired
    private FileStateDAO fileStateDAO;


    /**
     * Save filestate to table (Insert if it's new or update if already exist)
     *
     * @param fileStateModel to save
     * @return FileStateModel that just saved
     */
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public FileStateModel save(FileStateModel fileStateModel) throws DAOException {
    	FileStateModel result = null;
        if (fileStateModel == null) {
            return fileStateModel;
        }

        //FileStateModel result= fileStateModel;
        try {
        	result = fileStateDAO.save(fileStateModel);
        } catch (DataAccessException e) {
            log.error(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
            throw new DAOException("Got database exception while calling save() FileState", e);
        }
        return result;
    }

    /**
     * Delete filestate from table
     *
     * @param id to delete
     * @return boolean result
     */
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public Boolean delete(Long id) throws DAOException {
        boolean result = false;
        //make sure to delete the update key
        try {
            result = fileStateDAO.deleteById(id);
        } catch (DataAccessException e) {
            log.error(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
            throw new DAOException("Got database exception while calling delete() fileState id " + id, e);
        }
        return result;
    }

    /**
     * Find filestate by id
     *
     * @param id to find
     * @return FileStateModel
     */
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public FileStateModel findById(Long id) throws DAOException {
        FileStateModel fileStateModel = null;
        try {
        	fileStateModel = fileStateDAO.findById(id);
        } 
        catch (EmptyResultDataAccessException em) {
            log.debug("Empty result for id " + id + " returning null");
        } 
        catch (DataAccessException e) {
            log.error(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
            throw new DAOException("Got database exception while calling findById() id = " + id, e);
        }
        return fileStateModel;
    }

    /**
     * Find filestate by clientname
     *
     * @param clientName to find
     * @return List<FileStateModel>
     */
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<FileStateModel> findByClientName(String clientName) throws DAOException {
        List<FileStateModel> fileStateModel = null;
        try {
            List<Long> ids = fileStateDAO.findByClientName(clientName);
            fileStateModel = getFileStateModelByIdList(ids);
        } catch (EmptyResultDataAccessException em) {
            log.debug("Empty result for owner returning null");
        } catch (DataAccessException e) {
            log.error(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
            throw new DAOException("Got database exception while calling findByOwner() owner = " + clientName, e);
        }
        return fileStateModel;
    }

    /**
     * Find filestate by customer fomat
     *
     * @param customerFormat to find
     * @return List<FileStateModel>
     */
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<FileStateModel> findByCustomerFormat(String customerFormat) throws DAOException {
        List<FileStateModel> fileStateModel = null;
        try {
            List<Long> ids = fileStateDAO.findByCustomerFormat(customerFormat);
            fileStateModel = getFileStateModelByIdList(ids);
        } catch (EmptyResultDataAccessException em) {
            log.debug("Empty result for customerFormat. returning null");
        } catch (DataAccessException e) {
            log.error(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
            throw new DAOException("Got database exception while calling findByCustomerFormat() customerFormat = " + customerFormat, e);
        }
        return fileStateModel;
    }

    /**
     * Find filestate by customer format
     *
     * @param customerFormat to find
     * @return List<FileStateModel>
     */
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public FileStateModel findLastImportByCustomerFormat(String customerFormat) throws DAOException {
        FileStateModel fileStateModel = null;
        try {
            Long ids = fileStateDAO.findLastCreatedTimeByCustomerFormat(customerFormat);
            fileStateModel = findById(ids);
        } catch (EmptyResultDataAccessException em) {
            log.trace("Empty result for findLastCreatedTimeByCustomerFormat. returning null");
        } catch (DataAccessException e) {
            log.error(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
            throw new DAOException("Got database exception while calling findLastCreatedTimeByCustomerFormat() customerFormat = " + customerFormat, e);
        }
        return fileStateModel;
    }

    public List<FileStateModel> findLastImportByCustomerFormatList() throws DAOException {
        List<FileStateModel> fileStateModelList = new ArrayList<FileStateModel>();
        for (CustomerFormat format : CustomerFormat.values()) {
            if (!format.toTextValue().equalsIgnoreCase(CustomerFormat.UNSUPPORTED.toTextValue())) {
                FileStateModel fileStateModel = findLastImportByCustomerFormat(format.toTextValue());
                if (fileStateModel != null) {
                    fileStateModelList.add(fileStateModel);
                }
            }
        }
        return fileStateModelList;
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<FileStateModel> getFileStateModelByIdList(List<Long> ids) throws DAOException {
        List<FileStateModel> fileStateModel = new ArrayList<FileStateModel>();
        if (ids != null && ids.size() > 0) {
            for (Long id : ids) {
                fileStateModel.add(findById(id));
            }
        }
        return fileStateModel;
    }

    public List<FileStateModel> findFileStateByCondition(String conditionStr) {

        return fileStateDAO.findByCondition(conditionStr);
    }

    @Override
    public int countRowByCondition(final String condition) throws DAOException {

        return fileStateDAO.countRowByCondition(condition);
    }
}
