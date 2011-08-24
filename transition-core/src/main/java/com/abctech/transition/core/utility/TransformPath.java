package com.abctech.transition.core.utility;

// FIXME is this bean used? CR:2011-08-15, if so moved it to bean packages.
public class TransformPath {
    // TODO CR Erlend 08042011 Why is not the bean in the bean directory.
    private String xmlPath;
    private String xslPath;

    public void setXmlPath(String xmlPath) {
        this.xmlPath = xmlPath;
    }

    public String getXmlPath() {
        return this.xmlPath;
    }

    public void setXslPath(String xslPath) {
        this.xslPath = xslPath;
    }

    public String getXslPath() {
        return this.xslPath;
    }
}
