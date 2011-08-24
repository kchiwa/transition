/*
 * An XML document type.
 * Localname: LandingStage
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.LandingStageDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one LandingStage(@) element.
 *
 * This is a complex type.
 */
public class LandingStageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.LandingStageDocument
{
    private static final long serialVersionUID = 1L;
    
    public LandingStageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LANDINGSTAGE$0 = 
        new javax.xml.namespace.QName("", "LandingStage");
    
    
    /**
     * Gets the "LandingStage" element
     */
    public java.lang.String getLandingStage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANDINGSTAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LandingStage" element
     */
    public org.apache.xmlbeans.XmlString xgetLandingStage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANDINGSTAGE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "LandingStage" element
     */
    public void setLandingStage(java.lang.String landingStage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANDINGSTAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LANDINGSTAGE$0);
            }
            target.setStringValue(landingStage);
        }
    }
    
    /**
     * Sets (as xml) the "LandingStage" element
     */
    public void xsetLandingStage(org.apache.xmlbeans.XmlString landingStage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANDINGSTAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LANDINGSTAGE$0);
            }
            target.set(landingStage);
        }
    }
}
