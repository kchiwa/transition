/*
 * An XML document type.
 * Localname: BRUTTOAREAL
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.BRUTTOAREALDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one BRUTTOAREAL(@) element.
 *
 * This is a complex type.
 */
public class BRUTTOAREALDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.BRUTTOAREALDocument
{
    private static final long serialVersionUID = 1L;
    
    public BRUTTOAREALDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BRUTTOAREAL$0 = 
        new javax.xml.namespace.QName("", "BRUTTOAREAL");
    
    
    /**
     * Gets the "BRUTTOAREAL" element
     */
    public java.math.BigInteger getBRUTTOAREAL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRUTTOAREAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "BRUTTOAREAL" element
     */
    public org.apache.xmlbeans.XmlInteger xgetBRUTTOAREAL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BRUTTOAREAL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BRUTTOAREAL" element
     */
    public void setBRUTTOAREAL(java.math.BigInteger bruttoareal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRUTTOAREAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BRUTTOAREAL$0);
            }
            target.setBigIntegerValue(bruttoareal);
        }
    }
    
    /**
     * Sets (as xml) the "BRUTTOAREAL" element
     */
    public void xsetBRUTTOAREAL(org.apache.xmlbeans.XmlInteger bruttoareal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BRUTTOAREAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(BRUTTOAREAL$0);
            }
            target.set(bruttoareal);
        }
    }
}
