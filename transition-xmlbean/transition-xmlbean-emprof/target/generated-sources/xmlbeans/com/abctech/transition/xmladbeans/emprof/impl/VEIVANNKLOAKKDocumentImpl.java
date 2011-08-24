/*
 * An XML document type.
 * Localname: VEI_VANN_KLOAKK
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.VEIVANNKLOAKKDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one VEI_VANN_KLOAKK(@) element.
 *
 * This is a complex type.
 */
public class VEIVANNKLOAKKDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.VEIVANNKLOAKKDocument
{
    private static final long serialVersionUID = 1L;
    
    public VEIVANNKLOAKKDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VEIVANNKLOAKK$0 = 
        new javax.xml.namespace.QName("", "VEI_VANN_KLOAKK");
    
    
    /**
     * Gets the "VEI_VANN_KLOAKK" element
     */
    public java.lang.String getVEIVANNKLOAKK()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VEIVANNKLOAKK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "VEI_VANN_KLOAKK" element
     */
    public org.apache.xmlbeans.XmlString xgetVEIVANNKLOAKK()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VEIVANNKLOAKK$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "VEI_VANN_KLOAKK" element
     */
    public void setVEIVANNKLOAKK(java.lang.String veivannkloakk)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VEIVANNKLOAKK$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VEIVANNKLOAKK$0);
            }
            target.setStringValue(veivannkloakk);
        }
    }
    
    /**
     * Sets (as xml) the "VEI_VANN_KLOAKK" element
     */
    public void xsetVEIVANNKLOAKK(org.apache.xmlbeans.XmlString veivannkloakk)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VEIVANNKLOAKK$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VEIVANNKLOAKK$0);
            }
            target.set(veivannkloakk);
        }
    }
}
