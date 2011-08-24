/*
 * An XML document type.
 * Localname: MO
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifmmo.MODocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifmmo.impl;
/**
 * A document containing one MO(@) element.
 *
 * This is a complex type.
 */
public class MODocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifmmo.MODocument
{
    private static final long serialVersionUID = 1L;
    
    public MODocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MO$0 = 
        new javax.xml.namespace.QName("", "MO");
    
    
    /**
     * Gets the "MO" element
     */
    public com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO getMO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO target = null;
            target = (com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO)get_store().find_element_user(MO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MO" element
     */
    public void setMO(com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO mo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO target = null;
            target = (com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO)get_store().find_element_user(MO$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO)get_store().add_element_user(MO$0);
            }
            target.set(mo);
        }
    }
    
    /**
     * Appends and returns a new empty "MO" element
     */
    public com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO addNewMO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO target = null;
            target = (com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO)get_store().add_element_user(MO$0);
            return target;
        }
    }
    /**
     * An XML MO(@).
     *
     * This is a complex type.
     */
    public static class MOImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifmmo.MODocument.MO
    {
        private static final long serialVersionUID = 1L;
        
        public MOImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MMOTYPE$0 = 
            new javax.xml.namespace.QName("", "MMO_TYPE");
        private static final javax.xml.namespace.QName PRIORITY$2 = 
            new javax.xml.namespace.QName("", "PRIORITY");
        private static final javax.xml.namespace.QName REF$4 = 
            new javax.xml.namespace.QName("", "REF");
        private static final javax.xml.namespace.QName REMOVE$6 = 
            new javax.xml.namespace.QName("", "REMOVE");
        private static final javax.xml.namespace.QName VERSIONID$8 = 
            new javax.xml.namespace.QName("", "VERSIONID");
        
        
        /**
         * Gets the "MMO_TYPE" attribute
         */
        public java.lang.String getMMOTYPE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MMOTYPE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "MMO_TYPE" attribute
         */
        public org.apache.xmlbeans.XmlString xgetMMOTYPE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MMOTYPE$0);
                return target;
            }
        }
        
        /**
         * Sets the "MMO_TYPE" attribute
         */
        public void setMMOTYPE(java.lang.String mmotype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MMOTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MMOTYPE$0);
                }
                target.setStringValue(mmotype);
            }
        }
        
        /**
         * Sets (as xml) the "MMO_TYPE" attribute
         */
        public void xsetMMOTYPE(org.apache.xmlbeans.XmlString mmotype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MMOTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MMOTYPE$0);
                }
                target.set(mmotype);
            }
        }
        
        /**
         * Gets the "PRIORITY" attribute
         */
        public java.math.BigInteger getPRIORITY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIORITY$2);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "PRIORITY" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetPRIORITY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PRIORITY$2);
                return target;
            }
        }
        
        /**
         * Sets the "PRIORITY" attribute
         */
        public void setPRIORITY(java.math.BigInteger priority)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIORITY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRIORITY$2);
                }
                target.setBigIntegerValue(priority);
            }
        }
        
        /**
         * Sets (as xml) the "PRIORITY" attribute
         */
        public void xsetPRIORITY(org.apache.xmlbeans.XmlInteger priority)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PRIORITY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(PRIORITY$2);
                }
                target.set(priority);
            }
        }
        
        /**
         * Gets the "REF" attribute
         */
        public java.lang.String getREF()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "REF" attribute
         */
        public org.apache.xmlbeans.XmlString xgetREF()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REF$4);
                return target;
            }
        }
        
        /**
         * Sets the "REF" attribute
         */
        public void setREF(java.lang.String ref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REF$4);
                }
                target.setStringValue(ref);
            }
        }
        
        /**
         * Sets (as xml) the "REF" attribute
         */
        public void xsetREF(org.apache.xmlbeans.XmlString ref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REF$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REF$4);
                }
                target.set(ref);
            }
        }
        
        /**
         * Gets the "REMOVE" attribute
         */
        public java.lang.String getREMOVE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REMOVE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "REMOVE" attribute
         */
        public org.apache.xmlbeans.XmlString xgetREMOVE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REMOVE$6);
                return target;
            }
        }
        
        /**
         * Sets the "REMOVE" attribute
         */
        public void setREMOVE(java.lang.String remove)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REMOVE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REMOVE$6);
                }
                target.setStringValue(remove);
            }
        }
        
        /**
         * Sets (as xml) the "REMOVE" attribute
         */
        public void xsetREMOVE(org.apache.xmlbeans.XmlString remove)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REMOVE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REMOVE$6);
                }
                target.set(remove);
            }
        }
        
        /**
         * Gets the "VERSIONID" attribute
         */
        public java.math.BigInteger getVERSIONID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSIONID$8);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "VERSIONID" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetVERSIONID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(VERSIONID$8);
                return target;
            }
        }
        
        /**
         * Sets the "VERSIONID" attribute
         */
        public void setVERSIONID(java.math.BigInteger versionid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSIONID$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSIONID$8);
                }
                target.setBigIntegerValue(versionid);
            }
        }
        
        /**
         * Sets (as xml) the "VERSIONID" attribute
         */
        public void xsetVERSIONID(org.apache.xmlbeans.XmlInteger versionid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(VERSIONID$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(VERSIONID$8);
                }
                target.set(versionid);
            }
        }
    }
}
