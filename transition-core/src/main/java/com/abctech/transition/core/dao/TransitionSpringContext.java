package com.abctech.transition.core.dao;

import com.abctech.transition.core.TransitionProperties;
import com.abctech.transition.core.dao.adstate.IAdStateManager;
import com.abctech.transition.core.dao.filestate.IFileStateManager;
import com.abctech.transition.core.dao.mediastate.IMediaStateManager;
import com.abctech.transition.core.dao.partnermap.IPartnerMapManager;
import com.abctech.transition.core.dao.utility.novasol.PictureManager;
import com.abctech.transition.core.dao.utility.novasol.PriceManager;
import no.api.pantheon.spring.SpringApplicationContext;

/**
 * TODO CR Erlend 20110425: This class should be deprecated and remove. It should not be
 * necessary for a spring lookup helper within the spring environment.
 */
public final class TransitionSpringContext {

    private TransitionSpringContext() {
    }

    public static IAdStateManager getAdStateManager() {
        return (IAdStateManager) SpringApplicationContext.getApplicationContext().getBean("adStateManager");
    }

    public static IMediaStateManager getMediaStateManager() {
        return (IMediaStateManager) SpringApplicationContext.getApplicationContext().getBean("mediaStateManager");
    }

    public static IFileStateManager getFileStateManager() {
        return (IFileStateManager) SpringApplicationContext.getApplicationContext().getBean("fileStateManager");
    }

    public static IPartnerMapManager getPartnerMapManager() {
        return (IPartnerMapManager) SpringApplicationContext.getApplicationContext().getBean("partnerMapManager");
    }

    public static TransitionProperties getTransitionProperties() {
        return (TransitionProperties) SpringApplicationContext.getApplicationContext().getBean("transitionProperties");
    }
    // FIXME This can be moved to somewhere else
    public static PictureManager getNovasolPictureManager() {
        return (PictureManager) SpringApplicationContext.getApplicationContext().getBean("pictureManager");
    }

    public static PriceManager getNovasolPriceManager() {
        return (PriceManager) SpringApplicationContext.getApplicationContext().getBean("priceManager");
    }
}
