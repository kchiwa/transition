/*
 * An XML document type.
 * Localname: OMKOSTNINGER
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.OMKOSTNINGERDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one OMKOSTNINGER(@) element.
 *
 * This is a complex type.
 */
public class OMKOSTNINGERDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.OMKOSTNINGERDocument
{
    private static final long serialVersionUID = 1L;
    
    public OMKOSTNINGERDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OMKOSTNINGER$0 = 
        new javax.xml.namespace.QName("", "OMKOSTNINGER");
    
    
    /**
     * Gets the "OMKOSTNINGER" element
     */
    public java.lang.String getOMKOSTNINGER()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OMKOSTNINGER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OMKOSTNINGER" element
     */
    public org.apache.xmlbeans.XmlString xgetOMKOSTNINGER()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OMKOSTNINGER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OMKOSTNINGER" element
     */
    public void setOMKOSTNINGER(java.lang.String omkostninger)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OMKOSTNINGER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OMKOSTNINGER$0);
            }
            target.setStringValue(omkostninger);
        }
    }
    
    /**
     * Sets (as xml) the "OMKOSTNINGER" element
     */
    public void xsetOMKOSTNINGER(org.apache.xmlbeans.XmlString omkostninger)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OMKOSTNINGER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OMKOSTNINGER$0);
            }
            target.set(omkostninger);
        }
    }
}
