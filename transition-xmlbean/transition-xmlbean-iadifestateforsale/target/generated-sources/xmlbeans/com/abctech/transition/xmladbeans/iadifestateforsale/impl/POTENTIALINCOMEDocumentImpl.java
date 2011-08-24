/*
 * An XML document type.
 * Localname: POTENTIAL_INCOME
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.POTENTIALINCOMEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one POTENTIAL_INCOME(@) element.
 *
 * This is a complex type.
 */
public class POTENTIALINCOMEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.POTENTIALINCOMEDocument
{
    private static final long serialVersionUID = 1L;
    
    public POTENTIALINCOMEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POTENTIALINCOME$0 = 
        new javax.xml.namespace.QName("", "POTENTIAL_INCOME");
    
    
    /**
     * Gets the "POTENTIAL_INCOME" element
     */
    public java.lang.String getPOTENTIALINCOME()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POTENTIALINCOME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "POTENTIAL_INCOME" element
     */
    public org.apache.xmlbeans.XmlString xgetPOTENTIALINCOME()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POTENTIALINCOME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "POTENTIAL_INCOME" element
     */
    public void setPOTENTIALINCOME(java.lang.String potentialincome)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POTENTIALINCOME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POTENTIALINCOME$0);
            }
            target.setStringValue(potentialincome);
        }
    }
    
    /**
     * Sets (as xml) the "POTENTIAL_INCOME" element
     */
    public void xsetPOTENTIALINCOME(org.apache.xmlbeans.XmlString potentialincome)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POTENTIALINCOME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POTENTIALINCOME$0);
            }
            target.set(potentialincome);
        }
    }
}
