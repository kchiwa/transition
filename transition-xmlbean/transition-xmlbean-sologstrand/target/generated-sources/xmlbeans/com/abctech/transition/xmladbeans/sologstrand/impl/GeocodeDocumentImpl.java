/*
 * An XML document type.
 * Localname: geocode
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.sologstrand.impl;
/**
 * A document containing one geocode(@) element.
 *
 * This is a complex type.
 */
public class GeocodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeocodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOCODE$0 = 
        new javax.xml.namespace.QName("", "geocode");
    
    
    /**
     * Gets the "geocode" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument.Geocode getGeocode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument.Geocode target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument.Geocode)get_store().find_element_user(GEOCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "geocode" element
     */
    public void setGeocode(com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument.Geocode geocode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument.Geocode target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument.Geocode)get_store().find_element_user(GEOCODE$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument.Geocode)get_store().add_element_user(GEOCODE$0);
            }
            target.set(geocode);
        }
    }
    
    /**
     * Appends and returns a new empty "geocode" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument.Geocode addNewGeocode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument.Geocode target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument.Geocode)get_store().add_element_user(GEOCODE$0);
            return target;
        }
    }
    /**
     * An XML geocode(@).
     *
     * This is a complex type.
     */
    public static class GeocodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.GeocodeDocument.Geocode
    {
        private static final long serialVersionUID = 1L;
        
        public GeocodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LAT$0 = 
            new javax.xml.namespace.QName("", "lat");
        private static final javax.xml.namespace.QName LNG$2 = 
            new javax.xml.namespace.QName("", "lng");
        private static final javax.xml.namespace.QName ZOOM$4 = 
            new javax.xml.namespace.QName("", "zoom");
        private static final javax.xml.namespace.QName VERIFIEDDATE$6 = 
            new javax.xml.namespace.QName("", "verifieddate");
        
        
        /**
         * Gets the "lat" attribute
         */
        public java.lang.String getLat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LAT$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "lat" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LAT$0);
                return target;
            }
        }
        
        /**
         * True if has "lat" attribute
         */
        public boolean isSetLat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LAT$0) != null;
            }
        }
        
        /**
         * Sets the "lat" attribute
         */
        public void setLat(java.lang.String lat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LAT$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LAT$0);
                }
                target.setStringValue(lat);
            }
        }
        
        /**
         * Sets (as xml) the "lat" attribute
         */
        public void xsetLat(org.apache.xmlbeans.XmlString lat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LAT$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LAT$0);
                }
                target.set(lat);
            }
        }
        
        /**
         * Unsets the "lat" attribute
         */
        public void unsetLat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LAT$0);
            }
        }
        
        /**
         * Gets the "lng" attribute
         */
        public java.lang.String getLng()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LNG$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "lng" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLng()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LNG$2);
                return target;
            }
        }
        
        /**
         * True if has "lng" attribute
         */
        public boolean isSetLng()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LNG$2) != null;
            }
        }
        
        /**
         * Sets the "lng" attribute
         */
        public void setLng(java.lang.String lng)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LNG$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LNG$2);
                }
                target.setStringValue(lng);
            }
        }
        
        /**
         * Sets (as xml) the "lng" attribute
         */
        public void xsetLng(org.apache.xmlbeans.XmlString lng)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LNG$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LNG$2);
                }
                target.set(lng);
            }
        }
        
        /**
         * Unsets the "lng" attribute
         */
        public void unsetLng()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LNG$2);
            }
        }
        
        /**
         * Gets the "zoom" attribute
         */
        public java.math.BigInteger getZoom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZOOM$4);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "zoom" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetZoom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ZOOM$4);
                return target;
            }
        }
        
        /**
         * True if has "zoom" attribute
         */
        public boolean isSetZoom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ZOOM$4) != null;
            }
        }
        
        /**
         * Sets the "zoom" attribute
         */
        public void setZoom(java.math.BigInteger zoom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZOOM$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ZOOM$4);
                }
                target.setBigIntegerValue(zoom);
            }
        }
        
        /**
         * Sets (as xml) the "zoom" attribute
         */
        public void xsetZoom(org.apache.xmlbeans.XmlInteger zoom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ZOOM$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(ZOOM$4);
                }
                target.set(zoom);
            }
        }
        
        /**
         * Unsets the "zoom" attribute
         */
        public void unsetZoom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ZOOM$4);
            }
        }
        
        /**
         * Gets the "verifieddate" attribute
         */
        public java.lang.String getVerifieddate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERIFIEDDATE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "verifieddate" attribute
         */
        public org.apache.xmlbeans.XmlString xgetVerifieddate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERIFIEDDATE$6);
                return target;
            }
        }
        
        /**
         * True if has "verifieddate" attribute
         */
        public boolean isSetVerifieddate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VERIFIEDDATE$6) != null;
            }
        }
        
        /**
         * Sets the "verifieddate" attribute
         */
        public void setVerifieddate(java.lang.String verifieddate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERIFIEDDATE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERIFIEDDATE$6);
                }
                target.setStringValue(verifieddate);
            }
        }
        
        /**
         * Sets (as xml) the "verifieddate" attribute
         */
        public void xsetVerifieddate(org.apache.xmlbeans.XmlString verifieddate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERIFIEDDATE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VERIFIEDDATE$6);
                }
                target.set(verifieddate);
            }
        }
        
        /**
         * Unsets the "verifieddate" attribute
         */
        public void unsetVerifieddate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VERIFIEDDATE$6);
            }
        }
    }
}
