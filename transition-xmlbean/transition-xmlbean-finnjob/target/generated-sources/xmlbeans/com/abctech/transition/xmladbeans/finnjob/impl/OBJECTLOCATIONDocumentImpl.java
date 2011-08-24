/*
 * An XML document type.
 * Localname: OBJECT_LOCATION
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.finnjob.impl;
/**
 * A document containing one OBJECT_LOCATION(@) element.
 *
 * This is a complex type.
 */
public class OBJECTLOCATIONDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument
{
    private static final long serialVersionUID = 1L;
    
    public OBJECTLOCATIONDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECTLOCATION$0 = 
        new javax.xml.namespace.QName("", "OBJECT_LOCATION");
    
    
    /**
     * Gets the "OBJECT_LOCATION" element
     */
    public com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument.OBJECTLOCATION getOBJECTLOCATION()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument.OBJECTLOCATION target = null;
            target = (com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument.OBJECTLOCATION)get_store().find_element_user(OBJECTLOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OBJECT_LOCATION" element
     */
    public void setOBJECTLOCATION(com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument.OBJECTLOCATION objectlocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument.OBJECTLOCATION target = null;
            target = (com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument.OBJECTLOCATION)get_store().find_element_user(OBJECTLOCATION$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument.OBJECTLOCATION)get_store().add_element_user(OBJECTLOCATION$0);
            }
            target.set(objectlocation);
        }
    }
    
    /**
     * Appends and returns a new empty "OBJECT_LOCATION" element
     */
    public com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument.OBJECTLOCATION addNewOBJECTLOCATION()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument.OBJECTLOCATION target = null;
            target = (com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument.OBJECTLOCATION)get_store().add_element_user(OBJECTLOCATION$0);
            return target;
        }
    }
    /**
     * An XML OBJECT_LOCATION(@).
     *
     * This is a complex type.
     */
    public static class OBJECTLOCATIONImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument.OBJECTLOCATION
    {
        private static final long serialVersionUID = 1L;
        
        public OBJECTLOCATIONImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STREETADDRESS$0 = 
            new javax.xml.namespace.QName("", "STREETADDRESS");
        private static final javax.xml.namespace.QName ZIPCODE$2 = 
            new javax.xml.namespace.QName("", "ZIPCODE");
        private static final javax.xml.namespace.QName COUNTRYCODE$4 = 
            new javax.xml.namespace.QName("", "COUNTRYCODE");
        
        
        /**
         * Gets the "STREETADDRESS" element
         */
        public java.lang.String getSTREETADDRESS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREETADDRESS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "STREETADDRESS" element
         */
        public org.apache.xmlbeans.XmlString xgetSTREETADDRESS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STREETADDRESS$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "STREETADDRESS" element
         */
        public boolean isSetSTREETADDRESS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STREETADDRESS$0) != 0;
            }
        }
        
        /**
         * Sets the "STREETADDRESS" element
         */
        public void setSTREETADDRESS(java.lang.String streetaddress)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREETADDRESS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STREETADDRESS$0);
                }
                target.setStringValue(streetaddress);
            }
        }
        
        /**
         * Sets (as xml) the "STREETADDRESS" element
         */
        public void xsetSTREETADDRESS(org.apache.xmlbeans.XmlString streetaddress)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STREETADDRESS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STREETADDRESS$0);
                }
                target.set(streetaddress);
            }
        }
        
        /**
         * Unsets the "STREETADDRESS" element
         */
        public void unsetSTREETADDRESS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STREETADDRESS$0, 0);
            }
        }
        
        /**
         * Gets the "ZIPCODE" element
         */
        public java.math.BigInteger getZIPCODE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZIPCODE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "ZIPCODE" element
         */
        public org.apache.xmlbeans.XmlInteger xgetZIPCODE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ZIPCODE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "ZIPCODE" element
         */
        public boolean isSetZIPCODE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ZIPCODE$2) != 0;
            }
        }
        
        /**
         * Sets the "ZIPCODE" element
         */
        public void setZIPCODE(java.math.BigInteger zipcode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZIPCODE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ZIPCODE$2);
                }
                target.setBigIntegerValue(zipcode);
            }
        }
        
        /**
         * Sets (as xml) the "ZIPCODE" element
         */
        public void xsetZIPCODE(org.apache.xmlbeans.XmlInteger zipcode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ZIPCODE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(ZIPCODE$2);
                }
                target.set(zipcode);
            }
        }
        
        /**
         * Unsets the "ZIPCODE" element
         */
        public void unsetZIPCODE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ZIPCODE$2, 0);
            }
        }
        
        /**
         * Gets the "COUNTRYCODE" element
         */
        public java.lang.String getCOUNTRYCODE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYCODE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "COUNTRYCODE" element
         */
        public org.apache.xmlbeans.XmlString xgetCOUNTRYCODE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYCODE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "COUNTRYCODE" element
         */
        public boolean isSetCOUNTRYCODE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COUNTRYCODE$4) != 0;
            }
        }
        
        /**
         * Sets the "COUNTRYCODE" element
         */
        public void setCOUNTRYCODE(java.lang.String countrycode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYCODE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRYCODE$4);
                }
                target.setStringValue(countrycode);
            }
        }
        
        /**
         * Sets (as xml) the "COUNTRYCODE" element
         */
        public void xsetCOUNTRYCODE(org.apache.xmlbeans.XmlString countrycode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYCODE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRYCODE$4);
                }
                target.set(countrycode);
            }
        }
        
        /**
         * Unsets the "COUNTRYCODE" element
         */
        public void unsetCOUNTRYCODE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COUNTRYCODE$4, 0);
            }
        }
    }
}
