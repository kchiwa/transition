/*
 * An XML document type.
 * Localname: ESTATE_SALE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESALEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one ESTATE_SALE(@) element.
 *
 * This is a complex type.
 */
public class ESTATESALEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESALEDocument
{
    private static final long serialVersionUID = 1L;
    
    public ESTATESALEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ESTATESALE$0 = 
        new javax.xml.namespace.QName("", "ESTATE_SALE");
    
    
    /**
     * Gets the "ESTATE_SALE" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESALEDocument.ESTATESALE getESTATESALE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESALEDocument.ESTATESALE target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESALEDocument.ESTATESALE)get_store().find_element_user(ESTATESALE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ESTATE_SALE" element
     */
    public void setESTATESALE(com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESALEDocument.ESTATESALE estatesale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESALEDocument.ESTATESALE target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESALEDocument.ESTATESALE)get_store().find_element_user(ESTATESALE$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESALEDocument.ESTATESALE)get_store().add_element_user(ESTATESALE$0);
            }
            target.set(estatesale);
        }
    }
    
    /**
     * Appends and returns a new empty "ESTATE_SALE" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESALEDocument.ESTATESALE addNewESTATESALE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESALEDocument.ESTATESALE target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESALEDocument.ESTATESALE)get_store().add_element_user(ESTATESALE$0);
            return target;
        }
    }
    /**
     * An XML ESTATE_SALE(@).
     *
     * This is a complex type.
     */
    public static class ESTATESALEImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESALEDocument.ESTATESALE
    {
        private static final long serialVersionUID = 1L;
        
        public ESTATESALEImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ESTATEPREFERENCE$0 = 
            new javax.xml.namespace.QName("", "ESTATE_PREFERENCE");
        private static final javax.xml.namespace.QName FACILITIES$2 = 
            new javax.xml.namespace.QName("", "FACILITIES");
        private static final javax.xml.namespace.QName MAPMATRIX$4 = 
            new javax.xml.namespace.QName("", "MAPMATRIX");
        private static final javax.xml.namespace.QName BOLIGNUMMER$6 = 
            new javax.xml.namespace.QName("", "BOLIGNUMMER");
        private static final javax.xml.namespace.QName VIEWING$8 = 
            new javax.xml.namespace.QName("", "VIEWING");
        private static final javax.xml.namespace.QName PROPERTYTYPE$10 = 
            new javax.xml.namespace.QName("", "PROPERTY_TYPE");
        private static final javax.xml.namespace.QName NOOFBEDROOMS$12 = 
            new javax.xml.namespace.QName("", "NO_OF_BEDROOMS");
        private static final javax.xml.namespace.QName NOOFROOMS$14 = 
            new javax.xml.namespace.QName("", "NO_OF_ROOMS");
        private static final javax.xml.namespace.QName ESTATESIZE$16 = 
            new javax.xml.namespace.QName("", "ESTATE_SIZE");
        private static final javax.xml.namespace.QName FLOOR$18 = 
            new javax.xml.namespace.QName("", "FLOOR");
        private static final javax.xml.namespace.QName NOOFFLOORS$20 = 
            new javax.xml.namespace.QName("", "NO_OF_FLOORS");
        private static final javax.xml.namespace.QName PLOT$22 = 
            new javax.xml.namespace.QName("", "PLOT");
        private static final javax.xml.namespace.QName OWNERSHIPTYPE$24 = 
            new javax.xml.namespace.QName("", "OWNERSHIP_TYPE");
        private static final javax.xml.namespace.QName PARTOWNERSHIP$26 = 
            new javax.xml.namespace.QName("", "PART_OWNERSHIP");
        private static final javax.xml.namespace.QName ESTATEPRICE$28 = 
            new javax.xml.namespace.QName("", "ESTATE_PRICE");
        private static final javax.xml.namespace.QName RENT$30 = 
            new javax.xml.namespace.QName("", "RENT");
        private static final javax.xml.namespace.QName CONSTRUCTIONYEAR$32 = 
            new javax.xml.namespace.QName("", "CONSTRUCTION_YEAR");
        private static final javax.xml.namespace.QName RENOVATEDYEAR$34 = 
            new javax.xml.namespace.QName("", "RENOVATED_YEAR");
        private static final javax.xml.namespace.QName GENERALTEXTREALESTATE$36 = 
            new javax.xml.namespace.QName("", "GENERAL_TEXT_REALESTATE");
        private static final javax.xml.namespace.QName MOREINFO$38 = 
            new javax.xml.namespace.QName("", "MOREINFO");
        private static final javax.xml.namespace.QName ESTATEEXTERNALURL$40 = 
            new javax.xml.namespace.QName("", "ESTATE_EXTERNAL_URL");
        private static final javax.xml.namespace.QName ACQUISITION$42 = 
            new javax.xml.namespace.QName("", "ACQUISITION");
        private static final javax.xml.namespace.QName FINANCE$44 = 
            new javax.xml.namespace.QName("", "FINANCE");
        private static final javax.xml.namespace.QName REGULATIONS$46 = 
            new javax.xml.namespace.QName("", "REGULATIONS");
        private static final javax.xml.namespace.QName CHANGEOFOWNERSHIPINSURANCE$48 = 
            new javax.xml.namespace.QName("", "CHANGE_OF_OWNERSHIP_INSURANCE");
        private static final javax.xml.namespace.QName PREEMPTION$50 = 
            new javax.xml.namespace.QName("", "PREEMPTION");
        private static final javax.xml.namespace.QName LETTINGUNIT$52 = 
            new javax.xml.namespace.QName("", "LETTING_UNIT");
        private static final javax.xml.namespace.QName ENERGYLABEL$54 = 
            new javax.xml.namespace.QName("", "ENERGY_LABEL");
        private static final javax.xml.namespace.QName ENERGYLABELCOLORCODE$56 = 
            new javax.xml.namespace.QName("", "ENERGY_LABEL_COLOR_CODE");
        private static final javax.xml.namespace.QName BROKER$58 = 
            new javax.xml.namespace.QName("", "BROKER");
        private static final javax.xml.namespace.QName DEPARTMENT$60 = 
            new javax.xml.namespace.QName("", "DEPARTMENT");
        
        
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
         * Gets array of all "FACILITIES" elements
         */
        public java.lang.String[] getFACILITIESArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FACILITIES$2, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "FACILITIES" element
         */
        public java.lang.String getFACILITIESArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FACILITIES$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "FACILITIES" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetFACILITIESArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FACILITIES$2, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "FACILITIES" element
         */
        public org.apache.xmlbeans.XmlString xgetFACILITIESArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FACILITIES$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "FACILITIES" element
         */
        public int sizeOfFACILITIESArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FACILITIES$2);
            }
        }
        
        /**
         * Sets array of all "FACILITIES" element
         */
        public void setFACILITIESArray(java.lang.String[] facilitiesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(facilitiesArray, FACILITIES$2);
            }
        }
        
        /**
         * Sets ith "FACILITIES" element
         */
        public void setFACILITIESArray(int i, java.lang.String facilities)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FACILITIES$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(facilities);
            }
        }
        
        /**
         * Sets (as xml) array of all "FACILITIES" element
         */
        public void xsetFACILITIESArray(org.apache.xmlbeans.XmlString[]facilitiesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(facilitiesArray, FACILITIES$2);
            }
        }
        
        /**
         * Sets (as xml) ith "FACILITIES" element
         */
        public void xsetFACILITIESArray(int i, org.apache.xmlbeans.XmlString facilities)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FACILITIES$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(facilities);
            }
        }
        
        /**
         * Inserts the value as the ith "FACILITIES" element
         */
        public void insertFACILITIES(int i, java.lang.String facilities)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(FACILITIES$2, i);
                target.setStringValue(facilities);
            }
        }
        
        /**
         * Appends the value as the last "FACILITIES" element
         */
        public void addFACILITIES(java.lang.String facilities)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FACILITIES$2);
                target.setStringValue(facilities);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "FACILITIES" element
         */
        public org.apache.xmlbeans.XmlString insertNewFACILITIES(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(FACILITIES$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "FACILITIES" element
         */
        public org.apache.xmlbeans.XmlString addNewFACILITIES()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FACILITIES$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "FACILITIES" element
         */
        public void removeFACILITIES(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FACILITIES$2, i);
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
                get_store().find_all_element_users(MAPMATRIX$4, targetList);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument.MAPMATRIX)get_store().find_element_user(MAPMATRIX$4, i);
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
                return get_store().count_elements(MAPMATRIX$4);
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
                arraySetterHelper(mapmatrixArray, MAPMATRIX$4);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument.MAPMATRIX)get_store().find_element_user(MAPMATRIX$4, i);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument.MAPMATRIX)get_store().insert_element_user(MAPMATRIX$4, i);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.MAPMATRIXDocument.MAPMATRIX)get_store().add_element_user(MAPMATRIX$4);
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
                get_store().remove_element(MAPMATRIX$4, i);
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
                get_store().find_all_element_users(BOLIGNUMMER$6, targetList);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOLIGNUMMER$6, i);
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
                get_store().find_all_element_users(BOLIGNUMMER$6, targetList);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOLIGNUMMER$6, i);
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
                return get_store().count_elements(BOLIGNUMMER$6);
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
                arraySetterHelper(bolignummerArray, BOLIGNUMMER$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOLIGNUMMER$6, i);
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
                arraySetterHelper(bolignummerArray, BOLIGNUMMER$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOLIGNUMMER$6, i);
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
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(BOLIGNUMMER$6, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOLIGNUMMER$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(BOLIGNUMMER$6, i);
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
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BOLIGNUMMER$6);
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
                get_store().remove_element(BOLIGNUMMER$6, i);
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
                get_store().find_all_element_users(VIEWING$8, targetList);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING)get_store().find_element_user(VIEWING$8, i);
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
                return get_store().count_elements(VIEWING$8);
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
                arraySetterHelper(viewingArray, VIEWING$8);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING)get_store().find_element_user(VIEWING$8, i);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING)get_store().insert_element_user(VIEWING$8, i);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING)get_store().add_element_user(VIEWING$8);
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
                get_store().remove_element(VIEWING$8, i);
            }
        }
        
        /**
         * Gets the "PROPERTY_TYPE" element
         */
        public java.lang.String getPROPERTYTYPE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYTYPE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PROPERTY_TYPE" element
         */
        public org.apache.xmlbeans.XmlString xgetPROPERTYTYPE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYTYPE$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PROPERTY_TYPE" element
         */
        public void setPROPERTYTYPE(java.lang.String propertytype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYTYPE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTYTYPE$10);
                }
                target.setStringValue(propertytype);
            }
        }
        
        /**
         * Sets (as xml) the "PROPERTY_TYPE" element
         */
        public void xsetPROPERTYTYPE(org.apache.xmlbeans.XmlString propertytype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYTYPE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTYTYPE$10);
                }
                target.set(propertytype);
            }
        }
        
        /**
         * Gets the "NO_OF_BEDROOMS" element
         */
        public java.lang.String getNOOFBEDROOMS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOOFBEDROOMS$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "NO_OF_BEDROOMS" element
         */
        public org.apache.xmlbeans.XmlString xgetNOOFBEDROOMS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOOFBEDROOMS$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "NO_OF_BEDROOMS" element
         */
        public void setNOOFBEDROOMS(java.lang.String noofbedrooms)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOOFBEDROOMS$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOOFBEDROOMS$12);
                }
                target.setStringValue(noofbedrooms);
            }
        }
        
        /**
         * Sets (as xml) the "NO_OF_BEDROOMS" element
         */
        public void xsetNOOFBEDROOMS(org.apache.xmlbeans.XmlString noofbedrooms)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOOFBEDROOMS$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOOFBEDROOMS$12);
                }
                target.set(noofbedrooms);
            }
        }
        
        /**
         * Gets the "NO_OF_ROOMS" element
         */
        public java.lang.String getNOOFROOMS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOOFROOMS$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "NO_OF_ROOMS" element
         */
        public org.apache.xmlbeans.XmlString xgetNOOFROOMS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOOFROOMS$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "NO_OF_ROOMS" element
         */
        public boolean isSetNOOFROOMS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NOOFROOMS$14) != 0;
            }
        }
        
        /**
         * Sets the "NO_OF_ROOMS" element
         */
        public void setNOOFROOMS(java.lang.String noofrooms)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOOFROOMS$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOOFROOMS$14);
                }
                target.setStringValue(noofrooms);
            }
        }
        
        /**
         * Sets (as xml) the "NO_OF_ROOMS" element
         */
        public void xsetNOOFROOMS(org.apache.xmlbeans.XmlString noofrooms)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOOFROOMS$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOOFROOMS$14);
                }
                target.set(noofrooms);
            }
        }
        
        /**
         * Unsets the "NO_OF_ROOMS" element
         */
        public void unsetNOOFROOMS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NOOFROOMS$14, 0);
            }
        }
        
        /**
         * Gets the "ESTATE_SIZE" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESIZEDocument.ESTATESIZE getESTATESIZE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESIZEDocument.ESTATESIZE target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESIZEDocument.ESTATESIZE)get_store().find_element_user(ESTATESIZE$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ESTATE_SIZE" element
         */
        public void setESTATESIZE(com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESIZEDocument.ESTATESIZE estatesize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESIZEDocument.ESTATESIZE target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESIZEDocument.ESTATESIZE)get_store().find_element_user(ESTATESIZE$16, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESIZEDocument.ESTATESIZE)get_store().add_element_user(ESTATESIZE$16);
                }
                target.set(estatesize);
            }
        }
        
        /**
         * Appends and returns a new empty "ESTATE_SIZE" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESIZEDocument.ESTATESIZE addNewESTATESIZE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESIZEDocument.ESTATESIZE target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATESIZEDocument.ESTATESIZE)get_store().add_element_user(ESTATESIZE$16);
                return target;
            }
        }
        
        /**
         * Gets the "FLOOR" element
         */
        public java.lang.String getFLOOR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLOOR$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FLOOR" element
         */
        public org.apache.xmlbeans.XmlString xgetFLOOR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FLOOR$18, 0);
                return target;
            }
        }
        
        /**
         * True if has "FLOOR" element
         */
        public boolean isSetFLOOR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FLOOR$18) != 0;
            }
        }
        
        /**
         * Sets the "FLOOR" element
         */
        public void setFLOOR(java.lang.String floor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLOOR$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FLOOR$18);
                }
                target.setStringValue(floor);
            }
        }
        
        /**
         * Sets (as xml) the "FLOOR" element
         */
        public void xsetFLOOR(org.apache.xmlbeans.XmlString floor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FLOOR$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FLOOR$18);
                }
                target.set(floor);
            }
        }
        
        /**
         * Unsets the "FLOOR" element
         */
        public void unsetFLOOR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FLOOR$18, 0);
            }
        }
        
        /**
         * Gets the "NO_OF_FLOORS" element
         */
        public java.lang.String getNOOFFLOORS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOOFFLOORS$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "NO_OF_FLOORS" element
         */
        public org.apache.xmlbeans.XmlString xgetNOOFFLOORS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOOFFLOORS$20, 0);
                return target;
            }
        }
        
        /**
         * True if has "NO_OF_FLOORS" element
         */
        public boolean isSetNOOFFLOORS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NOOFFLOORS$20) != 0;
            }
        }
        
        /**
         * Sets the "NO_OF_FLOORS" element
         */
        public void setNOOFFLOORS(java.lang.String nooffloors)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOOFFLOORS$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOOFFLOORS$20);
                }
                target.setStringValue(nooffloors);
            }
        }
        
        /**
         * Sets (as xml) the "NO_OF_FLOORS" element
         */
        public void xsetNOOFFLOORS(org.apache.xmlbeans.XmlString nooffloors)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOOFFLOORS$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOOFFLOORS$20);
                }
                target.set(nooffloors);
            }
        }
        
        /**
         * Unsets the "NO_OF_FLOORS" element
         */
        public void unsetNOOFFLOORS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NOOFFLOORS$20, 0);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT)get_store().find_element_user(PLOT$22, 0);
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
                return get_store().count_elements(PLOT$22) != 0;
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT)get_store().find_element_user(PLOT$22, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT)get_store().add_element_user(PLOT$22);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT)get_store().add_element_user(PLOT$22);
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
                get_store().remove_element(PLOT$22, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNERSHIPTYPE$24, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OWNERSHIPTYPE$24, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNERSHIPTYPE$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OWNERSHIPTYPE$24);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OWNERSHIPTYPE$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OWNERSHIPTYPE$24);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument.PARTOWNERSHIP)get_store().find_element_user(PARTOWNERSHIP$26, 0);
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
                return get_store().count_elements(PARTOWNERSHIP$26) != 0;
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument.PARTOWNERSHIP)get_store().find_element_user(PARTOWNERSHIP$26, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument.PARTOWNERSHIP)get_store().add_element_user(PARTOWNERSHIP$26);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.PARTOWNERSHIPDocument.PARTOWNERSHIP)get_store().add_element_user(PARTOWNERSHIP$26);
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
                get_store().remove_element(PARTOWNERSHIP$26, 0);
            }
        }
        
        /**
         * Gets the "ESTATE_PRICE" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument.ESTATEPRICE getESTATEPRICE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument.ESTATEPRICE target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument.ESTATEPRICE)get_store().find_element_user(ESTATEPRICE$28, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ESTATE_PRICE" element
         */
        public boolean isSetESTATEPRICE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ESTATEPRICE$28) != 0;
            }
        }
        
        /**
         * Sets the "ESTATE_PRICE" element
         */
        public void setESTATEPRICE(com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument.ESTATEPRICE estateprice)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument.ESTATEPRICE target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument.ESTATEPRICE)get_store().find_element_user(ESTATEPRICE$28, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument.ESTATEPRICE)get_store().add_element_user(ESTATEPRICE$28);
                }
                target.set(estateprice);
            }
        }
        
        /**
         * Appends and returns a new empty "ESTATE_PRICE" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument.ESTATEPRICE addNewESTATEPRICE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument.ESTATEPRICE target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument.ESTATEPRICE)get_store().add_element_user(ESTATEPRICE$28);
                return target;
            }
        }
        
        /**
         * Unsets the "ESTATE_PRICE" element
         */
        public void unsetESTATEPRICE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ESTATEPRICE$28, 0);
            }
        }
        
        /**
         * Gets the "RENT" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.RENTDocument.RENT getRENT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.RENTDocument.RENT target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.RENTDocument.RENT)get_store().find_element_user(RENT$30, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "RENT" element
         */
        public boolean isSetRENT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RENT$30) != 0;
            }
        }
        
        /**
         * Sets the "RENT" element
         */
        public void setRENT(com.abctech.transition.xmladbeans.iadifestateforsale.RENTDocument.RENT rent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.RENTDocument.RENT target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.RENTDocument.RENT)get_store().find_element_user(RENT$30, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifestateforsale.RENTDocument.RENT)get_store().add_element_user(RENT$30);
                }
                target.set(rent);
            }
        }
        
        /**
         * Appends and returns a new empty "RENT" element
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.RENTDocument.RENT addNewRENT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.RENTDocument.RENT target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.RENTDocument.RENT)get_store().add_element_user(RENT$30);
                return target;
            }
        }
        
        /**
         * Unsets the "RENT" element
         */
        public void unsetRENT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RENT$30, 0);
            }
        }
        
        /**
         * Gets the "CONSTRUCTION_YEAR" element
         */
        public java.lang.String getCONSTRUCTIONYEAR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONSTRUCTIONYEAR$32, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CONSTRUCTION_YEAR" element
         */
        public org.apache.xmlbeans.XmlString xgetCONSTRUCTIONYEAR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONSTRUCTIONYEAR$32, 0);
                return target;
            }
        }
        
        /**
         * True if has "CONSTRUCTION_YEAR" element
         */
        public boolean isSetCONSTRUCTIONYEAR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONSTRUCTIONYEAR$32) != 0;
            }
        }
        
        /**
         * Sets the "CONSTRUCTION_YEAR" element
         */
        public void setCONSTRUCTIONYEAR(java.lang.String constructionyear)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONSTRUCTIONYEAR$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONSTRUCTIONYEAR$32);
                }
                target.setStringValue(constructionyear);
            }
        }
        
        /**
         * Sets (as xml) the "CONSTRUCTION_YEAR" element
         */
        public void xsetCONSTRUCTIONYEAR(org.apache.xmlbeans.XmlString constructionyear)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONSTRUCTIONYEAR$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONSTRUCTIONYEAR$32);
                }
                target.set(constructionyear);
            }
        }
        
        /**
         * Unsets the "CONSTRUCTION_YEAR" element
         */
        public void unsetCONSTRUCTIONYEAR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONSTRUCTIONYEAR$32, 0);
            }
        }
        
        /**
         * Gets the "RENOVATED_YEAR" element
         */
        public java.lang.String getRENOVATEDYEAR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENOVATEDYEAR$34, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "RENOVATED_YEAR" element
         */
        public org.apache.xmlbeans.XmlString xgetRENOVATEDYEAR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RENOVATEDYEAR$34, 0);
                return target;
            }
        }
        
        /**
         * True if has "RENOVATED_YEAR" element
         */
        public boolean isSetRENOVATEDYEAR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RENOVATEDYEAR$34) != 0;
            }
        }
        
        /**
         * Sets the "RENOVATED_YEAR" element
         */
        public void setRENOVATEDYEAR(java.lang.String renovatedyear)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENOVATEDYEAR$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RENOVATEDYEAR$34);
                }
                target.setStringValue(renovatedyear);
            }
        }
        
        /**
         * Sets (as xml) the "RENOVATED_YEAR" element
         */
        public void xsetRENOVATEDYEAR(org.apache.xmlbeans.XmlString renovatedyear)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RENOVATEDYEAR$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RENOVATEDYEAR$34);
                }
                target.set(renovatedyear);
            }
        }
        
        /**
         * Unsets the "RENOVATED_YEAR" element
         */
        public void unsetRENOVATEDYEAR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RENOVATEDYEAR$34, 0);
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
                get_store().find_all_element_users(GENERALTEXTREALESTATE$36, targetList);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE)get_store().find_element_user(GENERALTEXTREALESTATE$36, i);
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
                return get_store().count_elements(GENERALTEXTREALESTATE$36);
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
                arraySetterHelper(generaltextrealestateArray, GENERALTEXTREALESTATE$36);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE)get_store().find_element_user(GENERALTEXTREALESTATE$36, i);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE)get_store().insert_element_user(GENERALTEXTREALESTATE$36, i);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE)get_store().add_element_user(GENERALTEXTREALESTATE$36);
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
                get_store().remove_element(GENERALTEXTREALESTATE$36, i);
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
                get_store().find_all_element_users(MOREINFO$38, targetList);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.MOREINFODocument.MOREINFO)get_store().find_element_user(MOREINFO$38, i);
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
                return get_store().count_elements(MOREINFO$38);
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
                arraySetterHelper(moreinfoArray, MOREINFO$38);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.MOREINFODocument.MOREINFO)get_store().find_element_user(MOREINFO$38, i);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.MOREINFODocument.MOREINFO)get_store().insert_element_user(MOREINFO$38, i);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.MOREINFODocument.MOREINFO)get_store().add_element_user(MOREINFO$38);
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
                get_store().remove_element(MOREINFO$38, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTATEEXTERNALURL$40, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTATEEXTERNALURL$40, 0);
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
                return get_store().count_elements(ESTATEEXTERNALURL$40) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTATEEXTERNALURL$40, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESTATEEXTERNALURL$40);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTATEEXTERNALURL$40, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ESTATEEXTERNALURL$40);
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
                get_store().remove_element(ESTATEEXTERNALURL$40, 0);
            }
        }
        
        /**
         * Gets the "ACQUISITION" element
         */
        public java.lang.String getACQUISITION()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACQUISITION$42, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ACQUISITION" element
         */
        public org.apache.xmlbeans.XmlString xgetACQUISITION()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACQUISITION$42, 0);
                return target;
            }
        }
        
        /**
         * True if has "ACQUISITION" element
         */
        public boolean isSetACQUISITION()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ACQUISITION$42) != 0;
            }
        }
        
        /**
         * Sets the "ACQUISITION" element
         */
        public void setACQUISITION(java.lang.String acquisition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACQUISITION$42, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACQUISITION$42);
                }
                target.setStringValue(acquisition);
            }
        }
        
        /**
         * Sets (as xml) the "ACQUISITION" element
         */
        public void xsetACQUISITION(org.apache.xmlbeans.XmlString acquisition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACQUISITION$42, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACQUISITION$42);
                }
                target.set(acquisition);
            }
        }
        
        /**
         * Unsets the "ACQUISITION" element
         */
        public void unsetACQUISITION()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ACQUISITION$42, 0);
            }
        }
        
        /**
         * Gets the "FINANCE" element
         */
        public java.lang.String getFINANCE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FINANCE$44, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FINANCE" element
         */
        public org.apache.xmlbeans.XmlString xgetFINANCE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FINANCE$44, 0);
                return target;
            }
        }
        
        /**
         * True if has "FINANCE" element
         */
        public boolean isSetFINANCE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FINANCE$44) != 0;
            }
        }
        
        /**
         * Sets the "FINANCE" element
         */
        public void setFINANCE(java.lang.String finance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FINANCE$44, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FINANCE$44);
                }
                target.setStringValue(finance);
            }
        }
        
        /**
         * Sets (as xml) the "FINANCE" element
         */
        public void xsetFINANCE(org.apache.xmlbeans.XmlString finance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FINANCE$44, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FINANCE$44);
                }
                target.set(finance);
            }
        }
        
        /**
         * Unsets the "FINANCE" element
         */
        public void unsetFINANCE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FINANCE$44, 0);
            }
        }
        
        /**
         * Gets the "REGULATIONS" element
         */
        public java.lang.String getREGULATIONS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGULATIONS$46, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "REGULATIONS" element
         */
        public org.apache.xmlbeans.XmlString xgetREGULATIONS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGULATIONS$46, 0);
                return target;
            }
        }
        
        /**
         * True if has "REGULATIONS" element
         */
        public boolean isSetREGULATIONS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REGULATIONS$46) != 0;
            }
        }
        
        /**
         * Sets the "REGULATIONS" element
         */
        public void setREGULATIONS(java.lang.String regulations)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGULATIONS$46, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGULATIONS$46);
                }
                target.setStringValue(regulations);
            }
        }
        
        /**
         * Sets (as xml) the "REGULATIONS" element
         */
        public void xsetREGULATIONS(org.apache.xmlbeans.XmlString regulations)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGULATIONS$46, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REGULATIONS$46);
                }
                target.set(regulations);
            }
        }
        
        /**
         * Unsets the "REGULATIONS" element
         */
        public void unsetREGULATIONS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REGULATIONS$46, 0);
            }
        }
        
        /**
         * Gets the "CHANGE_OF_OWNERSHIP_INSURANCE" element
         */
        public java.lang.String getCHANGEOFOWNERSHIPINSURANCE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEOFOWNERSHIPINSURANCE$48, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CHANGE_OF_OWNERSHIP_INSURANCE" element
         */
        public org.apache.xmlbeans.XmlString xgetCHANGEOFOWNERSHIPINSURANCE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANGEOFOWNERSHIPINSURANCE$48, 0);
                return target;
            }
        }
        
        /**
         * True if has "CHANGE_OF_OWNERSHIP_INSURANCE" element
         */
        public boolean isSetCHANGEOFOWNERSHIPINSURANCE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CHANGEOFOWNERSHIPINSURANCE$48) != 0;
            }
        }
        
        /**
         * Sets the "CHANGE_OF_OWNERSHIP_INSURANCE" element
         */
        public void setCHANGEOFOWNERSHIPINSURANCE(java.lang.String changeofownershipinsurance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEOFOWNERSHIPINSURANCE$48, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHANGEOFOWNERSHIPINSURANCE$48);
                }
                target.setStringValue(changeofownershipinsurance);
            }
        }
        
        /**
         * Sets (as xml) the "CHANGE_OF_OWNERSHIP_INSURANCE" element
         */
        public void xsetCHANGEOFOWNERSHIPINSURANCE(org.apache.xmlbeans.XmlString changeofownershipinsurance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANGEOFOWNERSHIPINSURANCE$48, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHANGEOFOWNERSHIPINSURANCE$48);
                }
                target.set(changeofownershipinsurance);
            }
        }
        
        /**
         * Unsets the "CHANGE_OF_OWNERSHIP_INSURANCE" element
         */
        public void unsetCHANGEOFOWNERSHIPINSURANCE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CHANGEOFOWNERSHIPINSURANCE$48, 0);
            }
        }
        
        /**
         * Gets the "PREEMPTION" element
         */
        public java.lang.String getPREEMPTION()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREEMPTION$50, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PREEMPTION" element
         */
        public org.apache.xmlbeans.XmlString xgetPREEMPTION()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREEMPTION$50, 0);
                return target;
            }
        }
        
        /**
         * True if has "PREEMPTION" element
         */
        public boolean isSetPREEMPTION()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PREEMPTION$50) != 0;
            }
        }
        
        /**
         * Sets the "PREEMPTION" element
         */
        public void setPREEMPTION(java.lang.String preemption)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREEMPTION$50, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREEMPTION$50);
                }
                target.setStringValue(preemption);
            }
        }
        
        /**
         * Sets (as xml) the "PREEMPTION" element
         */
        public void xsetPREEMPTION(org.apache.xmlbeans.XmlString preemption)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREEMPTION$50, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PREEMPTION$50);
                }
                target.set(preemption);
            }
        }
        
        /**
         * Unsets the "PREEMPTION" element
         */
        public void unsetPREEMPTION()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PREEMPTION$50, 0);
            }
        }
        
        /**
         * Gets the "LETTING_UNIT" element
         */
        public java.lang.String getLETTINGUNIT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LETTINGUNIT$52, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "LETTING_UNIT" element
         */
        public org.apache.xmlbeans.XmlString xgetLETTINGUNIT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LETTINGUNIT$52, 0);
                return target;
            }
        }
        
        /**
         * True if has "LETTING_UNIT" element
         */
        public boolean isSetLETTINGUNIT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LETTINGUNIT$52) != 0;
            }
        }
        
        /**
         * Sets the "LETTING_UNIT" element
         */
        public void setLETTINGUNIT(java.lang.String lettingunit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LETTINGUNIT$52, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LETTINGUNIT$52);
                }
                target.setStringValue(lettingunit);
            }
        }
        
        /**
         * Sets (as xml) the "LETTING_UNIT" element
         */
        public void xsetLETTINGUNIT(org.apache.xmlbeans.XmlString lettingunit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LETTINGUNIT$52, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LETTINGUNIT$52);
                }
                target.set(lettingunit);
            }
        }
        
        /**
         * Unsets the "LETTING_UNIT" element
         */
        public void unsetLETTINGUNIT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LETTINGUNIT$52, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENERGYLABEL$54, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENERGYLABEL$54, 0);
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
                return get_store().count_elements(ENERGYLABEL$54) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENERGYLABEL$54, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENERGYLABEL$54);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENERGYLABEL$54, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENERGYLABEL$54);
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
                get_store().remove_element(ENERGYLABEL$54, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENERGYLABELCOLORCODE$56, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENERGYLABELCOLORCODE$56, 0);
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
                return get_store().count_elements(ENERGYLABELCOLORCODE$56) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENERGYLABELCOLORCODE$56, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENERGYLABELCOLORCODE$56);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENERGYLABELCOLORCODE$56, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENERGYLABELCOLORCODE$56);
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
                get_store().remove_element(ENERGYLABELCOLORCODE$56, 0);
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
                get_store().find_all_element_users(BROKER$58, targetList);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER)get_store().find_element_user(BROKER$58, i);
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
                return get_store().count_elements(BROKER$58);
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
                arraySetterHelper(brokerArray, BROKER$58);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER)get_store().find_element_user(BROKER$58, i);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER)get_store().insert_element_user(BROKER$58, i);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER)get_store().add_element_user(BROKER$58);
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
                get_store().remove_element(BROKER$58, i);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument.DEPARTMENT)get_store().find_element_user(DEPARTMENT$60, 0);
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
                return get_store().count_elements(DEPARTMENT$60) != 0;
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument.DEPARTMENT)get_store().find_element_user(DEPARTMENT$60, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument.DEPARTMENT)get_store().add_element_user(DEPARTMENT$60);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument.DEPARTMENT)get_store().add_element_user(DEPARTMENT$60);
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
                get_store().remove_element(DEPARTMENT$60, 0);
            }
        }
    }
}
