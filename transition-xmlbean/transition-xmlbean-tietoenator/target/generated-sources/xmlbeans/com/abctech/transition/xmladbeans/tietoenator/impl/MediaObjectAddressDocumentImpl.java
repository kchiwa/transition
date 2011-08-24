/*
 * An XML document type.
 * Localname: media_object_address
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.MediaObjectAddressDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one media_object_address(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class MediaObjectAddressDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.MediaObjectAddressDocument
{
    private static final long serialVersionUID = 1L;
    
    public MediaObjectAddressDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDIAOBJECTADDRESS$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "media_object_address");
    
    
    /**
     * Gets the "media_object_address" element
     */
    public java.lang.String getMediaObjectAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIAOBJECTADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "media_object_address" element
     */
    public org.apache.xmlbeans.XmlString xgetMediaObjectAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIAOBJECTADDRESS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "media_object_address" element
     */
    public void setMediaObjectAddress(java.lang.String mediaObjectAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIAOBJECTADDRESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEDIAOBJECTADDRESS$0);
            }
            target.setStringValue(mediaObjectAddress);
        }
    }
    
    /**
     * Sets (as xml) the "media_object_address" element
     */
    public void xsetMediaObjectAddress(org.apache.xmlbeans.XmlString mediaObjectAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIAOBJECTADDRESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEDIAOBJECTADDRESS$0);
            }
            target.set(mediaObjectAddress);
        }
    }
}
