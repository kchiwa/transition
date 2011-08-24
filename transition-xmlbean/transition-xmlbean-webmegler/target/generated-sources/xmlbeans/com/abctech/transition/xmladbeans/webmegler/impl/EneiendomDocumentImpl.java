/*
 * An XML document type.
 * Localname: eneiendom
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webmegler.EneiendomDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webmegler.impl;
/**
 * A document containing one eneiendom(@) element.
 *
 * This is a complex type.
 */
public class EneiendomDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webmegler.EneiendomDocument
{
    private static final long serialVersionUID = 1L;
    
    public EneiendomDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENEIENDOM$0 = 
        new javax.xml.namespace.QName("", "eneiendom");
    
    
    /**
     * Gets the "eneiendom" element
     */
    public com.abctech.transition.xmladbeans.webmegler.EneiendomDocument.Eneiendom getEneiendom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webmegler.EneiendomDocument.Eneiendom target = null;
            target = (com.abctech.transition.xmladbeans.webmegler.EneiendomDocument.Eneiendom)get_store().find_element_user(ENEIENDOM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "eneiendom" element
     */
    public void setEneiendom(com.abctech.transition.xmladbeans.webmegler.EneiendomDocument.Eneiendom eneiendom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webmegler.EneiendomDocument.Eneiendom target = null;
            target = (com.abctech.transition.xmladbeans.webmegler.EneiendomDocument.Eneiendom)get_store().find_element_user(ENEIENDOM$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.webmegler.EneiendomDocument.Eneiendom)get_store().add_element_user(ENEIENDOM$0);
            }
            target.set(eneiendom);
        }
    }
    
    /**
     * Appends and returns a new empty "eneiendom" element
     */
    public com.abctech.transition.xmladbeans.webmegler.EneiendomDocument.Eneiendom addNewEneiendom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webmegler.EneiendomDocument.Eneiendom target = null;
            target = (com.abctech.transition.xmladbeans.webmegler.EneiendomDocument.Eneiendom)get_store().add_element_user(ENEIENDOM$0);
            return target;
        }
    }
    /**
     * An XML eneiendom(@).
     *
     * This is a complex type.
     */
    public static class EneiendomImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webmegler.EneiendomDocument.Eneiendom
    {
        private static final long serialVersionUID = 1L;
        
        public EneiendomImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FELT$0 = 
            new javax.xml.namespace.QName("", "felt");
        private static final javax.xml.namespace.QName MATCHEKRITERIER$2 = 
            new javax.xml.namespace.QName("", "matchekriterier");
        private static final javax.xml.namespace.QName STYRINGSKODER$4 = 
            new javax.xml.namespace.QName("", "styringskoder");
        private static final javax.xml.namespace.QName FRITEKSTER$6 = 
            new javax.xml.namespace.QName("", "fritekster");
        private static final javax.xml.namespace.QName VISNINGER$8 = 
            new javax.xml.namespace.QName("", "visninger");
        private static final javax.xml.namespace.QName BILDER$10 = 
            new javax.xml.namespace.QName("", "bilder");
        private static final javax.xml.namespace.QName DOKUMENTER$12 = 
            new javax.xml.namespace.QName("", "dokumenter");
        private static final javax.xml.namespace.QName LENKER$14 = 
            new javax.xml.namespace.QName("", "lenker");
        
        
        /**
         * Gets array of all "felt" elements
         */
        public com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt[] getFeltArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FELT$0, targetList);
                com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt[] result = new com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "felt" element
         */
        public com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt getFeltArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt)get_store().find_element_user(FELT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "felt" element
         */
        public int sizeOfFeltArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FELT$0);
            }
        }
        
        /**
         * Sets array of all "felt" element
         */
        public void setFeltArray(com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt[] feltArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(feltArray, FELT$0);
            }
        }
        
        /**
         * Sets ith "felt" element
         */
        public void setFeltArray(int i, com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt felt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt)get_store().find_element_user(FELT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(felt);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "felt" element
         */
        public com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt insertNewFelt(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt)get_store().insert_element_user(FELT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "felt" element
         */
        public com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt addNewFelt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.FeltDocument.Felt)get_store().add_element_user(FELT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "felt" element
         */
        public void removeFelt(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FELT$0, i);
            }
        }
        
        /**
         * Gets array of all "matchekriterier" elements
         */
        public com.abctech.transition.xmladbeans.webmegler.MatchekriterierDocument.Matchekriterier[] getMatchekriterierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(MATCHEKRITERIER$2, targetList);
                com.abctech.transition.xmladbeans.webmegler.MatchekriterierDocument.Matchekriterier[] result = new com.abctech.transition.xmladbeans.webmegler.MatchekriterierDocument.Matchekriterier[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "matchekriterier" element
         */
        public com.abctech.transition.xmladbeans.webmegler.MatchekriterierDocument.Matchekriterier getMatchekriterierArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.MatchekriterierDocument.Matchekriterier target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.MatchekriterierDocument.Matchekriterier)get_store().find_element_user(MATCHEKRITERIER$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "matchekriterier" element
         */
        public int sizeOfMatchekriterierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MATCHEKRITERIER$2);
            }
        }
        
        /**
         * Sets array of all "matchekriterier" element
         */
        public void setMatchekriterierArray(com.abctech.transition.xmladbeans.webmegler.MatchekriterierDocument.Matchekriterier[] matchekriterierArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(matchekriterierArray, MATCHEKRITERIER$2);
            }
        }
        
        /**
         * Sets ith "matchekriterier" element
         */
        public void setMatchekriterierArray(int i, com.abctech.transition.xmladbeans.webmegler.MatchekriterierDocument.Matchekriterier matchekriterier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.MatchekriterierDocument.Matchekriterier target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.MatchekriterierDocument.Matchekriterier)get_store().find_element_user(MATCHEKRITERIER$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(matchekriterier);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "matchekriterier" element
         */
        public com.abctech.transition.xmladbeans.webmegler.MatchekriterierDocument.Matchekriterier insertNewMatchekriterier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.MatchekriterierDocument.Matchekriterier target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.MatchekriterierDocument.Matchekriterier)get_store().insert_element_user(MATCHEKRITERIER$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "matchekriterier" element
         */
        public com.abctech.transition.xmladbeans.webmegler.MatchekriterierDocument.Matchekriterier addNewMatchekriterier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.MatchekriterierDocument.Matchekriterier target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.MatchekriterierDocument.Matchekriterier)get_store().add_element_user(MATCHEKRITERIER$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "matchekriterier" element
         */
        public void removeMatchekriterier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MATCHEKRITERIER$2, i);
            }
        }
        
        /**
         * Gets array of all "styringskoder" elements
         */
        public com.abctech.transition.xmladbeans.webmegler.StyringskoderDocument.Styringskoder[] getStyringskoderArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STYRINGSKODER$4, targetList);
                com.abctech.transition.xmladbeans.webmegler.StyringskoderDocument.Styringskoder[] result = new com.abctech.transition.xmladbeans.webmegler.StyringskoderDocument.Styringskoder[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "styringskoder" element
         */
        public com.abctech.transition.xmladbeans.webmegler.StyringskoderDocument.Styringskoder getStyringskoderArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.StyringskoderDocument.Styringskoder target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.StyringskoderDocument.Styringskoder)get_store().find_element_user(STYRINGSKODER$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "styringskoder" element
         */
        public int sizeOfStyringskoderArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STYRINGSKODER$4);
            }
        }
        
        /**
         * Sets array of all "styringskoder" element
         */
        public void setStyringskoderArray(com.abctech.transition.xmladbeans.webmegler.StyringskoderDocument.Styringskoder[] styringskoderArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(styringskoderArray, STYRINGSKODER$4);
            }
        }
        
        /**
         * Sets ith "styringskoder" element
         */
        public void setStyringskoderArray(int i, com.abctech.transition.xmladbeans.webmegler.StyringskoderDocument.Styringskoder styringskoder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.StyringskoderDocument.Styringskoder target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.StyringskoderDocument.Styringskoder)get_store().find_element_user(STYRINGSKODER$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(styringskoder);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "styringskoder" element
         */
        public com.abctech.transition.xmladbeans.webmegler.StyringskoderDocument.Styringskoder insertNewStyringskoder(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.StyringskoderDocument.Styringskoder target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.StyringskoderDocument.Styringskoder)get_store().insert_element_user(STYRINGSKODER$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "styringskoder" element
         */
        public com.abctech.transition.xmladbeans.webmegler.StyringskoderDocument.Styringskoder addNewStyringskoder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.StyringskoderDocument.Styringskoder target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.StyringskoderDocument.Styringskoder)get_store().add_element_user(STYRINGSKODER$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "styringskoder" element
         */
        public void removeStyringskoder(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STYRINGSKODER$4, i);
            }
        }
        
        /**
         * Gets the "fritekster" element
         */
        public com.abctech.transition.xmladbeans.webmegler.FriteksterDocument.Fritekster getFritekster()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.FriteksterDocument.Fritekster target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.FriteksterDocument.Fritekster)get_store().find_element_user(FRITEKSTER$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "fritekster" element
         */
        public void setFritekster(com.abctech.transition.xmladbeans.webmegler.FriteksterDocument.Fritekster fritekster)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.FriteksterDocument.Fritekster target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.FriteksterDocument.Fritekster)get_store().find_element_user(FRITEKSTER$6, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.webmegler.FriteksterDocument.Fritekster)get_store().add_element_user(FRITEKSTER$6);
                }
                target.set(fritekster);
            }
        }
        
        /**
         * Appends and returns a new empty "fritekster" element
         */
        public com.abctech.transition.xmladbeans.webmegler.FriteksterDocument.Fritekster addNewFritekster()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.FriteksterDocument.Fritekster target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.FriteksterDocument.Fritekster)get_store().add_element_user(FRITEKSTER$6);
                return target;
            }
        }
        
        /**
         * Gets the "visninger" element
         */
        public com.abctech.transition.xmladbeans.webmegler.VisningerDocument.Visninger getVisninger()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.VisningerDocument.Visninger target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.VisningerDocument.Visninger)get_store().find_element_user(VISNINGER$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "visninger" element
         */
        public void setVisninger(com.abctech.transition.xmladbeans.webmegler.VisningerDocument.Visninger visninger)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.VisningerDocument.Visninger target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.VisningerDocument.Visninger)get_store().find_element_user(VISNINGER$8, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.webmegler.VisningerDocument.Visninger)get_store().add_element_user(VISNINGER$8);
                }
                target.set(visninger);
            }
        }
        
        /**
         * Appends and returns a new empty "visninger" element
         */
        public com.abctech.transition.xmladbeans.webmegler.VisningerDocument.Visninger addNewVisninger()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.VisningerDocument.Visninger target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.VisningerDocument.Visninger)get_store().add_element_user(VISNINGER$8);
                return target;
            }
        }
        
        /**
         * Gets the "bilder" element
         */
        public com.abctech.transition.xmladbeans.webmegler.BilderDocument.Bilder getBilder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.BilderDocument.Bilder target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.BilderDocument.Bilder)get_store().find_element_user(BILDER$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "bilder" element
         */
        public void setBilder(com.abctech.transition.xmladbeans.webmegler.BilderDocument.Bilder bilder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.BilderDocument.Bilder target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.BilderDocument.Bilder)get_store().find_element_user(BILDER$10, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.webmegler.BilderDocument.Bilder)get_store().add_element_user(BILDER$10);
                }
                target.set(bilder);
            }
        }
        
        /**
         * Appends and returns a new empty "bilder" element
         */
        public com.abctech.transition.xmladbeans.webmegler.BilderDocument.Bilder addNewBilder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.BilderDocument.Bilder target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.BilderDocument.Bilder)get_store().add_element_user(BILDER$10);
                return target;
            }
        }
        
        /**
         * Gets the "dokumenter" element
         */
        public com.abctech.transition.xmladbeans.webmegler.DokumenterDocument.Dokumenter getDokumenter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.DokumenterDocument.Dokumenter target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.DokumenterDocument.Dokumenter)get_store().find_element_user(DOKUMENTER$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "dokumenter" element
         */
        public void setDokumenter(com.abctech.transition.xmladbeans.webmegler.DokumenterDocument.Dokumenter dokumenter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.DokumenterDocument.Dokumenter target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.DokumenterDocument.Dokumenter)get_store().find_element_user(DOKUMENTER$12, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.webmegler.DokumenterDocument.Dokumenter)get_store().add_element_user(DOKUMENTER$12);
                }
                target.set(dokumenter);
            }
        }
        
        /**
         * Appends and returns a new empty "dokumenter" element
         */
        public com.abctech.transition.xmladbeans.webmegler.DokumenterDocument.Dokumenter addNewDokumenter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.DokumenterDocument.Dokumenter target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.DokumenterDocument.Dokumenter)get_store().add_element_user(DOKUMENTER$12);
                return target;
            }
        }
        
        /**
         * Gets the "lenker" element
         */
        public com.abctech.transition.xmladbeans.webmegler.LenkerDocument.Lenker getLenker()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.LenkerDocument.Lenker target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.LenkerDocument.Lenker)get_store().find_element_user(LENKER$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "lenker" element
         */
        public void setLenker(com.abctech.transition.xmladbeans.webmegler.LenkerDocument.Lenker lenker)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.LenkerDocument.Lenker target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.LenkerDocument.Lenker)get_store().find_element_user(LENKER$14, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.webmegler.LenkerDocument.Lenker)get_store().add_element_user(LENKER$14);
                }
                target.set(lenker);
            }
        }
        
        /**
         * Appends and returns a new empty "lenker" element
         */
        public com.abctech.transition.xmladbeans.webmegler.LenkerDocument.Lenker addNewLenker()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.LenkerDocument.Lenker target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.LenkerDocument.Lenker)get_store().add_element_user(LENKER$14);
                return target;
            }
        }
    }
}
