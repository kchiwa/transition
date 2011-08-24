/*
 * An XML document type.
 * Localname: VIEWING
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one VIEWING(@) element.
 *
 * This is a complex type.
 */
public class VIEWINGDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument
{
    private static final long serialVersionUID = 1L;
    
    public VIEWINGDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VIEWING$0 = 
        new javax.xml.namespace.QName("", "VIEWING");
    
    
    /**
     * Gets the "VIEWING" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING getVIEWING()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING)get_store().find_element_user(VIEWING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "VIEWING" element
     */
    public void setVIEWING(com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING viewing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING)get_store().find_element_user(VIEWING$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING)get_store().add_element_user(VIEWING$0);
            }
            target.set(viewing);
        }
    }
    
    /**
     * Appends and returns a new empty "VIEWING" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING addNewVIEWING()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING)get_store().add_element_user(VIEWING$0);
            return target;
        }
    }
    /**
     * An XML VIEWING(@).
     *
     * This is a complex type.
     */
    public static class VIEWINGImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING
    {
        private static final long serialVersionUID = 1L;
        
        public VIEWINGImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DATE$0 = 
            new javax.xml.namespace.QName("", "DATE");
        private static final javax.xml.namespace.QName FROMTIME$2 = 
            new javax.xml.namespace.QName("", "FROMTIME");
        private static final javax.xml.namespace.QName TOTIME$4 = 
            new javax.xml.namespace.QName("", "TOTIME");
        private static final javax.xml.namespace.QName NOTE$6 = 
            new javax.xml.namespace.QName("", "NOTE");
        private static final javax.xml.namespace.QName REPLACEMENTNOTE$8 = 
            new javax.xml.namespace.QName("", "REPLACEMENT_NOTE");
        
        
        /**
         * Gets the "DATE" element
         */
        public java.lang.String getDATE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "DATE" element
         */
        public org.apache.xmlbeans.XmlString xgetDATE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATE$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "DATE" element
         */
        public boolean isSetDATE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATE$0) != 0;
            }
        }
        
        /**
         * Sets the "DATE" element
         */
        public void setDATE(java.lang.String date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATE$0);
                }
                target.setStringValue(date);
            }
        }
        
        /**
         * Sets (as xml) the "DATE" element
         */
        public void xsetDATE(org.apache.xmlbeans.XmlString date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATE$0);
                }
                target.set(date);
            }
        }
        
        /**
         * Unsets the "DATE" element
         */
        public void unsetDATE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATE$0, 0);
            }
        }
        
        /**
         * Gets the "FROMTIME" element
         */
        public java.lang.String getFROMTIME()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMTIME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FROMTIME" element
         */
        public org.apache.xmlbeans.XmlString xgetFROMTIME()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMTIME$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "FROMTIME" element
         */
        public boolean isSetFROMTIME()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FROMTIME$2) != 0;
            }
        }
        
        /**
         * Sets the "FROMTIME" element
         */
        public void setFROMTIME(java.lang.String fromtime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMTIME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FROMTIME$2);
                }
                target.setStringValue(fromtime);
            }
        }
        
        /**
         * Sets (as xml) the "FROMTIME" element
         */
        public void xsetFROMTIME(org.apache.xmlbeans.XmlString fromtime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMTIME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FROMTIME$2);
                }
                target.set(fromtime);
            }
        }
        
        /**
         * Unsets the "FROMTIME" element
         */
        public void unsetFROMTIME()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FROMTIME$2, 0);
            }
        }
        
        /**
         * Gets the "TOTIME" element
         */
        public java.lang.String getTOTIME()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIME$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "TOTIME" element
         */
        public org.apache.xmlbeans.XmlString xgetTOTIME()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOTIME$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "TOTIME" element
         */
        public boolean isSetTOTIME()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TOTIME$4) != 0;
            }
        }
        
        /**
         * Sets the "TOTIME" element
         */
        public void setTOTIME(java.lang.String totime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTIME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTIME$4);
                }
                target.setStringValue(totime);
            }
        }
        
        /**
         * Sets (as xml) the "TOTIME" element
         */
        public void xsetTOTIME(org.apache.xmlbeans.XmlString totime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOTIME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOTIME$4);
                }
                target.set(totime);
            }
        }
        
        /**
         * Unsets the "TOTIME" element
         */
        public void unsetTOTIME()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TOTIME$4, 0);
            }
        }
        
        /**
         * Gets the "NOTE" element
         */
        public java.lang.String getNOTE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "NOTE" element
         */
        public org.apache.xmlbeans.XmlString xgetNOTE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTE$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "NOTE" element
         */
        public boolean isSetNOTE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NOTE$6) != 0;
            }
        }
        
        /**
         * Sets the "NOTE" element
         */
        public void setNOTE(java.lang.String note)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTE$6);
                }
                target.setStringValue(note);
            }
        }
        
        /**
         * Sets (as xml) the "NOTE" element
         */
        public void xsetNOTE(org.apache.xmlbeans.XmlString note)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOTE$6);
                }
                target.set(note);
            }
        }
        
        /**
         * Unsets the "NOTE" element
         */
        public void unsetNOTE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NOTE$6, 0);
            }
        }
        
        /**
         * Gets the "REPLACEMENT_NOTE" element
         */
        public java.lang.String getREPLACEMENTNOTE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPLACEMENTNOTE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "REPLACEMENT_NOTE" element
         */
        public org.apache.xmlbeans.XmlString xgetREPLACEMENTNOTE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPLACEMENTNOTE$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "REPLACEMENT_NOTE" element
         */
        public boolean isSetREPLACEMENTNOTE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REPLACEMENTNOTE$8) != 0;
            }
        }
        
        /**
         * Sets the "REPLACEMENT_NOTE" element
         */
        public void setREPLACEMENTNOTE(java.lang.String replacementnote)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPLACEMENTNOTE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPLACEMENTNOTE$8);
                }
                target.setStringValue(replacementnote);
            }
        }
        
        /**
         * Sets (as xml) the "REPLACEMENT_NOTE" element
         */
        public void xsetREPLACEMENTNOTE(org.apache.xmlbeans.XmlString replacementnote)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPLACEMENTNOTE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REPLACEMENTNOTE$8);
                }
                target.set(replacementnote);
            }
        }
        
        /**
         * Unsets the "REPLACEMENT_NOTE" element
         */
        public void unsetREPLACEMENTNOTE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REPLACEMENTNOTE$8, 0);
            }
        }
    }
}
