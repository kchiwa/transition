package com.abctech.transition.webapp;

import com.abctech.transition.webapp.gui.InternationalizedMessage;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Locale;

public class InternationalizedMessageTest {

    private final Logger log = LoggerFactory.getLogger(InternationalizedMessageTest.class);

    @Test
    public void testWelcomeMessage(){
        Locale alocale = new Locale("nb","NO");
        InternationalizedMessage im = new InternationalizedMessage(alocale);
        Assert.assertNotNull(im.getWelcome());
    }
}
