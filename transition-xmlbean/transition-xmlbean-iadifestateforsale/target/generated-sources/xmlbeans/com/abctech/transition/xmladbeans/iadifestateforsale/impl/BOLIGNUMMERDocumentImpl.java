/*
 * An XML document type.
 * Localname: BOLIGNUMMER
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.BOLIGNUMMERDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one BOLIGNUMMER(@) element.
 *
 * This is a complex type.
 */
public class BOLIGNUMMERDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.BOLIGNUMMERDocument
{
    private static final long serialVersionUID = 1L;
    
    public BOLIGNUMMERDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOLIGNUMMER$0 = 
        new javax.xml.namespace.QName("", "BOLIGNUMMER");
    
    
    /**
     * Gets the "BOLIGNUMMER" element
     */
    public java.lang.String getBOLIGNUMMER()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOLIGNUMMER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BOLIGNUMMER" element
     */
    public org.apache.xmlbeans.XmlString xgetBOLIGNUMMER()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOLIGNUMMER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BOLIGNUMMER" element
     */
    public void setBOLIGNUMMER(java.lang.String bolignummer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOLIGNUMMER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOLIGNUMMER$0);
            }
            target.setStringValue(bolignummer);
        }
    }
    
    /**
     * Sets (as xml) the "BOLIGNUMMER" element
     */
    public void xsetBOLIGNUMMER(org.apache.xmlbeans.XmlString bolignummer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOLIGNUMMER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BOLIGNUMMER$0);
            }
            target.set(bolignummer);
        }
    }
}
