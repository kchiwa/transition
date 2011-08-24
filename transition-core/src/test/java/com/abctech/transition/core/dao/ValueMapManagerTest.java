package com.abctech.transition.core.dao;

import com.abctech.transition.core.dao.valuemap.IValueMapExportManager;
import com.abctech.transition.core.dao.valuemap.ValueMapManager;
import com.abctech.transition.core.dao.valuemap.ValueMapModel;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.DAOException;
import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/transition-core-dao-test.xml"})
public class ValueMapManagerTest extends AbstractTransactionalJUnit4SpringContextTests {
    private static final Logger log = LoggerFactory.getLogger(ValueMapManagerTest.class);

    private ValueMapModel valueMapModel;

    @Autowired
    private ValueMapManager valueMapManager;

    @Autowired
    private IValueMapExportManager valueMapExportManager;

   @Autowired
    private DatabaseCreator initialTestDatabaseCreator;


    @Before
    public void initialData() throws Exception {
    	initialTestDatabaseCreator.checkDatabase();
        valueMapManager.loadValueMapToHashMap();
        log.debug("initialDataBase");
    }

    @Test
    public void testManager() throws DAOException {

        //Try to add the empty object
        valueMapModel = new ValueMapModel();

        //Try to Add new object
        valueMapModel = new ValueMapModel();
        valueMapModel.setField("field");
        valueMapModel.setFormat(CustomerFormat.CARWEB.toTextValue());
        valueMapModel.setLookup("lookup");
        valueMapModel.setZettValue("zettvalue");
        valueMapModel.setUpdatedtime(new DateTime(1311062802));
        Assert.assertNotNull(valueMapManager.save(valueMapModel));

        valueMapModel = new ValueMapModel();
        valueMapModel.setField("field2");
        valueMapModel.setFormat("carweb2");
        valueMapModel.setLookup("lookup2");
        valueMapModel.setZettValue("zettvalue2");
        Assert.assertNotNull( valueMapManager.save(valueMapModel) );

        valueMapModel = new ValueMapModel();
        valueMapModel.setField("field3");
        valueMapModel.setFormat("carweb3");
        valueMapModel.setLookup("lookup3");
        valueMapModel.setZettValue("zettvalue3");
        Assert.assertNotNull( valueMapManager.save(valueMapModel) );

        //Try to delete the existed object
        Assert.assertTrue(valueMapManager.delete(2));

        //Try to delete the non existed object
        Assert.assertFalse( valueMapManager.delete(10000) );

        //try to update existed object
        valueMapModel = valueMapManager.findById(1);
        valueMapModel.setField("new field");
        Assert.assertNotNull( valueMapManager.save(valueMapModel) );
        Assert.assertEquals( "new field", valueMapModel.getField() );
        log.debug(" =====>>>>>> " + valueMapManager.lookupValue("carweb2","field2", "lookup2") );

        /** **/
    }

    @Test
    public void testSaveTransition() throws DAOException {
        //Try to Add new object
        valueMapModel = new ValueMapModel();
        valueMapModel.setField("field");
        valueMapModel.setFormat(CustomerFormat.CARWEB.toTextValue());
        valueMapModel.setLookup("lookup");
        valueMapModel.setZettValue("zettvalue");

        valueMapModel =  valueMapExportManager.save(valueMapModel);
        Assert.assertNotNull(valueMapModel.getId());
    }


}
