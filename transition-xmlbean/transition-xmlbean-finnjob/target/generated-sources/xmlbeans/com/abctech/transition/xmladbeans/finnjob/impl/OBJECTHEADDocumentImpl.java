/*
 * An XML document type.
 * Localname: OBJECT_HEAD
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.finnjob.OBJECTHEADDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.finnjob.impl;
/**
 * A document containing one OBJECT_HEAD(@) element.
 *
 * This is a complex type.
 */
public class OBJECTHEADDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.finnjob.OBJECTHEADDocument
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
    public com.abctech.transition.xmladbeans.finnjob.OBJECTHEADDocument.OBJECTHEAD getOBJECTHEAD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.finnjob.OBJECTHEADDocument.OBJECTHEAD target = null;
            target = (com.abctech.transition.xmladbeans.finnjob.OBJECTHEADDocument.OBJECTHEAD)get_store().find_element_user(OBJECTHEAD$0, 0);
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
    public void setOBJECTHEAD(com.abctech.transition.xmladbeans.finnjob.OBJECTHEADDocument.OBJECTHEAD objecthead)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.finnjob.OBJECTHEADDocument.OBJECTHEAD target = null;
            target = (com.abctech.transition.xmladbeans.finnjob.OBJECTHEADDocument.OBJECTHEAD)get_store().find_element_user(OBJECTHEAD$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.finnjob.OBJECTHEADDocument.OBJECTHEAD)get_store().add_element_user(OBJECTHEAD$0);
            }
            target.set(objecthead);
        }
    }
    
    /**
     * Appends and returns a new empty "OBJECT_HEAD" element
     */
    public com.abctech.transition.xmladbeans.finnjob.OBJECTHEADDocument.OBJECTHEAD addNewOBJECTHEAD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.finnjob.OBJECTHEADDocument.OBJECTHEAD target = null;
            target = (com.abctech.transition.xmladbeans.finnjob.OBJECTHEADDocument.OBJECTHEAD)get_store().add_element_user(OBJECTHEAD$0);
            return target;
        }
    }
    /**
     * An XML OBJECT_HEAD(@).
     *
     * This is a complex type.
     */
    public static class OBJECTHEADImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.finnjob.OBJECTHEADDocument.OBJECTHEAD
    {
        private static final long serialVersionUID = 1L;
        
        public OBJECTHEADImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ORDERNO$0 = 
            new javax.xml.namespace.QName("", "ORDERNO");
        private static final javax.xml.namespace.QName USERREFERENCE$2 = 
            new javax.xml.namespace.QName("", "USERREFERENCE");
        private static final javax.xml.namespace.QName VERSIONNO$4 = 
            new javax.xml.namespace.QName("", "VERSIONNO");
        private static final javax.xml.namespace.QName OVERWRITEMMO$6 = 
            new javax.xml.namespace.QName("", "OVERWRITE_MMO");
        private static final javax.xml.namespace.QName FROMDATE$8 = 
            new javax.xml.namespace.QName("", "FROMDATE");
        private static final javax.xml.namespace.QName TODATE$10 = 
            new javax.xml.namespace.QName("", "TODATE");
        private static final javax.xml.namespace.QName OBJECTLOCATION$12 = 
            new javax.xml.namespace.QName("", "OBJECT_LOCATION");
        private static final javax.xml.namespace.QName HEADING$14 = 
            new javax.xml.namespace.QName("", "HEADING");
        
        
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
         * Gets the "USERREFERENCE" element
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
         * Gets (as xml) the "USERREFERENCE" element
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
         * True if has "USERREFERENCE" element
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
         * Sets the "USERREFERENCE" element
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
         * Sets (as xml) the "USERREFERENCE" element
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
         * Unsets the "USERREFERENCE" element
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
         * Gets the "VERSIONNO" element
         */
        public java.lang.String getVERSIONNO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSIONNO$4, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSIONNO$4, 0);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSIONNO$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSIONNO$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSIONNO$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERSIONNO$4);
                }
                target.set(versionno);
            }
        }
        
        /**
         * Gets the "OVERWRITE_MMO" element
         */
        public com.abctech.transition.xmladbeans.finnjob.OVERWRITEMMODocument.OVERWRITEMMO getOVERWRITEMMO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.OVERWRITEMMODocument.OVERWRITEMMO target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.OVERWRITEMMODocument.OVERWRITEMMO)get_store().find_element_user(OVERWRITEMMO$6, 0);
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
        public void setOVERWRITEMMO(com.abctech.transition.xmladbeans.finnjob.OVERWRITEMMODocument.OVERWRITEMMO overwritemmo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.OVERWRITEMMODocument.OVERWRITEMMO target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.OVERWRITEMMODocument.OVERWRITEMMO)get_store().find_element_user(OVERWRITEMMO$6, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.finnjob.OVERWRITEMMODocument.OVERWRITEMMO)get_store().add_element_user(OVERWRITEMMO$6);
                }
                target.set(overwritemmo);
            }
        }
        
        /**
         * Appends and returns a new empty "OVERWRITE_MMO" element
         */
        public com.abctech.transition.xmladbeans.finnjob.OVERWRITEMMODocument.OVERWRITEMMO addNewOVERWRITEMMO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.OVERWRITEMMODocument.OVERWRITEMMO target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.OVERWRITEMMODocument.OVERWRITEMMO)get_store().add_element_user(OVERWRITEMMO$6);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMDATE$8, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMDATE$8, 0);
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
                return get_store().count_elements(FROMDATE$8) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMDATE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FROMDATE$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMDATE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FROMDATE$8);
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
                get_store().remove_element(FROMDATE$8, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TODATE$10, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TODATE$10, 0);
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
                return get_store().count_elements(TODATE$10) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TODATE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TODATE$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TODATE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TODATE$10);
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
                get_store().remove_element(TODATE$10, 0);
            }
        }
        
        /**
         * Gets the "OBJECT_LOCATION" element
         */
        public com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument.OBJECTLOCATION getOBJECTLOCATION()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument.OBJECTLOCATION target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument.OBJECTLOCATION)get_store().find_element_user(OBJECTLOCATION$12, 0);
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
                target = (com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument.OBJECTLOCATION)get_store().find_element_user(OBJECTLOCATION$12, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument.OBJECTLOCATION)get_store().add_element_user(OBJECTLOCATION$12);
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
                target = (com.abctech.transition.xmladbeans.finnjob.OBJECTLOCATIONDocument.OBJECTLOCATION)get_store().add_element_user(OBJECTLOCATION$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEADING$14, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HEADING$14, 0);
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
                return get_store().count_elements(HEADING$14) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEADING$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HEADING$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HEADING$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HEADING$14);
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
                get_store().remove_element(HEADING$14, 0);
            }
        }
    }
}
