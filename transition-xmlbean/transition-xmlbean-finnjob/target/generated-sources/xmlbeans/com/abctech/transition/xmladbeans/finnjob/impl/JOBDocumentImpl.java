/*
 * An XML document type.
 * Localname: JOB
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.finnjob.JOBDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.finnjob.impl;
/**
 * A document containing one JOB(@) element.
 *
 * This is a complex type.
 */
public class JOBDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.finnjob.JOBDocument
{
    private static final long serialVersionUID = 1L;
    
    public JOBDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JOB$0 = 
        new javax.xml.namespace.QName("", "JOB");
    
    
    /**
     * Gets the "JOB" element
     */
    public com.abctech.transition.xmladbeans.finnjob.JOBDocument.JOB getJOB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.finnjob.JOBDocument.JOB target = null;
            target = (com.abctech.transition.xmladbeans.finnjob.JOBDocument.JOB)get_store().find_element_user(JOB$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "JOB" element
     */
    public void setJOB(com.abctech.transition.xmladbeans.finnjob.JOBDocument.JOB job)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.finnjob.JOBDocument.JOB target = null;
            target = (com.abctech.transition.xmladbeans.finnjob.JOBDocument.JOB)get_store().find_element_user(JOB$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.finnjob.JOBDocument.JOB)get_store().add_element_user(JOB$0);
            }
            target.set(job);
        }
    }
    
    /**
     * Appends and returns a new empty "JOB" element
     */
    public com.abctech.transition.xmladbeans.finnjob.JOBDocument.JOB addNewJOB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.finnjob.JOBDocument.JOB target = null;
            target = (com.abctech.transition.xmladbeans.finnjob.JOBDocument.JOB)get_store().add_element_user(JOB$0);
            return target;
        }
    }
    /**
     * An XML JOB(@).
     *
     * This is a complex type.
     */
    public static class JOBImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.finnjob.JOBDocument.JOB
    {
        private static final long serialVersionUID = 1L;
        
        public JOBImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName JOBTITLE$0 = 
            new javax.xml.namespace.QName("", "JOB_TITLE");
        private static final javax.xml.namespace.QName SITUATION$2 = 
            new javax.xml.namespace.QName("", "SITUATION");
        private static final javax.xml.namespace.QName SECTOR$4 = 
            new javax.xml.namespace.QName("", "SECTOR");
        private static final javax.xml.namespace.QName JOBCATEGORY$6 = 
            new javax.xml.namespace.QName("", "JOB_CATEGORY");
        private static final javax.xml.namespace.QName DURATION$8 = 
            new javax.xml.namespace.QName("", "DURATION");
        private static final javax.xml.namespace.QName ROLE$10 = 
            new javax.xml.namespace.QName("", "ROLE");
        private static final javax.xml.namespace.QName SALARY$12 = 
            new javax.xml.namespace.QName("", "SALARY");
        private static final javax.xml.namespace.QName EXTENT$14 = 
            new javax.xml.namespace.QName("", "EXTENT");
        private static final javax.xml.namespace.QName EDUCATION$16 = 
            new javax.xml.namespace.QName("", "EDUCATION");
        private static final javax.xml.namespace.QName APPLICATIONADDRESS$18 = 
            new javax.xml.namespace.QName("", "APPLICATION_ADDRESS");
        private static final javax.xml.namespace.QName COMPANY$20 = 
            new javax.xml.namespace.QName("", "COMPANY");
        private static final javax.xml.namespace.QName GENERALTEXTJOB$22 = 
            new javax.xml.namespace.QName("", "GENERAL_TEXT_JOB");
        private static final javax.xml.namespace.QName APPLICATIONDEADLINE$24 = 
            new javax.xml.namespace.QName("", "APPLICATION_DEADLINE");
        private static final javax.xml.namespace.QName APPLICATIONEMAIL$26 = 
            new javax.xml.namespace.QName("", "APPLICATION_EMAIL");
        private static final javax.xml.namespace.QName STARTDATE$28 = 
            new javax.xml.namespace.QName("", "START_DATE");
        private static final javax.xml.namespace.QName JOBCONTACT$30 = 
            new javax.xml.namespace.QName("", "JOB_CONTACT");
        private static final javax.xml.namespace.QName APPLICATIONLABEL$32 = 
            new javax.xml.namespace.QName("", "APPLICATION_LABEL");
        private static final javax.xml.namespace.QName ELECTRONICAPPLICATION$34 = 
            new javax.xml.namespace.QName("", "ELECTRONIC_APPLICATION");
        private static final javax.xml.namespace.QName MOREINFO$36 = 
            new javax.xml.namespace.QName("", "MOREINFO");
        private static final javax.xml.namespace.QName NOOFPOSITIONS$38 = 
            new javax.xml.namespace.QName("", "NO_OF_POSITIONS");
        
        
        /**
         * Gets the "JOB_TITLE" element
         */
        public java.lang.String getJOBTITLE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBTITLE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "JOB_TITLE" element
         */
        public org.apache.xmlbeans.XmlString xgetJOBTITLE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBTITLE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "JOB_TITLE" element
         */
        public void setJOBTITLE(java.lang.String jobtitle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBTITLE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOBTITLE$0);
                }
                target.setStringValue(jobtitle);
            }
        }
        
        /**
         * Sets (as xml) the "JOB_TITLE" element
         */
        public void xsetJOBTITLE(org.apache.xmlbeans.XmlString jobtitle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBTITLE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JOBTITLE$0);
                }
                target.set(jobtitle);
            }
        }
        
        /**
         * Gets the "SITUATION" element
         */
        public java.lang.String getSITUATION()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITUATION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SITUATION" element
         */
        public org.apache.xmlbeans.XmlString xgetSITUATION()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SITUATION$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "SITUATION" element
         */
        public void setSITUATION(java.lang.String situation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITUATION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SITUATION$2);
                }
                target.setStringValue(situation);
            }
        }
        
        /**
         * Sets (as xml) the "SITUATION" element
         */
        public void xsetSITUATION(org.apache.xmlbeans.XmlString situation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SITUATION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SITUATION$2);
                }
                target.set(situation);
            }
        }
        
        /**
         * Gets the "SECTOR" element
         */
        public java.lang.String getSECTOR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECTOR$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SECTOR" element
         */
        public org.apache.xmlbeans.XmlString xgetSECTOR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECTOR$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "SECTOR" element
         */
        public void setSECTOR(java.lang.String sector)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECTOR$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECTOR$4);
                }
                target.setStringValue(sector);
            }
        }
        
        /**
         * Sets (as xml) the "SECTOR" element
         */
        public void xsetSECTOR(org.apache.xmlbeans.XmlString sector)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECTOR$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SECTOR$4);
                }
                target.set(sector);
            }
        }
        
        /**
         * Gets array of all "JOB_CATEGORY" elements
         */
        public com.abctech.transition.xmladbeans.finnjob.JOBCATEGORYDocument.JOBCATEGORY[] getJOBCATEGORYArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(JOBCATEGORY$6, targetList);
                com.abctech.transition.xmladbeans.finnjob.JOBCATEGORYDocument.JOBCATEGORY[] result = new com.abctech.transition.xmladbeans.finnjob.JOBCATEGORYDocument.JOBCATEGORY[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "JOB_CATEGORY" element
         */
        public com.abctech.transition.xmladbeans.finnjob.JOBCATEGORYDocument.JOBCATEGORY getJOBCATEGORYArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.JOBCATEGORYDocument.JOBCATEGORY target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.JOBCATEGORYDocument.JOBCATEGORY)get_store().find_element_user(JOBCATEGORY$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "JOB_CATEGORY" element
         */
        public int sizeOfJOBCATEGORYArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(JOBCATEGORY$6);
            }
        }
        
        /**
         * Sets array of all "JOB_CATEGORY" element
         */
        public void setJOBCATEGORYArray(com.abctech.transition.xmladbeans.finnjob.JOBCATEGORYDocument.JOBCATEGORY[] jobcategoryArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(jobcategoryArray, JOBCATEGORY$6);
            }
        }
        
        /**
         * Sets ith "JOB_CATEGORY" element
         */
        public void setJOBCATEGORYArray(int i, com.abctech.transition.xmladbeans.finnjob.JOBCATEGORYDocument.JOBCATEGORY jobcategory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.JOBCATEGORYDocument.JOBCATEGORY target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.JOBCATEGORYDocument.JOBCATEGORY)get_store().find_element_user(JOBCATEGORY$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(jobcategory);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "JOB_CATEGORY" element
         */
        public com.abctech.transition.xmladbeans.finnjob.JOBCATEGORYDocument.JOBCATEGORY insertNewJOBCATEGORY(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.JOBCATEGORYDocument.JOBCATEGORY target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.JOBCATEGORYDocument.JOBCATEGORY)get_store().insert_element_user(JOBCATEGORY$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "JOB_CATEGORY" element
         */
        public com.abctech.transition.xmladbeans.finnjob.JOBCATEGORYDocument.JOBCATEGORY addNewJOBCATEGORY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.JOBCATEGORYDocument.JOBCATEGORY target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.JOBCATEGORYDocument.JOBCATEGORY)get_store().add_element_user(JOBCATEGORY$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "JOB_CATEGORY" element
         */
        public void removeJOBCATEGORY(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(JOBCATEGORY$6, i);
            }
        }
        
        /**
         * Gets the "DURATION" element
         */
        public java.lang.String getDURATION()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATION$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "DURATION" element
         */
        public org.apache.xmlbeans.XmlString xgetDURATION()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DURATION$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "DURATION" element
         */
        public boolean isSetDURATION()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DURATION$8) != 0;
            }
        }
        
        /**
         * Sets the "DURATION" element
         */
        public void setDURATION(java.lang.String duration)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATION$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DURATION$8);
                }
                target.setStringValue(duration);
            }
        }
        
        /**
         * Sets (as xml) the "DURATION" element
         */
        public void xsetDURATION(org.apache.xmlbeans.XmlString duration)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DURATION$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DURATION$8);
                }
                target.set(duration);
            }
        }
        
        /**
         * Unsets the "DURATION" element
         */
        public void unsetDURATION()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DURATION$8, 0);
            }
        }
        
        /**
         * Gets the "ROLE" element
         */
        public java.lang.String getROLE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROLE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ROLE" element
         */
        public org.apache.xmlbeans.XmlString xgetROLE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROLE$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "ROLE" element
         */
        public boolean isSetROLE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ROLE$10) != 0;
            }
        }
        
        /**
         * Sets the "ROLE" element
         */
        public void setROLE(java.lang.String role)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROLE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROLE$10);
                }
                target.setStringValue(role);
            }
        }
        
        /**
         * Sets (as xml) the "ROLE" element
         */
        public void xsetROLE(org.apache.xmlbeans.XmlString role)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROLE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ROLE$10);
                }
                target.set(role);
            }
        }
        
        /**
         * Unsets the "ROLE" element
         */
        public void unsetROLE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ROLE$10, 0);
            }
        }
        
        /**
         * Gets the "SALARY" element
         */
        public java.lang.String getSALARY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALARY$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SALARY" element
         */
        public org.apache.xmlbeans.XmlString xgetSALARY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SALARY$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "SALARY" element
         */
        public boolean isSetSALARY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SALARY$12) != 0;
            }
        }
        
        /**
         * Sets the "SALARY" element
         */
        public void setSALARY(java.lang.String salary)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALARY$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SALARY$12);
                }
                target.setStringValue(salary);
            }
        }
        
        /**
         * Sets (as xml) the "SALARY" element
         */
        public void xsetSALARY(org.apache.xmlbeans.XmlString salary)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SALARY$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SALARY$12);
                }
                target.set(salary);
            }
        }
        
        /**
         * Unsets the "SALARY" element
         */
        public void unsetSALARY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SALARY$12, 0);
            }
        }
        
        /**
         * Gets the "EXTENT" element
         */
        public java.lang.String getEXTENT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTENT$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EXTENT" element
         */
        public org.apache.xmlbeans.XmlString xgetEXTENT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTENT$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "EXTENT" element
         */
        public boolean isSetEXTENT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXTENT$14) != 0;
            }
        }
        
        /**
         * Sets the "EXTENT" element
         */
        public void setEXTENT(java.lang.String extent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTENT$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTENT$14);
                }
                target.setStringValue(extent);
            }
        }
        
        /**
         * Sets (as xml) the "EXTENT" element
         */
        public void xsetEXTENT(org.apache.xmlbeans.XmlString extent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTENT$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTENT$14);
                }
                target.set(extent);
            }
        }
        
        /**
         * Unsets the "EXTENT" element
         */
        public void unsetEXTENT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXTENT$14, 0);
            }
        }
        
        /**
         * Gets the "EDUCATION" element
         */
        public java.lang.String getEDUCATION()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EDUCATION$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EDUCATION" element
         */
        public org.apache.xmlbeans.XmlString xgetEDUCATION()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EDUCATION$16, 0);
                return target;
            }
        }
        
        /**
         * True if has "EDUCATION" element
         */
        public boolean isSetEDUCATION()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EDUCATION$16) != 0;
            }
        }
        
        /**
         * Sets the "EDUCATION" element
         */
        public void setEDUCATION(java.lang.String education)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EDUCATION$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EDUCATION$16);
                }
                target.setStringValue(education);
            }
        }
        
        /**
         * Sets (as xml) the "EDUCATION" element
         */
        public void xsetEDUCATION(org.apache.xmlbeans.XmlString education)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EDUCATION$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EDUCATION$16);
                }
                target.set(education);
            }
        }
        
        /**
         * Unsets the "EDUCATION" element
         */
        public void unsetEDUCATION()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EDUCATION$16, 0);
            }
        }
        
        /**
         * Gets array of all "APPLICATION_ADDRESS" elements
         */
        public com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS[] getAPPLICATIONADDRESSArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(APPLICATIONADDRESS$18, targetList);
                com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS[] result = new com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "APPLICATION_ADDRESS" element
         */
        public com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS getAPPLICATIONADDRESSArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS)get_store().find_element_user(APPLICATIONADDRESS$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "APPLICATION_ADDRESS" element
         */
        public int sizeOfAPPLICATIONADDRESSArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(APPLICATIONADDRESS$18);
            }
        }
        
        /**
         * Sets array of all "APPLICATION_ADDRESS" element
         */
        public void setAPPLICATIONADDRESSArray(com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS[] applicationaddressArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(applicationaddressArray, APPLICATIONADDRESS$18);
            }
        }
        
        /**
         * Sets ith "APPLICATION_ADDRESS" element
         */
        public void setAPPLICATIONADDRESSArray(int i, com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS applicationaddress)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS)get_store().find_element_user(APPLICATIONADDRESS$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(applicationaddress);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "APPLICATION_ADDRESS" element
         */
        public com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS insertNewAPPLICATIONADDRESS(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS)get_store().insert_element_user(APPLICATIONADDRESS$18, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "APPLICATION_ADDRESS" element
         */
        public com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS addNewAPPLICATIONADDRESS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.APPLICATIONADDRESSDocument.APPLICATIONADDRESS)get_store().add_element_user(APPLICATIONADDRESS$18);
                return target;
            }
        }
        
        /**
         * Removes the ith "APPLICATION_ADDRESS" element
         */
        public void removeAPPLICATIONADDRESS(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(APPLICATIONADDRESS$18, i);
            }
        }
        
        /**
         * Gets array of all "COMPANY" elements
         */
        public com.abctech.transition.xmladbeans.finnjob.COMPANYDocument.COMPANY[] getCOMPANYArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COMPANY$20, targetList);
                com.abctech.transition.xmladbeans.finnjob.COMPANYDocument.COMPANY[] result = new com.abctech.transition.xmladbeans.finnjob.COMPANYDocument.COMPANY[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "COMPANY" element
         */
        public com.abctech.transition.xmladbeans.finnjob.COMPANYDocument.COMPANY getCOMPANYArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.COMPANYDocument.COMPANY target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.COMPANYDocument.COMPANY)get_store().find_element_user(COMPANY$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "COMPANY" element
         */
        public int sizeOfCOMPANYArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMPANY$20);
            }
        }
        
        /**
         * Sets array of all "COMPANY" element
         */
        public void setCOMPANYArray(com.abctech.transition.xmladbeans.finnjob.COMPANYDocument.COMPANY[] companyArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(companyArray, COMPANY$20);
            }
        }
        
        /**
         * Sets ith "COMPANY" element
         */
        public void setCOMPANYArray(int i, com.abctech.transition.xmladbeans.finnjob.COMPANYDocument.COMPANY company)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.COMPANYDocument.COMPANY target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.COMPANYDocument.COMPANY)get_store().find_element_user(COMPANY$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(company);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "COMPANY" element
         */
        public com.abctech.transition.xmladbeans.finnjob.COMPANYDocument.COMPANY insertNewCOMPANY(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.COMPANYDocument.COMPANY target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.COMPANYDocument.COMPANY)get_store().insert_element_user(COMPANY$20, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "COMPANY" element
         */
        public com.abctech.transition.xmladbeans.finnjob.COMPANYDocument.COMPANY addNewCOMPANY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.COMPANYDocument.COMPANY target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.COMPANYDocument.COMPANY)get_store().add_element_user(COMPANY$20);
                return target;
            }
        }
        
        /**
         * Removes the ith "COMPANY" element
         */
        public void removeCOMPANY(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMPANY$20, i);
            }
        }
        
        /**
         * Gets array of all "GENERAL_TEXT_JOB" elements
         */
        public com.abctech.transition.xmladbeans.finnjob.GENERALTEXTJOBDocument.GENERALTEXTJOB[] getGENERALTEXTJOBArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(GENERALTEXTJOB$22, targetList);
                com.abctech.transition.xmladbeans.finnjob.GENERALTEXTJOBDocument.GENERALTEXTJOB[] result = new com.abctech.transition.xmladbeans.finnjob.GENERALTEXTJOBDocument.GENERALTEXTJOB[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "GENERAL_TEXT_JOB" element
         */
        public com.abctech.transition.xmladbeans.finnjob.GENERALTEXTJOBDocument.GENERALTEXTJOB getGENERALTEXTJOBArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.GENERALTEXTJOBDocument.GENERALTEXTJOB target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.GENERALTEXTJOBDocument.GENERALTEXTJOB)get_store().find_element_user(GENERALTEXTJOB$22, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "GENERAL_TEXT_JOB" element
         */
        public int sizeOfGENERALTEXTJOBArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GENERALTEXTJOB$22);
            }
        }
        
        /**
         * Sets array of all "GENERAL_TEXT_JOB" element
         */
        public void setGENERALTEXTJOBArray(com.abctech.transition.xmladbeans.finnjob.GENERALTEXTJOBDocument.GENERALTEXTJOB[] generaltextjobArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(generaltextjobArray, GENERALTEXTJOB$22);
            }
        }
        
        /**
         * Sets ith "GENERAL_TEXT_JOB" element
         */
        public void setGENERALTEXTJOBArray(int i, com.abctech.transition.xmladbeans.finnjob.GENERALTEXTJOBDocument.GENERALTEXTJOB generaltextjob)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.GENERALTEXTJOBDocument.GENERALTEXTJOB target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.GENERALTEXTJOBDocument.GENERALTEXTJOB)get_store().find_element_user(GENERALTEXTJOB$22, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(generaltextjob);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "GENERAL_TEXT_JOB" element
         */
        public com.abctech.transition.xmladbeans.finnjob.GENERALTEXTJOBDocument.GENERALTEXTJOB insertNewGENERALTEXTJOB(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.GENERALTEXTJOBDocument.GENERALTEXTJOB target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.GENERALTEXTJOBDocument.GENERALTEXTJOB)get_store().insert_element_user(GENERALTEXTJOB$22, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "GENERAL_TEXT_JOB" element
         */
        public com.abctech.transition.xmladbeans.finnjob.GENERALTEXTJOBDocument.GENERALTEXTJOB addNewGENERALTEXTJOB()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.GENERALTEXTJOBDocument.GENERALTEXTJOB target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.GENERALTEXTJOBDocument.GENERALTEXTJOB)get_store().add_element_user(GENERALTEXTJOB$22);
                return target;
            }
        }
        
        /**
         * Removes the ith "GENERAL_TEXT_JOB" element
         */
        public void removeGENERALTEXTJOB(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GENERALTEXTJOB$22, i);
            }
        }
        
        /**
         * Gets the "APPLICATION_DEADLINE" element
         */
        public java.lang.String getAPPLICATIONDEADLINE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPLICATIONDEADLINE$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "APPLICATION_DEADLINE" element
         */
        public org.apache.xmlbeans.XmlString xgetAPPLICATIONDEADLINE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPLICATIONDEADLINE$24, 0);
                return target;
            }
        }
        
        /**
         * True if has "APPLICATION_DEADLINE" element
         */
        public boolean isSetAPPLICATIONDEADLINE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(APPLICATIONDEADLINE$24) != 0;
            }
        }
        
        /**
         * Sets the "APPLICATION_DEADLINE" element
         */
        public void setAPPLICATIONDEADLINE(java.lang.String applicationdeadline)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPLICATIONDEADLINE$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APPLICATIONDEADLINE$24);
                }
                target.setStringValue(applicationdeadline);
            }
        }
        
        /**
         * Sets (as xml) the "APPLICATION_DEADLINE" element
         */
        public void xsetAPPLICATIONDEADLINE(org.apache.xmlbeans.XmlString applicationdeadline)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPLICATIONDEADLINE$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APPLICATIONDEADLINE$24);
                }
                target.set(applicationdeadline);
            }
        }
        
        /**
         * Unsets the "APPLICATION_DEADLINE" element
         */
        public void unsetAPPLICATIONDEADLINE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(APPLICATIONDEADLINE$24, 0);
            }
        }
        
        /**
         * Gets the "APPLICATION_EMAIL" element
         */
        public java.lang.String getAPPLICATIONEMAIL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPLICATIONEMAIL$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "APPLICATION_EMAIL" element
         */
        public org.apache.xmlbeans.XmlString xgetAPPLICATIONEMAIL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPLICATIONEMAIL$26, 0);
                return target;
            }
        }
        
        /**
         * True if has "APPLICATION_EMAIL" element
         */
        public boolean isSetAPPLICATIONEMAIL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(APPLICATIONEMAIL$26) != 0;
            }
        }
        
        /**
         * Sets the "APPLICATION_EMAIL" element
         */
        public void setAPPLICATIONEMAIL(java.lang.String applicationemail)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPLICATIONEMAIL$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APPLICATIONEMAIL$26);
                }
                target.setStringValue(applicationemail);
            }
        }
        
        /**
         * Sets (as xml) the "APPLICATION_EMAIL" element
         */
        public void xsetAPPLICATIONEMAIL(org.apache.xmlbeans.XmlString applicationemail)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPLICATIONEMAIL$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APPLICATIONEMAIL$26);
                }
                target.set(applicationemail);
            }
        }
        
        /**
         * Unsets the "APPLICATION_EMAIL" element
         */
        public void unsetAPPLICATIONEMAIL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(APPLICATIONEMAIL$26, 0);
            }
        }
        
        /**
         * Gets the "START_DATE" element
         */
        public java.lang.String getSTARTDATE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$28, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "START_DATE" element
         */
        public org.apache.xmlbeans.XmlString xgetSTARTDATE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STARTDATE$28, 0);
                return target;
            }
        }
        
        /**
         * True if has "START_DATE" element
         */
        public boolean isSetSTARTDATE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STARTDATE$28) != 0;
            }
        }
        
        /**
         * Sets the "START_DATE" element
         */
        public void setSTARTDATE(java.lang.String startdate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATE$28);
                }
                target.setStringValue(startdate);
            }
        }
        
        /**
         * Sets (as xml) the "START_DATE" element
         */
        public void xsetSTARTDATE(org.apache.xmlbeans.XmlString startdate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STARTDATE$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STARTDATE$28);
                }
                target.set(startdate);
            }
        }
        
        /**
         * Unsets the "START_DATE" element
         */
        public void unsetSTARTDATE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STARTDATE$28, 0);
            }
        }
        
        /**
         * Gets array of all "JOB_CONTACT" elements
         */
        public com.abctech.transition.xmladbeans.finnjob.JOBCONTACTDocument.JOBCONTACT[] getJOBCONTACTArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(JOBCONTACT$30, targetList);
                com.abctech.transition.xmladbeans.finnjob.JOBCONTACTDocument.JOBCONTACT[] result = new com.abctech.transition.xmladbeans.finnjob.JOBCONTACTDocument.JOBCONTACT[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "JOB_CONTACT" element
         */
        public com.abctech.transition.xmladbeans.finnjob.JOBCONTACTDocument.JOBCONTACT getJOBCONTACTArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.JOBCONTACTDocument.JOBCONTACT target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.JOBCONTACTDocument.JOBCONTACT)get_store().find_element_user(JOBCONTACT$30, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "JOB_CONTACT" element
         */
        public int sizeOfJOBCONTACTArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(JOBCONTACT$30);
            }
        }
        
        /**
         * Sets array of all "JOB_CONTACT" element
         */
        public void setJOBCONTACTArray(com.abctech.transition.xmladbeans.finnjob.JOBCONTACTDocument.JOBCONTACT[] jobcontactArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(jobcontactArray, JOBCONTACT$30);
            }
        }
        
        /**
         * Sets ith "JOB_CONTACT" element
         */
        public void setJOBCONTACTArray(int i, com.abctech.transition.xmladbeans.finnjob.JOBCONTACTDocument.JOBCONTACT jobcontact)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.JOBCONTACTDocument.JOBCONTACT target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.JOBCONTACTDocument.JOBCONTACT)get_store().find_element_user(JOBCONTACT$30, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(jobcontact);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "JOB_CONTACT" element
         */
        public com.abctech.transition.xmladbeans.finnjob.JOBCONTACTDocument.JOBCONTACT insertNewJOBCONTACT(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.JOBCONTACTDocument.JOBCONTACT target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.JOBCONTACTDocument.JOBCONTACT)get_store().insert_element_user(JOBCONTACT$30, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "JOB_CONTACT" element
         */
        public com.abctech.transition.xmladbeans.finnjob.JOBCONTACTDocument.JOBCONTACT addNewJOBCONTACT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.JOBCONTACTDocument.JOBCONTACT target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.JOBCONTACTDocument.JOBCONTACT)get_store().add_element_user(JOBCONTACT$30);
                return target;
            }
        }
        
        /**
         * Removes the ith "JOB_CONTACT" element
         */
        public void removeJOBCONTACT(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(JOBCONTACT$30, i);
            }
        }
        
        /**
         * Gets the "APPLICATION_LABEL" element
         */
        public java.lang.String getAPPLICATIONLABEL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPLICATIONLABEL$32, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "APPLICATION_LABEL" element
         */
        public org.apache.xmlbeans.XmlString xgetAPPLICATIONLABEL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPLICATIONLABEL$32, 0);
                return target;
            }
        }
        
        /**
         * True if has "APPLICATION_LABEL" element
         */
        public boolean isSetAPPLICATIONLABEL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(APPLICATIONLABEL$32) != 0;
            }
        }
        
        /**
         * Sets the "APPLICATION_LABEL" element
         */
        public void setAPPLICATIONLABEL(java.lang.String applicationlabel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPLICATIONLABEL$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APPLICATIONLABEL$32);
                }
                target.setStringValue(applicationlabel);
            }
        }
        
        /**
         * Sets (as xml) the "APPLICATION_LABEL" element
         */
        public void xsetAPPLICATIONLABEL(org.apache.xmlbeans.XmlString applicationlabel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPLICATIONLABEL$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APPLICATIONLABEL$32);
                }
                target.set(applicationlabel);
            }
        }
        
        /**
         * Unsets the "APPLICATION_LABEL" element
         */
        public void unsetAPPLICATIONLABEL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(APPLICATIONLABEL$32, 0);
            }
        }
        
        /**
         * Gets the "ELECTRONIC_APPLICATION" element
         */
        public com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION getELECTRONICAPPLICATION()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION)get_store().find_element_user(ELECTRONICAPPLICATION$34, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ELECTRONIC_APPLICATION" element
         */
        public boolean isSetELECTRONICAPPLICATION()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ELECTRONICAPPLICATION$34) != 0;
            }
        }
        
        /**
         * Sets the "ELECTRONIC_APPLICATION" element
         */
        public void setELECTRONICAPPLICATION(com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION electronicapplication)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION)get_store().find_element_user(ELECTRONICAPPLICATION$34, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION)get_store().add_element_user(ELECTRONICAPPLICATION$34);
                }
                target.set(electronicapplication);
            }
        }
        
        /**
         * Appends and returns a new empty "ELECTRONIC_APPLICATION" element
         */
        public com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION addNewELECTRONICAPPLICATION()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.ELECTRONICAPPLICATIONDocument.ELECTRONICAPPLICATION)get_store().add_element_user(ELECTRONICAPPLICATION$34);
                return target;
            }
        }
        
        /**
         * Unsets the "ELECTRONIC_APPLICATION" element
         */
        public void unsetELECTRONICAPPLICATION()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ELECTRONICAPPLICATION$34, 0);
            }
        }
        
        /**
         * Gets array of all "MOREINFO" elements
         */
        public com.abctech.transition.xmladbeans.finnjob.MOREINFODocument.MOREINFO[] getMOREINFOArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(MOREINFO$36, targetList);
                com.abctech.transition.xmladbeans.finnjob.MOREINFODocument.MOREINFO[] result = new com.abctech.transition.xmladbeans.finnjob.MOREINFODocument.MOREINFO[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "MOREINFO" element
         */
        public com.abctech.transition.xmladbeans.finnjob.MOREINFODocument.MOREINFO getMOREINFOArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.MOREINFODocument.MOREINFO target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.MOREINFODocument.MOREINFO)get_store().find_element_user(MOREINFO$36, i);
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
                return get_store().count_elements(MOREINFO$36);
            }
        }
        
        /**
         * Sets array of all "MOREINFO" element
         */
        public void setMOREINFOArray(com.abctech.transition.xmladbeans.finnjob.MOREINFODocument.MOREINFO[] moreinfoArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(moreinfoArray, MOREINFO$36);
            }
        }
        
        /**
         * Sets ith "MOREINFO" element
         */
        public void setMOREINFOArray(int i, com.abctech.transition.xmladbeans.finnjob.MOREINFODocument.MOREINFO moreinfo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.MOREINFODocument.MOREINFO target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.MOREINFODocument.MOREINFO)get_store().find_element_user(MOREINFO$36, i);
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
        public com.abctech.transition.xmladbeans.finnjob.MOREINFODocument.MOREINFO insertNewMOREINFO(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.MOREINFODocument.MOREINFO target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.MOREINFODocument.MOREINFO)get_store().insert_element_user(MOREINFO$36, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "MOREINFO" element
         */
        public com.abctech.transition.xmladbeans.finnjob.MOREINFODocument.MOREINFO addNewMOREINFO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.finnjob.MOREINFODocument.MOREINFO target = null;
                target = (com.abctech.transition.xmladbeans.finnjob.MOREINFODocument.MOREINFO)get_store().add_element_user(MOREINFO$36);
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
                get_store().remove_element(MOREINFO$36, i);
            }
        }
        
        /**
         * Gets the "NO_OF_POSITIONS" element
         */
        public java.math.BigInteger getNOOFPOSITIONS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOOFPOSITIONS$38, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "NO_OF_POSITIONS" element
         */
        public org.apache.xmlbeans.XmlInteger xgetNOOFPOSITIONS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NOOFPOSITIONS$38, 0);
                return target;
            }
        }
        
        /**
         * Sets the "NO_OF_POSITIONS" element
         */
        public void setNOOFPOSITIONS(java.math.BigInteger noofpositions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOOFPOSITIONS$38, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOOFPOSITIONS$38);
                }
                target.setBigIntegerValue(noofpositions);
            }
        }
        
        /**
         * Sets (as xml) the "NO_OF_POSITIONS" element
         */
        public void xsetNOOFPOSITIONS(org.apache.xmlbeans.XmlInteger noofpositions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NOOFPOSITIONS$38, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(NOOFPOSITIONS$38);
                }
                target.set(noofpositions);
            }
        }
    }
}
