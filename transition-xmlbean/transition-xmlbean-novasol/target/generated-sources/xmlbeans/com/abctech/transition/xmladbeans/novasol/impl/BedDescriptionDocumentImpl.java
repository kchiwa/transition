/*
 * An XML document type.
 * Localname: BedDescription
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.BedDescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one BedDescription(@) element.
 *
 * This is a complex type.
 */
public class BedDescriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.BedDescriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public BedDescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BEDDESCRIPTION$0 = 
        new javax.xml.namespace.QName("", "BedDescription");
    
    
    /**
     * Gets the "BedDescription" element
     */
    public java.lang.String getBedDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEDDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BedDescription" element
     */
    public org.apache.xmlbeans.XmlString xgetBedDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BEDDESCRIPTION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BedDescription" element
     */
    public void setBedDescription(java.lang.String bedDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEDDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BEDDESCRIPTION$0);
            }
            target.setStringValue(bedDescription);
        }
    }
    
    /**
     * Sets (as xml) the "BedDescription" element
     */
    public void xsetBedDescription(org.apache.xmlbeans.XmlString bedDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BEDDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BEDDESCRIPTION$0);
            }
            target.set(bedDescription);
        }
    }
}
