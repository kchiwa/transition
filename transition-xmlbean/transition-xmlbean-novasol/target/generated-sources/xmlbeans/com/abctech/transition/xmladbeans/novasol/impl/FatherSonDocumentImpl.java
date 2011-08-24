/*
 * An XML document type.
 * Localname: FatherSon
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.FatherSonDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one FatherSon(@) element.
 *
 * This is a complex type.
 */
public class FatherSonDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.FatherSonDocument
{
    private static final long serialVersionUID = 1L;
    
    public FatherSonDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FATHERSON$0 = 
        new javax.xml.namespace.QName("", "FatherSon");
    
    
    /**
     * Gets the "FatherSon" element
     */
    public java.lang.String getFatherSon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FATHERSON$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FatherSon" element
     */
    public org.apache.xmlbeans.XmlString xgetFatherSon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FATHERSON$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FatherSon" element
     */
    public void setFatherSon(java.lang.String fatherSon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FATHERSON$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FATHERSON$0);
            }
            target.setStringValue(fatherSon);
        }
    }
    
    /**
     * Sets (as xml) the "FatherSon" element
     */
    public void xsetFatherSon(org.apache.xmlbeans.XmlString fatherSon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FATHERSON$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FATHERSON$0);
            }
            target.set(fatherSon);
        }
    }
}
