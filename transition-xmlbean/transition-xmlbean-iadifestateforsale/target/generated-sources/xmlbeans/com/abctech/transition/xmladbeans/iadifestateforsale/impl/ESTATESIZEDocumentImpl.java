/*
 * An XML document type.
 * Localname: ESTATE_SIZE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESIZEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one ESTATE_SIZE(@) element.
 *
 * This is a complex type.
 */
public class ESTATESIZEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESIZEDocument
{
    private static final long serialVersionUID = 1L;
    
    public ESTATESIZEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ESTATESIZE$0 = 
        new javax.xml.namespace.QName("", "ESTATE_SIZE");
    
    
    /**
     * Gets the "ESTATE_SIZE" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESIZEDocument.ESTATESIZE getESTATESIZE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESIZEDocument.ESTATESIZE target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESIZEDocument.ESTATESIZE)get_store().find_element_user(ESTATESIZE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ESTATE_SIZE" element
     */
    public void setESTATESIZE(com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESIZEDocument.ESTATESIZE estatesize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESIZEDocument.ESTATESIZE target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESIZEDocument.ESTATESIZE)get_store().find_element_user(ESTATESIZE$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESIZEDocument.ESTATESIZE)get_store().add_element_user(ESTATESIZE$0);
            }
            target.set(estatesize);
        }
    }
    
    /**
     * Appends and returns a new empty "ESTATE_SIZE" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESIZEDocument.ESTATESIZE addNewESTATESIZE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESIZEDocument.ESTATESIZE target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESIZEDocument.ESTATESIZE)get_store().add_element_user(ESTATESIZE$0);
            return target;
        }
    }
    /**
     * An XML ESTATE_SIZE(@).
     *
     * This is a complex type.
     */
    public static class ESTATESIZEImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESIZEDocument.ESTATESIZE
    {
        private static final long serialVersionUID = 1L;
        
        public ESTATESIZEImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PRIMARYROOMAREA$0 = 
            new javax.xml.namespace.QName("", "PRIMARY_ROOM_AREA");
        private static final javax.xml.namespace.QName PRIMARYROOMDESCRIPTION$2 = 
            new javax.xml.namespace.QName("", "PRIMARY_ROOM_DESCRIPTION");
        private static final javax.xml.namespace.QName LIVINGAREA$4 = 
            new javax.xml.namespace.QName("", "LIVING_AREA");
        private static final javax.xml.namespace.QName GROSSAREA$6 = 
            new javax.xml.namespace.QName("", "GROSS_AREA");
        private static final javax.xml.namespace.QName FLOORAREA$8 = 
            new javax.xml.namespace.QName("", "FLOOR_AREA");
        private static final javax.xml.namespace.QName USEABLEAREA$10 = 
            new javax.xml.namespace.QName("", "USEABLE_AREA");
        
        
        /**
         * Gets the "PRIMARY_ROOM_AREA" element
         */
        public java.lang.String getPRIMARYROOMAREA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYROOMAREA$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PRIMARY_ROOM_AREA" element
         */
        public org.apache.xmlbeans.XmlString xgetPRIMARYROOMAREA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMARYROOMAREA$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "PRIMARY_ROOM_AREA" element
         */
        public boolean isSetPRIMARYROOMAREA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PRIMARYROOMAREA$0) != 0;
            }
        }
        
        /**
         * Sets the "PRIMARY_ROOM_AREA" element
         */
        public void setPRIMARYROOMAREA(java.lang.String primaryroomarea)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYROOMAREA$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIMARYROOMAREA$0);
                }
                target.setStringValue(primaryroomarea);
            }
        }
        
        /**
         * Sets (as xml) the "PRIMARY_ROOM_AREA" element
         */
        public void xsetPRIMARYROOMAREA(org.apache.xmlbeans.XmlString primaryroomarea)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMARYROOMAREA$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRIMARYROOMAREA$0);
                }
                target.set(primaryroomarea);
            }
        }
        
        /**
         * Unsets the "PRIMARY_ROOM_AREA" element
         */
        public void unsetPRIMARYROOMAREA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PRIMARYROOMAREA$0, 0);
            }
        }
        
        /**
         * Gets the "PRIMARY_ROOM_DESCRIPTION" element
         */
        public java.lang.String getPRIMARYROOMDESCRIPTION()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYROOMDESCRIPTION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PRIMARY_ROOM_DESCRIPTION" element
         */
        public org.apache.xmlbeans.XmlString xgetPRIMARYROOMDESCRIPTION()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMARYROOMDESCRIPTION$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "PRIMARY_ROOM_DESCRIPTION" element
         */
        public boolean isSetPRIMARYROOMDESCRIPTION()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PRIMARYROOMDESCRIPTION$2) != 0;
            }
        }
        
        /**
         * Sets the "PRIMARY_ROOM_DESCRIPTION" element
         */
        public void setPRIMARYROOMDESCRIPTION(java.lang.String primaryroomdescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYROOMDESCRIPTION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIMARYROOMDESCRIPTION$2);
                }
                target.setStringValue(primaryroomdescription);
            }
        }
        
        /**
         * Sets (as xml) the "PRIMARY_ROOM_DESCRIPTION" element
         */
        public void xsetPRIMARYROOMDESCRIPTION(org.apache.xmlbeans.XmlString primaryroomdescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMARYROOMDESCRIPTION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRIMARYROOMDESCRIPTION$2);
                }
                target.set(primaryroomdescription);
            }
        }
        
        /**
         * Unsets the "PRIMARY_ROOM_DESCRIPTION" element
         */
        public void unsetPRIMARYROOMDESCRIPTION()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PRIMARYROOMDESCRIPTION$2, 0);
            }
        }
        
        /**
         * Gets the "LIVING_AREA" element
         */
        public java.lang.String getLIVINGAREA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIVINGAREA$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "LIVING_AREA" element
         */
        public org.apache.xmlbeans.XmlString xgetLIVINGAREA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LIVINGAREA$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "LIVING_AREA" element
         */
        public boolean isSetLIVINGAREA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LIVINGAREA$4) != 0;
            }
        }
        
        /**
         * Sets the "LIVING_AREA" element
         */
        public void setLIVINGAREA(java.lang.String livingarea)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIVINGAREA$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LIVINGAREA$4);
                }
                target.setStringValue(livingarea);
            }
        }
        
        /**
         * Sets (as xml) the "LIVING_AREA" element
         */
        public void xsetLIVINGAREA(org.apache.xmlbeans.XmlString livingarea)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LIVINGAREA$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LIVINGAREA$4);
                }
                target.set(livingarea);
            }
        }
        
        /**
         * Unsets the "LIVING_AREA" element
         */
        public void unsetLIVINGAREA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LIVINGAREA$4, 0);
            }
        }
        
        /**
         * Gets the "GROSS_AREA" element
         */
        public java.lang.String getGROSSAREA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROSSAREA$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "GROSS_AREA" element
         */
        public org.apache.xmlbeans.XmlString xgetGROSSAREA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROSSAREA$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "GROSS_AREA" element
         */
        public boolean isSetGROSSAREA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GROSSAREA$6) != 0;
            }
        }
        
        /**
         * Sets the "GROSS_AREA" element
         */
        public void setGROSSAREA(java.lang.String grossarea)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROSSAREA$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GROSSAREA$6);
                }
                target.setStringValue(grossarea);
            }
        }
        
        /**
         * Sets (as xml) the "GROSS_AREA" element
         */
        public void xsetGROSSAREA(org.apache.xmlbeans.XmlString grossarea)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROSSAREA$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GROSSAREA$6);
                }
                target.set(grossarea);
            }
        }
        
        /**
         * Unsets the "GROSS_AREA" element
         */
        public void unsetGROSSAREA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GROSSAREA$6, 0);
            }
        }
        
        /**
         * Gets the "FLOOR_AREA" element
         */
        public java.lang.String getFLOORAREA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLOORAREA$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FLOOR_AREA" element
         */
        public org.apache.xmlbeans.XmlString xgetFLOORAREA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FLOORAREA$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "FLOOR_AREA" element
         */
        public boolean isSetFLOORAREA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FLOORAREA$8) != 0;
            }
        }
        
        /**
         * Sets the "FLOOR_AREA" element
         */
        public void setFLOORAREA(java.lang.String floorarea)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLOORAREA$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FLOORAREA$8);
                }
                target.setStringValue(floorarea);
            }
        }
        
        /**
         * Sets (as xml) the "FLOOR_AREA" element
         */
        public void xsetFLOORAREA(org.apache.xmlbeans.XmlString floorarea)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FLOORAREA$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FLOORAREA$8);
                }
                target.set(floorarea);
            }
        }
        
        /**
         * Unsets the "FLOOR_AREA" element
         */
        public void unsetFLOORAREA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FLOORAREA$8, 0);
            }
        }
        
        /**
         * Gets the "USEABLE_AREA" element
         */
        public java.lang.String getUSEABLEAREA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USEABLEAREA$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "USEABLE_AREA" element
         */
        public org.apache.xmlbeans.XmlString xgetUSEABLEAREA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USEABLEAREA$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "USEABLE_AREA" element
         */
        public boolean isSetUSEABLEAREA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(USEABLEAREA$10) != 0;
            }
        }
        
        /**
         * Sets the "USEABLE_AREA" element
         */
        public void setUSEABLEAREA(java.lang.String useablearea)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USEABLEAREA$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USEABLEAREA$10);
                }
                target.setStringValue(useablearea);
            }
        }
        
        /**
         * Sets (as xml) the "USEABLE_AREA" element
         */
        public void xsetUSEABLEAREA(org.apache.xmlbeans.XmlString useablearea)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USEABLEAREA$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USEABLEAREA$10);
                }
                target.set(useablearea);
            }
        }
        
        /**
         * Unsets the "USEABLE_AREA" element
         */
        public void unsetUSEABLEAREA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(USEABLEAREA$10, 0);
            }
        }
    }
}
