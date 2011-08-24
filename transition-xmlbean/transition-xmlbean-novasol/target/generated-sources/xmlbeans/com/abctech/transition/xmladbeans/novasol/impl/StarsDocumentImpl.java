/*
 * An XML document type.
 * Localname: Stars
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.StarsDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Stars(@) element.
 *
 * This is a complex type.
 */
public class StarsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.StarsDocument
{
    private static final long serialVersionUID = 1L;
    
    public StarsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STARS$0 = 
        new javax.xml.namespace.QName("", "Stars");
    
    
    /**
     * Gets the "Stars" element
     */
    public java.math.BigInteger getStars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "Stars" element
     */
    public org.apache.xmlbeans.XmlInteger xgetStars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(STARS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Stars" element
     */
    public void setStars(java.math.BigInteger stars)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARS$0);
            }
            target.setBigIntegerValue(stars);
        }
    }
    
    /**
     * Sets (as xml) the "Stars" element
     */
    public void xsetStars(org.apache.xmlbeans.XmlInteger stars)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(STARS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(STARS$0);
            }
            target.set(stars);
        }
    }
}
