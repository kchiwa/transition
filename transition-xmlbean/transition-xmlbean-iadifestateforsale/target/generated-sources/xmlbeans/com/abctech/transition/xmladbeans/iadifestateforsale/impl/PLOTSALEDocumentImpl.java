/*
 * An XML document type.
 * Localname: PLOT_SALE
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.PLOTSALEDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one PLOT_SALE(@) element.
 *
 * This is a complex type.
 */
public class PLOTSALEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.PLOTSALEDocument
{
    private static final long serialVersionUID = 1L;
    
    public PLOTSALEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PLOTSALE$0 = 
        new javax.xml.namespace.QName("", "PLOT_SALE");
    
    
    /**
     * Gets the "PLOT_SALE" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.PLOTSALEDocument.PLOTSALE getPLOTSALE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.PLOTSALEDocument.PLOTSALE target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTSALEDocument.PLOTSALE)get_store().find_element_user(PLOTSALE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PLOT_SALE" element
     */
    public void setPLOTSALE(com.abctech.transition.xmladbeans.iadifestateforsale.PLOTSALEDocument.PLOTSALE plotsale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.PLOTSALEDocument.PLOTSALE target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTSALEDocument.PLOTSALE)get_store().find_element_user(PLOTSALE$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTSALEDocument.PLOTSALE)get_store().add_element_user(PLOTSALE$0);
            }
            target.set(plotsale);
        }
    }
    
    /**
     * Appends and returns a new empty "PLOT_SALE" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.PLOTSALEDocument.PLOTSALE addNewPLOTSALE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.PLOTSALEDocument.PLOTSALE target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTSALEDocument.PLOTSALE)get_store().add_element_user(PLOTSALE$0);
            return target;
        }
    }
    /**
     * An XML PLOT_SALE(@).
     *
     * This is a complex type.
     */
    public static class PLOTSALEImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.PLOTSALEDocument.PLOTSALE
    {
        private static final long serialVersionUID = 1L;
        
        public PLOTSALEImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ESTATEPREFERENCE$0 = 
            new javax.xml.namespace.QName("", "ESTATE_PREFERENCE");
        private static final javax.xml.namespace.QName MAPMATRIX$2 = 
            new javax.xml.namespace.QName("", "MAPMATRIX");
        private static final javax.xml.namespace.QName VIEWING$4 = 
            new javax.xml.namespace.QName("", "VIEWING");
        private static final javax.xml.namespace.QName PROPERTYTYPE$6 = 
            new javax.xml.namespace.QName("", "PROPERTY_TYPE");
        private static final javax.xml.namespace.QName ESTATEPRICE$8 = 
            new javax.xml.namespace.QName("", "ESTATE_PRICE");
        private static final javax.xml.namespace.QName PLOT$10 = 
            new javax.xml.namespace.QName("", "PLOT");
        private static final javax.xml.namespace.QName GENERALTEXTREALESTATE$12 = 
            new javax.xml.namespace.QName("", "GENERAL_TEXT_REALESTATE");
        private static final javax.xml.namespace.QName MOREINFO$14 = 
            new javax.xml.namespace.QName("", "MOREINFO");
        private static final javax.xml.namespace.QName ESTATEEXTERNALURL$16 = 
            new javax.xml.namespace.QName("", "ESTATE_EXTERNAL_URL");
        private static final javax.xml.namespace.QName REGULATIONS$18 = 
            new javax.xml.namespace.QName("", "REGULATIONS");
        private static final javax.xml.namespace.QName BROKER$20 = 
            new javax.xml.namespace.QName("", "BROKER");
        private static final javax.xml.namespace.QName DEPARTMENT$22 = 
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
         * Gets array of all "VIEWING" elements
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING[] getVIEWINGArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VIEWING$4, targetList);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING)get_store().find_element_user(VIEWING$4, i);
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
                return get_store().count_elements(VIEWING$4);
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
                arraySetterHelper(viewingArray, VIEWING$4);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING)get_store().find_element_user(VIEWING$4, i);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING)get_store().insert_element_user(VIEWING$4, i);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.VIEWINGDocument.VIEWING)get_store().add_element_user(VIEWING$4);
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
                get_store().remove_element(VIEWING$4, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYTYPE$6, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYTYPE$6, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYTYPE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTYTYPE$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYTYPE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTYTYPE$6);
                }
                target.set(propertytype);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument.ESTATEPRICE)get_store().find_element_user(ESTATEPRICE$8, 0);
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
                return get_store().count_elements(ESTATEPRICE$8) != 0;
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument.ESTATEPRICE)get_store().find_element_user(ESTATEPRICE$8, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument.ESTATEPRICE)get_store().add_element_user(ESTATEPRICE$8);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.ESTATEPRICEDocument.ESTATEPRICE)get_store().add_element_user(ESTATEPRICE$8);
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
                get_store().remove_element(ESTATEPRICE$8, 0);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT)get_store().find_element_user(PLOT$10, 0);
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
                return get_store().count_elements(PLOT$10) != 0;
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT)get_store().find_element_user(PLOT$10, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT)get_store().add_element_user(PLOT$10);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.PLOTDocument.PLOT)get_store().add_element_user(PLOT$10);
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
                get_store().remove_element(PLOT$10, 0);
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
                get_store().find_all_element_users(GENERALTEXTREALESTATE$12, targetList);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE)get_store().find_element_user(GENERALTEXTREALESTATE$12, i);
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
                return get_store().count_elements(GENERALTEXTREALESTATE$12);
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
                arraySetterHelper(generaltextrealestateArray, GENERALTEXTREALESTATE$12);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE)get_store().find_element_user(GENERALTEXTREALESTATE$12, i);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE)get_store().insert_element_user(GENERALTEXTREALESTATE$12, i);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.GENERALTEXTREALESTATEDocument.GENERALTEXTREALESTATE)get_store().add_element_user(GENERALTEXTREALESTATE$12);
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
                get_store().remove_element(GENERALTEXTREALESTATE$12, i);
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
                get_store().find_all_element_users(MOREINFO$14, targetList);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.MOREINFODocument.MOREINFO)get_store().find_element_user(MOREINFO$14, i);
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
                return get_store().count_elements(MOREINFO$14);
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
                arraySetterHelper(moreinfoArray, MOREINFO$14);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.MOREINFODocument.MOREINFO)get_store().find_element_user(MOREINFO$14, i);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.MOREINFODocument.MOREINFO)get_store().insert_element_user(MOREINFO$14, i);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.MOREINFODocument.MOREINFO)get_store().add_element_user(MOREINFO$14);
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
                get_store().remove_element(MOREINFO$14, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTATEEXTERNALURL$16, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTATEEXTERNALURL$16, 0);
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
                return get_store().count_elements(ESTATEEXTERNALURL$16) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTATEEXTERNALURL$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESTATEEXTERNALURL$16);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTATEEXTERNALURL$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ESTATEEXTERNALURL$16);
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
                get_store().remove_element(ESTATEEXTERNALURL$16, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGULATIONS$18, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGULATIONS$18, 0);
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
                return get_store().count_elements(REGULATIONS$18) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGULATIONS$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGULATIONS$18);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGULATIONS$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REGULATIONS$18);
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
                get_store().remove_element(REGULATIONS$18, 0);
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
                get_store().find_all_element_users(BROKER$20, targetList);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER)get_store().find_element_user(BROKER$20, i);
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
                return get_store().count_elements(BROKER$20);
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
                arraySetterHelper(brokerArray, BROKER$20);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER)get_store().find_element_user(BROKER$20, i);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER)get_store().insert_element_user(BROKER$20, i);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER)get_store().add_element_user(BROKER$20);
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
                get_store().remove_element(BROKER$20, i);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument.DEPARTMENT)get_store().find_element_user(DEPARTMENT$22, 0);
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
                return get_store().count_elements(DEPARTMENT$22) != 0;
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument.DEPARTMENT)get_store().find_element_user(DEPARTMENT$22, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument.DEPARTMENT)get_store().add_element_user(DEPARTMENT$22);
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
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.DEPARTMENTDocument.DEPARTMENT)get_store().add_element_user(DEPARTMENT$22);
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
                get_store().remove_element(DEPARTMENT$22, 0);
            }
        }
    }
}
