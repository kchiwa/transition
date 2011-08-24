/*
 * An XML document type.
 * Localname: servicecategory
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.ServicecategoryDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one servicecategory(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class ServicecategoryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.ServicecategoryDocument
{
    private static final long serialVersionUID = 1L;
    
    public ServicecategoryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICECATEGORY$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "servicecategory");
    
    
    /**
     * Gets the "servicecategory" element
     */
    public java.lang.String getServicecategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICECATEGORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "servicecategory" element
     */
    public org.apache.xmlbeans.XmlString xgetServicecategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICECATEGORY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "servicecategory" element
     */
    public void setServicecategory(java.lang.String servicecategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICECATEGORY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICECATEGORY$0);
            }
            target.setStringValue(servicecategory);
        }
    }
    
    /**
     * Sets (as xml) the "servicecategory" element
     */
    public void xsetServicecategory(org.apache.xmlbeans.XmlString servicecategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICECATEGORY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERVICECATEGORY$0);
            }
            target.set(servicecategory);
        }
    }
}
