/*
 * An XML document type.
 * Localname: INCLUDES
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.INCLUDESDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one INCLUDES(@) element.
 *
 * This is a complex type.
 */
public class INCLUDESDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.INCLUDESDocument
{
    private static final long serialVersionUID = 1L;
    
    public INCLUDESDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCLUDES$0 = 
        new javax.xml.namespace.QName("", "INCLUDES");
    
    
    /**
     * Gets the "INCLUDES" element
     */
    public java.lang.String getINCLUDES()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCLUDES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "INCLUDES" element
     */
    public org.apache.xmlbeans.XmlString xgetINCLUDES()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCLUDES$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "INCLUDES" element
     */
    public void setINCLUDES(java.lang.String includes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCLUDES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCLUDES$0);
            }
            target.setStringValue(includes);
        }
    }
    
    /**
     * Sets (as xml) the "INCLUDES" element
     */
    public void xsetINCLUDES(org.apache.xmlbeans.XmlString includes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCLUDES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INCLUDES$0);
            }
            target.set(includes);
        }
    }
}
