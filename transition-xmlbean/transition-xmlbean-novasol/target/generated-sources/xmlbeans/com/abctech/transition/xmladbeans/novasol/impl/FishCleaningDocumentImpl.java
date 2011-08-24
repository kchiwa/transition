/*
 * An XML document type.
 * Localname: FishCleaning
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.FishCleaningDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one FishCleaning(@) element.
 *
 * This is a complex type.
 */
public class FishCleaningDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.FishCleaningDocument
{
    private static final long serialVersionUID = 1L;
    
    public FishCleaningDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FISHCLEANING$0 = 
        new javax.xml.namespace.QName("", "FishCleaning");
    
    
    /**
     * Gets the "FishCleaning" element
     */
    public java.lang.String getFishCleaning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FISHCLEANING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FishCleaning" element
     */
    public org.apache.xmlbeans.XmlString xgetFishCleaning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FISHCLEANING$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FishCleaning" element
     */
    public void setFishCleaning(java.lang.String fishCleaning)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FISHCLEANING$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FISHCLEANING$0);
            }
            target.setStringValue(fishCleaning);
        }
    }
    
    /**
     * Sets (as xml) the "FishCleaning" element
     */
    public void xsetFishCleaning(org.apache.xmlbeans.XmlString fishCleaning)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FISHCLEANING$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FISHCLEANING$0);
            }
            target.set(fishCleaning);
        }
    }
}
