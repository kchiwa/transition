/*
 * An XML attribute type.
 * Localname: user_login
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.oldonlinebooking.UserLoginAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.oldonlinebooking.impl;
/**
 * A document containing one user_login(@) attribute.
 *
 * This is a complex type.
 */
public class UserLoginAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.oldonlinebooking.UserLoginAttribute
{
    private static final long serialVersionUID = 1L;
    
    public UserLoginAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERLOGIN$0 = 
        new javax.xml.namespace.QName("", "user_login");
    
    
    /**
     * Gets the "user_login" attribute
     */
    public java.lang.String getUserLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERLOGIN$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "user_login" attribute
     */
    public org.apache.xmlbeans.XmlString xgetUserLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USERLOGIN$0);
            return target;
        }
    }
    
    /**
     * True if has "user_login" attribute
     */
    public boolean isSetUserLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(USERLOGIN$0) != null;
        }
    }
    
    /**
     * Sets the "user_login" attribute
     */
    public void setUserLogin(java.lang.String userLogin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERLOGIN$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USERLOGIN$0);
            }
            target.setStringValue(userLogin);
        }
    }
    
    /**
     * Sets (as xml) the "user_login" attribute
     */
    public void xsetUserLogin(org.apache.xmlbeans.XmlString userLogin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USERLOGIN$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(USERLOGIN$0);
            }
            target.set(userLogin);
        }
    }
    
    /**
     * Unsets the "user_login" attribute
     */
    public void unsetUserLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(USERLOGIN$0);
        }
    }
}
