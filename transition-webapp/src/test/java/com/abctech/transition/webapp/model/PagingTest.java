package com.abctech.transition.webapp.model;

import com.abctech.transition.core.dao.search.Paging;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PagingTest {
    private static final Logger log = LoggerFactory.getLogger(PagingTest.class);
    private Paging page;

    @Test
    public void testPaging() {
        page = new Paging();
        page.initialDatas(60, 6, 3);
        Assert.assertEquals(6, page.getPageSize());
        Assert.assertEquals(60, page.getTotalRecord());
        Assert.assertEquals(10, page.getTotalPage());
        Assert.assertEquals(3, page.getCurrentPage());
        Assert.assertEquals(2, page.getPrevPage());
        Assert.assertEquals(4, page.getNextPage());

        page = new Paging();
        page.initialDatas(60, 6, 1);
        Assert.assertEquals(1, page.getPrevPage());
        Assert.assertEquals(2, page.getNextPage());

        page = new Paging();
        page.initialDatas(60, 6, 10);
        Assert.assertEquals(9, page.getPrevPage());
        Assert.assertEquals(10, page.getNextPage());

        page = new Paging();
        page.initialDatas(60, 100, 10);
        Assert.assertEquals(100, page.getPageSize());
        Assert.assertEquals(60, page.getTotalRecord());
        Assert.assertEquals(1, page.getTotalPage());
        Assert.assertEquals(1, page.getCurrentPage());
        Assert.assertEquals(1, page.getPrevPage());
        Assert.assertEquals(1, page.getNextPage());
        Assert.assertNotNull(page.toString());

    }
}
