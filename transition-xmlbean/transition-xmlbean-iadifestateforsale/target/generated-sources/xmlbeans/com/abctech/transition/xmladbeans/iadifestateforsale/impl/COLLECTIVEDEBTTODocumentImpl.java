/*
 * An XML document type.
 * Localname: COLLECTIVE_DEBT_TO
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.COLLECTIVEDEBTTODocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one COLLECTIVE_DEBT_TO(@) element.
 *
 * This is a complex type.
 */
public class COLLECTIVEDEBTTODocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.COLLECTIVEDEBTTODocument
{
    private static final long serialVersionUID = 1L;
    
    public COLLECTIVEDEBTTODocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLLECTIVEDEBTTO$0 = 
        new javax.xml.namespace.QName("", "COLLECTIVE_DEBT_TO");
    
    
    /**
     * Gets the "COLLECTIVE_DEBT_TO" element
     */
    public java.lang.String getCOLLECTIVEDEBTTO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLLECTIVEDEBTTO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "COLLECTIVE_DEBT_TO" element
     */
    public org.apache.xmlbeans.XmlString xgetCOLLECTIVEDEBTTO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLLECTIVEDEBTTO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "COLLECTIVE_DEBT_TO" element
     */
    public void setCOLLECTIVEDEBTTO(java.lang.String collectivedebtto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLLECTIVEDEBTTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COLLECTIVEDEBTTO$0);
            }
            target.setStringValue(collectivedebtto);
        }
    }
    
    /**
     * Sets (as xml) the "COLLECTIVE_DEBT_TO" element
     */
    public void xsetCOLLECTIVEDEBTTO(org.apache.xmlbeans.XmlString collectivedebtto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLLECTIVEDEBTTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COLLECTIVEDEBTTO$0);
            }
            target.set(collectivedebtto);
        }
    }
}
