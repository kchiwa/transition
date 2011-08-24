/*
 * An XML document type.
 * Localname: joblocation
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.JoblocationDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one joblocation(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class JoblocationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.JoblocationDocument
{
    private static final long serialVersionUID = 1L;
    
    public JoblocationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JOBLOCATION$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "joblocation");
    
    
    /**
     * Gets the "joblocation" element
     */
    public java.lang.String getJoblocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBLOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "joblocation" element
     */
    public org.apache.xmlbeans.XmlString xgetJoblocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBLOCATION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "joblocation" element
     */
    public void setJoblocation(java.lang.String joblocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBLOCATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOBLOCATION$0);
            }
            target.setStringValue(joblocation);
        }
    }
    
    /**
     * Sets (as xml) the "joblocation" element
     */
    public void xsetJoblocation(org.apache.xmlbeans.XmlString joblocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBLOCATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JOBLOCATION$0);
            }
            target.set(joblocation);
        }
    }
}
