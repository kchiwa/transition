/*
 * An XML document type.
 * Localname: FESTENR
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.FESTENRDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one FESTENR(@) element.
 *
 * This is a complex type.
 */
public class FESTENRDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.FESTENRDocument
{
    private static final long serialVersionUID = 1L;
    
    public FESTENRDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FESTENR$0 = 
        new javax.xml.namespace.QName("", "FESTENR");
    
    
    /**
     * Gets the "FESTENR" element
     */
    public java.lang.String getFESTENR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FESTENR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FESTENR" element
     */
    public org.apache.xmlbeans.XmlString xgetFESTENR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FESTENR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FESTENR" element
     */
    public void setFESTENR(java.lang.String festenr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FESTENR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FESTENR$0);
            }
            target.setStringValue(festenr);
        }
    }
    
    /**
     * Sets (as xml) the "FESTENR" element
     */
    public void xsetFESTENR(org.apache.xmlbeans.XmlString festenr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FESTENR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FESTENR$0);
            }
            target.set(festenr);
        }
    }
}
