/*
 * An XML document type.
 * Localname: oppdragsgiver
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webtemp.impl;
/**
 * A document containing one oppdragsgiver(@) element.
 *
 * This is a complex type.
 */
public class OppdragsgiverDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument
{
    private static final long serialVersionUID = 1L;
    
    public OppdragsgiverDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPPDRAGSGIVER$0 = 
        new javax.xml.namespace.QName("", "oppdragsgiver");
    
    
    /**
     * Gets the "oppdragsgiver" element
     */
    public com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument.Oppdragsgiver getOppdragsgiver()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument.Oppdragsgiver target = null;
            target = (com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument.Oppdragsgiver)get_store().find_element_user(OPPDRAGSGIVER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "oppdragsgiver" element
     */
    public void setOppdragsgiver(com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument.Oppdragsgiver oppdragsgiver)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument.Oppdragsgiver target = null;
            target = (com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument.Oppdragsgiver)get_store().find_element_user(OPPDRAGSGIVER$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument.Oppdragsgiver)get_store().add_element_user(OPPDRAGSGIVER$0);
            }
            target.set(oppdragsgiver);
        }
    }
    
    /**
     * Appends and returns a new empty "oppdragsgiver" element
     */
    public com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument.Oppdragsgiver addNewOppdragsgiver()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument.Oppdragsgiver target = null;
            target = (com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument.Oppdragsgiver)get_store().add_element_user(OPPDRAGSGIVER$0);
            return target;
        }
    }
    /**
     * An XML oppdragsgiver(@).
     *
     * This is a complex type.
     */
    public static class OppdragsgiverImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webtemp.OppdragsgiverDocument.Oppdragsgiver
    {
        private static final long serialVersionUID = 1L;
        
        public OppdragsgiverImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAVN$0 = 
            new javax.xml.namespace.QName("", "navn");
        private static final javax.xml.namespace.QName HJEMMESIDE$2 = 
            new javax.xml.namespace.QName("", "hjemmeside");
        private static final javax.xml.namespace.QName LOGO$4 = 
            new javax.xml.namespace.QName("", "logo");
        private static final javax.xml.namespace.QName KONTAKTPERSON$6 = 
            new javax.xml.namespace.QName("", "kontaktperson");
        
        
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
         * Gets the "hjemmeside" element
         */
        public java.lang.String getHjemmeside()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HJEMMESIDE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "hjemmeside" element
         */
        public org.apache.xmlbeans.XmlString xgetHjemmeside()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HJEMMESIDE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "hjemmeside" element
         */
        public boolean isSetHjemmeside()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HJEMMESIDE$2) != 0;
            }
        }
        
        /**
         * Sets the "hjemmeside" element
         */
        public void setHjemmeside(java.lang.String hjemmeside)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HJEMMESIDE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HJEMMESIDE$2);
                }
                target.setStringValue(hjemmeside);
            }
        }
        
        /**
         * Sets (as xml) the "hjemmeside" element
         */
        public void xsetHjemmeside(org.apache.xmlbeans.XmlString hjemmeside)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HJEMMESIDE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HJEMMESIDE$2);
                }
                target.set(hjemmeside);
            }
        }
        
        /**
         * Unsets the "hjemmeside" element
         */
        public void unsetHjemmeside()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HJEMMESIDE$2, 0);
            }
        }
        
        /**
         * Gets the "logo" element
         */
        public java.lang.String getLogo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGO$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "logo" element
         */
        public org.apache.xmlbeans.XmlString xgetLogo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGO$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "logo" element
         */
        public boolean isSetLogo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOGO$4) != 0;
            }
        }
        
        /**
         * Sets the "logo" element
         */
        public void setLogo(java.lang.String logo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGO$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOGO$4);
                }
                target.setStringValue(logo);
            }
        }
        
        /**
         * Sets (as xml) the "logo" element
         */
        public void xsetLogo(org.apache.xmlbeans.XmlString logo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGO$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOGO$4);
                }
                target.set(logo);
            }
        }
        
        /**
         * Unsets the "logo" element
         */
        public void unsetLogo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOGO$4, 0);
            }
        }
        
        /**
         * Gets the "kontaktperson" element
         */
        public com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson getKontaktperson()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson target = null;
                target = (com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson)get_store().find_element_user(KONTAKTPERSON$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "kontaktperson" element
         */
        public boolean isSetKontaktperson()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(KONTAKTPERSON$6) != 0;
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
                target = (com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson)get_store().find_element_user(KONTAKTPERSON$6, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson)get_store().add_element_user(KONTAKTPERSON$6);
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
                target = (com.abctech.transition.xmladbeans.webtemp.KontaktpersonDocument.Kontaktperson)get_store().add_element_user(KONTAKTPERSON$6);
                return target;
            }
        }
        
        /**
         * Unsets the "kontaktperson" element
         */
        public void unsetKontaktperson()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(KONTAKTPERSON$6, 0);
            }
        }
    }
}
