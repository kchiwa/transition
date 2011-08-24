/*
 * An XML document type.
 * Localname: OBJECT_LOCATION
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.OBJECTLOCATIONDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one OBJECT_LOCATION(@) element.
 *
 * This is a complex type.
 */
public class OBJECTLOCATIONDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.OBJECTLOCATIONDocument
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
    public com.abctech.transition.xmladbeans.iadifestateforsale.OBJECTLOCATIONDocument.OBJECTLOCATION getOBJECTLOCATION()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.OBJECTLOCATIONDocument.OBJECTLOCATION target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.OBJECTLOCATIONDocument.OBJECTLOCATION)get_store().find_element_user(OBJECTLOCATION$0, 0);
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
    public void setOBJECTLOCATION(com.abctech.transition.xmladbeans.iadifestateforsale.OBJECTLOCATIONDocument.OBJECTLOCATION objectlocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.OBJECTLOCATIONDocument.OBJECTLOCATION target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.OBJECTLOCATIONDocument.OBJECTLOCATION)get_store().find_element_user(OBJECTLOCATION$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.OBJECTLOCATIONDocument.OBJECTLOCATION)get_store().add_element_user(OBJECTLOCATION$0);
            }
            target.set(objectlocation);
        }
    }
    
    /**
     * Appends and returns a new empty "OBJECT_LOCATION" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.OBJECTLOCATIONDocument.OBJECTLOCATION addNewOBJECTLOCATION()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.OBJECTLOCATIONDocument.OBJECTLOCATION target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.OBJECTLOCATIONDocument.OBJECTLOCATION)get_store().add_element_user(OBJECTLOCATION$0);
            return target;
        }
    }
    /**
     * An XML OBJECT_LOCATION(@).
     *
     * This is a complex type.
     */
    public static class OBJECTLOCATIONImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.OBJECTLOCATIONDocument.OBJECTLOCATION
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
        private static final javax.xml.namespace.QName ADDRESS2$6 = 
            new javax.xml.namespace.QName("", "ADDRESS2");
        private static final javax.xml.namespace.QName ADDRESS3$8 = 
            new javax.xml.namespace.QName("", "ADDRESS3");
        private static final javax.xml.namespace.QName ADDRESS4$10 = 
            new javax.xml.namespace.QName("", "ADDRESS4");
        private static final javax.xml.namespace.QName MAPCOORDINATE$12 = 
            new javax.xml.namespace.QName("", "MAP_COORDINATE");
        
        
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
        public java.lang.String getZIPCODE()
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
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ZIPCODE" element
         */
        public org.apache.xmlbeans.XmlString xgetZIPCODE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZIPCODE$2, 0);
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
        public void setZIPCODE(java.lang.String zipcode)
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
                target.setStringValue(zipcode);
            }
        }
        
        /**
         * Sets (as xml) the "ZIPCODE" element
         */
        public void xsetZIPCODE(org.apache.xmlbeans.XmlString zipcode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZIPCODE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ZIPCODE$2);
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
        
        /**
         * Gets the "ADDRESS2" element
         */
        public java.lang.String getADDRESS2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ADDRESS2" element
         */
        public org.apache.xmlbeans.XmlString xgetADDRESS2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "ADDRESS2" element
         */
        public boolean isSetADDRESS2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADDRESS2$6) != 0;
            }
        }
        
        /**
         * Sets the "ADDRESS2" element
         */
        public void setADDRESS2(java.lang.String address2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2$6);
                }
                target.setStringValue(address2);
            }
        }
        
        /**
         * Sets (as xml) the "ADDRESS2" element
         */
        public void xsetADDRESS2(org.apache.xmlbeans.XmlString address2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2$6);
                }
                target.set(address2);
            }
        }
        
        /**
         * Unsets the "ADDRESS2" element
         */
        public void unsetADDRESS2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADDRESS2$6, 0);
            }
        }
        
        /**
         * Gets the "ADDRESS3" element
         */
        public java.lang.String getADDRESS3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS3$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ADDRESS3" element
         */
        public org.apache.xmlbeans.XmlString xgetADDRESS3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS3$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "ADDRESS3" element
         */
        public boolean isSetADDRESS3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADDRESS3$8) != 0;
            }
        }
        
        /**
         * Sets the "ADDRESS3" element
         */
        public void setADDRESS3(java.lang.String address3)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS3$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS3$8);
                }
                target.setStringValue(address3);
            }
        }
        
        /**
         * Sets (as xml) the "ADDRESS3" element
         */
        public void xsetADDRESS3(org.apache.xmlbeans.XmlString address3)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS3$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS3$8);
                }
                target.set(address3);
            }
        }
        
        /**
         * Unsets the "ADDRESS3" element
         */
        public void unsetADDRESS3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADDRESS3$8, 0);
            }
        }
        
        /**
         * Gets the "ADDRESS4" element
         */
        public java.lang.String getADDRESS4()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS4$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ADDRESS4" element
         */
        public org.apache.xmlbeans.XmlString xgetADDRESS4()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS4$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "ADDRESS4" element
         */
        public boolean isSetADDRESS4()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADDRESS4$10) != 0;
            }
        }
        
        /**
         * Sets the "ADDRESS4" element
         */
        public void setADDRESS4(java.lang.String address4)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS4$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS4$10);
                }
                target.setStringValue(address4);
            }
        }
        
        /**
         * Sets (as xml) the "ADDRESS4" element
         */
        public void xsetADDRESS4(org.apache.xmlbeans.XmlString address4)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS4$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS4$10);
                }
                target.set(address4);
            }
        }
        
        /**
         * Unsets the "ADDRESS4" element
         */
        public void unsetADDRESS4()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADDRESS4$10, 0);
            }
        }
        
        /**
         * Gets the "MAP_COORDINATE" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE getMAPCOORDINATE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE)get_store().find_element_user(MAPCOORDINATE$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "MAP_COORDINATE" element
         */
        public boolean isSetMAPCOORDINATE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MAPCOORDINATE$12) != 0;
            }
        }
        
        /**
         * Sets the "MAP_COORDINATE" element
         */
        public void setMAPCOORDINATE(com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE mapcoordinate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE)get_store().find_element_user(MAPCOORDINATE$12, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE)get_store().add_element_user(MAPCOORDINATE$12);
                }
                target.set(mapcoordinate);
            }
        }
        
        /**
         * Appends and returns a new empty "MAP_COORDINATE" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE addNewMAPCOORDINATE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE)get_store().add_element_user(MAPCOORDINATE$12);
                return target;
            }
        }
        
        /**
         * Unsets the "MAP_COORDINATE" element
         */
        public void unsetMAPCOORDINATE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MAPCOORDINATE$12, 0);
            }
        }
    }
}
