/*
 * An XML document type.
 * Localname: Fax
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.FaxDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Fax(@) element.
 *
 * This is a complex type.
 */
public class FaxDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.FaxDocument
{
    private static final long serialVersionUID = 1L;
    
    public FaxDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FAX$0 = 
        new javax.xml.namespace.QName("", "Fax");
    
    
    /**
     * Gets the "Fax" element
     */
    public com.abctech.transition.xmladbeans.novasol.FaxDocument.Fax getFax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.FaxDocument.Fax target = null;
            target = (com.abctech.transition.xmladbeans.novasol.FaxDocument.Fax)get_store().find_element_user(FAX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Fax" element
     */
    public void setFax(com.abctech.transition.xmladbeans.novasol.FaxDocument.Fax fax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.FaxDocument.Fax target = null;
            target = (com.abctech.transition.xmladbeans.novasol.FaxDocument.Fax)get_store().find_element_user(FAX$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.novasol.FaxDocument.Fax)get_store().add_element_user(FAX$0);
            }
            target.set(fax);
        }
    }
    
    /**
     * Appends and returns a new empty "Fax" element
     */
    public com.abctech.transition.xmladbeans.novasol.FaxDocument.Fax addNewFax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.FaxDocument.Fax target = null;
            target = (com.abctech.transition.xmladbeans.novasol.FaxDocument.Fax)get_store().add_element_user(FAX$0);
            return target;
        }
    }
    /**
     * An XML Fax(@).
     *
     * This is a complex type.
     */
    public static class FaxImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.FaxDocument.Fax
    {
        private static final long serialVersionUID = 1L;
        
        public FaxImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
