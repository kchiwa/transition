/*
 * An XML document type.
 * Localname: joblocationid
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.JoblocationidDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one joblocationid(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class JoblocationidDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.JoblocationidDocument
{
    private static final long serialVersionUID = 1L;
    
    public JoblocationidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JOBLOCATIONID$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "joblocationid");
    
    
    /**
     * Gets the "joblocationid" element
     */
    public java.lang.String getJoblocationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBLOCATIONID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "joblocationid" element
     */
    public org.apache.xmlbeans.XmlString xgetJoblocationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBLOCATIONID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "joblocationid" element
     */
    public void setJoblocationid(java.lang.String joblocationid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBLOCATIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOBLOCATIONID$0);
            }
            target.setStringValue(joblocationid);
        }
    }
    
    /**
     * Sets (as xml) the "joblocationid" element
     */
    public void xsetJoblocationid(org.apache.xmlbeans.XmlString joblocationid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBLOCATIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JOBLOCATIONID$0);
            }
            target.set(joblocationid);
        }
    }
}
