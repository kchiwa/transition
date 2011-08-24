/*
 * An XML document type.
 * Localname: REGULATIONS
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.REGULATIONSDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one REGULATIONS(@) element.
 *
 * This is a complex type.
 */
public class REGULATIONSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.REGULATIONSDocument
{
    private static final long serialVersionUID = 1L;
    
    public REGULATIONSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REGULATIONS$0 = 
        new javax.xml.namespace.QName("", "REGULATIONS");
    
    
    /**
     * Gets the "REGULATIONS" element
     */
    public java.lang.String getREGULATIONS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGULATIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "REGULATIONS" element
     */
    public org.apache.xmlbeans.XmlString xgetREGULATIONS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGULATIONS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "REGULATIONS" element
     */
    public void setREGULATIONS(java.lang.String regulations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGULATIONS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGULATIONS$0);
            }
            target.setStringValue(regulations);
        }
    }
    
    /**
     * Sets (as xml) the "REGULATIONS" element
     */
    public void xsetREGULATIONS(org.apache.xmlbeans.XmlString regulations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGULATIONS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REGULATIONS$0);
            }
            target.set(regulations);
        }
    }
}
