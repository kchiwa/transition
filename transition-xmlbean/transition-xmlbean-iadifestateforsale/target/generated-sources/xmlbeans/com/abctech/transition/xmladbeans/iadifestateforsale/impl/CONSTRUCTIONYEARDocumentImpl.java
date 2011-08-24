/*
 * An XML document type.
 * Localname: CONSTRUCTION_YEAR
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.CONSTRUCTIONYEARDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one CONSTRUCTION_YEAR(@) element.
 *
 * This is a complex type.
 */
public class CONSTRUCTIONYEARDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.CONSTRUCTIONYEARDocument
{
    private static final long serialVersionUID = 1L;
    
    public CONSTRUCTIONYEARDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONSTRUCTIONYEAR$0 = 
        new javax.xml.namespace.QName("", "CONSTRUCTION_YEAR");
    
    
    /**
     * Gets the "CONSTRUCTION_YEAR" element
     */
    public java.lang.String getCONSTRUCTIONYEAR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONSTRUCTIONYEAR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CONSTRUCTION_YEAR" element
     */
    public org.apache.xmlbeans.XmlString xgetCONSTRUCTIONYEAR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONSTRUCTIONYEAR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CONSTRUCTION_YEAR" element
     */
    public void setCONSTRUCTIONYEAR(java.lang.String constructionyear)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONSTRUCTIONYEAR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONSTRUCTIONYEAR$0);
            }
            target.setStringValue(constructionyear);
        }
    }
    
    /**
     * Sets (as xml) the "CONSTRUCTION_YEAR" element
     */
    public void xsetCONSTRUCTIONYEAR(org.apache.xmlbeans.XmlString constructionyear)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONSTRUCTIONYEAR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONSTRUCTIONYEAR$0);
            }
            target.set(constructionyear);
        }
    }
}
