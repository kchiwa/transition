/*
 * An XML document type.
 * Localname: COLLECTIVE_DEBT
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.COLLECTIVEDEBTDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one COLLECTIVE_DEBT(@) element.
 *
 * This is a complex type.
 */
public class COLLECTIVEDEBTDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.COLLECTIVEDEBTDocument
{
    private static final long serialVersionUID = 1L;
    
    public COLLECTIVEDEBTDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLLECTIVEDEBT$0 = 
        new javax.xml.namespace.QName("", "COLLECTIVE_DEBT");
    
    
    /**
     * Gets the "COLLECTIVE_DEBT" element
     */
    public java.lang.String getCOLLECTIVEDEBT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLLECTIVEDEBT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "COLLECTIVE_DEBT" element
     */
    public org.apache.xmlbeans.XmlString xgetCOLLECTIVEDEBT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLLECTIVEDEBT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "COLLECTIVE_DEBT" element
     */
    public void setCOLLECTIVEDEBT(java.lang.String collectivedebt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLLECTIVEDEBT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COLLECTIVEDEBT$0);
            }
            target.setStringValue(collectivedebt);
        }
    }
    
    /**
     * Sets (as xml) the "COLLECTIVE_DEBT" element
     */
    public void xsetCOLLECTIVEDEBT(org.apache.xmlbeans.XmlString collectivedebt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLLECTIVEDEBT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COLLECTIVEDEBT$0);
            }
            target.set(collectivedebt);
        }
    }
}
