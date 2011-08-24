/*
 * An XML document type.
 * Localname: FELLESUTGIFTER
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.FELLESUTGIFTERDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one FELLESUTGIFTER(@) element.
 *
 * This is a complex type.
 */
public class FELLESUTGIFTERDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.FELLESUTGIFTERDocument
{
    private static final long serialVersionUID = 1L;
    
    public FELLESUTGIFTERDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FELLESUTGIFTER$0 = 
        new javax.xml.namespace.QName("", "FELLESUTGIFTER");
    
    
    /**
     * Gets the "FELLESUTGIFTER" element
     */
    public java.lang.String getFELLESUTGIFTER()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FELLESUTGIFTER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FELLESUTGIFTER" element
     */
    public org.apache.xmlbeans.XmlString xgetFELLESUTGIFTER()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FELLESUTGIFTER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FELLESUTGIFTER" element
     */
    public void setFELLESUTGIFTER(java.lang.String fellesutgifter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FELLESUTGIFTER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FELLESUTGIFTER$0);
            }
            target.setStringValue(fellesutgifter);
        }
    }
    
    /**
     * Sets (as xml) the "FELLESUTGIFTER" element
     */
    public void xsetFELLESUTGIFTER(org.apache.xmlbeans.XmlString fellesutgifter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FELLESUTGIFTER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FELLESUTGIFTER$0);
            }
            target.set(fellesutgifter);
        }
    }
}
