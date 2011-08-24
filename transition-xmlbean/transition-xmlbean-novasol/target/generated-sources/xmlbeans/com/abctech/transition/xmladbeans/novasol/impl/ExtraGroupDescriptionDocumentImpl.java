/*
 * An XML document type.
 * Localname: ExtraGroupDescription
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.ExtraGroupDescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one ExtraGroupDescription(@) element.
 *
 * This is a complex type.
 */
public class ExtraGroupDescriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.ExtraGroupDescriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExtraGroupDescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTRAGROUPDESCRIPTION$0 = 
        new javax.xml.namespace.QName("", "ExtraGroupDescription");
    
    
    /**
     * Gets the "ExtraGroupDescription" element
     */
    public java.lang.String getExtraGroupDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRAGROUPDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExtraGroupDescription" element
     */
    public org.apache.xmlbeans.XmlString xgetExtraGroupDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRAGROUPDESCRIPTION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ExtraGroupDescription" element
     */
    public void setExtraGroupDescription(java.lang.String extraGroupDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRAGROUPDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTRAGROUPDESCRIPTION$0);
            }
            target.setStringValue(extraGroupDescription);
        }
    }
    
    /**
     * Sets (as xml) the "ExtraGroupDescription" element
     */
    public void xsetExtraGroupDescription(org.apache.xmlbeans.XmlString extraGroupDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRAGROUPDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTRAGROUPDESCRIPTION$0);
            }
            target.set(extraGroupDescription);
        }
    }
}
