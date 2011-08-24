/*
 * An XML document type.
 * Localname: VERSIONNO
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifjob.VERSIONNODocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifjob.impl;
/**
 * A document containing one VERSIONNO(@) element.
 *
 * This is a complex type.
 */
public class VERSIONNODocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifjob.VERSIONNODocument
{
    private static final long serialVersionUID = 1L;
    
    public VERSIONNODocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERSIONNO$0 = 
        new javax.xml.namespace.QName("", "VERSIONNO");
    
    
    /**
     * Gets the "VERSIONNO" element
     */
    public java.lang.String getVERSIONNO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSIONNO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "VERSIONNO" element
     */
    public org.apache.xmlbeans.XmlString xgetVERSIONNO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSIONNO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "VERSIONNO" element
     */
    public void setVERSIONNO(java.lang.String versionno)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSIONNO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSIONNO$0);
            }
            target.setStringValue(versionno);
        }
    }
    
    /**
     * Sets (as xml) the "VERSIONNO" element
     */
    public void xsetVERSIONNO(org.apache.xmlbeans.XmlString versionno)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSIONNO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERSIONNO$0);
            }
            target.set(versionno);
        }
    }
}
