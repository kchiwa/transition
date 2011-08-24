/*
 * An XML document type.
 * Localname: HEAD
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifjob.HEADDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifjob.impl;
/**
 * A document containing one HEAD(@) element.
 *
 * This is a complex type.
 */
public class HEADDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifjob.HEADDocument
{
    private static final long serialVersionUID = 1L;
    
    public HEADDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEAD$0 = 
        new javax.xml.namespace.QName("", "HEAD");
    
    
    /**
     * Gets the "HEAD" element
     */
    public com.abctech.transition.xmladbeans.iadifjob.HEADDocument.HEAD getHEAD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifjob.HEADDocument.HEAD target = null;
            target = (com.abctech.transition.xmladbeans.iadifjob.HEADDocument.HEAD)get_store().find_element_user(HEAD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HEAD" element
     */
    public void setHEAD(com.abctech.transition.xmladbeans.iadifjob.HEADDocument.HEAD head)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifjob.HEADDocument.HEAD target = null;
            target = (com.abctech.transition.xmladbeans.iadifjob.HEADDocument.HEAD)get_store().find_element_user(HEAD$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifjob.HEADDocument.HEAD)get_store().add_element_user(HEAD$0);
            }
            target.set(head);
        }
    }
    
    /**
     * Appends and returns a new empty "HEAD" element
     */
    public com.abctech.transition.xmladbeans.iadifjob.HEADDocument.HEAD addNewHEAD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifjob.HEADDocument.HEAD target = null;
            target = (com.abctech.transition.xmladbeans.iadifjob.HEADDocument.HEAD)get_store().add_element_user(HEAD$0);
            return target;
        }
    }
    /**
     * An XML HEAD(@).
     *
     * This is a complex type.
     */
    public static class HEADImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifjob.HEADDocument.HEAD
    {
        private static final long serialVersionUID = 1L;
        
        public HEADImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARTNER$0 = 
            new javax.xml.namespace.QName("", "PARTNER");
        private static final javax.xml.namespace.QName PROVIDER$2 = 
            new javax.xml.namespace.QName("", "PROVIDER");
        private static final javax.xml.namespace.QName UPLOADREFERENCE$4 = 
            new javax.xml.namespace.QName("", "UPLOAD_REFERENCE");
        private static final javax.xml.namespace.QName EMAILFEEDBACK$6 = 
            new javax.xml.namespace.QName("", "EMAIL_FEEDBACK");
        
        
        /**
         * Gets the "PARTNER" element
         */
        public java.lang.String getPARTNER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PARTNER" element
         */
        public org.apache.xmlbeans.XmlString xgetPARTNER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNER$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PARTNER" element
         */
        public void setPARTNER(java.lang.String partner)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTNER$0);
                }
                target.setStringValue(partner);
            }
        }
        
        /**
         * Sets (as xml) the "PARTNER" element
         */
        public void xsetPARTNER(org.apache.xmlbeans.XmlString partner)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARTNER$0);
                }
                target.set(partner);
            }
        }
        
        /**
         * Gets the "PROVIDER" element
         */
        public java.lang.String getPROVIDER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVIDER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PROVIDER" element
         */
        public org.apache.xmlbeans.XmlString xgetPROVIDER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROVIDER$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "PROVIDER" element
         */
        public boolean isSetPROVIDER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROVIDER$2) != 0;
            }
        }
        
        /**
         * Sets the "PROVIDER" element
         */
        public void setPROVIDER(java.lang.String provider)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVIDER$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROVIDER$2);
                }
                target.setStringValue(provider);
            }
        }
        
        /**
         * Sets (as xml) the "PROVIDER" element
         */
        public void xsetPROVIDER(org.apache.xmlbeans.XmlString provider)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROVIDER$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROVIDER$2);
                }
                target.set(provider);
            }
        }
        
        /**
         * Unsets the "PROVIDER" element
         */
        public void unsetPROVIDER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROVIDER$2, 0);
            }
        }
        
        /**
         * Gets the "UPLOAD_REFERENCE" element
         */
        public java.lang.String getUPLOADREFERENCE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPLOADREFERENCE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "UPLOAD_REFERENCE" element
         */
        public org.apache.xmlbeans.XmlString xgetUPLOADREFERENCE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPLOADREFERENCE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "UPLOAD_REFERENCE" element
         */
        public boolean isSetUPLOADREFERENCE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(UPLOADREFERENCE$4) != 0;
            }
        }
        
        /**
         * Sets the "UPLOAD_REFERENCE" element
         */
        public void setUPLOADREFERENCE(java.lang.String uploadreference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPLOADREFERENCE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPLOADREFERENCE$4);
                }
                target.setStringValue(uploadreference);
            }
        }
        
        /**
         * Sets (as xml) the "UPLOAD_REFERENCE" element
         */
        public void xsetUPLOADREFERENCE(org.apache.xmlbeans.XmlString uploadreference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPLOADREFERENCE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UPLOADREFERENCE$4);
                }
                target.set(uploadreference);
            }
        }
        
        /**
         * Unsets the "UPLOAD_REFERENCE" element
         */
        public void unsetUPLOADREFERENCE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(UPLOADREFERENCE$4, 0);
            }
        }
        
        /**
         * Gets the "EMAIL_FEEDBACK" element
         */
        public com.abctech.transition.xmladbeans.iadifjob.EMAILFEEDBACKDocument.EMAILFEEDBACK getEMAILFEEDBACK()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.EMAILFEEDBACKDocument.EMAILFEEDBACK target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.EMAILFEEDBACKDocument.EMAILFEEDBACK)get_store().find_element_user(EMAILFEEDBACK$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "EMAIL_FEEDBACK" element
         */
        public boolean isSetEMAILFEEDBACK()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMAILFEEDBACK$6) != 0;
            }
        }
        
        /**
         * Sets the "EMAIL_FEEDBACK" element
         */
        public void setEMAILFEEDBACK(com.abctech.transition.xmladbeans.iadifjob.EMAILFEEDBACKDocument.EMAILFEEDBACK emailfeedback)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.EMAILFEEDBACKDocument.EMAILFEEDBACK target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.EMAILFEEDBACKDocument.EMAILFEEDBACK)get_store().find_element_user(EMAILFEEDBACK$6, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifjob.EMAILFEEDBACKDocument.EMAILFEEDBACK)get_store().add_element_user(EMAILFEEDBACK$6);
                }
                target.set(emailfeedback);
            }
        }
        
        /**
         * Appends and returns a new empty "EMAIL_FEEDBACK" element
         */
        public com.abctech.transition.xmladbeans.iadifjob.EMAILFEEDBACKDocument.EMAILFEEDBACK addNewEMAILFEEDBACK()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.EMAILFEEDBACKDocument.EMAILFEEDBACK target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.EMAILFEEDBACKDocument.EMAILFEEDBACK)get_store().add_element_user(EMAILFEEDBACK$6);
                return target;
            }
        }
        
        /**
         * Unsets the "EMAIL_FEEDBACK" element
         */
        public void unsetEMAILFEEDBACK()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMAILFEEDBACK$6, 0);
            }
        }
    }
}
