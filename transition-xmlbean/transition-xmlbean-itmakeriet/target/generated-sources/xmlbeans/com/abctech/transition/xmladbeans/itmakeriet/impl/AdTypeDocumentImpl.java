/*
 * An XML document type.
 * Localname: AdType
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.AdTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one AdType(@) element.
 *
 * This is a complex type.
 */
public class AdTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.AdTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public AdTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADTYPE$0 = 
        new javax.xml.namespace.QName("", "AdType");
    
    
    /**
     * Gets the "AdType" element
     */
    public java.lang.String getAdType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AdType" element
     */
    public org.apache.xmlbeans.XmlString xgetAdType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AdType" element
     */
    public void setAdType(java.lang.String adType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADTYPE$0);
            }
            target.setStringValue(adType);
        }
    }
    
    /**
     * Sets (as xml) the "AdType" element
     */
    public void xsetAdType(org.apache.xmlbeans.XmlString adType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADTYPE$0);
            }
            target.set(adType);
        }
    }
}
