/*
 * An XML document type.
 * Localname: stateid
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.StateidDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one stateid(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class StateidDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.StateidDocument
{
    private static final long serialVersionUID = 1L;
    
    public StateidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATEID$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "stateid");
    
    
    /**
     * Gets the "stateid" element
     */
    public java.lang.String getStateid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "stateid" element
     */
    public org.apache.xmlbeans.XmlString xgetStateid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATEID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "stateid" element
     */
    public void setStateid(java.lang.String stateid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATEID$0);
            }
            target.setStringValue(stateid);
        }
    }
    
    /**
     * Sets (as xml) the "stateid" element
     */
    public void xsetStateid(org.apache.xmlbeans.XmlString stateid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATEID$0);
            }
            target.set(stateid);
        }
    }
}
