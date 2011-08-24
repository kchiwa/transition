/*
 * An XML document type.
 * Localname: PRICE_FROM
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.PRICEFROMDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one PRICE_FROM(@) element.
 *
 * This is a complex type.
 */
public class PRICEFROMDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.PRICEFROMDocument
{
    private static final long serialVersionUID = 1L;
    
    public PRICEFROMDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRICEFROM$0 = 
        new javax.xml.namespace.QName("", "PRICE_FROM");
    
    
    /**
     * Gets the "PRICE_FROM" element
     */
    public java.lang.String getPRICEFROM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICEFROM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PRICE_FROM" element
     */
    public org.apache.xmlbeans.XmlString xgetPRICEFROM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRICEFROM$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PRICE_FROM" element
     */
    public void setPRICEFROM(java.lang.String pricefrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICEFROM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRICEFROM$0);
            }
            target.setStringValue(pricefrom);
        }
    }
    
    /**
     * Sets (as xml) the "PRICE_FROM" element
     */
    public void xsetPRICEFROM(org.apache.xmlbeans.XmlString pricefrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRICEFROM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRICEFROM$0);
            }
            target.set(pricefrom);
        }
    }
}
