/*
 * An XML document type.
 * Localname: DistanceFishing
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.DistanceFishingDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one DistanceFishing(@) element.
 *
 * This is a complex type.
 */
public class DistanceFishingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.DistanceFishingDocument
{
    private static final long serialVersionUID = 1L;
    
    public DistanceFishingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISTANCEFISHING$0 = 
        new javax.xml.namespace.QName("", "DistanceFishing");
    
    
    /**
     * Gets the "DistanceFishing" element
     */
    public java.lang.String getDistanceFishing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCEFISHING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DistanceFishing" element
     */
    public org.apache.xmlbeans.XmlString xgetDistanceFishing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCEFISHING$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DistanceFishing" element
     */
    public void setDistanceFishing(java.lang.String distanceFishing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCEFISHING$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISTANCEFISHING$0);
            }
            target.setStringValue(distanceFishing);
        }
    }
    
    /**
     * Sets (as xml) the "DistanceFishing" element
     */
    public void xsetDistanceFishing(org.apache.xmlbeans.XmlString distanceFishing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTANCEFISHING$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISTANCEFISHING$0);
            }
            target.set(distanceFishing);
        }
    }
}
