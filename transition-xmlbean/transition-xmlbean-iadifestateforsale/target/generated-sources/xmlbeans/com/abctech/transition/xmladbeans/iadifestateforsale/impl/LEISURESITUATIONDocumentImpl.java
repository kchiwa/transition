/*
 * An XML document type.
 * Localname: LEISURE_SITUATION
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.LEISURESITUATIONDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one LEISURE_SITUATION(@) element.
 *
 * This is a complex type.
 */
public class LEISURESITUATIONDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.LEISURESITUATIONDocument
{
    private static final long serialVersionUID = 1L;
    
    public LEISURESITUATIONDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEISURESITUATION$0 = 
        new javax.xml.namespace.QName("", "LEISURE_SITUATION");
    
    
    /**
     * Gets the "LEISURE_SITUATION" element
     */
    public java.lang.String getLEISURESITUATION()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEISURESITUATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LEISURE_SITUATION" element
     */
    public org.apache.xmlbeans.XmlString xgetLEISURESITUATION()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEISURESITUATION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "LEISURE_SITUATION" element
     */
    public void setLEISURESITUATION(java.lang.String leisuresituation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEISURESITUATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LEISURESITUATION$0);
            }
            target.setStringValue(leisuresituation);
        }
    }
    
    /**
     * Sets (as xml) the "LEISURE_SITUATION" element
     */
    public void xsetLEISURESITUATION(org.apache.xmlbeans.XmlString leisuresituation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEISURESITUATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LEISURESITUATION$0);
            }
            target.set(leisuresituation);
        }
    }
}
