/*
 * An XML document type.
 * Localname: ESTATE_DEVELOPMENT
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one ESTATE_DEVELOPMENT(@) element.
 *
 * This is a complex type.
 */
public class ESTATEDEVELOPMENTDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument
{
    private static final long serialVersionUID = 1L;
    
    public ESTATEDEVELOPMENTDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ESTATEDEVELOPMENT$0 = 
        new javax.xml.namespace.QName("", "ESTATE_DEVELOPMENT");
    
    
    /**
     * Gets the "ESTATE_DEVELOPMENT" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument.ESTATEDEVELOPMENT getESTATEDEVELOPMENT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument.ESTATEDEVELOPMENT target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument.ESTATEDEVELOPMENT)get_store().find_element_user(ESTATEDEVELOPMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ESTATE_DEVELOPMENT" element
     */
    public void setESTATEDEVELOPMENT(com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument.ESTATEDEVELOPMENT estatedevelopment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument.ESTATEDEVELOPMENT target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument.ESTATEDEVELOPMENT)get_store().find_element_user(ESTATEDEVELOPMENT$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument.ESTATEDEVELOPMENT)get_store().add_element_user(ESTATEDEVELOPMENT$0);
            }
            target.set(estatedevelopment);
        }
    }
    
    /**
     * Appends and returns a new empty "ESTATE_DEVELOPMENT" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument.ESTATEDEVELOPMENT addNewESTATEDEVELOPMENT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument.ESTATEDEVELOPMENT target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument.ESTATEDEVELOPMENT)get_store().add_element_user(ESTATEDEVELOPMENT$0);
            return target;
        }
    }
    /**
     * An XML ESTATE_DEVELOPMENT(@).
     *
     * This is a complex type.
     */
    public static class ESTATEDEVELOPMENTImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEDEVELOPMENTDocument.ESTATEDEVELOPMENT
    {
        private static final long serialVersionUID = 1L;
        
        public ESTATEDEVELOPMENTImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ESTATEPREFERENCE$0 = 
            new javax.xml.namespace.QName("", "ESTATE_PREFERENCE");
        private static final javax.xml.namespace.QName MAPMATRIX$2 = 
            new javax.xml.namespace.QName("", "MAPMATRIX");
        private static final javax.xml.namespace.QName BOLIGNUMMER$4 = 
            new javax.xml.namespace.QName("", "BOLIGNUMMER");
        private static final javax.xml.namespace.QName VIEWING$6 = 
            new javax.xml.namespace.QName("", "VIEWING");
        private static final javax.xml.namespace.QName AREARANGE$8 = 
            new javax.xml.namespace.QName("", "AREA_RANGE");
        private static final javax.xml.namespace.QName PRICERANGE$10 = 
            new javax.xml.namespace.QName("", "PRICE_RANGE");
        private static final javax.xml.namespace.QName ESTATECOLLECTIVEDEBT$12 = 
            new javax.xml.namespace.QName("", "ESTATE_COLLECTIVE_DEBT");
        private static final javax.xml.namespace.QName RENTRANGE$14 = 
            new javax.xml.namespace.QName("", "RENT_RANGE");
        private static final javax.xml.namespace.QName NUMBEROFUNITS$16 = 
            new javax.xml.namespace.QName("", "NUMBER_OF_UNITS");
        private static final javax.xml.namespace.QName PROGRESS$18 = 
            new javax.xml.namespace.QName("", "PROGRESS");
        private static final javax.xml.namespace.QName GENERALTEXTREALESTATE$20 = 
            new javax.xml.namespace.QName("", "GENERAL_TEXT_REALESTATE");
        private static final javax.xml.namespace.QName PROPERTYTYPE$22 = 
            new javax.xml.namespace.QName("", "PROPERTY_TYPE");
        private static final javax.xml.namespace.QName PLOT$24 = 
            new javax.xml.namespace.QName("", "PLOT");
        private static final javax.xml.namespace.QName OWNERSHIPTYPE$26 = 
            new javax.xml.namespace.QName("", "OWNERSHIP_TYPE");
        private static final javax.xml.namespace.QName PARTOWNERSHIP$28 = 
            new javax.xml.namespace.QName("", "PART_OWNERSHIP");
        private static final javax.xml.namespace.QName MOREINFO$30 = 
            new javax.xml.namespace.QName("", "MOREINFO");
        private static final javax.xml.namespace.QName ESTATEEXTERNALURL$32 = 
            new javax.xml.namespace.QName("", "ESTATE_EXTERNAL_URL");
        private static final javax.xml.namespace.QName ENERGYLABEL$34 = 
            new javax.xml.namespace.QName("", "ENERGY_LABEL");
        private static final javax.xml.namespace.QName ENERGYLABELCOLORCODE$36 = 
            new javax.xml.namespace.QName("", "ENERGY_LABEL_COLOR_CODE");
        private static final javax.xml.namespace.QName ESTATEEXTERNALORDERURL$38 = 
            new javax.xml.namespace.QName("", "ESTATE_EXTERNAL_ORDER_URL");
        private static final javax.xml.namespace.QName NOOFROOMSRANGE$40 = 
            new javax.xml.namespace.QName("", "NO_OF_ROOMS_RANGE");
        private static final javax.xml.namespace.QName BROKER$42 = 
            new javax.xml.namespace.QName("", "BROKER");
        private static final javax.xml.namespace.QName DEPARTMENT$44 = 
            new javax.xml.namespace.QName("", "DEPARTMENT");
        private static final javax.xml.namespace.QName FINANCIALAGENT$46 = 
            new javax.xml.namespace.QName("", "FINANCIAL_AGENT");
        private static final javax.xml.namespace.QName DEVELOPER$48 = 
            new javax.xml.namespace.QName("", "DEVELOPER");
        
        
        /**
         * Gets array of all "ESTATE_PREFERENCE" elements
         */
        public java.lang.String[] getESTATEPREFERENCEArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ESTATEPREFERENCE$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "ESTATE_PREFERENCE" element
         */
        public java.lang.String getESTATEPREFERENCEArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTATEPREFERENCE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "ESTATE_PREFERENCE" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetESTATEPREFERENCEArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ESTATEPREFERENCE$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "ESTATE_PREFERENCE" element
         */
        public org.apache.xmlbeans.XmlString xgetESTATEPREFERENCEArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTATEPREFERENCE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "ESTATE_PREFERENCE" element
         */
        public int sizeOfESTATEPREFERENCEArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ESTATEPREFERENCE$0);
            }
        }
        
        /**
         * Sets array of all "ESTATE_PREFERENCE" element
         */
        public void setESTATEPREFERENCEArray(java.lang.String[] estatepreferenceArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(estatepreferenceArray, ESTATEPREFERENCE$0);
            }
        }
        
        /**
         * Sets ith "ESTATE_PREFERENCE" element
         */
        public void setESTATEPREFERENCEArray(int i, java.lang.String estatepreference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTATEPREFERENCE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(estatepreference);
            }
        }
        
        /**
         * Sets (as xml) array of all "ESTATE_PREFERENCE" element
         */
        public void xsetESTATEPREFERENCEArray(org.apache.xmlbeans.XmlString[]estatepreferenceArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(estatepreferenceArray, ESTATEPREFERENCE$0);
            }
        }
        
        /**
         * Sets (as xml) ith "ESTATE_PREFERENCE" element
         */
        public void xsetESTATEPREFERENCEArray(int i, org.apache.xmlbeans.XmlString estatepreference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTATEPREFERENCE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(estatepreference);
            }
        }
        
        /**
         * Inserts the value as the ith "ESTATE_PREFERENCE" element
         */
        public void insertESTATEPREFERENCE(int i, java.lang.String estatepreference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ESTATEPREFERENCE$0, i);
                target.setStringValue(estatepreference);
            }
        }
        
        /**
         * Appends the value as the last "ESTATE_PREFERENCE" element
         */
        public void addESTATEPREFERENCE(java.lang.String estatepreference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESTATEPREFERENCE$0);
                target.setStringValue(estatepreference);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ESTATE_PREFERENCE" element
         */
        public org.apache.xmlbeans.XmlString insertNewESTATEPREFERENCE(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ESTATEPREFERENCE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ESTATE_PREFERENCE" element
         */
        public org.apache.xmlbeans.XmlString addNewESTATEPREFERENCE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ESTATEPREFERENCE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "ESTATE_PREFERENCE" element
         */
        public void removeESTATEPREFERENCE(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ESTATEPREFERENCE$0, i);
            }
        }
        
        /**
         * Gets array of all "MAPMATRIX" elements
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument.MAPMATRIX[] getMAPMATRIXArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(MAPMATRIX$2, targetList);
                com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument.MAPMATRIX[] result = new com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument.MAPMATRIX[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "MAPMATRIX" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument.MAPMATRIX getMAPMATRIXArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument.MAPMATRIX target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument.MAPMATRIX)get_store().find_element_user(MAPMATRIX$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "MAPMATRIX" element
         */
        public int sizeOfMAPMATRIXArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MAPMATRIX$2);
            }
        }
        
        /**
         * Sets array of all "MAPMATRIX" element
         */
        public void setMAPMATRIXArray(com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument.MAPMATRIX[] mapmatrixArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(mapmatrixArray, MAPMATRIX$2);
            }
        }
        
        /**
         * Sets ith "MAPMATRIX" element
         */
        public void setMAPMATRIXArray(int i, com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument.MAPMATRIX mapmatrix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument.MAPMATRIX target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument.MAPMATRIX)get_store().find_element_user(MAPMATRIX$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(mapmatrix);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "MAPMATRIX" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument.MAPMATRIX insertNewMAPMATRIX(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument.MAPMATRIX target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument.MAPMATRIX)get_store().insert_element_user(MAPMATRIX$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "MAPMATRIX" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument.MAPMATRIX addNewMAPMATRIX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument.MAPMATRIX target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument.MAPMATRIX)get_store().add_element_user(MAPMATRIX$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "MAPMATRIX" element
         */
        public void removeMAPMATRIX(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MAPMATRIX$2, i);
            }
        }
        
        /**
         * Gets array of all "BOLIGNUMMER" elements
         */
        public java.lang.String[] getBOLIGNUMMERArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BOLIGNUMMER$4, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "BOLIGNUMMER" element
         */
        public java.lang.String getBOLIGNUMMERArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOLIGNUMMER$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "BOLIGNUMMER" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetBOLIGNUMMERArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BOLIGNUMMER$4, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "BOLIGNUMMER" element
         */
        public org.apache.xmlbeans.XmlString xgetBOLIGNUMMERArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOLIGNUMMER$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "BOLIGNUMMER" element
         */
        public int sizeOfBOLIGNUMMERArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BOLIGNUMMER$4);
            }
        }
        
        /**
         * Sets array of all "BOLIGNUMMER" element
         */
        public void setBOLIGNUMMERArray(java.lang.String[] bolignummerArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(bolignummerArray, BOLIGNUMMER$4);
            }
        }
        
        /**
         * Sets ith "BOLIGNUMMER" element
         */
        public void setBOLIGNUMMERArray(int i, java.lang.String bolignummer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOLIGNUMMER$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(bolignummer);
            }
        }
        
        /**
         * Sets (as xml) array of all "BOLIGNUMMER" element
         */
        public void xsetBOLIGNUMMERArray(org.apache.xmlbeans.XmlString[]bolignummerArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(bolignummerArray, BOLIGNUMMER$4);
            }
        }
        
        /**
         * Sets (as xml) ith "BOLIGNUMMER" element
         */
        public void xsetBOLIGNUMMERArray(int i, org.apache.xmlbeans.XmlString bolignummer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOLIGNUMMER$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(bolignummer);
            }
        }
        
        /**
         * Inserts the value as the ith "BOLIGNUMMER" element
         */
        public void insertBOLIGNUMMER(int i, java.lang.String bolignummer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(BOLIGNUMMER$4, i);
                target.setStringValue(bolignummer);
            }
        }
        
        /**
         * Appends the value as the last "BOLIGNUMMER" element
         */
        public void addBOLIGNUMMER(java.lang.String bolignummer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOLIGNUMMER$4);
                target.setStringValue(bolignummer);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "BOLIGNUMMER" element
         */
        public org.apache.xmlbeans.XmlString insertNewBOLIGNUMMER(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(BOLIGNUMMER$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "BOLIGNUMMER" element
         */
        public org.apache.xmlbeans.XmlString addNewBOLIGNUMMER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BOLIGNUMMER$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "BOLIGNUMMER" element
         */
        public void removeBOLIGNUMMER(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BOLIGNUMMER$4, i);
            }
        }
        
        /**
         * Gets array of all "VIEWING" elements
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING[] getVIEWINGArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VIEWING$6, targetList);
                com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING[] result = new com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "VIEWING" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING getVIEWINGArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING)get_store().find_element_user(VIEWING$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "VIEWING" element
         */
        public int sizeOfVIEWINGArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VIEWING$6);
            }
        }
        
        /**
         * Sets array of all "VIEWING" element
         */
        public void setVIEWINGArray(com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING[] viewingArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(viewingArray, VIEWING$6);
            }
        }
        
        /**
         * Sets ith "VIEWING" element
         */
        public void setVIEWINGArray(int i, com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING viewing)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING)get_store().find_element_user(VIEWING$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(viewing);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "VIEWING" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING insertNewVIEWING(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING)get_store().insert_element_user(VIEWING$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "VIEWING" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING addNewVIEWING()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING)get_store().add_element_user(VIEWING$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "VIEWING" element
         */
        public void removeVIEWING(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VIEWING$6, i);
            }
        }
        
        /**
         * Gets the "AREA_RANGE" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.AREARANGEDocument.AREARANGE getAREARANGE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.AREARANGEDocument.AREARANGE target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.AREARANGEDocument.AREARANGE)get_store().find_element_user(AREARANGE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "AREA_RANGE" element
         */
        public boolean isSetAREARANGE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AREARANGE$8) != 0;
            }
        }
        
        /**
         * Sets the "AREA_RANGE" element
         */
        public void setAREARANGE(com.abctech.transition.xmladbeans.iadifestateforsale.AREARANGEDocument.AREARANGE arearange)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.AREARANGEDocument.AREARANGE target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.AREARANGEDocument.AREARANGE)get_store().find_element_user(AREARANGE$8, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifestateforsale.AREARANGEDocument.AREARANGE)get_store().add_element_user(AREARANGE$8);
                }
                target.set(arearange);
            }
        }
        
        /**
         * Appends and returns a new empty "AREA_RANGE" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.AREARANGEDocument.AREARANGE addNewAREARANGE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.AREARANGEDocument.AREARANGE target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.AREARANGEDocument.AREARANGE)get_store().add_element_user(AREARANGE$8);
                return target;
            }
        }
        
        /**
         * Unsets the "AREA_RANGE" element
         */
        public void unsetAREARANGE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AREARANGE$8, 0);
            }
        }
        
        /**
         * Gets the "PRICE_RANGE" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.PRICERANGEDocument.PRICERANGE getPRICERANGE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.PRICERANGEDocument.PRICERANGE target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.PRICERANGEDocument.PRICERANGE)get_store().find_element_user(PRICERANGE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "PRICE_RANGE" element
         */
        public boolean isSetPRICERANGE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PRICERANGE$10) != 0;
            }
        }
        
        /**
         * Sets the "PRICE_RANGE" element
         */
        public void setPRICERANGE(com.abctech.transition.xmladbeans.iadifestateforsale.PRICERANGEDocument.PRICERANGE pricerange)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.PRICERANGEDocument.PRICERANGE target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.PRICERANGEDocument.PRICERANGE)get_store().find_element_user(PRICERANGE$10, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifestateforsale.PRICERANGEDocument.PRICERANGE)get_store().add_element_user(PRICERANGE$10);
                }
                target.set(pricerange);
            }
        }
        
        /**
         * Appends and returns a new empty "PRICE_RANGE" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.PRICERANGEDocument.PRICERANGE addNewPRICERANGE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.PRICERANGEDocument.PRICERANGE target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.PRICERANGEDocument.PRICERANGE)get_store().add_element_user(PRICERANGE$10);
                return target;
            }
        }
        
        /**
         * Unsets the "PRICE_RANGE" element
         */
        public void unsetPRICERANGE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PRICERANGE$10, 0);
            }
        }
        
        /**
         * Gets the "ESTATE_COLLECTIVE_DEBT" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.ESTATECOLLECTIVEDEBTDocument.ESTATECOLLECTIVEDEBT getESTATECOLLECTIVEDEBT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.ESTATECOLLECTIVEDEBTDocument.ESTATECOLLECTIVEDEBT target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATECOLLECTIVEDEBTDocument.ESTATECOLLECTIVEDEBT)get_store().find_element_user(ESTATECOLLECTIVEDEBT$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ESTATE_COLLECTIVE_DEBT" element
         */
        public boolean isSetESTATECOLLECTIVEDEBT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ESTATECOLLECTIVEDEBT$12) != 0;
            }
        }
        
        /**
         * Sets the "ESTATE_COLLECTIVE_DEBT" element
         */
        public void setESTATECOLLECTIVEDEBT(com.abctech.transition.xmladbeans.iadifestateforsale.ESTATECOLLECTIVEDEBTDocument.ESTATECOLLECTIVEDEBT estatecollectivedebt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.ESTATECOLLECTIVEDEBTDocument.ESTATECOLLECTIVEDEBT target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATECOLLECTIVEDEBTDocument.ESTATECOLLECTIVEDEBT)get_store().find_element_user(ESTATECOLLECTIVEDEBT$12, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATECOLLECTIVEDEBTDocument.ESTATECOLLECTIVEDEBT)get_store().add_element_user(ESTATECOLLECTIVEDEBT$12);
                }
                target.set(estatecollectivedebt);
            }
        }
        
        /**
         * Appends and returns a new empty "ESTATE_COLLECTIVE_DEBT" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.ESTATECOLLECTIVEDEBTDocument.ESTATECOLLECTIVEDEBT addNewESTATECOLLECTIVEDEBT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.ESTATECOLLECTIVEDEBTDocument.ESTATECOLLECTIVEDEBT target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATECOLLECTIVEDEBTDocument.ESTATECOLLECTIVEDEBT)get_store().add_element_user(ESTATECOLLECTIVEDEBT$12);
                return target;
            }
        }
        
        /**
         * Unsets the "ESTATE_COLLECTIVE_DEBT" element
         */
        public void unsetESTATECOLLECTIVEDEBT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ESTATECOLLECTIVEDEBT$12, 0);
            }
        }
        
        /**
         * Gets the "RENT_RANGE" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument.RENTRANGE getRENTRANGE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument.RENTRANGE target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument.RENTRANGE)get_store().find_element_user(RENTRANGE$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "RENT_RANGE" element
         */
        public boolean isSetRENTRANGE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RENTRANGE$14) != 0;
            }
        }
        
        /**
         * Sets the "RENT_RANGE" element
         */
        public void setRENTRANGE(com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument.RENTRANGE rentrange)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument.RENTRANGE target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument.RENTRANGE)get_store().find_element_user(RENTRANGE$14, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument.RENTRANGE)get_store().add_element_user(RENTRANGE$14);
                }
                target.set(rentrange);
            }
        }
        
        /**
         * Appends and returns a new empty "RENT_RANGE" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument.RENTRANGE addNewRENTRANGE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument.RENTRANGE target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.RENTRANGEDocument.RENTRANGE)get_store().add_element_user(RENTRANGE$14);
                return target;
            }
        }
        
        /**
         * Unsets the "RENT_RANGE" element
         */
        public void unsetRENTRANGE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RENTRANGE$14, 0);
            }
        }
        
        /**
         * Gets the "NUMBER_OF_UNITS" element
         */
        public java.lang.String getNUMBEROFUNITS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFUNITS$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "NUMBER_OF_UNITS" element
         */
        public org.apache.xmlbeans.XmlString xgetNUMBEROFUNITS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBEROFUNITS$16, 0);
                return target;
            }
        }
        
        /**
         * True if has "NUMBER_OF_UNITS" element
         */
        public boolean isSetNUMBEROFUNITS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NUMBEROFUNITS$16) != 0;
            }
        }
        
        /**
         * Sets the "NUMBER_OF_UNITS" element
         */
        public void setNUMBEROFUNITS(java.lang.String numberofunits)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFUNITS$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFUNITS$16);
                }
                target.setStringValue(numberofunits);
            }
        }
        
        /**
         * Sets (as xml) the "NUMBER_OF_UNITS" element
         */
        public void xsetNUMBEROFUNITS(org.apache.xmlbeans.XmlString numberofunits)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBEROFUNITS$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMBEROFUNITS$16);
                }
                target.set(numberofunits);
            }
        }
        
        /**
         * Unsets the "NUMBER_OF_UNITS" element
         */
        public void unsetNUMBEROFUNITS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NUMBEROFUNITS$16, 0);
            }
        }
        
        /**
         * Gets the "PROGRESS" element
         */
        public java.lang.String getPROGRESS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROGRESS$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PROGRESS" element
         */
        public org.apache.xmlbeans.XmlString xgetPROGRESS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROGRESS$18, 0);
                return target;
            }
        }
        
        /**
         * True if has "PROGRESS" element
         */
        public boolean isSetPROGRESS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROGRESS$18) != 0;
            }
        }
        
        /**
         * Sets the "PROGRESS" element
         */
        public void setPROGRESS(java.lang.String progress)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROGRESS$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROGRESS$18);
                }
                target.setStringValue(progress);
            }
        }
        
        /**
         * Sets (as xml) the "PROGRESS" element
         */
        public void xsetPROGRESS(org.apache.xmlbeans.XmlString progress)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROGRESS$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROGRESS$18);
                }
                target.set(progress);
            }
        }
        
        /**
         * Unsets the "PROGRESS" element
         */
        public void unsetPROGRESS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROGRESS$18, 0);
            }
        }
        
        /**
         * Gets array of all "GENERAL_TEXT_REALESTATE" elements
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE[] getGENERALTEXTREALESTATEArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(GENERALTEXTREALESTATE$20, targetList);
                com.abctech.transition.xmladbeans.iadifestateforsale.GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE[] result = new com.abctech.transition.xmladbeans.iadifestateforsale.GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "GENERAL_TEXT_REALESTATE" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE getGENERALTEXTREALESTATEArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE)get_store().find_element_user(GENERALTEXTREALESTATE$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "GENERAL_TEXT_REALESTATE" element
         */
        public int sizeOfGENERALTEXTREALESTATEArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GENERALTEXTREALESTATE$20);
            }
        }
        
        /**
         * Sets array of all "GENERAL_TEXT_REALESTATE" element
         */
        public void setGENERALTEXTREALESTATEArray(com.abctech.transition.xmladbeans.iadifestateforsale.GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE[] generaltextrealestateArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(generaltextrealestateArray, GENERALTEXTREALESTATE$20);
            }
        }
        
        /**
         * Sets ith "GENERAL_TEXT_REALESTATE" element
         */
        public void setGENERALTEXTREALESTATEArray(int i, com.abctech.transition.xmladbeans.iadifestateforsale.GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE generaltextrealestate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE)get_store().find_element_user(GENERALTEXTREALESTATE$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(generaltextrealestate);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "GENERAL_TEXT_REALESTATE" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE insertNewGENERALTEXTREALESTATE(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE)get_store().insert_element_user(GENERALTEXTREALESTATE$20, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "GENERAL_TEXT_REALESTATE" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE addNewGENERALTEXTREALESTATE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE)get_store().add_element_user(GENERALTEXTREALESTATE$20);
                return target;
            }
        }
        
        /**
         * Removes the ith "GENERAL_TEXT_REALESTATE" element
         */
        public void removeGENERALTEXTREALESTATE(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GENERALTEXTREALESTATE$20, i);
            }
        }
        
        /**
         * Gets array of all "PROPERTY_TYPE" elements
         */
        public java.lang.String[] getPROPERTYTYPEArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PROPERTYTYPE$22, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "PROPERTY_TYPE" element
         */
        public java.lang.String getPROPERTYTYPEArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYTYPE$22, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "PROPERTY_TYPE" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetPROPERTYTYPEArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PROPERTYTYPE$22, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "PROPERTY_TYPE" element
         */
        public org.apache.xmlbeans.XmlString xgetPROPERTYTYPEArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYTYPE$22, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "PROPERTY_TYPE" element
         */
        public int sizeOfPROPERTYTYPEArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROPERTYTYPE$22);
            }
        }
        
        /**
         * Sets array of all "PROPERTY_TYPE" element
         */
        public void setPROPERTYTYPEArray(java.lang.String[] propertytypeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(propertytypeArray, PROPERTYTYPE$22);
            }
        }
        
        /**
         * Sets ith "PROPERTY_TYPE" element
         */
        public void setPROPERTYTYPEArray(int i, java.lang.String propertytype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYTYPE$22, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(propertytype);
            }
        }
        
        /**
         * Sets (as xml) array of all "PROPERTY_TYPE" element
         */
        public void xsetPROPERTYTYPEArray(org.apache.xmlbeans.XmlString[]propertytypeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(propertytypeArray, PROPERTYTYPE$22);
            }
        }
        
        /**
         * Sets (as xml) ith "PROPERTY_TYPE" element
         */
        public void xsetPROPERTYTYPEArray(int i, org.apache.xmlbeans.XmlString propertytype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYTYPE$22, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(propertytype);
            }
        }
        
        /**
         * Inserts the value as the ith "PROPERTY_TYPE" element
         */
        public void insertPROPERTYTYPE(int i, java.lang.String propertytype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTYTYPE$22, i);
                target.setStringValue(propertytype);
            }
        }
        
        /**
         * Appends the value as the last "PROPERTY_TYPE" element
         */
        public void addPROPERTYTYPE(java.lang.String propertytype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTYTYPE$22);
                target.setStringValue(propertytype);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PROPERTY_TYPE" element
         */
        public org.apache.xmlbeans.XmlString insertNewPROPERTYTYPE(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTYTYPE$22, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PROPERTY_TYPE" element
         */
        public org.apache.xmlbeans.XmlString addNewPROPERTYTYPE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTYTYPE$22);
                return target;
            }
        }
        
        /**
         * Removes the ith "PROPERTY_TYPE" element
         */
        public void removePROPERTYTYPE(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROPERTYTYPE$22, i);
            }
        }
        
        /**
         * Gets the "PLOT" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT getPLOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT)get_store().find_element_user(PLOT$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "PLOT" element
         */
        public boolean isSetPLOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PLOT$24) != 0;
            }
        }
        
        /**
         * Sets the "PLOT" element
         */
        public void setPLOT(com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT plot)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT)get_store().find_element_user(PLOT$24, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT)get_store().add_element_user(PLOT$24);
                }
                target.set(plot);
            }
        }
        
        /**
         * Appends and returns a new empty "PLOT" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT addNewPLOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT)get_store().add_element_user(PLOT$24);
                return target;
            }
        }
        
        /**
         * Unsets the "PLOT" element
         */
        public void unsetPLOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PLOT$24, 0);
            }
        }
        
        /**
         * Gets the "OWNERSHIP_TYPE" element
         */
        public java.lang.String getOWNERSHIPTYPE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNERSHIPTYPE$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OWNERSHIP_TYPE" element
         */
        public org.apache.xmlbeans.XmlString xgetOWNERSHIPTYPE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OWNERSHIPTYPE$26, 0);
                return target;
            }
        }
        
        /**
         * Sets the "OWNERSHIP_TYPE" element
         */
        public void setOWNERSHIPTYPE(java.lang.String ownershiptype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNERSHIPTYPE$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OWNERSHIPTYPE$26);
                }
                target.setStringValue(ownershiptype);
            }
        }
        
        /**
         * Sets (as xml) the "OWNERSHIP_TYPE" element
         */
        public void xsetOWNERSHIPTYPE(org.apache.xmlbeans.XmlString ownershiptype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OWNERSHIPTYPE$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OWNERSHIPTYPE$26);
                }
                target.set(ownershiptype);
            }
        }
        
        /**
         * Gets the "PART_OWNERSHIP" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument.PARTOWNERSHIP getPARTOWNERSHIP()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument.PARTOWNERSHIP target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument.PARTOWNERSHIP)get_store().find_element_user(PARTOWNERSHIP$28, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "PART_OWNERSHIP" element
         */
        public boolean isSetPARTOWNERSHIP()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PARTOWNERSHIP$28) != 0;
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument.PARTOWNERSHIP)get_store().find_element_user(PARTOWNERSHIP$28, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument.PARTOWNERSHIP)get_store().add_element_user(PARTOWNERSHIP$28);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument.PARTOWNERSHIP)get_store().add_element_user(PARTOWNERSHIP$28);
                return target;
            }
        }
        
        /**
         * Unsets the "PART_OWNERSHIP" element
         */
        public void unsetPARTOWNERSHIP()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PARTOWNERSHIP$28, 0);
            }
        }
        
        /**
         * Gets array of all "MOREINFO" elements
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.MOREINFODocument.MOREINFO[] getMOREINFOArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(MOREINFO$30, targetList);
                com.abctech.transition.xmladbeans.iadifestateforsale.MOREINFODocument.MOREINFO[] result = new com.abctech.transition.xmladbeans.iadifestateforsale.MOREINFODocument.MOREINFO[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "MOREINFO" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.MOREINFODocument.MOREINFO getMOREINFOArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.MOREINFODocument.MOREINFO target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.MOREINFODocument.MOREINFO)get_store().find_element_user(MOREINFO$30, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "MOREINFO" element
         */
        public int sizeOfMOREINFOArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MOREINFO$30);
            }
        }
        
        /**
         * Sets array of all "MOREINFO" element
         */
        public void setMOREINFOArray(com.abctech.transition.xmladbeans.iadifestateforsale.MOREINFODocument.MOREINFO[] moreinfoArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(moreinfoArray, MOREINFO$30);
            }
        }
        
        /**
         * Sets ith "MOREINFO" element
         */
        public void setMOREINFOArray(int i, com.abctech.transition.xmladbeans.iadifestateforsale.MOREINFODocument.MOREINFO moreinfo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.MOREINFODocument.MOREINFO target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.MOREINFODocument.MOREINFO)get_store().find_element_user(MOREINFO$30, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(moreinfo);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "MOREINFO" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.MOREINFODocument.MOREINFO insertNewMOREINFO(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.MOREINFODocument.MOREINFO target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.MOREINFODocument.MOREINFO)get_store().insert_element_user(MOREINFO$30, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "MOREINFO" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.MOREINFODocument.MOREINFO addNewMOREINFO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.MOREINFODocument.MOREINFO target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.MOREINFODocument.MOREINFO)get_store().add_element_user(MOREINFO$30);
                return target;
            }
        }
        
        /**
         * Removes the ith "MOREINFO" element
         */
        public void removeMOREINFO(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MOREINFO$30, i);
            }
        }
        
        /**
         * Gets the "ESTATE_EXTERNAL_URL" element
         */
        public java.lang.String getESTATEEXTERNALURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTATEEXTERNALURL$32, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ESTATE_EXTERNAL_URL" element
         */
        public org.apache.xmlbeans.XmlString xgetESTATEEXTERNALURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTATEEXTERNALURL$32, 0);
                return target;
            }
        }
        
        /**
         * True if has "ESTATE_EXTERNAL_URL" element
         */
        public boolean isSetESTATEEXTERNALURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ESTATEEXTERNALURL$32) != 0;
            }
        }
        
        /**
         * Sets the "ESTATE_EXTERNAL_URL" element
         */
        public void setESTATEEXTERNALURL(java.lang.String estateexternalurl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTATEEXTERNALURL$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESTATEEXTERNALURL$32);
                }
                target.setStringValue(estateexternalurl);
            }
        }
        
        /**
         * Sets (as xml) the "ESTATE_EXTERNAL_URL" element
         */
        public void xsetESTATEEXTERNALURL(org.apache.xmlbeans.XmlString estateexternalurl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTATEEXTERNALURL$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ESTATEEXTERNALURL$32);
                }
                target.set(estateexternalurl);
            }
        }
        
        /**
         * Unsets the "ESTATE_EXTERNAL_URL" element
         */
        public void unsetESTATEEXTERNALURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ESTATEEXTERNALURL$32, 0);
            }
        }
        
        /**
         * Gets the "ENERGY_LABEL" element
         */
        public java.lang.String getENERGYLABEL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENERGYLABEL$34, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ENERGY_LABEL" element
         */
        public org.apache.xmlbeans.XmlString xgetENERGYLABEL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENERGYLABEL$34, 0);
                return target;
            }
        }
        
        /**
         * True if has "ENERGY_LABEL" element
         */
        public boolean isSetENERGYLABEL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENERGYLABEL$34) != 0;
            }
        }
        
        /**
         * Sets the "ENERGY_LABEL" element
         */
        public void setENERGYLABEL(java.lang.String energylabel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENERGYLABEL$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENERGYLABEL$34);
                }
                target.setStringValue(energylabel);
            }
        }
        
        /**
         * Sets (as xml) the "ENERGY_LABEL" element
         */
        public void xsetENERGYLABEL(org.apache.xmlbeans.XmlString energylabel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENERGYLABEL$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENERGYLABEL$34);
                }
                target.set(energylabel);
            }
        }
        
        /**
         * Unsets the "ENERGY_LABEL" element
         */
        public void unsetENERGYLABEL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENERGYLABEL$34, 0);
            }
        }
        
        /**
         * Gets the "ENERGY_LABEL_COLOR_CODE" element
         */
        public java.lang.String getENERGYLABELCOLORCODE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENERGYLABELCOLORCODE$36, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ENERGY_LABEL_COLOR_CODE" element
         */
        public org.apache.xmlbeans.XmlString xgetENERGYLABELCOLORCODE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENERGYLABELCOLORCODE$36, 0);
                return target;
            }
        }
        
        /**
         * True if has "ENERGY_LABEL_COLOR_CODE" element
         */
        public boolean isSetENERGYLABELCOLORCODE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENERGYLABELCOLORCODE$36) != 0;
            }
        }
        
        /**
         * Sets the "ENERGY_LABEL_COLOR_CODE" element
         */
        public void setENERGYLABELCOLORCODE(java.lang.String energylabelcolorcode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENERGYLABELCOLORCODE$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENERGYLABELCOLORCODE$36);
                }
                target.setStringValue(energylabelcolorcode);
            }
        }
        
        /**
         * Sets (as xml) the "ENERGY_LABEL_COLOR_CODE" element
         */
        public void xsetENERGYLABELCOLORCODE(org.apache.xmlbeans.XmlString energylabelcolorcode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENERGYLABELCOLORCODE$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENERGYLABELCOLORCODE$36);
                }
                target.set(energylabelcolorcode);
            }
        }
        
        /**
         * Unsets the "ENERGY_LABEL_COLOR_CODE" element
         */
        public void unsetENERGYLABELCOLORCODE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENERGYLABELCOLORCODE$36, 0);
            }
        }
        
        /**
         * Gets the "ESTATE_EXTERNAL_ORDER_URL" element
         */
        public java.lang.String getESTATEEXTERNALORDERURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTATEEXTERNALORDERURL$38, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ESTATE_EXTERNAL_ORDER_URL" element
         */
        public org.apache.xmlbeans.XmlString xgetESTATEEXTERNALORDERURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTATEEXTERNALORDERURL$38, 0);
                return target;
            }
        }
        
        /**
         * True if has "ESTATE_EXTERNAL_ORDER_URL" element
         */
        public boolean isSetESTATEEXTERNALORDERURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ESTATEEXTERNALORDERURL$38) != 0;
            }
        }
        
        /**
         * Sets the "ESTATE_EXTERNAL_ORDER_URL" element
         */
        public void setESTATEEXTERNALORDERURL(java.lang.String estateexternalorderurl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTATEEXTERNALORDERURL$38, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESTATEEXTERNALORDERURL$38);
                }
                target.setStringValue(estateexternalorderurl);
            }
        }
        
        /**
         * Sets (as xml) the "ESTATE_EXTERNAL_ORDER_URL" element
         */
        public void xsetESTATEEXTERNALORDERURL(org.apache.xmlbeans.XmlString estateexternalorderurl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTATEEXTERNALORDERURL$38, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ESTATEEXTERNALORDERURL$38);
                }
                target.set(estateexternalorderurl);
            }
        }
        
        /**
         * Unsets the "ESTATE_EXTERNAL_ORDER_URL" element
         */
        public void unsetESTATEEXTERNALORDERURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ESTATEEXTERNALORDERURL$38, 0);
            }
        }
        
        /**
         * Gets the "NO_OF_ROOMS_RANGE" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.NOOFROOMSRANGEDocument.NOOFROOMSRANGE getNOOFROOMSRANGE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.NOOFROOMSRANGEDocument.NOOFROOMSRANGE target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.NOOFROOMSRANGEDocument.NOOFROOMSRANGE)get_store().find_element_user(NOOFROOMSRANGE$40, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "NO_OF_ROOMS_RANGE" element
         */
        public boolean isSetNOOFROOMSRANGE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NOOFROOMSRANGE$40) != 0;
            }
        }
        
        /**
         * Sets the "NO_OF_ROOMS_RANGE" element
         */
        public void setNOOFROOMSRANGE(com.abctech.transition.xmladbeans.iadifestateforsale.NOOFROOMSRANGEDocument.NOOFROOMSRANGE noofroomsrange)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.NOOFROOMSRANGEDocument.NOOFROOMSRANGE target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.NOOFROOMSRANGEDocument.NOOFROOMSRANGE)get_store().find_element_user(NOOFROOMSRANGE$40, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifestateforsale.NOOFROOMSRANGEDocument.NOOFROOMSRANGE)get_store().add_element_user(NOOFROOMSRANGE$40);
                }
                target.set(noofroomsrange);
            }
        }
        
        /**
         * Appends and returns a new empty "NO_OF_ROOMS_RANGE" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.NOOFROOMSRANGEDocument.NOOFROOMSRANGE addNewNOOFROOMSRANGE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.NOOFROOMSRANGEDocument.NOOFROOMSRANGE target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.NOOFROOMSRANGEDocument.NOOFROOMSRANGE)get_store().add_element_user(NOOFROOMSRANGE$40);
                return target;
            }
        }
        
        /**
         * Unsets the "NO_OF_ROOMS_RANGE" element
         */
        public void unsetNOOFROOMSRANGE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NOOFROOMSRANGE$40, 0);
            }
        }
        
        /**
         * Gets array of all "BROKER" elements
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER[] getBROKERArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BROKER$42, targetList);
                com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER[] result = new com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "BROKER" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER getBROKERArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER)get_store().find_element_user(BROKER$42, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "BROKER" element
         */
        public int sizeOfBROKERArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BROKER$42);
            }
        }
        
        /**
         * Sets array of all "BROKER" element
         */
        public void setBROKERArray(com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER[] brokerArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(brokerArray, BROKER$42);
            }
        }
        
        /**
         * Sets ith "BROKER" element
         */
        public void setBROKERArray(int i, com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER broker)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER)get_store().find_element_user(BROKER$42, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(broker);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "BROKER" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER insertNewBROKER(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER)get_store().insert_element_user(BROKER$42, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "BROKER" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER addNewBROKER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER)get_store().add_element_user(BROKER$42);
                return target;
            }
        }
        
        /**
         * Removes the ith "BROKER" element
         */
        public void removeBROKER(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BROKER$42, i);
            }
        }
        
        /**
         * Gets the "DEPARTMENT" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument.DEPARTMENT getDEPARTMENT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument.DEPARTMENT target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument.DEPARTMENT)get_store().find_element_user(DEPARTMENT$44, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "DEPARTMENT" element
         */
        public boolean isSetDEPARTMENT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DEPARTMENT$44) != 0;
            }
        }
        
        /**
         * Sets the "DEPARTMENT" element
         */
        public void setDEPARTMENT(com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument.DEPARTMENT department)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument.DEPARTMENT target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument.DEPARTMENT)get_store().find_element_user(DEPARTMENT$44, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument.DEPARTMENT)get_store().add_element_user(DEPARTMENT$44);
                }
                target.set(department);
            }
        }
        
        /**
         * Appends and returns a new empty "DEPARTMENT" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument.DEPARTMENT addNewDEPARTMENT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument.DEPARTMENT target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument.DEPARTMENT)get_store().add_element_user(DEPARTMENT$44);
                return target;
            }
        }
        
        /**
         * Unsets the "DEPARTMENT" element
         */
        public void unsetDEPARTMENT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DEPARTMENT$44, 0);
            }
        }
        
        /**
         * Gets array of all "FINANCIAL_AGENT" elements
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.FINANCIALAGENTDocument.FINANCIALAGENT[] getFINANCIALAGENTArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FINANCIALAGENT$46, targetList);
                com.abctech.transition.xmladbeans.iadifestateforsale.FINANCIALAGENTDocument.FINANCIALAGENT[] result = new com.abctech.transition.xmladbeans.iadifestateforsale.FINANCIALAGENTDocument.FINANCIALAGENT[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "FINANCIAL_AGENT" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.FINANCIALAGENTDocument.FINANCIALAGENT getFINANCIALAGENTArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.FINANCIALAGENTDocument.FINANCIALAGENT target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.FINANCIALAGENTDocument.FINANCIALAGENT)get_store().find_element_user(FINANCIALAGENT$46, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "FINANCIAL_AGENT" element
         */
        public int sizeOfFINANCIALAGENTArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FINANCIALAGENT$46);
            }
        }
        
        /**
         * Sets array of all "FINANCIAL_AGENT" element
         */
        public void setFINANCIALAGENTArray(com.abctech.transition.xmladbeans.iadifestateforsale.FINANCIALAGENTDocument.FINANCIALAGENT[] financialagentArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(financialagentArray, FINANCIALAGENT$46);
            }
        }
        
        /**
         * Sets ith "FINANCIAL_AGENT" element
         */
        public void setFINANCIALAGENTArray(int i, com.abctech.transition.xmladbeans.iadifestateforsale.FINANCIALAGENTDocument.FINANCIALAGENT financialagent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.FINANCIALAGENTDocument.FINANCIALAGENT target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.FINANCIALAGENTDocument.FINANCIALAGENT)get_store().find_element_user(FINANCIALAGENT$46, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(financialagent);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "FINANCIAL_AGENT" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.FINANCIALAGENTDocument.FINANCIALAGENT insertNewFINANCIALAGENT(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.FINANCIALAGENTDocument.FINANCIALAGENT target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.FINANCIALAGENTDocument.FINANCIALAGENT)get_store().insert_element_user(FINANCIALAGENT$46, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "FINANCIAL_AGENT" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.FINANCIALAGENTDocument.FINANCIALAGENT addNewFINANCIALAGENT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.FINANCIALAGENTDocument.FINANCIALAGENT target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.FINANCIALAGENTDocument.FINANCIALAGENT)get_store().add_element_user(FINANCIALAGENT$46);
                return target;
            }
        }
        
        /**
         * Removes the ith "FINANCIAL_AGENT" element
         */
        public void removeFINANCIALAGENT(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FINANCIALAGENT$46, i);
            }
        }
        
        /**
         * Gets array of all "DEVELOPER" elements
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.DEVELOPERDocument.DEVELOPER[] getDEVELOPERArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DEVELOPER$48, targetList);
                com.abctech.transition.xmladbeans.iadifestateforsale.DEVELOPERDocument.DEVELOPER[] result = new com.abctech.transition.xmladbeans.iadifestateforsale.DEVELOPERDocument.DEVELOPER[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "DEVELOPER" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.DEVELOPERDocument.DEVELOPER getDEVELOPERArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.DEVELOPERDocument.DEVELOPER target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.DEVELOPERDocument.DEVELOPER)get_store().find_element_user(DEVELOPER$48, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "DEVELOPER" element
         */
        public int sizeOfDEVELOPERArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DEVELOPER$48);
            }
        }
        
        /**
         * Sets array of all "DEVELOPER" element
         */
        public void setDEVELOPERArray(com.abctech.transition.xmladbeans.iadifestateforsale.DEVELOPERDocument.DEVELOPER[] developerArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(developerArray, DEVELOPER$48);
            }
        }
        
        /**
         * Sets ith "DEVELOPER" element
         */
        public void setDEVELOPERArray(int i, com.abctech.transition.xmladbeans.iadifestateforsale.DEVELOPERDocument.DEVELOPER developer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.DEVELOPERDocument.DEVELOPER target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.DEVELOPERDocument.DEVELOPER)get_store().find_element_user(DEVELOPER$48, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(developer);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "DEVELOPER" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.DEVELOPERDocument.DEVELOPER insertNewDEVELOPER(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.DEVELOPERDocument.DEVELOPER target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.DEVELOPERDocument.DEVELOPER)get_store().insert_element_user(DEVELOPER$48, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "DEVELOPER" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.DEVELOPERDocument.DEVELOPER addNewDEVELOPER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.DEVELOPERDocument.DEVELOPER target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.DEVELOPERDocument.DEVELOPER)get_store().add_element_user(DEVELOPER$48);
                return target;
            }
        }
        
        /**
         * Removes the ith "DEVELOPER" element
         */
        public void removeDEVELOPER(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DEVELOPER$48, i);
            }
        }
    }
}
