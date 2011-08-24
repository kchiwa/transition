/*
 * An XML document type.
 * Localname: NO_OF_PARKING_SPOTS
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.NOOFPARKINGSPOTSDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one NO_OF_PARKING_SPOTS(@) element.
 *
 * This is a complex type.
 */
public class NOOFPARKINGSPOTSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.NOOFPARKINGSPOTSDocument
{
    private static final long serialVersionUID = 1L;
    
    public NOOFPARKINGSPOTSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOOFPARKINGSPOTS$0 = 
        new javax.xml.namespace.QName("", "NO_OF_PARKING_SPOTS");
    
    
    /**
     * Gets the "NO_OF_PARKING_SPOTS" element
     */
    public java.lang.String getNOOFPARKINGSPOTS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOOFPARKINGSPOTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NO_OF_PARKING_SPOTS" element
     */
    public org.apache.xmlbeans.XmlString xgetNOOFPARKINGSPOTS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOOFPARKINGSPOTS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NO_OF_PARKING_SPOTS" element
     */
    public void setNOOFPARKINGSPOTS(java.lang.String noofparkingspots)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOOFPARKINGSPOTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOOFPARKINGSPOTS$0);
            }
            target.setStringValue(noofparkingspots);
        }
    }
    
    /**
     * Sets (as xml) the "NO_OF_PARKING_SPOTS" element
     */
    public void xsetNOOFPARKINGSPOTS(org.apache.xmlbeans.XmlString noofparkingspots)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOOFPARKINGSPOTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOOFPARKINGSPOTS$0);
            }
            target.set(noofparkingspots);
        }
    }
}
