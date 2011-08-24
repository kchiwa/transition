package com.abctech.transition.core.dao.valuemap;

import com.abctech.transition.core.dao.DAOLogging;
import com.abctech.transition.core.exception.DAOException;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// TODO CR Erlend 20110415: A service should not have this number of static methods.
@Service
final public class ValueMapManager implements InitializingBean {
    private static final Logger log = LoggerFactory.getLogger(ValueMapManager.class);

    private static Map<String, ValueMapModel> valueMapModelMap = null;
    private static ValueMapDAO valueMapDAO;
    private static final String ERROR_WHILE_FETCHING_FROM_DATABASE = "Error while fetching from database";
    // TODO This instance variable is temporary and shall be deleted after methods have been refactored to not be static
    private static ValueMapManager temporaryInstanceReference;


    @Autowired
    private ValueMapManager(ValueMapDAO valueMapDAOParameter) {
        setValueMapDAO(valueMapDAOParameter);
    }

    private static void setValueMapDAO(ValueMapDAO valueMapDAOParameter) {
        valueMapDAO = valueMapDAOParameter;
    }

    public ValueMapModel save(ValueMapModel valueMapModel) throws DAOException {
        if (valueMapModel == null) {
            return valueMapModel;
        }
        ValueMapModel result = null;
        try {

            if (valueMapModel.getId() == null) {
                //Insert
                result = valueMapDAO.add(valueMapModel);
            } else {
                //Update
                result = valueMapDAO.update(valueMapModel);
            }
            loadValueMapToHashMap();
        } catch (DataAccessException e) {
            log.error(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
            throw new DAOException("Got database exception while calling save() ValueMap", e);
        }
        return result;
    }

    public Boolean delete(int id) throws DAOException {
    	boolean result = false;
        try {
            result = valueMapDAO.deleteById(id);
            loadValueMapToHashMap();
        } catch (DataAccessException e) {
            log.error(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
            throw new DAOException("Got database exception while calling delete() id " + id, e);
        }
        return result;
    }

    public ValueMapModel findById(int id) throws DAOException {
        DAOLogging logging = DAOLogging.start();
        ValueMapModel valueMapModel = null;
        try {
            valueMapModel = valueMapDAO.findById(id);
            log.debug(logging.finish("ValueMap:findById()", "DB", 1));
        } catch (EmptyResultDataAccessException em) {
            log.debug("Empty result for id " + id + " returning null");
        } catch (DataAccessException e) {
            log.error(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
            throw new DAOException("Got database exception while calling findById" + id, e);
        }
        return valueMapModel;
    }

    // TODO CR Erlend 20110425: This is a @service - it should not have static methods
    public static void loadValueMapToHashMap() throws DAOException {
        List<ValueMapModel> valueMapModelList;
        try {
            valueMapModelList = valueMapDAO.load();
            if (valueMapModelList == null) {
                log.debug("Can not load ValueMap  ");
            } else {
                int valueMapSize = valueMapModelList.size();
                Map<String, ValueMapModel> valueMapModelMapTmp = new HashMap<String, ValueMapModel>();
                log.debug("Can load ValueMap  " + valueMapSize);
                for (ValueMapModel valueMap : valueMapModelList) {
                    String key = StringUtils.deleteWhitespace(valueMap.getFormat().toLowerCase() + "_" + valueMap.getField().toLowerCase() + "_" + valueMap.getLookup().toLowerCase());
                    valueMapModelMapTmp.put(key, valueMap);
                }
                setValueMapModelMap(valueMapModelMapTmp);
            }
        } catch (EmptyResultDataAccessException em) {
            log.error("Empty result for valuemap returning null");
        } catch (DataAccessException e) {
            log.error(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
            throw new DAOException("Got database exception while calling loadValueMapToHashMap", e);
        }
    }

    // TODO CR Erlend 20110425: This is a @service - it should not have static methods
    private static void setValueMapModelMap(Map<String, ValueMapModel> valueMapModel) {
        valueMapModelMap = valueMapModel;
    }

    // TODO CR Erlend 20110425: This is a @service - it should not have static methods
    public static String lookupValue(String format, String field, String lookupParam) throws DAOException {
        return temporaryInstanceReference.lookupValue2( format, field, lookupParam);
    }

    // TODO CR Erlend 20110425: This is a @service - it should not have static methods
    private static String generateLookupKey(String format, String field, String lookupParam) {
        String lookup = lookupParam;
        if (lookup == null) {
            lookup = "";
        }
        return format.toLowerCase() + "_" + field.toLowerCase() + "_" + lookup.toLowerCase();
    }

    // TODO CR Erlend 20110425: This is a @service - it should not have static methods
    public static Integer lookUpValueForCategoryId(String format, String field, String lookupParam) throws DAOException {
        String key = generateLookupKey(format, field, lookupParam);
        Integer result = null;
        try {
            if (valueMapModelMap == null) {
                loadValueMapToHashMap();
            }
            if (valueMapModelMap.get(key) != null) {
                result = valueMapModelMap.get(key).getCategoryId();
            }
        } catch (EmptyResultDataAccessException em) {
            log.error("Empty result for lookUpValueForCategoryId returning null");
        } catch (DataAccessException e) {
            log.error(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
            throw new DAOException("Got database exception while calling lookUpValueForCategoryId format " + format + " field " + field + "lookup " + lookupParam, e);
        }
        return result;
    }

    // TODO CR Erlend20110501 Rename method. It should not have "2" in the name
     public String lookupValue2(String format, String field, String lookupParam) throws DAOException {
        String key = generateLookupKey(format, field, lookupParam);
        String result = null;
        try {
            if (valueMapModelMap == null) {
                loadValueMapToHashMap();
            }
            if (valueMapModelMap.get(key) != null) {
                result = valueMapModelMap.get(key).getZettValue();
            }
        } catch (EmptyResultDataAccessException em) {
            log.error("Empty result for lookupValue returning null");
        } catch (DataAccessException e) {
            log.error(ERROR_WHILE_FETCHING_FROM_DATABASE, e);
            throw new DAOException("Got database exception while calling lookupValue format " + format + " field " + field + "lookup " + lookupParam, e);
        }
        return result;
    }

    public String getLastUpdated() {
        return valueMapDAO.getLastUpdated();
    }

    // SPRINT_29 Remove throws Exception  because sonar complain : A method/constructor shouldn't explicitly throw java.lang.Exception
    @Override
    public void afterPropertiesSet() {
        temporaryInstanceReference = this;
    }
}
