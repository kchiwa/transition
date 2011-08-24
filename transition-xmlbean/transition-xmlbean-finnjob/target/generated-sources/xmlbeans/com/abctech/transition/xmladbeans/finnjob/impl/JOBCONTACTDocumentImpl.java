/*
 * An XML document type.
 * Localname: JOB_CONTACT
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.finnjob.JOBCONTACTDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.finnjob.impl;
/**
 * A document containing one JOB_CONTACT(@) element.
 *
 * This is a complex type.
 */
public class JOBCONTACTDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.finnjob.JOBCONTACTDocument
{
    private static final long serialVersionUID = 1L;
    
    public JOBCONTACTDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JOBCONTACT$0 = 
        new javax.xml.namespace.QName("", "JOB_CONTACT");
    
    
    /**
     * Gets the "JOB_CONTACT" element
     */
    public com.abctech.transition.xmladbeans.finnjob.JOBCONTACTDocument.JOBCONTACT getJOBCONTACT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.finnjob.JOBCONTACTDocument.JOBCONTACT target = null;
            target = (com.abctech.transition.xmladbeans.finnjob.JOBCONTACTDocument.JOBCONTACT)get_store().find_element_user(JOBCONTACT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "JOB_CONTACT" element
     */
    public void setJOBCONTACT(com.abctech.transition.xmladbeans.finnjob.JOBCONTACTDocument.JOBCONTACT jobcontact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.finnjob.JOBCONTACTDocument.JOBCONTACT target = null;
            target = (com.abctech.transition.xmladbeans.finnjob.JOBCONTACTDocument.JOBCONTACT)get_store().find_element_user(JOBCONTACT$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.finnjob.JOBCONTACTDocument.JOBCONTACT)get_store().add_element_user(JOBCONTACT$0);
            }
            target.set(jobcontact);
        }
    }
    
    /**
     * Appends and returns a new empty "JOB_CONTACT" element
     */
    public com.abctech.transition.xmladbeans.finnjob.JOBCONTACTDocument.JOBCONTACT addNewJOBCONTACT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.finnjob.JOBCONTACTDocument.JOBCONTACT target = null;
            target = (com.abctech.transition.xmladbeans.finnjob.JOBCONTACTDocument.JOBCONTACT)get_store().add_element_user(JOBCONTACT$0);
            return target;
        }
    }
    /**
     * An XML JOB_CONTACT(@).
     *
     * This is a complex type.
     */
    public static class JOBCONTACTImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.finnjob.JOBCONTACTDocument.JOBCONTACT
    {
        private static final long serialVersionUID = 1L;
        
        public JOBCONTACTImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "NAME");
        private static final javax.xml.namespace.QName ADDRESS$2 = 
            new javax.xml.namespace.QName("", "ADDRESS");
        private static final javax.xml.namespace.QName TITLE$4 = 
            new javax.xml.namespace.QName("", "TITLE");
        private static final javax.xml.namespace.QName PHONE$6 = 
            new javax.xml.namespace.QName("", "PHONE");
        private static final javax.xml.namespace.QName MOBILE$8 = 
            new javax.xml.namespace.QName("", "MOBILE");
        private static final javax.xml.namespace.QName EMAIL$10 = 
            new javax.xml.namespace.QName("", "EMAIL");
        private static final javax.xml.namespace.QName FAX$12 = 
            new javax.xml.namespace.QName("", "FAX");
        
        
        /**
         * Gets the "NAME" element
         */
        public java.lang.String getNAME()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "NAME" element
         */
        public org.apache.xmlbeans.XmlString xgetNAME()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "NAME" element
         */
        public void setNAME(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "NAME" element
         */
        public void xsetNAME(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "ADDRESS" element
         */
        public java.lang.String getADDRESS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ADDRESS" element
         */
        public org.apache.xmlbeans.XmlString xgetADDRESS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "ADDRESS" element
         */
        public boolean isSetADDRESS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADDRESS$2) != 0;
            }
        }
        
        /**
         * Sets the "ADDRESS" element
         */
        public void setADDRESS(java.lang.String address)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS$2);
                }
                target.setStringValue(address);
            }
        }
        
        /**
         * Sets (as xml) the "ADDRESS" element
         */
        public void xsetADDRESS(org.apache.xmlbeans.XmlString address)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS$2);
                }
                target.set(address);
            }
        }
        
        /**
         * Unsets the "ADDRESS" element
         */
        public void unsetADDRESS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADDRESS$2, 0);
            }
        }
        
        /**
         * Gets the "TITLE" element
         */
        public java.lang.String getTITLE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "TITLE" element
         */
        public org.apache.xmlbeans.XmlString xgetTITLE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "TITLE" element
         */
        public boolean isSetTITLE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TITLE$4) != 0;
            }
        }
        
        /**
         * Sets the "TITLE" element
         */
        public void setTITLE(java.lang.String title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE$4);
                }
                target.setStringValue(title);
            }
        }
        
        /**
         * Sets (as xml) the "TITLE" element
         */
        public void xsetTITLE(org.apache.xmlbeans.XmlString title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$4);
                }
                target.set(title);
            }
        }
        
        /**
         * Unsets the "TITLE" element
         */
        public void unsetTITLE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TITLE$4, 0);
            }
        }
        
        /**
         * Gets the "PHONE" element
         */
        public java.lang.String getPHONE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PHONE" element
         */
        public org.apache.xmlbeans.XmlString xgetPHONE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PHONE" element
         */
        public void setPHONE(java.lang.String phone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHONE$6);
                }
                target.setStringValue(phone);
            }
        }
        
        /**
         * Sets (as xml) the "PHONE" element
         */
        public void xsetPHONE(org.apache.xmlbeans.XmlString phone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHONE$6);
                }
                target.set(phone);
            }
        }
        
        /**
         * Gets the "MOBILE" element
         */
        public java.lang.String getMOBILE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOBILE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "MOBILE" element
         */
        public org.apache.xmlbeans.XmlString xgetMOBILE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOBILE$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "MOBILE" element
         */
        public boolean isSetMOBILE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MOBILE$8) != 0;
            }
        }
        
        /**
         * Sets the "MOBILE" element
         */
        public void setMOBILE(java.lang.String mobile)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOBILE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOBILE$8);
                }
                target.setStringValue(mobile);
            }
        }
        
        /**
         * Sets (as xml) the "MOBILE" element
         */
        public void xsetMOBILE(org.apache.xmlbeans.XmlString mobile)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOBILE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MOBILE$8);
                }
                target.set(mobile);
            }
        }
        
        /**
         * Unsets the "MOBILE" element
         */
        public void unsetMOBILE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MOBILE$8, 0);
            }
        }
        
        /**
         * Gets the "EMAIL" element
         */
        public java.lang.String getEMAIL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EMAIL" element
         */
        public org.apache.xmlbeans.XmlString xgetEMAIL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "EMAIL" element
         */
        public boolean isSetEMAIL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMAIL$10) != 0;
            }
        }
        
        /**
         * Sets the "EMAIL" element
         */
        public void setEMAIL(java.lang.String email)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAIL$10);
                }
                target.setStringValue(email);
            }
        }
        
        /**
         * Sets (as xml) the "EMAIL" element
         */
        public void xsetEMAIL(org.apache.xmlbeans.XmlString email)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAIL$10);
                }
                target.set(email);
            }
        }
        
        /**
         * Unsets the "EMAIL" element
         */
        public void unsetEMAIL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMAIL$10, 0);
            }
        }
        
        /**
         * Gets the "FAX" element
         */
        public java.lang.String getFAX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAX$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FAX" element
         */
        public org.apache.xmlbeans.XmlString xgetFAX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAX$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "FAX" element
         */
        public boolean isSetFAX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FAX$12) != 0;
            }
        }
        
        /**
         * Sets the "FAX" element
         */
        public void setFAX(java.lang.String fax)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAX$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAX$12);
                }
                target.setStringValue(fax);
            }
        }
        
        /**
         * Sets (as xml) the "FAX" element
         */
        public void xsetFAX(org.apache.xmlbeans.XmlString fax)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAX$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FAX$12);
                }
                target.set(fax);
            }
        }
        
        /**
         * Unsets the "FAX" element
         */
        public void unsetFAX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FAX$12, 0);
            }
        }
    }
}
