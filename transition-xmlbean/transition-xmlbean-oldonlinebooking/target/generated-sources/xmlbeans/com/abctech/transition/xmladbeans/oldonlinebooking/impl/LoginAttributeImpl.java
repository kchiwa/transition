/*
 * An XML attribute type.
 * Localname: login
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.oldonlinebooking.LoginAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.oldonlinebooking.impl;
/**
 * A document containing one login(@) attribute.
 *
 * This is a complex type.
 */
public class LoginAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.oldonlinebooking.LoginAttribute
{
    private static final long serialVersionUID = 1L;
    
    public LoginAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOGIN$0 = 
        new javax.xml.namespace.QName("", "login");
    
    
    /**
     * Gets the "login" attribute
     */
    public java.lang.String getLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOGIN$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "login" attribute
     */
    public org.apache.xmlbeans.XmlString xgetLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOGIN$0);
            return target;
        }
    }
    
    /**
     * True if has "login" attribute
     */
    public boolean isSetLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LOGIN$0) != null;
        }
    }
    
    /**
     * Sets the "login" attribute
     */
    public void setLogin(java.lang.String login)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOGIN$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOGIN$0);
            }
            target.setStringValue(login);
        }
    }
    
    /**
     * Sets (as xml) the "login" attribute
     */
    public void xsetLogin(org.apache.xmlbeans.XmlString login)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOGIN$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LOGIN$0);
            }
            target.set(login);
        }
    }
    
    /**
     * Unsets the "login" attribute
     */
    public void unsetLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LOGIN$0);
        }
    }
}
