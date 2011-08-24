package com.abctech.transition.core.dao.utility;


import com.abctech.transition.core.dao.search.SearchManager;
import com.abctech.transition.core.dao.valuemap.IValueMapExportManager;
import com.abctech.transition.core.dao.valuemap.ValueMapModel;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.TransitionExportException;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class ValueMapExportUtility {
    private static final Logger log = LoggerFactory.getLogger(ValueMapExportUtility.class);

    @Autowired(required = true)
    private IValueMapExportManager valueMapExportManager;

    @Autowired
    private SearchManager searchManager;

    public List<ValueMapModel> csvToValueMapModelListWithValidation(File filePara) throws IOException, TransitionExportException {
        List<ValueMapModel> valueMapModelList = new ArrayList<ValueMapModel>();
        File file = filePara;
        List<String> contents = FileUtils.readLines(file);
        int firstLine = 1;
        HashMap hm = new HashMap();
        for (String line : contents) {
            try {
                if (firstLine != 1) {
                    //ID,Format,Field,Lookup,Zett Value,CategoryID
                    ValueMapModel valueMapModel = new ValueMapModel();


                    //check empty line
                    if (line.equals("")) {
                        log.error("Line is empty at line " + firstLine);
                        throw new TransitionExportException("Line is empty at line " + firstLine);
                    }

                    String[] content = line.split("\\|");
                    String id = content[0];
                    //check duplicate id
                    if (!id.equals("")) {
                        if (hm.containsKey(id)) {
                            //duplicate id
                            log.error("Duplicate Key (" + id + ")  at line " + firstLine);
                            throw new TransitionExportException("Duplicate Key (" + id + ")  at line " + firstLine);
                        } else {
                            hm.put(content[0], null);
                        }
                    }

                    //check number of columns
                    if (content.length == 6) {
                        if (id.equals("")) {
                            valueMapModel.setId(null);
                            //insertCouter++;
                        } else {
                            valueMapModel.setId(Long.parseLong(id));
                            //updateCouter++;
                        }
                        valueMapModel.setFormat(content[1]);
                        valueMapModel.setField(content[2]);
                        valueMapModel.setLookup(content[3]);
                        valueMapModel.setZettValue(content[4]);
                        valueMapModel.setCategoryId(Integer.parseInt(content[5]));
                        valueMapModelList.add(valueMapModel);
                        //log.debug("===> " + valueMapModel.toString());
                    } else {
                        log.error("Number of columns is wrong : (" + content.length + ") at line " + firstLine);
                        throw new TransitionExportException("Number of columns is wrong : (" + content.length + ") at line " + firstLine);
                    }
                }
                firstLine++;
            } catch (NumberFormatException ex) {
                //invalid type
                log.error("Invalid Type in CSV file to mapping to ValueMapModel " + ": at line " + firstLine + ex);
                throw new TransitionExportException("Invalid Type in CSV file while mapping to ValueMapModel : at line " + firstLine, ex);
            }
        }
        return valueMapModelList;
    }

    public List<String> importValueMap(List<ValueMapModel> valueMapModelListFromCSV) throws DAOException {
        List<String> information = new ArrayList<String>();
        try {
            int insertCouter = 0;
            int updateCouter = 0;
            // retrive inforrmation insertCouter and updateCouter from list
            for(ValueMapModel valueMapModel : valueMapModelListFromCSV) {
                if(valueMapModel.getId() == null) {
                    insertCouter ++;
                } else {
                    updateCouter ++;
                }
            }
            //delete
            List<Long> ids = findDeleteIds(valueMapModelListFromCSV);
            valueMapExportManager.importValueMap(valueMapModelListFromCSV, ids);
            information.add("Deleted : " + ids.size() + " record(s).");
            information.add("Insert  : " + insertCouter + " record(s).");
            information.add("Update  : " + updateCouter + " record(s).");
        } catch (DAOException e) {
            throw new DAOException("Can not Import Data to Database : " + e.getMessage(), e);
        }
        return information;
    }

    private List<Long> findDeleteIds(List<ValueMapModel> valueMapModelListFromCSV) throws DAOException {
        List<ValueMapModel> valueMapModelListFromDB = searchManager.searchAllVAlueMap();
        HashMap hm = new HashMap();
        for (ValueMapModel vm : valueMapModelListFromCSV) {
            hm.put(vm.getId(), null);
        }
        List<Long> idsToDelete = new ArrayList<Long>();

        for (ValueMapModel vm : valueMapModelListFromDB) {
            Long id = vm.getId();
            if (!hm.containsKey(id)) {
                //this id was delete
                idsToDelete.add(id);
            }
        }
        /*  */
        return idsToDelete;
    }
}
