/*
 * An XML document type.
 * Localname: AREA_RANGE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.AREARANGEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one AREA_RANGE(@) element.
 *
 * This is a complex type.
 */
public class AREARANGEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.AREARANGEDocument
{
    private static final long serialVersionUID = 1L;
    
    public AREARANGEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AREARANGE$0 = 
        new javax.xml.namespace.QName("", "AREA_RANGE");
    
    
    /**
     * Gets the "AREA_RANGE" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.AREARANGEDocument.AREARANGE getAREARANGE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.AREARANGEDocument.AREARANGE target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.AREARANGEDocument.AREARANGE)get_store().find_element_user(AREARANGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AREA_RANGE" element
     */
    public void setAREARANGE(com.abctech.transition.xmladbeans.iadifestateforsale.AREARANGEDocument.AREARANGE arearange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.AREARANGEDocument.AREARANGE target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.AREARANGEDocument.AREARANGE)get_store().find_element_user(AREARANGE$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.AREARANGEDocument.AREARANGE)get_store().add_element_user(AREARANGE$0);
            }
            target.set(arearange);
        }
    }
    
    /**
     * Appends and returns a new empty "AREA_RANGE" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.AREARANGEDocument.AREARANGE addNewAREARANGE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.AREARANGEDocument.AREARANGE target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.AREARANGEDocument.AREARANGE)get_store().add_element_user(AREARANGE$0);
            return target;
        }
    }
    /**
     * An XML AREA_RANGE(@).
     *
     * This is a complex type.
     */
    public static class AREARANGEImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.AREARANGEDocument.AREARANGE
    {
        private static final long serialVersionUID = 1L;
        
        public AREARANGEImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AREAFROM$0 = 
            new javax.xml.namespace.QName("", "AREA_FROM");
        private static final javax.xml.namespace.QName AREATO$2 = 
            new javax.xml.namespace.QName("", "AREA_TO");
        private static final javax.xml.namespace.QName USEABLEAREAFROM$4 = 
            new javax.xml.namespace.QName("", "USEABLE_AREA_FROM");
        private static final javax.xml.namespace.QName USEABLEAREATO$6 = 
            new javax.xml.namespace.QName("", "USEABLE_AREA_TO");
        private static final javax.xml.namespace.QName PRIMARYROOMAREAFROM$8 = 
            new javax.xml.namespace.QName("", "PRIMARY_ROOM_AREA_FROM");
        private static final javax.xml.namespace.QName PRIMARYROOMAREATO$10 = 
            new javax.xml.namespace.QName("", "PRIMARY_ROOM_AREA_TO");
        
        
        /**
         * Gets the "AREA_FROM" element
         */
        public java.lang.String getAREAFROM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AREAFROM$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "AREA_FROM" element
         */
        public org.apache.xmlbeans.XmlString xgetAREAFROM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AREAFROM$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "AREA_FROM" element
         */
        public void setAREAFROM(java.lang.String areafrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AREAFROM$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AREAFROM$0);
                }
                target.setStringValue(areafrom);
            }
        }
        
        /**
         * Sets (as xml) the "AREA_FROM" element
         */
        public void xsetAREAFROM(org.apache.xmlbeans.XmlString areafrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AREAFROM$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AREAFROM$0);
                }
                target.set(areafrom);
            }
        }
        
        /**
         * Gets the "AREA_TO" element
         */
        public java.lang.String getAREATO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AREATO$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "AREA_TO" element
         */
        public org.apache.xmlbeans.XmlString xgetAREATO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AREATO$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "AREA_TO" element
         */
        public void setAREATO(java.lang.String areato)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AREATO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AREATO$2);
                }
                target.setStringValue(areato);
            }
        }
        
        /**
         * Sets (as xml) the "AREA_TO" element
         */
        public void xsetAREATO(org.apache.xmlbeans.XmlString areato)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AREATO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AREATO$2);
                }
                target.set(areato);
            }
        }
        
        /**
         * Gets the "USEABLE_AREA_FROM" element
         */
        public java.lang.String getUSEABLEAREAFROM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USEABLEAREAFROM$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "USEABLE_AREA_FROM" element
         */
        public org.apache.xmlbeans.XmlString xgetUSEABLEAREAFROM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USEABLEAREAFROM$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "USEABLE_AREA_FROM" element
         */
        public boolean isSetUSEABLEAREAFROM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(USEABLEAREAFROM$4) != 0;
            }
        }
        
        /**
         * Sets the "USEABLE_AREA_FROM" element
         */
        public void setUSEABLEAREAFROM(java.lang.String useableareafrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USEABLEAREAFROM$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USEABLEAREAFROM$4);
                }
                target.setStringValue(useableareafrom);
            }
        }
        
        /**
         * Sets (as xml) the "USEABLE_AREA_FROM" element
         */
        public void xsetUSEABLEAREAFROM(org.apache.xmlbeans.XmlString useableareafrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USEABLEAREAFROM$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USEABLEAREAFROM$4);
                }
                target.set(useableareafrom);
            }
        }
        
        /**
         * Unsets the "USEABLE_AREA_FROM" element
         */
        public void unsetUSEABLEAREAFROM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(USEABLEAREAFROM$4, 0);
            }
        }
        
        /**
         * Gets the "USEABLE_AREA_TO" element
         */
        public java.lang.String getUSEABLEAREATO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USEABLEAREATO$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "USEABLE_AREA_TO" element
         */
        public org.apache.xmlbeans.XmlString xgetUSEABLEAREATO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USEABLEAREATO$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "USEABLE_AREA_TO" element
         */
        public boolean isSetUSEABLEAREATO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(USEABLEAREATO$6) != 0;
            }
        }
        
        /**
         * Sets the "USEABLE_AREA_TO" element
         */
        public void setUSEABLEAREATO(java.lang.String useableareato)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USEABLEAREATO$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USEABLEAREATO$6);
                }
                target.setStringValue(useableareato);
            }
        }
        
        /**
         * Sets (as xml) the "USEABLE_AREA_TO" element
         */
        public void xsetUSEABLEAREATO(org.apache.xmlbeans.XmlString useableareato)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USEABLEAREATO$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USEABLEAREATO$6);
                }
                target.set(useableareato);
            }
        }
        
        /**
         * Unsets the "USEABLE_AREA_TO" element
         */
        public void unsetUSEABLEAREATO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(USEABLEAREATO$6, 0);
            }
        }
        
        /**
         * Gets the "PRIMARY_ROOM_AREA_FROM" element
         */
        public java.lang.String getPRIMARYROOMAREAFROM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYROOMAREAFROM$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PRIMARY_ROOM_AREA_FROM" element
         */
        public org.apache.xmlbeans.XmlString xgetPRIMARYROOMAREAFROM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMARYROOMAREAFROM$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "PRIMARY_ROOM_AREA_FROM" element
         */
        public boolean isSetPRIMARYROOMAREAFROM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PRIMARYROOMAREAFROM$8) != 0;
            }
        }
        
        /**
         * Sets the "PRIMARY_ROOM_AREA_FROM" element
         */
        public void setPRIMARYROOMAREAFROM(java.lang.String primaryroomareafrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYROOMAREAFROM$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIMARYROOMAREAFROM$8);
                }
                target.setStringValue(primaryroomareafrom);
            }
        }
        
        /**
         * Sets (as xml) the "PRIMARY_ROOM_AREA_FROM" element
         */
        public void xsetPRIMARYROOMAREAFROM(org.apache.xmlbeans.XmlString primaryroomareafrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMARYROOMAREAFROM$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRIMARYROOMAREAFROM$8);
                }
                target.set(primaryroomareafrom);
            }
        }
        
        /**
         * Unsets the "PRIMARY_ROOM_AREA_FROM" element
         */
        public void unsetPRIMARYROOMAREAFROM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PRIMARYROOMAREAFROM$8, 0);
            }
        }
        
        /**
         * Gets the "PRIMARY_ROOM_AREA_TO" element
         */
        public java.lang.String getPRIMARYROOMAREATO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYROOMAREATO$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PRIMARY_ROOM_AREA_TO" element
         */
        public org.apache.xmlbeans.XmlString xgetPRIMARYROOMAREATO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMARYROOMAREATO$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "PRIMARY_ROOM_AREA_TO" element
         */
        public boolean isSetPRIMARYROOMAREATO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PRIMARYROOMAREATO$10) != 0;
            }
        }
        
        /**
         * Sets the "PRIMARY_ROOM_AREA_TO" element
         */
        public void setPRIMARYROOMAREATO(java.lang.String primaryroomareato)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYROOMAREATO$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIMARYROOMAREATO$10);
                }
                target.setStringValue(primaryroomareato);
            }
        }
        
        /**
         * Sets (as xml) the "PRIMARY_ROOM_AREA_TO" element
         */
        public void xsetPRIMARYROOMAREATO(org.apache.xmlbeans.XmlString primaryroomareato)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMARYROOMAREATO$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRIMARYROOMAREATO$10);
                }
                target.set(primaryroomareato);
            }
        }
        
        /**
         * Unsets the "PRIMARY_ROOM_AREA_TO" element
         */
        public void unsetPRIMARYROOMAREATO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PRIMARYROOMAREATO$10, 0);
            }
        }
    }
}
