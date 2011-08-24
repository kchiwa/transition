/*
 * An XML document type.
 * Localname: cancellation
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.sologstrand.CancellationDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.sologstrand.impl;
/**
 * A document containing one cancellation(@) element.
 *
 * This is a complex type.
 */
public class CancellationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.CancellationDocument
{
    private static final long serialVersionUID = 1L;
    
    public CancellationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CANCELLATION$0 = 
        new javax.xml.namespace.QName("", "cancellation");
    
    
    /**
     * Gets the "cancellation" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.CancellationDocument.Cancellation getCancellation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.CancellationDocument.Cancellation target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.CancellationDocument.Cancellation)get_store().find_element_user(CANCELLATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cancellation" element
     */
    public void setCancellation(com.abctech.transition.xmladbeans.sologstrand.CancellationDocument.Cancellation cancellation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.CancellationDocument.Cancellation target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.CancellationDocument.Cancellation)get_store().find_element_user(CANCELLATION$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.sologstrand.CancellationDocument.Cancellation)get_store().add_element_user(CANCELLATION$0);
            }
            target.set(cancellation);
        }
    }
    
    /**
     * Appends and returns a new empty "cancellation" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.CancellationDocument.Cancellation addNewCancellation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.CancellationDocument.Cancellation target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.CancellationDocument.Cancellation)get_store().add_element_user(CANCELLATION$0);
            return target;
        }
    }
    /**
     * An XML cancellation(@).
     *
     * This is a complex type.
     */
    public static class CancellationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.CancellationDocument.Cancellation
    {
        private static final long serialVersionUID = 1L;
        
        public CancellationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NOK$0 = 
            new javax.xml.namespace.QName("", "nok");
        
        
        /**
         * Gets the "nok" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok getNok()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok)get_store().find_element_user(NOK$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "nok" element
         */
        public void setNok(com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok nok)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok)get_store().find_element_user(NOK$0, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok)get_store().add_element_user(NOK$0);
                }
                target.set(nok);
            }
        }
        
        /**
         * Appends and returns a new empty "nok" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok addNewNok()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.NokDocument.Nok)get_store().add_element_user(NOK$0);
                return target;
            }
        }
    }
}
