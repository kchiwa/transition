package com.abctech.transition.core.dao.filestate;

import com.abctech.transition.core.exception.DAOException;

import java.util.List;

public interface IFileStateManager {

    /**
     * Save filestate to table (Insert if it's new or update if already exist)
     *
     * @param fileStateModel to save
     * @return FileStateModel that just saved
     */
    public FileStateModel save(FileStateModel fileStateModel) throws DAOException;


     /**
     * Delete filestate from table
     *
     * @param id to delete
     * @return boolean result
     */
    public Boolean delete(Long id) throws DAOException;
    
    /**
     * Find filestate by id
     *
     * @param id to find
     * @return FileStateModel
     */
    public FileStateModel findById(Long id) throws DAOException;
     /**
     * Find filestate by clientname
     *
     * @param clientName to find
     * @return List<FileStateModel>
     */
    public List<FileStateModel> findByClientName(String clientName) throws DAOException;

     /**
     * Find filestate by customer fomat
     *
     * @param customerFormat to find
     * @return List<FileStateModel>
     */
    public List<FileStateModel> findByCustomerFormat(String customerFormat) throws DAOException;
    
    
    public List<FileStateModel> getFileStateModelByIdList(List<Long> ids) throws DAOException;

    /**
     * Find filestate by customer fomat
     *
     * @param customerFormat to find
     * @return FileStateModel
     */
    public FileStateModel findLastImportByCustomerFormat(String customerFormat) throws DAOException;

    /**
     * Find filestate by customer fomat
     *
     * @return List<FileStateModel>  of all customer format
     */
    public List<FileStateModel> findLastImportByCustomerFormatList() throws DAOException;

     /**
     * Find filestate by condition string
     *
     * @return List<FileStateModel>  of match condition
     */
    public List<FileStateModel> findFileStateByCondition(String condition) throws DAOException;

    /**
     * Find total rows by condition string
     *
     * @return int row count
     */
    public int countRowByCondition(final String condition) throws DAOException;
    
}
