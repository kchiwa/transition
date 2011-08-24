/*
 * An XML document type.
 * Localname: VISNING
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.VISNINGDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one VISNING(@) element.
 *
 * This is a complex type.
 */
public class VISNINGDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.VISNINGDocument
{
    private static final long serialVersionUID = 1L;
    
    public VISNINGDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VISNING$0 = 
        new javax.xml.namespace.QName("", "VISNING");
    
    
    /**
     * Gets the "VISNING" element
     */
    public com.abctech.transition.xmladbeans.emprof.VISNINGDocument.VISNING getVISNING()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.emprof.VISNINGDocument.VISNING target = null;
            target = (com.abctech.transition.xmladbeans.emprof.VISNINGDocument.VISNING)get_store().find_element_user(VISNING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "VISNING" element
     */
    public void setVISNING(com.abctech.transition.xmladbeans.emprof.VISNINGDocument.VISNING visning)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.emprof.VISNINGDocument.VISNING target = null;
            target = (com.abctech.transition.xmladbeans.emprof.VISNINGDocument.VISNING)get_store().find_element_user(VISNING$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.emprof.VISNINGDocument.VISNING)get_store().add_element_user(VISNING$0);
            }
            target.set(visning);
        }
    }
    
    /**
     * Appends and returns a new empty "VISNING" element
     */
    public com.abctech.transition.xmladbeans.emprof.VISNINGDocument.VISNING addNewVISNING()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.emprof.VISNINGDocument.VISNING target = null;
            target = (com.abctech.transition.xmladbeans.emprof.VISNINGDocument.VISNING)get_store().add_element_user(VISNING$0);
            return target;
        }
    }
    /**
     * An XML VISNING(@).
     *
     * This is a complex type.
     */
    public static class VISNINGImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.VISNINGDocument.VISNING
    {
        private static final long serialVersionUID = 1L;
        
        public VISNINGImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FRA$0 = 
            new javax.xml.namespace.QName("", "FRA");
        private static final javax.xml.namespace.QName TIL$2 = 
            new javax.xml.namespace.QName("", "TIL");
        
        
        /**
         * Gets the "FRA" attribute
         */
        public java.lang.String getFRA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FRA$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FRA" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFRA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FRA$0);
                return target;
            }
        }
        
        /**
         * True if has "FRA" attribute
         */
        public boolean isSetFRA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FRA$0) != null;
            }
        }
        
        /**
         * Sets the "FRA" attribute
         */
        public void setFRA(java.lang.String fra)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FRA$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FRA$0);
                }
                target.setStringValue(fra);
            }
        }
        
        /**
         * Sets (as xml) the "FRA" attribute
         */
        public void xsetFRA(org.apache.xmlbeans.XmlString fra)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FRA$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FRA$0);
                }
                target.set(fra);
            }
        }
        
        /**
         * Unsets the "FRA" attribute
         */
        public void unsetFRA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FRA$0);
            }
        }
        
        /**
         * Gets the "TIL" attribute
         */
        public java.lang.String getTIL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIL$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "TIL" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTIL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TIL$2);
                return target;
            }
        }
        
        /**
         * True if has "TIL" attribute
         */
        public boolean isSetTIL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TIL$2) != null;
            }
        }
        
        /**
         * Sets the "TIL" attribute
         */
        public void setTIL(java.lang.String til)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIL$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIL$2);
                }
                target.setStringValue(til);
            }
        }
        
        /**
         * Sets (as xml) the "TIL" attribute
         */
        public void xsetTIL(org.apache.xmlbeans.XmlString til)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TIL$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TIL$2);
                }
                target.set(til);
            }
        }
        
        /**
         * Unsets the "TIL" attribute
         */
        public void unsetTIL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TIL$2);
            }
        }
    }
}
