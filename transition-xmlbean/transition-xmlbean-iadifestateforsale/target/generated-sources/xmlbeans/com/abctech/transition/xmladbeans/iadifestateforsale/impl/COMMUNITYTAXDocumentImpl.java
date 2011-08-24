/*
 * An XML document type.
 * Localname: COMMUNITY_TAX
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.COMMUNITYTAXDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one COMMUNITY_TAX(@) element.
 *
 * This is a complex type.
 */
public class COMMUNITYTAXDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.COMMUNITYTAXDocument
{
    private static final long serialVersionUID = 1L;
    
    public COMMUNITYTAXDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMMUNITYTAX$0 = 
        new javax.xml.namespace.QName("", "COMMUNITY_TAX");
    
    
    /**
     * Gets the "COMMUNITY_TAX" element
     */
    public java.lang.String getCOMMUNITYTAX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMUNITYTAX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "COMMUNITY_TAX" element
     */
    public org.apache.xmlbeans.XmlString xgetCOMMUNITYTAX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMUNITYTAX$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "COMMUNITY_TAX" element
     */
    public void setCOMMUNITYTAX(java.lang.String communitytax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMUNITYTAX$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMUNITYTAX$0);
            }
            target.setStringValue(communitytax);
        }
    }
    
    /**
     * Sets (as xml) the "COMMUNITY_TAX" element
     */
    public void xsetCOMMUNITYTAX(org.apache.xmlbeans.XmlString communitytax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMUNITYTAX$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMMUNITYTAX$0);
            }
            target.set(communitytax);
        }
    }
}
