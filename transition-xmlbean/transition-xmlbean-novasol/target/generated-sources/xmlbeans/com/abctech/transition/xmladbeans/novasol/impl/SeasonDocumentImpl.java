/*
 * An XML document type.
 * Localname: Season
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.SeasonDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Season(@) element.
 *
 * This is a complex type.
 */
public class SeasonDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.SeasonDocument
{
    private static final long serialVersionUID = 1L;
    
    public SeasonDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEASON$0 = 
        new javax.xml.namespace.QName("", "Season");
    
    
    /**
     * Gets the "Season" element
     */
    public java.math.BigInteger getSeason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEASON$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "Season" element
     */
    public org.apache.xmlbeans.XmlInteger xgetSeason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SEASON$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Season" element
     */
    public void setSeason(java.math.BigInteger season)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEASON$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEASON$0);
            }
            target.setBigIntegerValue(season);
        }
    }
    
    /**
     * Sets (as xml) the "Season" element
     */
    public void xsetSeason(org.apache.xmlbeans.XmlInteger season)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SEASON$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(SEASON$0);
            }
            target.set(season);
        }
    }
}
