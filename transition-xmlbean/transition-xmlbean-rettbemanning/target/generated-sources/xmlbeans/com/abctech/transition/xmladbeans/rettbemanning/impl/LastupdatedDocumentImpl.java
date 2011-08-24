/*
 * An XML document type.
 * Localname: lastupdated
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.LastupdatedDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one lastupdated(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class LastupdatedDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.LastupdatedDocument
{
    private static final long serialVersionUID = 1L;
    
    public LastupdatedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LASTUPDATED$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "lastupdated");
    
    
    /**
     * Gets the "lastupdated" element
     */
    public java.lang.String getLastupdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTUPDATED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "lastupdated" element
     */
    public org.apache.xmlbeans.XmlString xgetLastupdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTUPDATED$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "lastupdated" element
     */
    public void setLastupdated(java.lang.String lastupdated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTUPDATED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTUPDATED$0);
            }
            target.setStringValue(lastupdated);
        }
    }
    
    /**
     * Sets (as xml) the "lastupdated" element
     */
    public void xsetLastupdated(org.apache.xmlbeans.XmlString lastupdated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTUPDATED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LASTUPDATED$0);
            }
            target.set(lastupdated);
        }
    }
}
