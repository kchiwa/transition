package com.abctech.transition.core.drivers.mediahandlers;

import com.abctech.transition.core.drivers.AMediaHandlerDriver;
import com.abctech.transition.core.drivers.xmlbeans.IadifestateforsaleDriver;

/**
 *
 */

public class HandleMediaIadifestateforsale extends AMediaHandlerDriver {

    public HandleMediaIadifestateforsale(IadifestateforsaleDriver driver) {
    	setXmlBeanDriver(driver);
    }

    @Override
    public void retrieveMediaStateList() {
        // This format we handle media later not here
    }
}
