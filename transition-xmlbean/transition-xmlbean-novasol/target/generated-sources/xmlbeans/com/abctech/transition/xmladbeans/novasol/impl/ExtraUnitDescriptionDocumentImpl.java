/*
 * An XML document type.
 * Localname: ExtraUnitDescription
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.ExtraUnitDescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one ExtraUnitDescription(@) element.
 *
 * This is a complex type.
 */
public class ExtraUnitDescriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.ExtraUnitDescriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExtraUnitDescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTRAUNITDESCRIPTION$0 = 
        new javax.xml.namespace.QName("", "ExtraUnitDescription");
    
    
    /**
     * Gets the "ExtraUnitDescription" element
     */
    public java.lang.String getExtraUnitDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRAUNITDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExtraUnitDescription" element
     */
    public org.apache.xmlbeans.XmlString xgetExtraUnitDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRAUNITDESCRIPTION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ExtraUnitDescription" element
     */
    public void setExtraUnitDescription(java.lang.String extraUnitDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRAUNITDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTRAUNITDESCRIPTION$0);
            }
            target.setStringValue(extraUnitDescription);
        }
    }
    
    /**
     * Sets (as xml) the "ExtraUnitDescription" element
     */
    public void xsetExtraUnitDescription(org.apache.xmlbeans.XmlString extraUnitDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRAUNITDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTRAUNITDESCRIPTION$0);
            }
            target.set(extraUnitDescription);
        }
    }
}
