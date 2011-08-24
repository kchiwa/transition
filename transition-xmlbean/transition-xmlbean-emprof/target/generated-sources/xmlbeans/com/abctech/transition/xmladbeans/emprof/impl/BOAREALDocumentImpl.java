/*
 * An XML document type.
 * Localname: BOAREAL
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.BOAREALDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one BOAREAL(@) element.
 *
 * This is a complex type.
 */
public class BOAREALDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.BOAREALDocument
{
    private static final long serialVersionUID = 1L;
    
    public BOAREALDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOAREAL$0 = 
        new javax.xml.namespace.QName("", "BOAREAL");
    
    
    /**
     * Gets the "BOAREAL" element
     */
    public java.math.BigInteger getBOAREAL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOAREAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "BOAREAL" element
     */
    public org.apache.xmlbeans.XmlInteger xgetBOAREAL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BOAREAL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BOAREAL" element
     */
    public void setBOAREAL(java.math.BigInteger boareal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOAREAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOAREAL$0);
            }
            target.setBigIntegerValue(boareal);
        }
    }
    
    /**
     * Sets (as xml) the "BOAREAL" element
     */
    public void xsetBOAREAL(org.apache.xmlbeans.XmlInteger boareal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BOAREAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(BOAREAL$0);
            }
            target.set(boareal);
        }
    }
}
