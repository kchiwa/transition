package com.abctech.transition.core.utility;

import com.abctech.transition.core.dao.utility.ValueMapExportUtility;
import com.abctech.transition.core.dao.valuemap.ValueMapManager;
import com.abctech.transition.core.dao.valuemap.ValueMapModel;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.TransitionExportException;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class ValueMapExportUtilityTest extends TestCase {
    private static final Logger log = LoggerFactory.getLogger(ValueMapExportUtilityTest.class);

    @Autowired
    private ValueMapExportUtility valueMapExportUtility;

    @Autowired
    private ValueMapManager valueMapManager;

    @Test
    public void testCSVToValueMapModelListException() throws IOException, TransitionExportException {


        //Check Invalid Column
        String filePath = getClass().getClassLoader().getResource("valuemap/invalid_column.csv").getFile();
        try {
            valueMapExportUtility.csvToValueMapModelListWithValidation(new File(filePath));
            fail();
        } catch (TransitionExportException expected) {
            log.debug(expected.getMessage());
            assertEquals(expected.getMessage(), "Number of columns is wrong : (7) at line 2");
        }


        //Check Invalid type
        filePath = getClass().getClassLoader().getResource("valuemap/invalid_type.csv").getFile();
        try {
            valueMapExportUtility.csvToValueMapModelListWithValidation(new File(filePath));
            fail();
        } catch (TransitionExportException expected) {
            log.debug(expected.getMessage());
            assertEquals(expected.getMessage(), "Invalid Type in CSV file while mapping to ValueMapModel : at line 3");
        }

        //Check duplicate key
        filePath = getClass().getClassLoader().getResource("valuemap/duplicate_key.csv").getFile();
        try {
            valueMapExportUtility.csvToValueMapModelListWithValidation(new File(filePath));
            fail();
        } catch (TransitionExportException expected) {
            log.debug(expected.getMessage());
            assertEquals(expected.getMessage(), "Duplicate Key (2)  at line 4");
        }

        //Check empty line
        filePath = getClass().getClassLoader().getResource("valuemap/empty_line.csv").getFile();
        try {
            valueMapExportUtility.csvToValueMapModelListWithValidation(new File(filePath));
            fail();
        } catch (TransitionExportException expected) {
            log.debug(expected.getMessage());
            assertEquals(expected.getMessage(), "Line is empty at line 3");
        }

    }

    @Test
    public void testImportValueMapWithDelete() throws IOException, TransitionExportException, DAOException {
        String filePath = getClass().getClassLoader().getResource("valuemap/delete_valuemap.csv").getFile();
        List<ValueMapModel> valueMapModelList = valueMapExportUtility.csvToValueMapModelListWithValidation(new File(filePath));
        valueMapExportUtility.importValueMap(valueMapModelList);
        for (int i =1; i <= 10; i++) {
            Assert.assertNull(valueMapManager.findById(i));
        }

        filePath = getClass().getClassLoader().getResource("valuemap/update.csv").getFile();
        valueMapModelList = valueMapExportUtility.csvToValueMapModelListWithValidation(new File(filePath));
        valueMapExportUtility.importValueMap(valueMapModelList);

        Assert.assertEquals("rettbemanning_update" ,valueMapManager.findById(500).getFormat());

    }

    @Test
    public void testInsert() throws IOException, TransitionExportException, DAOException {
        String filePath = getClass().getClassLoader().getResource("valuemap/insert.csv").getFile();
        List<ValueMapModel>  valueMapModelList = valueMapExportUtility.csvToValueMapModelListWithValidation(new File(filePath));
        List<Long> ids = new ArrayList<Long>();
        List<String> result = valueMapExportUtility.importValueMap(valueMapModelList);
        log.debug("===========>> " + result.toString());
    }


}
