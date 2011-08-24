/*
 * An XML document type.
 * Localname: REPLACEMENT_NOTE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.REPLACEMENTNOTEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one REPLACEMENT_NOTE(@) element.
 *
 * This is a complex type.
 */
public class REPLACEMENTNOTEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.REPLACEMENTNOTEDocument
{
    private static final long serialVersionUID = 1L;
    
    public REPLACEMENTNOTEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPLACEMENTNOTE$0 = 
        new javax.xml.namespace.QName("", "REPLACEMENT_NOTE");
    
    
    /**
     * Gets the "REPLACEMENT_NOTE" element
     */
    public java.lang.String getREPLACEMENTNOTE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPLACEMENTNOTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "REPLACEMENT_NOTE" element
     */
    public org.apache.xmlbeans.XmlString xgetREPLACEMENTNOTE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPLACEMENTNOTE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "REPLACEMENT_NOTE" element
     */
    public void setREPLACEMENTNOTE(java.lang.String replacementnote)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPLACEMENTNOTE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPLACEMENTNOTE$0);
            }
            target.setStringValue(replacementnote);
        }
    }
    
    /**
     * Sets (as xml) the "REPLACEMENT_NOTE" element
     */
    public void xsetREPLACEMENTNOTE(org.apache.xmlbeans.XmlString replacementnote)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPLACEMENTNOTE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REPLACEMENTNOTE$0);
            }
            target.set(replacementnote);
        }
    }
}
