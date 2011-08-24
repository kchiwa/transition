/*
 * An XML document type.
 * Localname: Bildata
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.BildataDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb.impl;
/**
 * A document containing one Bildata(@) element.
 *
 * This is a complex type.
 */
public class BildataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.BildataDocument
{
    private static final long serialVersionUID = 1L;
    
    public BildataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BILDATA$0 = 
        new javax.xml.namespace.QName("", "Bildata");
    
    
    /**
     * Gets the "Bildata" element
     */
    public com.abctech.transition.xmladbeans.carweb.BildataDocument.Bildata getBildata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.carweb.BildataDocument.Bildata target = null;
            target = (com.abctech.transition.xmladbeans.carweb.BildataDocument.Bildata)get_store().find_element_user(BILDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Bildata" element
     */
    public void setBildata(com.abctech.transition.xmladbeans.carweb.BildataDocument.Bildata bildata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.carweb.BildataDocument.Bildata target = null;
            target = (com.abctech.transition.xmladbeans.carweb.BildataDocument.Bildata)get_store().find_element_user(BILDATA$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.carweb.BildataDocument.Bildata)get_store().add_element_user(BILDATA$0);
            }
            target.set(bildata);
        }
    }
    
    /**
     * Appends and returns a new empty "Bildata" element
     */
    public com.abctech.transition.xmladbeans.carweb.BildataDocument.Bildata addNewBildata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.carweb.BildataDocument.Bildata target = null;
            target = (com.abctech.transition.xmladbeans.carweb.BildataDocument.Bildata)get_store().add_element_user(BILDATA$0);
            return target;
        }
    }
    /**
     * An XML Bildata(@).
     *
     * This is a complex type.
     */
    public static class BildataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.carweb.BildataDocument.Bildata
    {
        private static final long serialVersionUID = 1L;
        
        public BildataImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FORHANDLER$0 = 
            new javax.xml.namespace.QName("", "Forhandler");
        
        
        /**
         * Gets the "Forhandler" element
         */
        public com.abctech.transition.xmladbeans.carweb.ForhandlerDocument.Forhandler getForhandler()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.carweb.ForhandlerDocument.Forhandler target = null;
                target = (com.abctech.transition.xmladbeans.carweb.ForhandlerDocument.Forhandler)get_store().find_element_user(FORHANDLER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Forhandler" element
         */
        public void setForhandler(com.abctech.transition.xmladbeans.carweb.ForhandlerDocument.Forhandler forhandler)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.carweb.ForhandlerDocument.Forhandler target = null;
                target = (com.abctech.transition.xmladbeans.carweb.ForhandlerDocument.Forhandler)get_store().find_element_user(FORHANDLER$0, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.carweb.ForhandlerDocument.Forhandler)get_store().add_element_user(FORHANDLER$0);
                }
                target.set(forhandler);
            }
        }
        
        /**
         * Appends and returns a new empty "Forhandler" element
         */
        public com.abctech.transition.xmladbeans.carweb.ForhandlerDocument.Forhandler addNewForhandler()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.carweb.ForhandlerDocument.Forhandler target = null;
                target = (com.abctech.transition.xmladbeans.carweb.ForhandlerDocument.Forhandler)get_store().add_element_user(FORHANDLER$0);
                return target;
            }
        }
    }
}
