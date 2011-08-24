/*
 * An XML document type.
 * Localname: ENTERPRICE_NUMBER
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifjob.ENTERPRICENUMBERDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifjob.impl;
/**
 * A document containing one ENTERPRICE_NUMBER(@) element.
 *
 * This is a complex type.
 */
public class ENTERPRICENUMBERDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifjob.ENTERPRICENUMBERDocument
{
    private static final long serialVersionUID = 1L;
    
    public ENTERPRICENUMBERDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTERPRICENUMBER$0 = 
        new javax.xml.namespace.QName("", "ENTERPRICE_NUMBER");
    
    
    /**
     * Gets the "ENTERPRICE_NUMBER" element
     */
    public java.lang.String getENTERPRICENUMBER()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTERPRICENUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ENTERPRICE_NUMBER" element
     */
    public org.apache.xmlbeans.XmlString xgetENTERPRICENUMBER()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTERPRICENUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ENTERPRICE_NUMBER" element
     */
    public void setENTERPRICENUMBER(java.lang.String enterpricenumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTERPRICENUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTERPRICENUMBER$0);
            }
            target.setStringValue(enterpricenumber);
        }
    }
    
    /**
     * Sets (as xml) the "ENTERPRICE_NUMBER" element
     */
    public void xsetENTERPRICENUMBER(org.apache.xmlbeans.XmlString enterpricenumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTERPRICENUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTERPRICENUMBER$0);
            }
            target.set(enterpricenumber);
        }
    }
}
