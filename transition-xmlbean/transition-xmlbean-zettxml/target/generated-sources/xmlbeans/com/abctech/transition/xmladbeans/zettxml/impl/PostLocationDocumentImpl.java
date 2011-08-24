/*
 * An XML document type.
 * Localname: PostLocation
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.zettxml.PostLocationDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.zettxml.impl;
/**
 * A document containing one PostLocation(@) element.
 *
 * This is a complex type.
 */
public class PostLocationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.zettxml.PostLocationDocument
{
    private static final long serialVersionUID = 1L;
    
    public PostLocationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSTLOCATION$0 = 
        new javax.xml.namespace.QName("", "PostLocation");
    
    
    /**
     * Gets the "PostLocation" element
     */
    public java.lang.String getPostLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTLOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PostLocation" element
     */
    public org.apache.xmlbeans.XmlString xgetPostLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSTLOCATION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PostLocation" element
     */
    public void setPostLocation(java.lang.String postLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTLOCATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTLOCATION$0);
            }
            target.setStringValue(postLocation);
        }
    }
    
    /**
     * Sets (as xml) the "PostLocation" element
     */
    public void xsetPostLocation(org.apache.xmlbeans.XmlString postLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSTLOCATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POSTLOCATION$0);
            }
            target.set(postLocation);
        }
    }
}
