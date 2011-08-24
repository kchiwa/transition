/*
 * An XML document type.
 * Localname: LastUpdate
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.LastUpdateDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one LastUpdate(@) element.
 *
 * This is a complex type.
 */
public class LastUpdateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.LastUpdateDocument
{
    private static final long serialVersionUID = 1L;
    
    public LastUpdateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LASTUPDATE$0 = 
        new javax.xml.namespace.QName("", "LastUpdate");
    
    
    /**
     * Gets the "LastUpdate" element
     */
    public java.lang.String getLastUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTUPDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LastUpdate" element
     */
    public org.apache.xmlbeans.XmlString xgetLastUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTUPDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "LastUpdate" element
     */
    public void setLastUpdate(java.lang.String lastUpdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTUPDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTUPDATE$0);
            }
            target.setStringValue(lastUpdate);
        }
    }
    
    /**
     * Sets (as xml) the "LastUpdate" element
     */
    public void xsetLastUpdate(org.apache.xmlbeans.XmlString lastUpdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTUPDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LASTUPDATE$0);
            }
            target.set(lastUpdate);
        }
    }
}
