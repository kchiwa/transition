/*
 * An XML document type.
 * Localname: numberofpositionstofill
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.NumberofpositionstofillDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one numberofpositionstofill(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class NumberofpositionstofillDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.NumberofpositionstofillDocument
{
    private static final long serialVersionUID = 1L;
    
    public NumberofpositionstofillDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMBEROFPOSITIONSTOFILL$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "numberofpositionstofill");
    
    
    /**
     * Gets the "numberofpositionstofill" element
     */
    public java.lang.String getNumberofpositionstofill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFPOSITIONSTOFILL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "numberofpositionstofill" element
     */
    public org.apache.xmlbeans.XmlString xgetNumberofpositionstofill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBEROFPOSITIONSTOFILL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "numberofpositionstofill" element
     */
    public void setNumberofpositionstofill(java.lang.String numberofpositionstofill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFPOSITIONSTOFILL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFPOSITIONSTOFILL$0);
            }
            target.setStringValue(numberofpositionstofill);
        }
    }
    
    /**
     * Sets (as xml) the "numberofpositionstofill" element
     */
    public void xsetNumberofpositionstofill(org.apache.xmlbeans.XmlString numberofpositionstofill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBEROFPOSITIONSTOFILL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMBEROFPOSITIONSTOFILL$0);
            }
            target.set(numberofpositionstofill);
        }
    }
}
