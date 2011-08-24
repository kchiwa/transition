/*
 * An XML document type.
 * Localname: OBJECT_HEAD
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifjob.impl;
/**
 * A document containing one OBJECT_HEAD(@) element.
 *
 * This is a complex type.
 */
public class OBJECTHEADDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument
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
    public com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument.OBJECTHEAD getOBJECTHEAD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument.OBJECTHEAD target = null;
            target = (com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument.OBJECTHEAD)get_store().find_element_user(OBJECTHEAD$0, 0);
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
    public void setOBJECTHEAD(com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument.OBJECTHEAD objecthead)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument.OBJECTHEAD target = null;
            target = (com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument.OBJECTHEAD)get_store().find_element_user(OBJECTHEAD$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument.OBJECTHEAD)get_store().add_element_user(OBJECTHEAD$0);
            }
            target.set(objecthead);
        }
    }
    
    /**
     * Appends and returns a new empty "OBJECT_HEAD" element
     */
    public com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument.OBJECTHEAD addNewOBJECTHEAD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument.OBJECTHEAD target = null;
            target = (com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument.OBJECTHEAD)get_store().add_element_user(OBJECTHEAD$0);
            return target;
        }
    }
    /**
     * An XML OBJECT_HEAD(@).
     *
     * This is a complex type.
     */
    public static class OBJECTHEADImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument.OBJECTHEAD
    {
        private static final long serialVersionUID = 1L;
        
        public OBJECTHEADImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ORDERNO$0 = 
            new javax.xml.namespace.QName("", "ORDERNO");
        private static final javax.xml.namespace.QName USERREFERENCE$2 = 
            new javax.xml.namespace.QName("", "USER_REFERENCE");
        private static final javax.xml.namespace.QName PROVIDERREFERENCE$4 = 
            new javax.xml.namespace.QName("", "PROVIDER_REFERENCE");
        private static final javax.xml.namespace.QName OVERWRITEMMO$6 = 
            new javax.xml.namespace.QName("", "OVERWRITE_MMO");
        private static final javax.xml.namespace.QName VERSIONNO$8 = 
            new javax.xml.namespace.QName("", "VERSIONNO");
        private static final javax.xml.namespace.QName FROMDATE$10 = 
            new javax.xml.namespace.QName("", "FROMDATE");
        private static final javax.xml.namespace.QName TODATE$12 = 
            new javax.xml.namespace.QName("", "TODATE");
        private static final javax.xml.namespace.QName OBJECTLOCATION$14 = 
            new javax.xml.namespace.QName("", "OBJECT_LOCATION");
        private static final javax.xml.namespace.QName HEADING$16 = 
            new javax.xml.namespace.QName("", "HEADING");
        private static final javax.xml.namespace.QName SEGMENT$18 = 
            new javax.xml.namespace.QName("", "SEGMENT");
        
        
        /**
         * Gets the "ORDERNO" element
         */
        public com.abctech.transition.xmladbeans.iadifjob.ORDERNODocument.ORDERNO getORDERNO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.ORDERNODocument.ORDERNO target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.ORDERNODocument.ORDERNO)get_store().find_element_user(ORDERNO$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ORDERNO" element
         */
        public void setORDERNO(com.abctech.transition.xmladbeans.iadifjob.ORDERNODocument.ORDERNO orderno)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.ORDERNODocument.ORDERNO target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.ORDERNODocument.ORDERNO)get_store().find_element_user(ORDERNO$0, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifjob.ORDERNODocument.ORDERNO)get_store().add_element_user(ORDERNO$0);
                }
                target.set(orderno);
            }
        }
        
        /**
         * Appends and returns a new empty "ORDERNO" element
         */
        public com.abctech.transition.xmladbeans.iadifjob.ORDERNODocument.ORDERNO addNewORDERNO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.ORDERNODocument.ORDERNO target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.ORDERNODocument.ORDERNO)get_store().add_element_user(ORDERNO$0);
                return target;
            }
        }
        
        /**
         * Gets the "USER_REFERENCE" element
         */
        public java.lang.String getUSERREFERENCE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERREFERENCE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "USER_REFERENCE" element
         */
        public org.apache.xmlbeans.XmlString xgetUSERREFERENCE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERREFERENCE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "USER_REFERENCE" element
         */
        public boolean isSetUSERREFERENCE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(USERREFERENCE$2) != 0;
            }
        }
        
        /**
         * Sets the "USER_REFERENCE" element
         */
        public void setUSERREFERENCE(java.lang.String userreference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERREFERENCE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERREFERENCE$2);
                }
                target.setStringValue(userreference);
            }
        }
        
        /**
         * Sets (as xml) the "USER_REFERENCE" element
         */
        public void xsetUSERREFERENCE(org.apache.xmlbeans.XmlString userreference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERREFERENCE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERREFERENCE$2);
                }
                target.set(userreference);
            }
        }
        
        /**
         * Unsets the "USER_REFERENCE" element
         */
        public void unsetUSERREFERENCE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(USERREFERENCE$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVIDERREFERENCE$4, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROVIDERREFERENCE$4, 0);
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
                return get_store().count_elements(PROVIDERREFERENCE$4) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVIDERREFERENCE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROVIDERREFERENCE$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROVIDERREFERENCE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROVIDERREFERENCE$4);
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
                get_store().remove_element(PROVIDERREFERENCE$4, 0);
            }
        }
        
        /**
         * Gets the "OVERWRITE_MMO" element
         */
        public com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument.OVERWRITEMMO getOVERWRITEMMO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument.OVERWRITEMMO target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument.OVERWRITEMMO)get_store().find_element_user(OVERWRITEMMO$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "OVERWRITE_MMO" element
         */
        public void setOVERWRITEMMO(com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument.OVERWRITEMMO overwritemmo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument.OVERWRITEMMO target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument.OVERWRITEMMO)get_store().find_element_user(OVERWRITEMMO$6, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument.OVERWRITEMMO)get_store().add_element_user(OVERWRITEMMO$6);
                }
                target.set(overwritemmo);
            }
        }
        
        /**
         * Appends and returns a new empty "OVERWRITE_MMO" element
         */
        public com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument.OVERWRITEMMO addNewOVERWRITEMMO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument.OVERWRITEMMO target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.OVERWRITEMMODocument.OVERWRITEMMO)get_store().add_element_user(OVERWRITEMMO$6);
                return target;
            }
        }
        
        /**
         * Gets the "VERSIONNO" element
         */
        public java.lang.String getVERSIONNO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSIONNO$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "VERSIONNO" element
         */
        public org.apache.xmlbeans.XmlString xgetVERSIONNO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSIONNO$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "VERSIONNO" element
         */
        public boolean isSetVERSIONNO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VERSIONNO$8) != 0;
            }
        }
        
        /**
         * Sets the "VERSIONNO" element
         */
        public void setVERSIONNO(java.lang.String versionno)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSIONNO$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSIONNO$8);
                }
                target.setStringValue(versionno);
            }
        }
        
        /**
         * Sets (as xml) the "VERSIONNO" element
         */
        public void xsetVERSIONNO(org.apache.xmlbeans.XmlString versionno)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSIONNO$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERSIONNO$8);
                }
                target.set(versionno);
            }
        }
        
        /**
         * Unsets the "VERSIONNO" element
         */
        public void unsetVERSIONNO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VERSIONNO$8, 0);
            }
        }
        
        /**
         * Gets the "FROMDATE" element
         */
        public java.lang.String getFROMDATE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMDATE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FROMDATE" element
         */
        public org.apache.xmlbeans.XmlString xgetFROMDATE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMDATE$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "FROMDATE" element
         */
        public boolean isSetFROMDATE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FROMDATE$10) != 0;
            }
        }
        
        /**
         * Sets the "FROMDATE" element
         */
        public void setFROMDATE(java.lang.String fromdate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMDATE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FROMDATE$10);
                }
                target.setStringValue(fromdate);
            }
        }
        
        /**
         * Sets (as xml) the "FROMDATE" element
         */
        public void xsetFROMDATE(org.apache.xmlbeans.XmlString fromdate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMDATE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FROMDATE$10);
                }
                target.set(fromdate);
            }
        }
        
        /**
         * Unsets the "FROMDATE" element
         */
        public void unsetFROMDATE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FROMDATE$10, 0);
            }
        }
        
        /**
         * Gets the "TODATE" element
         */
        public java.lang.String getTODATE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TODATE$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "TODATE" element
         */
        public org.apache.xmlbeans.XmlString xgetTODATE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TODATE$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "TODATE" element
         */
        public boolean isSetTODATE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TODATE$12) != 0;
            }
        }
        
        /**
         * Sets the "TODATE" element
         */
        public void setTODATE(java.lang.String todate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TODATE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TODATE$12);
                }
                target.setStringValue(todate);
            }
        }
        
        /**
         * Sets (as xml) the "TODATE" element
         */
        public void xsetTODATE(org.apache.xmlbeans.XmlString todate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TODATE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TODATE$12);
                }
                target.set(todate);
            }
        }
        
        /**
         * Unsets the "TODATE" element
         */
        public void unsetTODATE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TODATE$12, 0);
            }
        }
        
        /**
         * Gets the "OBJECT_LOCATION" element
         */
        public com.abctech.transition.xmladbeans.iadifjob.OBJECTLOCATIONDocument.OBJECTLOCATION getOBJECTLOCATION()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.OBJECTLOCATIONDocument.OBJECTLOCATION target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.OBJECTLOCATIONDocument.OBJECTLOCATION)get_store().find_element_user(OBJECTLOCATION$14, 0);
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
        public void setOBJECTLOCATION(com.abctech.transition.xmladbeans.iadifjob.OBJECTLOCATIONDocument.OBJECTLOCATION objectlocation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.OBJECTLOCATIONDocument.OBJECTLOCATION target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.OBJECTLOCATIONDocument.OBJECTLOCATION)get_store().find_element_user(OBJECTLOCATION$14, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifjob.OBJECTLOCATIONDocument.OBJECTLOCATION)get_store().add_element_user(OBJECTLOCATION$14);
                }
                target.set(objectlocation);
            }
        }
        
        /**
         * Appends and returns a new empty "OBJECT_LOCATION" element
         */
        public com.abctech.transition.xmladbeans.iadifjob.OBJECTLOCATIONDocument.OBJECTLOCATION addNewOBJECTLOCATION()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.OBJECTLOCATIONDocument.OBJECTLOCATION target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.OBJECTLOCATIONDocument.OBJECTLOCATION)get_store().add_element_user(OBJECTLOCATION$14);
                return target;
            }
        }
        
        /**
         * Gets the "HEADING" element
         */
        public java.lang.String getHEADING()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEADING$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "HEADING" element
         */
        public org.apache.xmlbeans.XmlString xgetHEADING()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HEADING$16, 0);
                return target;
            }
        }
        
        /**
         * True if has "HEADING" element
         */
        public boolean isSetHEADING()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HEADING$16) != 0;
            }
        }
        
        /**
         * Sets the "HEADING" element
         */
        public void setHEADING(java.lang.String heading)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEADING$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HEADING$16);
                }
                target.setStringValue(heading);
            }
        }
        
        /**
         * Sets (as xml) the "HEADING" element
         */
        public void xsetHEADING(org.apache.xmlbeans.XmlString heading)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HEADING$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HEADING$16);
                }
                target.set(heading);
            }
        }
        
        /**
         * Unsets the "HEADING" element
         */
        public void unsetHEADING()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HEADING$16, 0);
            }
        }
        
        /**
         * Gets the "SEGMENT" element
         */
        public com.abctech.transition.xmladbeans.iadifjob.SEGMENTDocument.SEGMENT getSEGMENT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.SEGMENTDocument.SEGMENT target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.SEGMENTDocument.SEGMENT)get_store().find_element_user(SEGMENT$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "SEGMENT" element
         */
        public boolean isSetSEGMENT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEGMENT$18) != 0;
            }
        }
        
        /**
         * Sets the "SEGMENT" element
         */
        public void setSEGMENT(com.abctech.transition.xmladbeans.iadifjob.SEGMENTDocument.SEGMENT segment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.SEGMENTDocument.SEGMENT target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.SEGMENTDocument.SEGMENT)get_store().find_element_user(SEGMENT$18, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifjob.SEGMENTDocument.SEGMENT)get_store().add_element_user(SEGMENT$18);
                }
                target.set(segment);
            }
        }
        
        /**
         * Appends and returns a new empty "SEGMENT" element
         */
        public com.abctech.transition.xmladbeans.iadifjob.SEGMENTDocument.SEGMENT addNewSEGMENT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.SEGMENTDocument.SEGMENT target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.SEGMENTDocument.SEGMENT)get_store().add_element_user(SEGMENT$18);
                return target;
            }
        }
        
        /**
         * Unsets the "SEGMENT" element
         */
        public void unsetSEGMENT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEGMENT$18, 0);
            }
        }
    }
}
