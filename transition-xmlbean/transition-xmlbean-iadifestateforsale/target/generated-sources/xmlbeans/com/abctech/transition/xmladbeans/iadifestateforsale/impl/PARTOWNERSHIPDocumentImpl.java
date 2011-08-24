/*
 * An XML document type.
 * Localname: PART_OWNERSHIP
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one PART_OWNERSHIP(@) element.
 *
 * This is a complex type.
 */
public class PARTOWNERSHIPDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument
{
    private static final long serialVersionUID = 1L;
    
    public PARTOWNERSHIPDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTOWNERSHIP$0 = 
        new javax.xml.namespace.QName("", "PART_OWNERSHIP");
    
    
    /**
     * Gets the "PART_OWNERSHIP" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument.PARTOWNERSHIP getPARTOWNERSHIP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument.PARTOWNERSHIP target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument.PARTOWNERSHIP)get_store().find_element_user(PARTOWNERSHIP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PART_OWNERSHIP" element
     */
    public void setPARTOWNERSHIP(com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument.PARTOWNERSHIP partownership)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument.PARTOWNERSHIP target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument.PARTOWNERSHIP)get_store().find_element_user(PARTOWNERSHIP$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument.PARTOWNERSHIP)get_store().add_element_user(PARTOWNERSHIP$0);
            }
            target.set(partownership);
        }
    }
    
    /**
     * Appends and returns a new empty "PART_OWNERSHIP" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument.PARTOWNERSHIP addNewPARTOWNERSHIP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument.PARTOWNERSHIP target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument.PARTOWNERSHIP)get_store().add_element_user(PARTOWNERSHIP$0);
            return target;
        }
    }
    /**
     * An XML PART_OWNERSHIP(@).
     *
     * This is a complex type.
     */
    public static class PARTOWNERSHIPImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument.PARTOWNERSHIP
    {
        private static final long serialVersionUID = 1L;
        
        public PARTOWNERSHIPImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARTNAME$0 = 
            new javax.xml.namespace.QName("", "PART_NAME");
        private static final javax.xml.namespace.QName PARTOWNER$2 = 
            new javax.xml.namespace.QName("", "PART_OWNER");
        private static final javax.xml.namespace.QName PARTORGNUMBER$4 = 
            new javax.xml.namespace.QName("", "PART_ORG_NUMBER");
        private static final javax.xml.namespace.QName PARTNUMBER$6 = 
            new javax.xml.namespace.QName("", "PART_NUMBER");
        
        
        /**
         * Gets the "PART_NAME" element
         */
        public java.lang.String getPARTNAME()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PART_NAME" element
         */
        public org.apache.xmlbeans.XmlString xgetPARTNAME()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNAME$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "PART_NAME" element
         */
        public boolean isSetPARTNAME()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PARTNAME$0) != 0;
            }
        }
        
        /**
         * Sets the "PART_NAME" element
         */
        public void setPARTNAME(java.lang.String partname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTNAME$0);
                }
                target.setStringValue(partname);
            }
        }
        
        /**
         * Sets (as xml) the "PART_NAME" element
         */
        public void xsetPARTNAME(org.apache.xmlbeans.XmlString partname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARTNAME$0);
                }
                target.set(partname);
            }
        }
        
        /**
         * Unsets the "PART_NAME" element
         */
        public void unsetPARTNAME()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PARTNAME$0, 0);
            }
        }
        
        /**
         * Gets the "PART_OWNER" element
         */
        public java.lang.String getPARTOWNER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTOWNER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PART_OWNER" element
         */
        public org.apache.xmlbeans.XmlString xgetPARTOWNER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTOWNER$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "PART_OWNER" element
         */
        public boolean isSetPARTOWNER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PARTOWNER$2) != 0;
            }
        }
        
        /**
         * Sets the "PART_OWNER" element
         */
        public void setPARTOWNER(java.lang.String partowner)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTOWNER$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTOWNER$2);
                }
                target.setStringValue(partowner);
            }
        }
        
        /**
         * Sets (as xml) the "PART_OWNER" element
         */
        public void xsetPARTOWNER(org.apache.xmlbeans.XmlString partowner)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTOWNER$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARTOWNER$2);
                }
                target.set(partowner);
            }
        }
        
        /**
         * Unsets the "PART_OWNER" element
         */
        public void unsetPARTOWNER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PARTOWNER$2, 0);
            }
        }
        
        /**
         * Gets the "PART_ORG_NUMBER" element
         */
        public java.lang.String getPARTORGNUMBER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTORGNUMBER$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PART_ORG_NUMBER" element
         */
        public org.apache.xmlbeans.XmlString xgetPARTORGNUMBER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTORGNUMBER$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "PART_ORG_NUMBER" element
         */
        public boolean isSetPARTORGNUMBER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PARTORGNUMBER$4) != 0;
            }
        }
        
        /**
         * Sets the "PART_ORG_NUMBER" element
         */
        public void setPARTORGNUMBER(java.lang.String partorgnumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTORGNUMBER$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTORGNUMBER$4);
                }
                target.setStringValue(partorgnumber);
            }
        }
        
        /**
         * Sets (as xml) the "PART_ORG_NUMBER" element
         */
        public void xsetPARTORGNUMBER(org.apache.xmlbeans.XmlString partorgnumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTORGNUMBER$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARTORGNUMBER$4);
                }
                target.set(partorgnumber);
            }
        }
        
        /**
         * Unsets the "PART_ORG_NUMBER" element
         */
        public void unsetPARTORGNUMBER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PARTORGNUMBER$4, 0);
            }
        }
        
        /**
         * Gets the "PART_NUMBER" element
         */
        public java.lang.String getPARTNUMBER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNUMBER$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PART_NUMBER" element
         */
        public org.apache.xmlbeans.XmlString xgetPARTNUMBER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNUMBER$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "PART_NUMBER" element
         */
        public boolean isSetPARTNUMBER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PARTNUMBER$6) != 0;
            }
        }
        
        /**
         * Sets the "PART_NUMBER" element
         */
        public void setPARTNUMBER(java.lang.String partnumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNUMBER$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTNUMBER$6);
                }
                target.setStringValue(partnumber);
            }
        }
        
        /**
         * Sets (as xml) the "PART_NUMBER" element
         */
        public void xsetPARTNUMBER(org.apache.xmlbeans.XmlString partnumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNUMBER$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARTNUMBER$6);
                }
                target.set(partnumber);
            }
        }
        
        /**
         * Unsets the "PART_NUMBER" element
         */
        public void unsetPARTNUMBER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PARTNUMBER$6, 0);
            }
        }
    }
}
