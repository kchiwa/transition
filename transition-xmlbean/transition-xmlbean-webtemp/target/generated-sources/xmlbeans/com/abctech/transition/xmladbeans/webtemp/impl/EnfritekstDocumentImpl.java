/*
 * An XML document type.
 * Localname: enfritekst
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webtemp.EnfritekstDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webtemp.impl;
/**
 * A document containing one enfritekst(@) element.
 *
 * This is a complex type.
 */
public class EnfritekstDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webtemp.EnfritekstDocument
{
    private static final long serialVersionUID = 1L;
    
    public EnfritekstDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENFRITEKST$0 = 
        new javax.xml.namespace.QName("", "enfritekst");
    
    
    /**
     * Gets the "enfritekst" element
     */
    public com.abctech.transition.xmladbeans.webtemp.EnfritekstDocument.Enfritekst getEnfritekst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webtemp.EnfritekstDocument.Enfritekst target = null;
            target = (com.abctech.transition.xmladbeans.webtemp.EnfritekstDocument.Enfritekst)get_store().find_element_user(ENFRITEKST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "enfritekst" element
     */
    public void setEnfritekst(com.abctech.transition.xmladbeans.webtemp.EnfritekstDocument.Enfritekst enfritekst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webtemp.EnfritekstDocument.Enfritekst target = null;
            target = (com.abctech.transition.xmladbeans.webtemp.EnfritekstDocument.Enfritekst)get_store().find_element_user(ENFRITEKST$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.webtemp.EnfritekstDocument.Enfritekst)get_store().add_element_user(ENFRITEKST$0);
            }
            target.set(enfritekst);
        }
    }
    
    /**
     * Appends and returns a new empty "enfritekst" element
     */
    public com.abctech.transition.xmladbeans.webtemp.EnfritekstDocument.Enfritekst addNewEnfritekst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webtemp.EnfritekstDocument.Enfritekst target = null;
            target = (com.abctech.transition.xmladbeans.webtemp.EnfritekstDocument.Enfritekst)get_store().add_element_user(ENFRITEKST$0);
            return target;
        }
    }
    /**
     * An XML enfritekst(@).
     *
     * This is a complex type.
     */
    public static class EnfritekstImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webtemp.EnfritekstDocument.Enfritekst
    {
        private static final long serialVersionUID = 1L;
        
        public EnfritekstImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EMNE$0 = 
            new javax.xml.namespace.QName("", "emne");
        private static final javax.xml.namespace.QName FRITEKST$2 = 
            new javax.xml.namespace.QName("", "fritekst");
        
        
        /**
         * Gets the "emne" element
         */
        public java.lang.String getEmne()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMNE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "emne" element
         */
        public org.apache.xmlbeans.XmlString xgetEmne()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMNE$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "emne" element
         */
        public boolean isSetEmne()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMNE$0) != 0;
            }
        }
        
        /**
         * Sets the "emne" element
         */
        public void setEmne(java.lang.String emne)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMNE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMNE$0);
                }
                target.setStringValue(emne);
            }
        }
        
        /**
         * Sets (as xml) the "emne" element
         */
        public void xsetEmne(org.apache.xmlbeans.XmlString emne)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMNE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMNE$0);
                }
                target.set(emne);
            }
        }
        
        /**
         * Unsets the "emne" element
         */
        public void unsetEmne()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMNE$0, 0);
            }
        }
        
        /**
         * Gets the "fritekst" element
         */
        public java.lang.String getFritekst()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FRITEKST$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fritekst" element
         */
        public org.apache.xmlbeans.XmlString xgetFritekst()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FRITEKST$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "fritekst" element
         */
        public void setFritekst(java.lang.String fritekst)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FRITEKST$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FRITEKST$2);
                }
                target.setStringValue(fritekst);
            }
        }
        
        /**
         * Sets (as xml) the "fritekst" element
         */
        public void xsetFritekst(org.apache.xmlbeans.XmlString fritekst)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FRITEKST$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FRITEKST$2);
                }
                target.set(fritekst);
            }
        }
    }
}
