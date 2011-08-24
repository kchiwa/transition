package com.abctech.transition.core.drivers.mediahandlers;

import com.abctech.transition.core.dao.mediastate.MediaStateModel;
import com.abctech.transition.core.drivers.AMediaHandlerDriver;
import com.abctech.transition.core.drivers.xmlbeans.RettbemanningDriver;
import com.abctech.transition.core.enumeration.MediaStateContentType;
import com.abctech.transition.core.enumeration.MediaStatus;
import com.abctech.transition.xmladbeans.rettbemanning.ItemDocument;
import com.abctech.transition.xmladbeans.rettbemanning.RssDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Pun (pun@abctech-thailand.com)
 * @since 2011-05-12
 */
public class HandleMediaRettbemanning extends AMediaHandlerDriver {
    private final static Logger log = LoggerFactory.getLogger(HandleMediaRettbemanning.class);
    private ItemDocument.Item item = null;

    public HandleMediaRettbemanning(RettbemanningDriver rettbemanningDriver) {
        this.setXmlBeanDriver(rettbemanningDriver);
        RssDocument channelDocument = (RssDocument) getXmlBeanDriver().getDriverRootXmlBeanDocument();
        item = channelDocument.getRss().getChannel().getItemArray(0);
    }

    @Override
    public void retrieveMediaStateList() {
        if (item.getCompanylogourl() != null && item.getCompanylogourl().length() > 0) {
            MediaStateModel mediaStateModel = new MediaStateModel();
            mediaStateModel.setMediaStatus(MediaStatus.MISSING); // Default as missing
            mediaStateModel.setContentType(MediaStateContentType.LOGO);
            mediaStateModel.setTitle(item.getCompany());
            mediaStateModel.setExtref(item.getCompanylogourl().trim());
            mediaStateModel.setMediaFileName(item.getCompanylogourl().substring(item.getCompanylogourl().lastIndexOf('?') + 1).trim().replace("=", "") + ".jpg");
            mediaStateModel.setSequenceNum(1);
            mediaStateModel.setAdStateModel(getAdStateModel());
            getMediaStateModelList().add(mediaStateModel);
        }

        if (getMediaStateModelList() != null && getMediaStateModelList().size() > 0) {
            log.debug("Found " + getMediaStateModelList().size() + " media in the ad");
        }
    }
}
