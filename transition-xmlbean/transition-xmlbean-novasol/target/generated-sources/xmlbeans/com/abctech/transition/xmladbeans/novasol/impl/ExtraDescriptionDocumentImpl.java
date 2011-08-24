/*
 * An XML document type.
 * Localname: ExtraDescription
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.ExtraDescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one ExtraDescription(@) element.
 *
 * This is a complex type.
 */
public class ExtraDescriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.ExtraDescriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExtraDescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTRADESCRIPTION$0 = 
        new javax.xml.namespace.QName("", "ExtraDescription");
    
    
    /**
     * Gets the "ExtraDescription" element
     */
    public java.lang.String getExtraDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRADESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExtraDescription" element
     */
    public org.apache.xmlbeans.XmlString xgetExtraDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRADESCRIPTION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ExtraDescription" element
     */
    public void setExtraDescription(java.lang.String extraDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRADESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTRADESCRIPTION$0);
            }
            target.setStringValue(extraDescription);
        }
    }
    
    /**
     * Sets (as xml) the "ExtraDescription" element
     */
    public void xsetExtraDescription(org.apache.xmlbeans.XmlString extraDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRADESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTRADESCRIPTION$0);
            }
            target.set(extraDescription);
        }
    }
}
