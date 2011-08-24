/*
 * An XML document type.
 * Localname: PRICE_TO
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.PRICETODocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one PRICE_TO(@) element.
 *
 * This is a complex type.
 */
public class PRICETODocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.PRICETODocument
{
    private static final long serialVersionUID = 1L;
    
    public PRICETODocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRICETO$0 = 
        new javax.xml.namespace.QName("", "PRICE_TO");
    
    
    /**
     * Gets the "PRICE_TO" element
     */
    public java.lang.String getPRICETO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICETO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PRICE_TO" element
     */
    public org.apache.xmlbeans.XmlString xgetPRICETO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRICETO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PRICE_TO" element
     */
    public void setPRICETO(java.lang.String priceto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICETO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRICETO$0);
            }
            target.setStringValue(priceto);
        }
    }
    
    /**
     * Sets (as xml) the "PRICE_TO" element
     */
    public void xsetPRICETO(org.apache.xmlbeans.XmlString priceto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRICETO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRICETO$0);
            }
            target.set(priceto);
        }
    }
}
