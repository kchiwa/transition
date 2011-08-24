/*
 * An XML document type.
 * Localname: ExtraCosts
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.ExtraCostsDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one ExtraCosts(@) element.
 *
 * This is a complex type.
 */
public class ExtraCostsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.ExtraCostsDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExtraCostsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTRACOSTS$0 = 
        new javax.xml.namespace.QName("", "ExtraCosts");
    
    
    /**
     * Gets the "ExtraCosts" element
     */
    public java.lang.String getExtraCosts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRACOSTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExtraCosts" element
     */
    public org.apache.xmlbeans.XmlString xgetExtraCosts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRACOSTS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ExtraCosts" element
     */
    public void setExtraCosts(java.lang.String extraCosts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRACOSTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTRACOSTS$0);
            }
            target.setStringValue(extraCosts);
        }
    }
    
    /**
     * Sets (as xml) the "ExtraCosts" element
     */
    public void xsetExtraCosts(org.apache.xmlbeans.XmlString extraCosts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRACOSTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTRACOSTS$0);
            }
            target.set(extraCosts);
        }
    }
}
