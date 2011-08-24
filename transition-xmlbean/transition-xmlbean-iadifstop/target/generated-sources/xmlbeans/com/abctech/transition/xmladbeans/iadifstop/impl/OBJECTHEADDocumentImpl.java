/*
 * An XML document type.
 * Localname: OBJECT_HEAD
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifstop.impl;
/**
 * A document containing one OBJECT_HEAD(@) element.
 *
 * This is a complex type.
 */
public class OBJECTHEADDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument
{
    private static final long serialVersionUID = 1L;
    
    public OBJECTHEADDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECTHEAD$0 = 
        new javax.xml.namespace.QName("", "OBJECT_HEAD");
    
    
    /**
     * Gets the "OBJECT_HEAD" element
     */
    public com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument.OBJECTHEAD getOBJECTHEAD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument.OBJECTHEAD target = null;
            target = (com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument.OBJECTHEAD)get_store().find_element_user(OBJECTHEAD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OBJECT_HEAD" element
     */
    public void setOBJECTHEAD(com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument.OBJECTHEAD objecthead)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument.OBJECTHEAD target = null;
            target = (com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument.OBJECTHEAD)get_store().find_element_user(OBJECTHEAD$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument.OBJECTHEAD)get_store().add_element_user(OBJECTHEAD$0);
            }
            target.set(objecthead);
        }
    }
    
    /**
     * Appends and returns a new empty "OBJECT_HEAD" element
     */
    public com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument.OBJECTHEAD addNewOBJECTHEAD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument.OBJECTHEAD target = null;
            target = (com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument.OBJECTHEAD)get_store().add_element_user(OBJECTHEAD$0);
            return target;
        }
    }
    /**
     * An XML OBJECT_HEAD(@).
     *
     * This is a complex type.
     */
    public static class OBJECTHEADImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument.OBJECTHEAD
    {
        private static final long serialVersionUID = 1L;
        
        public OBJECTHEADImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ORDERNO$0 = 
            new javax.xml.namespace.QName("", "ORDERNO");
        private static final javax.xml.namespace.QName PROVIDERREFERENCE$2 = 
            new javax.xml.namespace.QName("", "PROVIDER_REFERENCE");
        
        
        /**
         * Gets the "ORDERNO" element
         */
        public java.lang.String getORDERNO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERNO$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ORDERNO" element
         */
        public org.apache.xmlbeans.XmlString xgetORDERNO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNO$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "ORDERNO" element
         */
        public boolean isSetORDERNO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORDERNO$0) != 0;
            }
        }
        
        /**
         * Sets the "ORDERNO" element
         */
        public void setORDERNO(java.lang.String orderno)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERNO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERNO$0);
                }
                target.setStringValue(orderno);
            }
        }
        
        /**
         * Sets (as xml) the "ORDERNO" element
         */
        public void xsetORDERNO(org.apache.xmlbeans.XmlString orderno)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERNO$0);
                }
                target.set(orderno);
            }
        }
        
        /**
         * Unsets the "ORDERNO" element
         */
        public void unsetORDERNO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORDERNO$0, 0);
            }
        }
        
        /**
         * Gets the "PROVIDER_REFERENCE" element
         */
        public java.lang.String getPROVIDERREFERENCE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVIDERREFERENCE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PROVIDER_REFERENCE" element
         */
        public org.apache.xmlbeans.XmlString xgetPROVIDERREFERENCE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROVIDERREFERENCE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "PROVIDER_REFERENCE" element
         */
        public boolean isSetPROVIDERREFERENCE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROVIDERREFERENCE$2) != 0;
            }
        }
        
        /**
         * Sets the "PROVIDER_REFERENCE" element
         */
        public void setPROVIDERREFERENCE(java.lang.String providerreference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVIDERREFERENCE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROVIDERREFERENCE$2);
                }
                target.setStringValue(providerreference);
            }
        }
        
        /**
         * Sets (as xml) the "PROVIDER_REFERENCE" element
         */
        public void xsetPROVIDERREFERENCE(org.apache.xmlbeans.XmlString providerreference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROVIDERREFERENCE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROVIDERREFERENCE$2);
                }
                target.set(providerreference);
            }
        }
        
        /**
         * Unsets the "PROVIDER_REFERENCE" element
         */
        public void unsetPROVIDERREFERENCE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROVIDERREFERENCE$2, 0);
            }
        }
    }
}
