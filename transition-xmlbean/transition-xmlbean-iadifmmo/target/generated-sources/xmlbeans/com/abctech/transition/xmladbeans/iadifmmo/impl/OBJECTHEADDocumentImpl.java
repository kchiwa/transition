/*
 * An XML document type.
 * Localname: OBJECT_HEAD
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifmmo.OBJECTHEADDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifmmo.impl;
/**
 * A document containing one OBJECT_HEAD(@) element.
 *
 * This is a complex type.
 */
public class OBJECTHEADDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifmmo.OBJECTHEADDocument
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
    public com.abctech.transition.xmladbeans.iadifmmo.OBJECTHEADDocument.OBJECTHEAD getOBJECTHEAD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifmmo.OBJECTHEADDocument.OBJECTHEAD target = null;
            target = (com.abctech.transition.xmladbeans.iadifmmo.OBJECTHEADDocument.OBJECTHEAD)get_store().find_element_user(OBJECTHEAD$0, 0);
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
    public void setOBJECTHEAD(com.abctech.transition.xmladbeans.iadifmmo.OBJECTHEADDocument.OBJECTHEAD objecthead)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifmmo.OBJECTHEADDocument.OBJECTHEAD target = null;
            target = (com.abctech.transition.xmladbeans.iadifmmo.OBJECTHEADDocument.OBJECTHEAD)get_store().find_element_user(OBJECTHEAD$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifmmo.OBJECTHEADDocument.OBJECTHEAD)get_store().add_element_user(OBJECTHEAD$0);
            }
            target.set(objecthead);
        }
    }
    
    /**
     * Appends and returns a new empty "OBJECT_HEAD" element
     */
    public com.abctech.transition.xmladbeans.iadifmmo.OBJECTHEADDocument.OBJECTHEAD addNewOBJECTHEAD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifmmo.OBJECTHEADDocument.OBJECTHEAD target = null;
            target = (com.abctech.transition.xmladbeans.iadifmmo.OBJECTHEADDocument.OBJECTHEAD)get_store().add_element_user(OBJECTHEAD$0);
            return target;
        }
    }
    /**
     * An XML OBJECT_HEAD(@).
     *
     * This is a complex type.
     */
    public static class OBJECTHEADImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifmmo.OBJECTHEADDocument.OBJECTHEAD
    {
        private static final long serialVersionUID = 1L;
        
        public OBJECTHEADImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ORDERNO$0 = 
            new javax.xml.namespace.QName("", "ORDERNO");
        
        
        /**
         * Gets the "ORDERNO" element
         */
        public java.math.BigInteger getORDERNO()
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
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "ORDERNO" element
         */
        public org.apache.xmlbeans.XmlInteger xgetORDERNO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ORDERNO$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ORDERNO" element
         */
        public void setORDERNO(java.math.BigInteger orderno)
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
                target.setBigIntegerValue(orderno);
            }
        }
        
        /**
         * Sets (as xml) the "ORDERNO" element
         */
        public void xsetORDERNO(org.apache.xmlbeans.XmlInteger orderno)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ORDERNO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(ORDERNO$0);
                }
                target.set(orderno);
            }
        }
    }
}
