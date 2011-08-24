/*
 * An XML document type.
 * Localname: MAPMATRIX
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one MAPMATRIX(@) element.
 *
 * This is a complex type.
 */
public class MAPMATRIXDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument
{
    private static final long serialVersionUID = 1L;
    
    public MAPMATRIXDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAPMATRIX$0 = 
        new javax.xml.namespace.QName("", "MAPMATRIX");
    
    
    /**
     * Gets the "MAPMATRIX" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument.MAPMATRIX getMAPMATRIX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument.MAPMATRIX target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument.MAPMATRIX)get_store().find_element_user(MAPMATRIX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MAPMATRIX" element
     */
    public void setMAPMATRIX(com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument.MAPMATRIX mapmatrix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument.MAPMATRIX target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument.MAPMATRIX)get_store().find_element_user(MAPMATRIX$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument.MAPMATRIX)get_store().add_element_user(MAPMATRIX$0);
            }
            target.set(mapmatrix);
        }
    }
    
    /**
     * Appends and returns a new empty "MAPMATRIX" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument.MAPMATRIX addNewMAPMATRIX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument.MAPMATRIX target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument.MAPMATRIX)get_store().add_element_user(MAPMATRIX$0);
            return target;
        }
    }
    /**
     * An XML MAPMATRIX(@).
     *
     * This is a complex type.
     */
    public static class MAPMATRIXImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument.MAPMATRIX
    {
        private static final long serialVersionUID = 1L;
        
        public MAPMATRIXImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName KOMMUNENR$0 = 
            new javax.xml.namespace.QName("", "KOMMUNENR");
        private static final javax.xml.namespace.QName GAARDSNR$2 = 
            new javax.xml.namespace.QName("", "GAARDSNR");
        private static final javax.xml.namespace.QName BRUKSNR$4 = 
            new javax.xml.namespace.QName("", "BRUKSNR");
        private static final javax.xml.namespace.QName FESTENR$6 = 
            new javax.xml.namespace.QName("", "FESTENR");
        private static final javax.xml.namespace.QName SEKSJONSNR$8 = 
            new javax.xml.namespace.QName("", "SEKSJONSNR");
        private static final javax.xml.namespace.QName LEILIGHETSNR$10 = 
            new javax.xml.namespace.QName("", "LEILIGHETSNR");
        
        
        /**
         * Gets the "KOMMUNENR" element
         */
        public java.lang.String getKOMMUNENR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KOMMUNENR$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "KOMMUNENR" element
         */
        public org.apache.xmlbeans.XmlString xgetKOMMUNENR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KOMMUNENR$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "KOMMUNENR" element
         */
        public boolean isSetKOMMUNENR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(KOMMUNENR$0) != 0;
            }
        }
        
        /**
         * Sets the "KOMMUNENR" element
         */
        public void setKOMMUNENR(java.lang.String kommunenr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KOMMUNENR$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KOMMUNENR$0);
                }
                target.setStringValue(kommunenr);
            }
        }
        
        /**
         * Sets (as xml) the "KOMMUNENR" element
         */
        public void xsetKOMMUNENR(org.apache.xmlbeans.XmlString kommunenr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KOMMUNENR$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KOMMUNENR$0);
                }
                target.set(kommunenr);
            }
        }
        
        /**
         * Unsets the "KOMMUNENR" element
         */
        public void unsetKOMMUNENR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(KOMMUNENR$0, 0);
            }
        }
        
        /**
         * Gets the "GAARDSNR" element
         */
        public java.lang.String getGAARDSNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GAARDSNR$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "GAARDSNR" element
         */
        public org.apache.xmlbeans.XmlString xgetGAARDSNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GAARDSNR$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "GAARDSNR" element
         */
        public boolean isSetGAARDSNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GAARDSNR$2) != 0;
            }
        }
        
        /**
         * Sets the "GAARDSNR" element
         */
        public void setGAARDSNR(java.lang.String gaardsnr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GAARDSNR$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GAARDSNR$2);
                }
                target.setStringValue(gaardsnr);
            }
        }
        
        /**
         * Sets (as xml) the "GAARDSNR" element
         */
        public void xsetGAARDSNR(org.apache.xmlbeans.XmlString gaardsnr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GAARDSNR$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GAARDSNR$2);
                }
                target.set(gaardsnr);
            }
        }
        
        /**
         * Unsets the "GAARDSNR" element
         */
        public void unsetGAARDSNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GAARDSNR$2, 0);
            }
        }
        
        /**
         * Gets the "BRUKSNR" element
         */
        public java.lang.String getBRUKSNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRUKSNR$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "BRUKSNR" element
         */
        public org.apache.xmlbeans.XmlString xgetBRUKSNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRUKSNR$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "BRUKSNR" element
         */
        public boolean isSetBRUKSNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BRUKSNR$4) != 0;
            }
        }
        
        /**
         * Sets the "BRUKSNR" element
         */
        public void setBRUKSNR(java.lang.String bruksnr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRUKSNR$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BRUKSNR$4);
                }
                target.setStringValue(bruksnr);
            }
        }
        
        /**
         * Sets (as xml) the "BRUKSNR" element
         */
        public void xsetBRUKSNR(org.apache.xmlbeans.XmlString bruksnr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRUKSNR$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BRUKSNR$4);
                }
                target.set(bruksnr);
            }
        }
        
        /**
         * Unsets the "BRUKSNR" element
         */
        public void unsetBRUKSNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BRUKSNR$4, 0);
            }
        }
        
        /**
         * Gets the "FESTENR" element
         */
        public java.lang.String getFESTENR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FESTENR$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FESTENR" element
         */
        public org.apache.xmlbeans.XmlString xgetFESTENR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FESTENR$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "FESTENR" element
         */
        public boolean isSetFESTENR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FESTENR$6) != 0;
            }
        }
        
        /**
         * Sets the "FESTENR" element
         */
        public void setFESTENR(java.lang.String festenr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FESTENR$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FESTENR$6);
                }
                target.setStringValue(festenr);
            }
        }
        
        /**
         * Sets (as xml) the "FESTENR" element
         */
        public void xsetFESTENR(org.apache.xmlbeans.XmlString festenr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FESTENR$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FESTENR$6);
                }
                target.set(festenr);
            }
        }
        
        /**
         * Unsets the "FESTENR" element
         */
        public void unsetFESTENR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FESTENR$6, 0);
            }
        }
        
        /**
         * Gets the "SEKSJONSNR" element
         */
        public java.lang.String getSEKSJONSNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEKSJONSNR$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SEKSJONSNR" element
         */
        public org.apache.xmlbeans.XmlString xgetSEKSJONSNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEKSJONSNR$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "SEKSJONSNR" element
         */
        public boolean isSetSEKSJONSNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEKSJONSNR$8) != 0;
            }
        }
        
        /**
         * Sets the "SEKSJONSNR" element
         */
        public void setSEKSJONSNR(java.lang.String seksjonsnr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEKSJONSNR$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEKSJONSNR$8);
                }
                target.setStringValue(seksjonsnr);
            }
        }
        
        /**
         * Sets (as xml) the "SEKSJONSNR" element
         */
        public void xsetSEKSJONSNR(org.apache.xmlbeans.XmlString seksjonsnr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEKSJONSNR$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEKSJONSNR$8);
                }
                target.set(seksjonsnr);
            }
        }
        
        /**
         * Unsets the "SEKSJONSNR" element
         */
        public void unsetSEKSJONSNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEKSJONSNR$8, 0);
            }
        }
        
        /**
         * Gets the "LEILIGHETSNR" element
         */
        public java.lang.String getLEILIGHETSNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEILIGHETSNR$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "LEILIGHETSNR" element
         */
        public org.apache.xmlbeans.XmlString xgetLEILIGHETSNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEILIGHETSNR$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "LEILIGHETSNR" element
         */
        public boolean isSetLEILIGHETSNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LEILIGHETSNR$10) != 0;
            }
        }
        
        /**
         * Sets the "LEILIGHETSNR" element
         */
        public void setLEILIGHETSNR(java.lang.String leilighetsnr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEILIGHETSNR$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LEILIGHETSNR$10);
                }
                target.setStringValue(leilighetsnr);
            }
        }
        
        /**
         * Sets (as xml) the "LEILIGHETSNR" element
         */
        public void xsetLEILIGHETSNR(org.apache.xmlbeans.XmlString leilighetsnr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEILIGHETSNR$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LEILIGHETSNR$10);
                }
                target.set(leilighetsnr);
            }
        }
        
        /**
         * Unsets the "LEILIGHETSNR" element
         */
        public void unsetLEILIGHETSNR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LEILIGHETSNR$10, 0);
            }
        }
    }
}
