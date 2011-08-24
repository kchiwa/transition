/*
 * An XML document type.
 * Localname: LINKER
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.LINKERDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one LINKER(@) element.
 *
 * This is a complex type.
 */
public class LINKERDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.LINKERDocument
{
    private static final long serialVersionUID = 1L;
    
    public LINKERDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINKER$0 = 
        new javax.xml.namespace.QName("", "LINKER");
    
    
    /**
     * Gets the "LINKER" element
     */
    public com.abctech.transition.xmladbeans.emprof.LINKERDocument.LINKER getLINKER()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.emprof.LINKERDocument.LINKER target = null;
            target = (com.abctech.transition.xmladbeans.emprof.LINKERDocument.LINKER)get_store().find_element_user(LINKER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LINKER" element
     */
    public void setLINKER(com.abctech.transition.xmladbeans.emprof.LINKERDocument.LINKER linker)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.emprof.LINKERDocument.LINKER target = null;
            target = (com.abctech.transition.xmladbeans.emprof.LINKERDocument.LINKER)get_store().find_element_user(LINKER$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.emprof.LINKERDocument.LINKER)get_store().add_element_user(LINKER$0);
            }
            target.set(linker);
        }
    }
    
    /**
     * Appends and returns a new empty "LINKER" element
     */
    public com.abctech.transition.xmladbeans.emprof.LINKERDocument.LINKER addNewLINKER()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.emprof.LINKERDocument.LINKER target = null;
            target = (com.abctech.transition.xmladbeans.emprof.LINKERDocument.LINKER)get_store().add_element_user(LINKER$0);
            return target;
        }
    }
    /**
     * An XML LINKER(@).
     *
     * This is a complex type.
     */
    public static class LINKERImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.LINKERDocument.LINKER
    {
        private static final long serialVersionUID = 1L;
        
        public LINKERImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LINKTYPE$0 = 
            new javax.xml.namespace.QName("", "LINKTYPE");
        private static final javax.xml.namespace.QName EXTERNALURL$2 = 
            new javax.xml.namespace.QName("", "EXTERNALURL");
        
        
        /**
         * Gets the "LINKTYPE" element
         */
        public java.lang.String getLINKTYPE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINKTYPE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "LINKTYPE" element
         */
        public org.apache.xmlbeans.XmlString xgetLINKTYPE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINKTYPE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "LINKTYPE" element
         */
        public void setLINKTYPE(java.lang.String linktype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINKTYPE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINKTYPE$0);
                }
                target.setStringValue(linktype);
            }
        }
        
        /**
         * Sets (as xml) the "LINKTYPE" element
         */
        public void xsetLINKTYPE(org.apache.xmlbeans.XmlString linktype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINKTYPE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LINKTYPE$0);
                }
                target.set(linktype);
            }
        }
        
        /**
         * Gets the "EXTERNALURL" element
         */
        public java.lang.String getEXTERNALURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALURL$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EXTERNALURL" element
         */
        public org.apache.xmlbeans.XmlString xgetEXTERNALURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALURL$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "EXTERNALURL" element
         */
        public void setEXTERNALURL(java.lang.String externalurl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALURL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTERNALURL$2);
                }
                target.setStringValue(externalurl);
            }
        }
        
        /**
         * Sets (as xml) the "EXTERNALURL" element
         */
        public void xsetEXTERNALURL(org.apache.xmlbeans.XmlString externalurl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALURL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTERNALURL$2);
                }
                target.set(externalurl);
            }
        }
    }
}
