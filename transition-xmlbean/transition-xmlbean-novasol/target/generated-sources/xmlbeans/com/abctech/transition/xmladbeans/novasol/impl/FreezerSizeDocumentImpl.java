/*
 * An XML document type.
 * Localname: FreezerSize
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.FreezerSizeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one FreezerSize(@) element.
 *
 * This is a complex type.
 */
public class FreezerSizeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.FreezerSizeDocument
{
    private static final long serialVersionUID = 1L;
    
    public FreezerSizeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FREEZERSIZE$0 = 
        new javax.xml.namespace.QName("", "FreezerSize");
    
    
    /**
     * Gets the "FreezerSize" element
     */
    public java.lang.String getFreezerSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREEZERSIZE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FreezerSize" element
     */
    public org.apache.xmlbeans.XmlString xgetFreezerSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FREEZERSIZE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FreezerSize" element
     */
    public void setFreezerSize(java.lang.String freezerSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREEZERSIZE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FREEZERSIZE$0);
            }
            target.setStringValue(freezerSize);
        }
    }
    
    /**
     * Sets (as xml) the "FreezerSize" element
     */
    public void xsetFreezerSize(org.apache.xmlbeans.XmlString freezerSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FREEZERSIZE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FREEZERSIZE$0);
            }
            target.set(freezerSize);
        }
    }
}
