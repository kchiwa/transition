package com.abctech.transition.core.dao.valuemap;

import com.abctech.transition.core.exception.DAOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ValueMapExportManager implements  IValueMapExportManager {
    //private static final Logger log = LoggerFactory.getLogger(ValueMapExportManager.class);

    @Autowired
    private ValueMapDAO valueMapDAO;

    @Transactional(propagation= Propagation.REQUIRED, readOnly=false)
    public ValueMapModel save(ValueMapModel valueMapModel) throws DAOException {
        if (valueMapModel == null) {
            return valueMapModel;
        }
        ValueMapModel result = null;
        try {

            if (valueMapModel.getId() == null) {
                //Insert
                //log.debug("INSERT");
                result = valueMapDAO.add(valueMapModel);
            } else {
                //Update
                //log.debug("UPDATE");
                result = valueMapDAO.update(valueMapModel);
            }
        } catch (DataAccessException e) {
            throw new DAOException("Got database exception while calling save() ValueMap", e);
        }
        return result;
    }

    @Transactional(propagation= Propagation.REQUIRED, readOnly=false)
    public List<ValueMapModel> saveTransaction(List<ValueMapModel> valueMapModelList) throws DAOException {
        for (ValueMapModel valueMapModel : valueMapModelList) {
            try {
               save(valueMapModel);
            } catch (DAOException ex) {
                throw new DAOException(ex.getMessage(),ex);
            }
        }
        return valueMapModelList;
    }

     @Transactional(propagation= Propagation.REQUIRED, readOnly=false)
     public Boolean importValueMap(List<ValueMapModel> valueMapModelListFromCSV,List<Long> ids) throws DAOException {
        try {
            //delete
            for (Long id : ids) {
                valueMapDAO.deleteById(Integer.parseInt("" + id));
            }
            //insert and update
            saveTransaction(valueMapModelListFromCSV);
        } catch (DAOException e) {
            throw new DAOException("Can not Import Data to Database : " + e.getMessage(), e);
        }
        return true;
    }

    public void test() {
        //
    }
}
