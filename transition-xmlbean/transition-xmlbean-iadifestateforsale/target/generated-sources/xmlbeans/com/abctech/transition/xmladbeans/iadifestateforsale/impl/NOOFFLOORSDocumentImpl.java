/*
 * An XML document type.
 * Localname: NO_OF_FLOORS
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.NOOFFLOORSDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one NO_OF_FLOORS(@) element.
 *
 * This is a complex type.
 */
public class NOOFFLOORSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.NOOFFLOORSDocument
{
    private static final long serialVersionUID = 1L;
    
    public NOOFFLOORSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOOFFLOORS$0 = 
        new javax.xml.namespace.QName("", "NO_OF_FLOORS");
    
    
    /**
     * Gets the "NO_OF_FLOORS" element
     */
    public java.lang.String getNOOFFLOORS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOOFFLOORS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NO_OF_FLOORS" element
     */
    public org.apache.xmlbeans.XmlString xgetNOOFFLOORS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOOFFLOORS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NO_OF_FLOORS" element
     */
    public void setNOOFFLOORS(java.lang.String nooffloors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOOFFLOORS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOOFFLOORS$0);
            }
            target.setStringValue(nooffloors);
        }
    }
    
    /**
     * Sets (as xml) the "NO_OF_FLOORS" element
     */
    public void xsetNOOFFLOORS(org.apache.xmlbeans.XmlString nooffloors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOOFFLOORS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOOFFLOORS$0);
            }
            target.set(nooffloors);
        }
    }
}
