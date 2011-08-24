/*
 * An XML document type.
 * Localname: BuiltYear
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.BuiltYearDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one BuiltYear(@) element.
 *
 * This is a complex type.
 */
public class BuiltYearDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.BuiltYearDocument
{
    private static final long serialVersionUID = 1L;
    
    public BuiltYearDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUILTYEAR$0 = 
        new javax.xml.namespace.QName("", "BuiltYear");
    
    
    /**
     * Gets the "BuiltYear" element
     */
    public java.math.BigInteger getBuiltYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUILTYEAR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "BuiltYear" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetBuiltYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(BUILTYEAR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BuiltYear" element
     */
    public void setBuiltYear(java.math.BigInteger builtYear)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUILTYEAR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUILTYEAR$0);
            }
            target.setBigIntegerValue(builtYear);
        }
    }
    
    /**
     * Sets (as xml) the "BuiltYear" element
     */
    public void xsetBuiltYear(org.apache.xmlbeans.XmlPositiveInteger builtYear)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(BUILTYEAR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(BUILTYEAR$0);
            }
            target.set(builtYear);
        }
    }
}
