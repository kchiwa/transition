/*
 * An XML document type.
 * Localname: VEDLEGG
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one VEDLEGG(@) element.
 *
 * This is a complex type.
 */
public class VEDLEGGDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument
{
    private static final long serialVersionUID = 1L;
    
    public VEDLEGGDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VEDLEGG$0 = 
        new javax.xml.namespace.QName("", "VEDLEGG");
    
    
    /**
     * Gets the "VEDLEGG" element
     */
    public com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG getVEDLEGG()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG target = null;
            target = (com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG)get_store().find_element_user(VEDLEGG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "VEDLEGG" element
     */
    public void setVEDLEGG(com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG vedlegg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG target = null;
            target = (com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG)get_store().find_element_user(VEDLEGG$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG)get_store().add_element_user(VEDLEGG$0);
            }
            target.set(vedlegg);
        }
    }
    
    /**
     * Appends and returns a new empty "VEDLEGG" element
     */
    public com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG addNewVEDLEGG()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG target = null;
            target = (com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG)get_store().add_element_user(VEDLEGG$0);
            return target;
        }
    }
    /**
     * An XML VEDLEGG(@).
     *
     * This is a complex type.
     */
    public static class VEDLEGGImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.VEDLEGGDocument.VEDLEGG
    {
        private static final long serialVersionUID = 1L;
        
        public VEDLEGGImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VEDLEGGID$0 = 
            new javax.xml.namespace.QName("", "VEDLEGGID");
        private static final javax.xml.namespace.QName VEDLEGGSEKVENS$2 = 
            new javax.xml.namespace.QName("", "VEDLEGGSEKVENS");
        private static final javax.xml.namespace.QName VEDLEGGTITTEL$4 = 
            new javax.xml.namespace.QName("", "VEDLEGGTITTEL");
        private static final javax.xml.namespace.QName VEDLEGGURL$6 = 
            new javax.xml.namespace.QName("", "VEDLEGGURL");
        private static final javax.xml.namespace.QName VEDLEGGHASH$8 = 
            new javax.xml.namespace.QName("", "VEDLEGGHASH");
        
        
        /**
         * Gets the "VEDLEGGID" element
         */
        public java.math.BigInteger getVEDLEGGID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VEDLEGGID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "VEDLEGGID" element
         */
        public org.apache.xmlbeans.XmlInteger xgetVEDLEGGID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(VEDLEGGID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "VEDLEGGID" element
         */
        public void setVEDLEGGID(java.math.BigInteger vedleggid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VEDLEGGID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VEDLEGGID$0);
                }
                target.setBigIntegerValue(vedleggid);
            }
        }
        
        /**
         * Sets (as xml) the "VEDLEGGID" element
         */
        public void xsetVEDLEGGID(org.apache.xmlbeans.XmlInteger vedleggid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(VEDLEGGID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(VEDLEGGID$0);
                }
                target.set(vedleggid);
            }
        }
        
        /**
         * Gets the "VEDLEGGSEKVENS" element
         */
        public java.math.BigInteger getVEDLEGGSEKVENS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VEDLEGGSEKVENS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "VEDLEGGSEKVENS" element
         */
        public org.apache.xmlbeans.XmlInteger xgetVEDLEGGSEKVENS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(VEDLEGGSEKVENS$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "VEDLEGGSEKVENS" element
         */
        public void setVEDLEGGSEKVENS(java.math.BigInteger vedleggsekvens)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VEDLEGGSEKVENS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VEDLEGGSEKVENS$2);
                }
                target.setBigIntegerValue(vedleggsekvens);
            }
        }
        
        /**
         * Sets (as xml) the "VEDLEGGSEKVENS" element
         */
        public void xsetVEDLEGGSEKVENS(org.apache.xmlbeans.XmlInteger vedleggsekvens)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(VEDLEGGSEKVENS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(VEDLEGGSEKVENS$2);
                }
                target.set(vedleggsekvens);
            }
        }
        
        /**
         * Gets the "VEDLEGGTITTEL" element
         */
        public java.lang.String getVEDLEGGTITTEL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VEDLEGGTITTEL$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "VEDLEGGTITTEL" element
         */
        public org.apache.xmlbeans.XmlString xgetVEDLEGGTITTEL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VEDLEGGTITTEL$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "VEDLEGGTITTEL" element
         */
        public void setVEDLEGGTITTEL(java.lang.String vedleggtittel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VEDLEGGTITTEL$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VEDLEGGTITTEL$4);
                }
                target.setStringValue(vedleggtittel);
            }
        }
        
        /**
         * Sets (as xml) the "VEDLEGGTITTEL" element
         */
        public void xsetVEDLEGGTITTEL(org.apache.xmlbeans.XmlString vedleggtittel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VEDLEGGTITTEL$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VEDLEGGTITTEL$4);
                }
                target.set(vedleggtittel);
            }
        }
        
        /**
         * Gets the "VEDLEGGURL" element
         */
        public java.lang.String getVEDLEGGURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VEDLEGGURL$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "VEDLEGGURL" element
         */
        public org.apache.xmlbeans.XmlString xgetVEDLEGGURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VEDLEGGURL$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "VEDLEGGURL" element
         */
        public void setVEDLEGGURL(java.lang.String vedleggurl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VEDLEGGURL$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VEDLEGGURL$6);
                }
                target.setStringValue(vedleggurl);
            }
        }
        
        /**
         * Sets (as xml) the "VEDLEGGURL" element
         */
        public void xsetVEDLEGGURL(org.apache.xmlbeans.XmlString vedleggurl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VEDLEGGURL$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VEDLEGGURL$6);
                }
                target.set(vedleggurl);
            }
        }
        
        /**
         * Gets the "VEDLEGGHASH" element
         */
        public java.lang.String getVEDLEGGHASH()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VEDLEGGHASH$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "VEDLEGGHASH" element
         */
        public org.apache.xmlbeans.XmlString xgetVEDLEGGHASH()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VEDLEGGHASH$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "VEDLEGGHASH" element
         */
        public void setVEDLEGGHASH(java.lang.String vedlegghash)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VEDLEGGHASH$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VEDLEGGHASH$8);
                }
                target.setStringValue(vedlegghash);
            }
        }
        
        /**
         * Sets (as xml) the "VEDLEGGHASH" element
         */
        public void xsetVEDLEGGHASH(org.apache.xmlbeans.XmlString vedlegghash)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VEDLEGGHASH$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VEDLEGGHASH$8);
                }
                target.set(vedlegghash);
            }
        }
    }
}
