/*
 * An XML document type.
 * Localname: infotext
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.sologstrand.InfotextDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.sologstrand.impl;
/**
 * A document containing one infotext(@) element.
 *
 * This is a complex type.
 */
public class InfotextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.InfotextDocument
{
    private static final long serialVersionUID = 1L;
    
    public InfotextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INFOTEXT$0 = 
        new javax.xml.namespace.QName("", "infotext");
    
    
    /**
     * Gets the "infotext" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.InfotextDocument.Infotext getInfotext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.InfotextDocument.Infotext target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.InfotextDocument.Infotext)get_store().find_element_user(INFOTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "infotext" element
     */
    public void setInfotext(com.abctech.transition.xmladbeans.sologstrand.InfotextDocument.Infotext infotext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.InfotextDocument.Infotext target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.InfotextDocument.Infotext)get_store().find_element_user(INFOTEXT$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.sologstrand.InfotextDocument.Infotext)get_store().add_element_user(INFOTEXT$0);
            }
            target.set(infotext);
        }
    }
    
    /**
     * Appends and returns a new empty "infotext" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.InfotextDocument.Infotext addNewInfotext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.InfotextDocument.Infotext target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.InfotextDocument.Infotext)get_store().add_element_user(INFOTEXT$0);
            return target;
        }
    }
    /**
     * An XML infotext(@).
     *
     * This is a complex type.
     */
    public static class InfotextImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.InfotextDocument.Infotext
    {
        private static final long serialVersionUID = 1L;
        
        public InfotextImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DK$0 = 
            new javax.xml.namespace.QName("", "dk");
        private static final javax.xml.namespace.QName DE$2 = 
            new javax.xml.namespace.QName("", "de");
        private static final javax.xml.namespace.QName UK$4 = 
            new javax.xml.namespace.QName("", "uk");
        private static final javax.xml.namespace.QName STARTDATE$6 = 
            new javax.xml.namespace.QName("", "startdate");
        private static final javax.xml.namespace.QName ENDDATE$8 = 
            new javax.xml.namespace.QName("", "enddate");
        
        
        /**
         * Gets the "dk" element
         */
        public java.lang.String getDk()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DK$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "dk" element
         */
        public org.apache.xmlbeans.XmlString xgetDk()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DK$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "dk" element
         */
        public void setDk(java.lang.String dk)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DK$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DK$0);
                }
                target.setStringValue(dk);
            }
        }
        
        /**
         * Sets (as xml) the "dk" element
         */
        public void xsetDk(org.apache.xmlbeans.XmlString dk)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DK$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DK$0);
                }
                target.set(dk);
            }
        }
        
        /**
         * Gets the "de" element
         */
        public java.lang.String getDe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "de" element
         */
        public org.apache.xmlbeans.XmlString xgetDe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "de" element
         */
        public void setDe(java.lang.String de)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DE$2);
                }
                target.setStringValue(de);
            }
        }
        
        /**
         * Sets (as xml) the "de" element
         */
        public void xsetDe(org.apache.xmlbeans.XmlString de)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DE$2);
                }
                target.set(de);
            }
        }
        
        /**
         * Gets the "uk" element
         */
        public java.lang.String getUk()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UK$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "uk" element
         */
        public org.apache.xmlbeans.XmlString xgetUk()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UK$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "uk" element
         */
        public void setUk(java.lang.String uk)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UK$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UK$4);
                }
                target.setStringValue(uk);
            }
        }
        
        /**
         * Sets (as xml) the "uk" element
         */
        public void xsetUk(org.apache.xmlbeans.XmlString uk)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UK$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UK$4);
                }
                target.set(uk);
            }
        }
        
        /**
         * Gets the "startdate" attribute
         */
        public java.lang.String getStartdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTDATE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "startdate" attribute
         */
        public org.apache.xmlbeans.XmlString xgetStartdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STARTDATE$6);
                return target;
            }
        }
        
        /**
         * True if has "startdate" attribute
         */
        public boolean isSetStartdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STARTDATE$6) != null;
            }
        }
        
        /**
         * Sets the "startdate" attribute
         */
        public void setStartdate(java.lang.String startdate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTDATE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTDATE$6);
                }
                target.setStringValue(startdate);
            }
        }
        
        /**
         * Sets (as xml) the "startdate" attribute
         */
        public void xsetStartdate(org.apache.xmlbeans.XmlString startdate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STARTDATE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STARTDATE$6);
                }
                target.set(startdate);
            }
        }
        
        /**
         * Unsets the "startdate" attribute
         */
        public void unsetStartdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STARTDATE$6);
            }
        }
        
        /**
         * Gets the "enddate" attribute
         */
        public java.lang.String getEnddate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDDATE$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "enddate" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEnddate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENDDATE$8);
                return target;
            }
        }
        
        /**
         * True if has "enddate" attribute
         */
        public boolean isSetEnddate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENDDATE$8) != null;
            }
        }
        
        /**
         * Sets the "enddate" attribute
         */
        public void setEnddate(java.lang.String enddate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDDATE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDDATE$8);
                }
                target.setStringValue(enddate);
            }
        }
        
        /**
         * Sets (as xml) the "enddate" attribute
         */
        public void xsetEnddate(org.apache.xmlbeans.XmlString enddate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENDDATE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENDDATE$8);
                }
                target.set(enddate);
            }
        }
        
        /**
         * Unsets the "enddate" attribute
         */
        public void unsetEnddate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENDDATE$8);
            }
        }
    }
}
