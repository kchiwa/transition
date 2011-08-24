package com.abctech.transition.webapp.model;

import com.abctech.transition.core.dao.filestate.FileStateModel;
import com.abctech.transition.core.dao.mediastate.MediaStateModel;
import com.abctech.transition.core.dao.search.AdInformationBean;
import com.abctech.transition.core.enumeration.CustomerFormat;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AdStateDataModelTest {
    private static final Long fileStateId = new Long(1);

    @Test
    public void testInitialize(){

        AdInformationBean adInformationBean = new AdInformationBean();
        adInformationBean.setFileStateModel(getFileStateModel());
        adInformationBean.setMediaStateModelsList(getMediaStateModelList());
        Assert.assertNotNull(adInformationBean);
    }

    private FileStateModel getFileStateModel(){

        //create fileStateModel
        FileStateModel fileStateModel = new FileStateModel();
        fileStateModel.setId(fileStateId);
        fileStateModel.setClientName(CustomerFormat.CARWEB.toTextValue());
        fileStateModel.setCustomerFormat(CustomerFormat.CARWEB.toTextValue());
        fileStateModel.setFileName("carweb.xml");

        return fileStateModel;
    }

    private List<MediaStateModel> getMediaStateModelList(){
        List<MediaStateModel> mediaStateModelList = new ArrayList<MediaStateModel>();

        MediaStateModel mediaStateModel1 = new MediaStateModel();
        mediaStateModel1.setId(new Long(1));
        mediaStateModelList.add(mediaStateModel1);

        MediaStateModel mediaStateModel2 = new MediaStateModel();
        mediaStateModel2.setId(new Long(2));
        mediaStateModelList.add(mediaStateModel2);

        return mediaStateModelList;
    }
}
