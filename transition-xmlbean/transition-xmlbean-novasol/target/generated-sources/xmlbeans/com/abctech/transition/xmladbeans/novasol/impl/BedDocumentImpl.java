/*
 * An XML document type.
 * Localname: Bed
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.BedDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one Bed(@) element.
 *
 * This is a complex type.
 */
public class BedDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.BedDocument
{
    private static final long serialVersionUID = 1L;
    
    public BedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BED$0 = 
        new javax.xml.namespace.QName("", "Bed");
    
    
    /**
     * Gets the "Bed" element
     */
    public com.abctech.transition.xmladbeans.novasol.BedDocument.Bed getBed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.BedDocument.Bed target = null;
            target = (com.abctech.transition.xmladbeans.novasol.BedDocument.Bed)get_store().find_element_user(BED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Bed" element
     */
    public void setBed(com.abctech.transition.xmladbeans.novasol.BedDocument.Bed bed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.BedDocument.Bed target = null;
            target = (com.abctech.transition.xmladbeans.novasol.BedDocument.Bed)get_store().find_element_user(BED$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.novasol.BedDocument.Bed)get_store().add_element_user(BED$0);
            }
            target.set(bed);
        }
    }
    
    /**
     * Appends and returns a new empty "Bed" element
     */
    public com.abctech.transition.xmladbeans.novasol.BedDocument.Bed addNewBed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.BedDocument.Bed target = null;
            target = (com.abctech.transition.xmladbeans.novasol.BedDocument.Bed)get_store().add_element_user(BED$0);
            return target;
        }
    }
    /**
     * An XML Bed(@).
     *
     * This is a complex type.
     */
    public static class BedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.BedDocument.Bed
    {
        private static final long serialVersionUID = 1L;
        
        public BedImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BEDDESCRIPTION$0 = 
            new javax.xml.namespace.QName("", "BedDescription");
        private static final javax.xml.namespace.QName BEDCAPACITY$2 = 
            new javax.xml.namespace.QName("", "BedCapacity");
        private static final javax.xml.namespace.QName ID$4 = 
            new javax.xml.namespace.QName("", "id");
        
        
        /**
         * Gets the "BedDescription" element
         */
        public java.lang.String getBedDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEDDESCRIPTION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "BedDescription" element
         */
        public org.apache.xmlbeans.XmlString xgetBedDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BEDDESCRIPTION$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "BedDescription" element
         */
        public void setBedDescription(java.lang.String bedDescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEDDESCRIPTION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BEDDESCRIPTION$0);
                }
                target.setStringValue(bedDescription);
            }
        }
        
        /**
         * Sets (as xml) the "BedDescription" element
         */
        public void xsetBedDescription(org.apache.xmlbeans.XmlString bedDescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BEDDESCRIPTION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BEDDESCRIPTION$0);
                }
                target.set(bedDescription);
            }
        }
        
        /**
         * Gets the "BedCapacity" element
         */
        public java.math.BigInteger getBedCapacity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEDCAPACITY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "BedCapacity" element
         */
        public org.apache.xmlbeans.XmlInteger xgetBedCapacity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BEDCAPACITY$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "BedCapacity" element
         */
        public void setBedCapacity(java.math.BigInteger bedCapacity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEDCAPACITY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BEDCAPACITY$2);
                }
                target.setBigIntegerValue(bedCapacity);
            }
        }
        
        /**
         * Sets (as xml) the "BedCapacity" element
         */
        public void xsetBedCapacity(org.apache.xmlbeans.XmlInteger bedCapacity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BEDCAPACITY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(BEDCAPACITY$2);
                }
                target.set(bedCapacity);
            }
        }
        
        /**
         * Gets the "id" attribute
         */
        public java.lang.String getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" attribute
         */
        public org.apache.xmlbeans.XmlString xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$4);
                return target;
            }
        }
        
        /**
         * Sets the "id" attribute
         */
        public void setId(java.lang.String id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$4);
                }
                target.setStringValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" attribute
         */
        public void xsetId(org.apache.xmlbeans.XmlString id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$4);
                }
                target.set(id);
            }
        }
    }
}
