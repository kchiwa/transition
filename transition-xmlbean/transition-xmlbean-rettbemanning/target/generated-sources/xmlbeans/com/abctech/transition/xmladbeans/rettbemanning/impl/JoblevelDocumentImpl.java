/*
 * An XML document type.
 * Localname: joblevel
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.JoblevelDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one joblevel(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class JoblevelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.JoblevelDocument
{
    private static final long serialVersionUID = 1L;
    
    public JoblevelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JOBLEVEL$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "joblevel");
    
    
    /**
     * Gets the "joblevel" element
     */
    public java.lang.String getJoblevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBLEVEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "joblevel" element
     */
    public org.apache.xmlbeans.XmlString xgetJoblevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBLEVEL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "joblevel" element
     */
    public void setJoblevel(java.lang.String joblevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBLEVEL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOBLEVEL$0);
            }
            target.setStringValue(joblevel);
        }
    }
    
    /**
     * Sets (as xml) the "joblevel" element
     */
    public void xsetJoblevel(org.apache.xmlbeans.XmlString joblevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBLEVEL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JOBLEVEL$0);
            }
            target.set(joblevel);
        }
    }
}
