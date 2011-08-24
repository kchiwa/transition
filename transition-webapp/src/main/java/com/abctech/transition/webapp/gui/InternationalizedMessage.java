package com.abctech.transition.webapp.gui;

import java.util.Locale;
import java.util.ResourceBundle;

public class InternationalizedMessage {

    private ResourceBundle messages;

    public InternationalizedMessage(Locale currentLocale){
        messages = ResourceBundle.getBundle("InternationalizedMessage",currentLocale);
    }

    public String getWelcome() {
        String welcome;
        welcome = messages.getString("welcome");
        return welcome;
    }
}
