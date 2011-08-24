/*
 * An XML document type.
 * Localname: kontaktperson
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webtemp.impl;
/**
 * A document containing one kontaktperson(@) element.
 *
 * This is a complex type.
 */
public class KontaktpersonDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument
{
    private static final long serialVersionUID = 1L;
    
    public KontaktpersonDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KONTAKTPERSON$0 = 
        new javax.xml.namespace.QName("", "kontaktperson");
    
    
    /**
     * Gets the "kontaktperson" element
     */
    public com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson getKontaktperson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson target = null;
            target = (com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson)get_store().find_element_user(KONTAKTPERSON$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "kontaktperson" element
     */
    public void setKontaktperson(com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson kontaktperson)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson target = null;
            target = (com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson)get_store().find_element_user(KONTAKTPERSON$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson)get_store().add_element_user(KONTAKTPERSON$0);
            }
            target.set(kontaktperson);
        }
    }
    
    /**
     * Appends and returns a new empty "kontaktperson" element
     */
    public com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson addNewKontaktperson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson target = null;
            target = (com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson)get_store().add_element_user(KONTAKTPERSON$0);
            return target;
        }
    }
    /**
     * An XML kontaktperson(@).
     *
     * This is a complex type.
     */
    public static class KontaktpersonImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson
    {
        private static final long serialVersionUID = 1L;
        
        public KontaktpersonImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAVN$0 = 
            new javax.xml.namespace.QName("", "navn");
        private static final javax.xml.namespace.QName STILLING$2 = 
            new javax.xml.namespace.QName("", "stilling");
        private static final javax.xml.namespace.QName MOBILTELEFON$4 = 
            new javax.xml.namespace.QName("", "mobiltelefon");
        private static final javax.xml.namespace.QName INTERNTELEFON$6 = 
            new javax.xml.namespace.QName("", "interntelefon");
        private static final javax.xml.namespace.QName EMAIL$8 = 
            new javax.xml.namespace.QName("", "email");
        private static final javax.xml.namespace.QName BILDE65PX$10 = 
            new javax.xml.namespace.QName("", "bilde65px");
        private static final javax.xml.namespace.QName BILDE250PX$12 = 
            new javax.xml.namespace.QName("", "bilde250px");
        
        
        /**
         * Gets the "navn" element
         */
        public java.lang.String getNavn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAVN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "navn" element
         */
        public org.apache.xmlbeans.XmlString xgetNavn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAVN$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "navn" element
         */
        public void setNavn(java.lang.String navn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAVN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAVN$0);
                }
                target.setStringValue(navn);
            }
        }
        
        /**
         * Sets (as xml) the "navn" element
         */
        public void xsetNavn(org.apache.xmlbeans.XmlString navn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAVN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAVN$0);
                }
                target.set(navn);
            }
        }
        
        /**
         * Gets the "stilling" element
         */
        public java.lang.String getStilling()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STILLING$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "stilling" element
         */
        public org.apache.xmlbeans.XmlString xgetStilling()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STILLING$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "stilling" element
         */
        public boolean isSetStilling()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STILLING$2) != 0;
            }
        }
        
        /**
         * Sets the "stilling" element
         */
        public void setStilling(java.lang.String stilling)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STILLING$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STILLING$2);
                }
                target.setStringValue(stilling);
            }
        }
        
        /**
         * Sets (as xml) the "stilling" element
         */
        public void xsetStilling(org.apache.xmlbeans.XmlString stilling)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STILLING$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STILLING$2);
                }
                target.set(stilling);
            }
        }
        
        /**
         * Unsets the "stilling" element
         */
        public void unsetStilling()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STILLING$2, 0);
            }
        }
        
        /**
         * Gets the "mobiltelefon" element
         */
        public java.lang.String getMobiltelefon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOBILTELEFON$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "mobiltelefon" element
         */
        public org.apache.xmlbeans.XmlString xgetMobiltelefon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOBILTELEFON$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "mobiltelefon" element
         */
        public void setMobiltelefon(java.lang.String mobiltelefon)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOBILTELEFON$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOBILTELEFON$4);
                }
                target.setStringValue(mobiltelefon);
            }
        }
        
        /**
         * Sets (as xml) the "mobiltelefon" element
         */
        public void xsetMobiltelefon(org.apache.xmlbeans.XmlString mobiltelefon)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOBILTELEFON$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MOBILTELEFON$4);
                }
                target.set(mobiltelefon);
            }
        }
        
        /**
         * Gets the "interntelefon" element
         */
        public java.lang.String getInterntelefon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERNTELEFON$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "interntelefon" element
         */
        public org.apache.xmlbeans.XmlString xgetInterntelefon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTERNTELEFON$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "interntelefon" element
         */
        public boolean isSetInterntelefon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INTERNTELEFON$6) != 0;
            }
        }
        
        /**
         * Sets the "interntelefon" element
         */
        public void setInterntelefon(java.lang.String interntelefon)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERNTELEFON$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERNTELEFON$6);
                }
                target.setStringValue(interntelefon);
            }
        }
        
        /**
         * Sets (as xml) the "interntelefon" element
         */
        public void xsetInterntelefon(org.apache.xmlbeans.XmlString interntelefon)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTERNTELEFON$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INTERNTELEFON$6);
                }
                target.set(interntelefon);
            }
        }
        
        /**
         * Unsets the "interntelefon" element
         */
        public void unsetInterntelefon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INTERNTELEFON$6, 0);
            }
        }
        
        /**
         * Gets the "email" element
         */
        public java.lang.String getEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "email" element
         */
        public org.apache.xmlbeans.XmlString xgetEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "email" element
         */
        public void setEmail(java.lang.String email)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAIL$8);
                }
                target.setStringValue(email);
            }
        }
        
        /**
         * Sets (as xml) the "email" element
         */
        public void xsetEmail(org.apache.xmlbeans.XmlString email)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAIL$8);
                }
                target.set(email);
            }
        }
        
        /**
         * Gets the "bilde65px" element
         */
        public java.lang.String getBilde65Px()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILDE65PX$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "bilde65px" element
         */
        public org.apache.xmlbeans.XmlString xgetBilde65Px()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILDE65PX$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "bilde65px" element
         */
        public boolean isSetBilde65Px()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BILDE65PX$10) != 0;
            }
        }
        
        /**
         * Sets the "bilde65px" element
         */
        public void setBilde65Px(java.lang.String bilde65Px)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILDE65PX$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BILDE65PX$10);
                }
                target.setStringValue(bilde65Px);
            }
        }
        
        /**
         * Sets (as xml) the "bilde65px" element
         */
        public void xsetBilde65Px(org.apache.xmlbeans.XmlString bilde65Px)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILDE65PX$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILDE65PX$10);
                }
                target.set(bilde65Px);
            }
        }
        
        /**
         * Unsets the "bilde65px" element
         */
        public void unsetBilde65Px()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BILDE65PX$10, 0);
            }
        }
        
        /**
         * Gets the "bilde250px" element
         */
        public java.lang.String getBilde250Px()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILDE250PX$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "bilde250px" element
         */
        public org.apache.xmlbeans.XmlString xgetBilde250Px()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILDE250PX$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "bilde250px" element
         */
        public boolean isSetBilde250Px()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BILDE250PX$12) != 0;
            }
        }
        
        /**
         * Sets the "bilde250px" element
         */
        public void setBilde250Px(java.lang.String bilde250Px)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILDE250PX$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BILDE250PX$12);
                }
                target.setStringValue(bilde250Px);
            }
        }
        
        /**
         * Sets (as xml) the "bilde250px" element
         */
        public void xsetBilde250Px(org.apache.xmlbeans.XmlString bilde250Px)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILDE250PX$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILDE250PX$12);
                }
                target.set(bilde250Px);
            }
        }
        
        /**
         * Unsets the "bilde250px" element
         */
        public void unsetBilde250Px()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BILDE250PX$12, 0);
            }
        }
    }
}
