/*
 * An XML document type.
 * Localname: PRISANTYDNING_VERDI
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.PRISANTYDNINGVERDIDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one PRISANTYDNING_VERDI(@) element.
 *
 * This is a complex type.
 */
public class PRISANTYDNINGVERDIDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.PRISANTYDNINGVERDIDocument
{
    private static final long serialVersionUID = 1L;
    
    public PRISANTYDNINGVERDIDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRISANTYDNINGVERDI$0 = 
        new javax.xml.namespace.QName("", "PRISANTYDNING_VERDI");
    
    
    /**
     * Gets the "PRISANTYDNING_VERDI" element
     */
    public java.math.BigInteger getPRISANTYDNINGVERDI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRISANTYDNINGVERDI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "PRISANTYDNING_VERDI" element
     */
    public org.apache.xmlbeans.XmlInteger xgetPRISANTYDNINGVERDI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PRISANTYDNINGVERDI$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PRISANTYDNING_VERDI" element
     */
    public void setPRISANTYDNINGVERDI(java.math.BigInteger prisantydningverdi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRISANTYDNINGVERDI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRISANTYDNINGVERDI$0);
            }
            target.setBigIntegerValue(prisantydningverdi);
        }
    }
    
    /**
     * Sets (as xml) the "PRISANTYDNING_VERDI" element
     */
    public void xsetPRISANTYDNINGVERDI(org.apache.xmlbeans.XmlInteger prisantydningverdi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PRISANTYDNINGVERDI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PRISANTYDNINGVERDI$0);
            }
            target.set(prisantydningverdi);
        }
    }
}
