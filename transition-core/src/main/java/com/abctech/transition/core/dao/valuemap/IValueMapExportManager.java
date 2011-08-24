package com.abctech.transition.core.dao.valuemap;


import com.abctech.transition.core.exception.DAOException;

import java.util.List;

public interface IValueMapExportManager {

    public ValueMapModel save(ValueMapModel valueMapModel) throws DAOException;
    public List<ValueMapModel> saveTransaction(List<ValueMapModel> valueMapModelList) throws DAOException;
    public Boolean importValueMap(List<ValueMapModel> valueMapModelListFromCSV,List<Long> ids) throws DAOException ;
}
