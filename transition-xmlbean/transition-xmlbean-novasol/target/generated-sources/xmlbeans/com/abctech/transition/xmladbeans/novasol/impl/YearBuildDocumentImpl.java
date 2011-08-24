/*
 * An XML document type.
 * Localname: YearBuild
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.YearBuildDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one YearBuild(@) element.
 *
 * This is a complex type.
 */
public class YearBuildDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.YearBuildDocument
{
    private static final long serialVersionUID = 1L;
    
    public YearBuildDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName YEARBUILD$0 = 
        new javax.xml.namespace.QName("", "YearBuild");
    
    
    /**
     * Gets the "YearBuild" element
     */
    public java.math.BigInteger getYearBuild()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YEARBUILD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "YearBuild" element
     */
    public org.apache.xmlbeans.XmlInteger xgetYearBuild()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(YEARBUILD$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "YearBuild" element
     */
    public void setYearBuild(java.math.BigInteger yearBuild)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YEARBUILD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(YEARBUILD$0);
            }
            target.setBigIntegerValue(yearBuild);
        }
    }
    
    /**
     * Sets (as xml) the "YearBuild" element
     */
    public void xsetYearBuild(org.apache.xmlbeans.XmlInteger yearBuild)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(YEARBUILD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(YEARBUILD$0);
            }
            target.set(yearBuild);
        }
    }
}
