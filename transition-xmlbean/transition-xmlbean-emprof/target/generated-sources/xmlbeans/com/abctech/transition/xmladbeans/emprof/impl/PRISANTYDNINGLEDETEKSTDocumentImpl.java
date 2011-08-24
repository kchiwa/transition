/*
 * An XML document type.
 * Localname: PRISANTYDNING_LEDETEKST
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.PRISANTYDNINGLEDETEKSTDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one PRISANTYDNING_LEDETEKST(@) element.
 *
 * This is a complex type.
 */
public class PRISANTYDNINGLEDETEKSTDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.PRISANTYDNINGLEDETEKSTDocument
{
    private static final long serialVersionUID = 1L;
    
    public PRISANTYDNINGLEDETEKSTDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRISANTYDNINGLEDETEKST$0 = 
        new javax.xml.namespace.QName("", "PRISANTYDNING_LEDETEKST");
    
    
    /**
     * Gets the "PRISANTYDNING_LEDETEKST" element
     */
    public java.lang.String getPRISANTYDNINGLEDETEKST()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRISANTYDNINGLEDETEKST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PRISANTYDNING_LEDETEKST" element
     */
    public org.apache.xmlbeans.XmlString xgetPRISANTYDNINGLEDETEKST()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRISANTYDNINGLEDETEKST$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PRISANTYDNING_LEDETEKST" element
     */
    public void setPRISANTYDNINGLEDETEKST(java.lang.String prisantydningledetekst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRISANTYDNINGLEDETEKST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRISANTYDNINGLEDETEKST$0);
            }
            target.setStringValue(prisantydningledetekst);
        }
    }
    
    /**
     * Sets (as xml) the "PRISANTYDNING_LEDETEKST" element
     */
    public void xsetPRISANTYDNINGLEDETEKST(org.apache.xmlbeans.XmlString prisantydningledetekst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRISANTYDNINGLEDETEKST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRISANTYDNINGLEDETEKST$0);
            }
            target.set(prisantydningledetekst);
        }
    }
}
