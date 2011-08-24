/*
 * An XML document type.
 * Localname: PRIMAERROM_BESKRIVELSE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.PRIMAERROMBESKRIVELSEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one PRIMAERROM_BESKRIVELSE(@) element.
 *
 * This is a complex type.
 */
public class PRIMAERROMBESKRIVELSEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.PRIMAERROMBESKRIVELSEDocument
{
    private static final long serialVersionUID = 1L;
    
    public PRIMAERROMBESKRIVELSEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRIMAERROMBESKRIVELSE$0 = 
        new javax.xml.namespace.QName("", "PRIMAERROM_BESKRIVELSE");
    
    
    /**
     * Gets the "PRIMAERROM_BESKRIVELSE" element
     */
    public java.lang.String getPRIMAERROMBESKRIVELSE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMAERROMBESKRIVELSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PRIMAERROM_BESKRIVELSE" element
     */
    public org.apache.xmlbeans.XmlString xgetPRIMAERROMBESKRIVELSE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMAERROMBESKRIVELSE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PRIMAERROM_BESKRIVELSE" element
     */
    public void setPRIMAERROMBESKRIVELSE(java.lang.String primaerrombeskrivelse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMAERROMBESKRIVELSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIMAERROMBESKRIVELSE$0);
            }
            target.setStringValue(primaerrombeskrivelse);
        }
    }
    
    /**
     * Sets (as xml) the "PRIMAERROM_BESKRIVELSE" element
     */
    public void xsetPRIMAERROMBESKRIVELSE(org.apache.xmlbeans.XmlString primaerrombeskrivelse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMAERROMBESKRIVELSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRIMAERROMBESKRIVELSE$0);
            }
            target.set(primaerrombeskrivelse);
        }
    }
}
