/*
 * An XML document type.
 * Localname: AltitudeM
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.AltitudeMDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one AltitudeM(@) element.
 *
 * This is a complex type.
 */
public class AltitudeMDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.AltitudeMDocument
{
    private static final long serialVersionUID = 1L;
    
    public AltitudeMDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALTITUDEM$0 = 
        new javax.xml.namespace.QName("", "AltitudeM");
    
    
    /**
     * Gets the "AltitudeM" element
     */
    public java.lang.String getAltitudeM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTITUDEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AltitudeM" element
     */
    public org.apache.xmlbeans.XmlString xgetAltitudeM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALTITUDEM$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AltitudeM" element
     */
    public void setAltitudeM(java.lang.String altitudeM)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTITUDEM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALTITUDEM$0);
            }
            target.setStringValue(altitudeM);
        }
    }
    
    /**
     * Sets (as xml) the "AltitudeM" element
     */
    public void xsetAltitudeM(org.apache.xmlbeans.XmlString altitudeM)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALTITUDEM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ALTITUDEM$0);
            }
            target.set(altitudeM);
        }
    }
}
