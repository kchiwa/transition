/*
 * An XML document type.
 * Localname: MAP_COORDINATE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one MAP_COORDINATE(@) element.
 *
 * This is a complex type.
 */
public class MAPCOORDINATEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument
{
    private static final long serialVersionUID = 1L;
    
    public MAPCOORDINATEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAPCOORDINATE$0 = 
        new javax.xml.namespace.QName("", "MAP_COORDINATE");
    
    
    /**
     * Gets the "MAP_COORDINATE" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE getMAPCOORDINATE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE)get_store().find_element_user(MAPCOORDINATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
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
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE)get_store().find_element_user(MAPCOORDINATE$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE)get_store().add_element_user(MAPCOORDINATE$0);
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
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE)get_store().add_element_user(MAPCOORDINATE$0);
            return target;
        }
    }
    /**
     * An XML MAP_COORDINATE(@).
     *
     * This is a complex type.
     */
    public static class MAPCOORDINATEImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE
    {
        private static final long serialVersionUID = 1L;
        
        public MAPCOORDINATEImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EASTING$0 = 
            new javax.xml.namespace.QName("", "EASTING");
        private static final javax.xml.namespace.QName NORTHING$2 = 
            new javax.xml.namespace.QName("", "NORTHING");
        private static final javax.xml.namespace.QName GEOACCURACY$4 = 
            new javax.xml.namespace.QName("", "GEO_ACCURACY");
        private static final javax.xml.namespace.QName SYSTEM$6 = 
            new javax.xml.namespace.QName("", "SYSTEM");
        
        
        /**
         * Gets the "EASTING" element
         */
        public java.lang.String getEASTING()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EASTING$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EASTING" element
         */
        public org.apache.xmlbeans.XmlString xgetEASTING()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EASTING$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "EASTING" element
         */
        public void setEASTING(java.lang.String easting)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EASTING$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EASTING$0);
                }
                target.setStringValue(easting);
            }
        }
        
        /**
         * Sets (as xml) the "EASTING" element
         */
        public void xsetEASTING(org.apache.xmlbeans.XmlString easting)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EASTING$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EASTING$0);
                }
                target.set(easting);
            }
        }
        
        /**
         * Gets the "NORTHING" element
         */
        public java.lang.String getNORTHING()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NORTHING$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "NORTHING" element
         */
        public org.apache.xmlbeans.XmlString xgetNORTHING()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NORTHING$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "NORTHING" element
         */
        public void setNORTHING(java.lang.String northing)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NORTHING$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NORTHING$2);
                }
                target.setStringValue(northing);
            }
        }
        
        /**
         * Sets (as xml) the "NORTHING" element
         */
        public void xsetNORTHING(org.apache.xmlbeans.XmlString northing)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NORTHING$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NORTHING$2);
                }
                target.set(northing);
            }
        }
        
        /**
         * Gets the "GEO_ACCURACY" element
         */
        public java.lang.String getGEOACCURACY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GEOACCURACY$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "GEO_ACCURACY" element
         */
        public org.apache.xmlbeans.XmlString xgetGEOACCURACY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GEOACCURACY$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "GEO_ACCURACY" element
         */
        public boolean isSetGEOACCURACY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GEOACCURACY$4) != 0;
            }
        }
        
        /**
         * Sets the "GEO_ACCURACY" element
         */
        public void setGEOACCURACY(java.lang.String geoaccuracy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GEOACCURACY$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GEOACCURACY$4);
                }
                target.setStringValue(geoaccuracy);
            }
        }
        
        /**
         * Sets (as xml) the "GEO_ACCURACY" element
         */
        public void xsetGEOACCURACY(org.apache.xmlbeans.XmlString geoaccuracy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GEOACCURACY$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GEOACCURACY$4);
                }
                target.set(geoaccuracy);
            }
        }
        
        /**
         * Unsets the "GEO_ACCURACY" element
         */
        public void unsetGEOACCURACY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GEOACCURACY$4, 0);
            }
        }
        
        /**
         * Gets the "SYSTEM" attribute
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE.SYSTEM.Enum getSYSTEM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYSTEM$6);
                if (target == null)
                {
                    return null;
                }
                return (com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE.SYSTEM.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "SYSTEM" attribute
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE.SYSTEM xgetSYSTEM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE.SYSTEM target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE.SYSTEM)get_store().find_attribute_user(SYSTEM$6);
                return target;
            }
        }
        
        /**
         * Sets the "SYSTEM" attribute
         */
        public void setSYSTEM(com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE.SYSTEM.Enum system)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYSTEM$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SYSTEM$6);
                }
                target.setEnumValue(system);
            }
        }
        
        /**
         * Sets (as xml) the "SYSTEM" attribute
         */
        public void xsetSYSTEM(com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE.SYSTEM system)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE.SYSTEM target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE.SYSTEM)get_store().find_attribute_user(SYSTEM$6);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE.SYSTEM)get_store().add_attribute_user(SYSTEM$6);
                }
                target.set(system);
            }
        }
        /**
         * An XML SYSTEM(@).
         *
         * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument$MAPCOORDINATE$SYSTEM.
         */
        public static class SYSTEMImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.abctech.transition.xmladbeans.iadifestateforsale.MAPCOORDINATEDocument.MAPCOORDINATE.SYSTEM
        {
            private static final long serialVersionUID = 1L;
            
            public SYSTEMImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected SYSTEMImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
