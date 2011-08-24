/*
 * An XML document type.
 * Localname: CleaningHelp
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.CleaningHelpDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one CleaningHelp(@) element.
 *
 * This is a complex type.
 */
public class CleaningHelpDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.CleaningHelpDocument
{
    private static final long serialVersionUID = 1L;
    
    public CleaningHelpDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLEANINGHELP$0 = 
        new javax.xml.namespace.QName("", "CleaningHelp");
    
    
    /**
     * Gets the "CleaningHelp" element
     */
    public java.lang.String getCleaningHelp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLEANINGHELP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CleaningHelp" element
     */
    public org.apache.xmlbeans.XmlString xgetCleaningHelp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLEANINGHELP$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CleaningHelp" element
     */
    public void setCleaningHelp(java.lang.String cleaningHelp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLEANINGHELP$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLEANINGHELP$0);
            }
            target.setStringValue(cleaningHelp);
        }
    }
    
    /**
     * Sets (as xml) the "CleaningHelp" element
     */
    public void xsetCleaningHelp(org.apache.xmlbeans.XmlString cleaningHelp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLEANINGHELP$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLEANINGHELP$0);
            }
            target.set(cleaningHelp);
        }
    }
}
