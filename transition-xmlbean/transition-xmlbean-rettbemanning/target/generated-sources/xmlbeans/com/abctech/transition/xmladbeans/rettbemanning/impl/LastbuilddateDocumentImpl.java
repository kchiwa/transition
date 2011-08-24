/*
 * An XML document type.
 * Localname: lastbuilddate
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.LastbuilddateDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one lastbuilddate(@) element.
 *
 * This is a complex type.
 */
public class LastbuilddateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.LastbuilddateDocument
{
    private static final long serialVersionUID = 1L;
    
    public LastbuilddateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LASTBUILDDATE$0 = 
        new javax.xml.namespace.QName("", "lastbuilddate");
    
    
    /**
     * Gets the "lastbuilddate" element
     */
    public java.lang.String getLastbuilddate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTBUILDDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "lastbuilddate" element
     */
    public org.apache.xmlbeans.XmlString xgetLastbuilddate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTBUILDDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "lastbuilddate" element
     */
    public void setLastbuilddate(java.lang.String lastbuilddate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTBUILDDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTBUILDDATE$0);
            }
            target.setStringValue(lastbuilddate);
        }
    }
    
    /**
     * Sets (as xml) the "lastbuilddate" element
     */
    public void xsetLastbuilddate(org.apache.xmlbeans.XmlString lastbuilddate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTBUILDDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LASTBUILDDATE$0);
            }
            target.set(lastbuilddate);
        }
    }
}
