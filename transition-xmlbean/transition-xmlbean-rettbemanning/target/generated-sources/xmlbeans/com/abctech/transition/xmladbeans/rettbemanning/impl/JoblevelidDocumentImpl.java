/*
 * An XML document type.
 * Localname: joblevelid
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.JoblevelidDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one joblevelid(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class JoblevelidDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.JoblevelidDocument
{
    private static final long serialVersionUID = 1L;
    
    public JoblevelidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JOBLEVELID$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "joblevelid");
    
    
    /**
     * Gets the "joblevelid" element
     */
    public java.lang.String getJoblevelid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBLEVELID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "joblevelid" element
     */
    public org.apache.xmlbeans.XmlString xgetJoblevelid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBLEVELID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "joblevelid" element
     */
    public void setJoblevelid(java.lang.String joblevelid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBLEVELID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOBLEVELID$0);
            }
            target.setStringValue(joblevelid);
        }
    }
    
    /**
     * Sets (as xml) the "joblevelid" element
     */
    public void xsetJoblevelid(org.apache.xmlbeans.XmlString joblevelid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBLEVELID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JOBLEVELID$0);
            }
            target.set(joblevelid);
        }
    }
}
