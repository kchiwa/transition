/*
 * An XML document type.
 * Localname: COLLECTIVE_ASSETS
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.COLLECTIVEASSETSDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one COLLECTIVE_ASSETS(@) element.
 *
 * This is a complex type.
 */
public class COLLECTIVEASSETSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.COLLECTIVEASSETSDocument
{
    private static final long serialVersionUID = 1L;
    
    public COLLECTIVEASSETSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLLECTIVEASSETS$0 = 
        new javax.xml.namespace.QName("", "COLLECTIVE_ASSETS");
    
    
    /**
     * Gets the "COLLECTIVE_ASSETS" element
     */
    public java.lang.String getCOLLECTIVEASSETS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLLECTIVEASSETS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "COLLECTIVE_ASSETS" element
     */
    public org.apache.xmlbeans.XmlString xgetCOLLECTIVEASSETS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLLECTIVEASSETS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "COLLECTIVE_ASSETS" element
     */
    public void setCOLLECTIVEASSETS(java.lang.String collectiveassets)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLLECTIVEASSETS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COLLECTIVEASSETS$0);
            }
            target.setStringValue(collectiveassets);
        }
    }
    
    /**
     * Sets (as xml) the "COLLECTIVE_ASSETS" element
     */
    public void xsetCOLLECTIVEASSETS(org.apache.xmlbeans.XmlString collectiveassets)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLLECTIVEASSETS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COLLECTIVEASSETS$0);
            }
            target.set(collectiveassets);
        }
    }
}
