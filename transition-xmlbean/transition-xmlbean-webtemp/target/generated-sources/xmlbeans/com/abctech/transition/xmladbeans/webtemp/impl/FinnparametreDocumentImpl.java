/*
 * An XML document type.
 * Localname: finnparametre
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webtemp.impl;
/**
 * A document containing one finnparametre(@) element.
 *
 * This is a complex type.
 */
public class FinnparametreDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument
{
    private static final long serialVersionUID = 1L;
    
    public FinnparametreDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FINNPARAMETRE$0 = 
        new javax.xml.namespace.QName("", "finnparametre");
    
    
    /**
     * Gets the "finnparametre" element
     */
    public com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument.Finnparametre getFinnparametre()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument.Finnparametre target = null;
            target = (com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument.Finnparametre)get_store().find_element_user(FINNPARAMETRE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "finnparametre" element
     */
    public void setFinnparametre(com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument.Finnparametre finnparametre)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument.Finnparametre target = null;
            target = (com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument.Finnparametre)get_store().find_element_user(FINNPARAMETRE$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument.Finnparametre)get_store().add_element_user(FINNPARAMETRE$0);
            }
            target.set(finnparametre);
        }
    }
    
    /**
     * Appends and returns a new empty "finnparametre" element
     */
    public com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument.Finnparametre addNewFinnparametre()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument.Finnparametre target = null;
            target = (com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument.Finnparametre)get_store().add_element_user(FINNPARAMETRE$0);
            return target;
        }
    }
    /**
     * An XML finnparametre(@).
     *
     * This is a complex type.
     */
    public static class FinnparametreImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument.Finnparametre
    {
        private static final long serialVersionUID = 1L;
        
        public FinnparametreImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName JOBCATEGORY$0 = 
            new javax.xml.namespace.QName("", "job_category");
        private static final javax.xml.namespace.QName DURATION$2 = 
            new javax.xml.namespace.QName("", "duration");
        private static final javax.xml.namespace.QName SECTOR$4 = 
            new javax.xml.namespace.QName("", "sector");
        private static final javax.xml.namespace.QName ROLE$6 = 
            new javax.xml.namespace.QName("", "role");
        private static final javax.xml.namespace.QName EXTENT$8 = 
            new javax.xml.namespace.QName("", "extent");
        
        
        /**
         * Gets array of all "job_category" elements
         */
        public com.abctech.transition.xmladbeans.webtemp.JobCategoryDocument.JobCategory[] getJobCategoryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(JOBCATEGORY$0, targetList);
                com.abctech.transition.xmladbeans.webtemp.JobCategoryDocument.JobCategory[] result = new com.abctech.transition.xmladbeans.webtemp.JobCategoryDocument.JobCategory[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "job_category" element
         */
        public com.abctech.transition.xmladbeans.webtemp.JobCategoryDocument.JobCategory getJobCategoryArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webtemp.JobCategoryDocument.JobCategory target = null;
                target = (com.abctech.transition.xmladbeans.webtemp.JobCategoryDocument.JobCategory)get_store().find_element_user(JOBCATEGORY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "job_category" element
         */
        public int sizeOfJobCategoryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(JOBCATEGORY$0);
            }
        }
        
        /**
         * Sets array of all "job_category" element
         */
        public void setJobCategoryArray(com.abctech.transition.xmladbeans.webtemp.JobCategoryDocument.JobCategory[] jobCategoryArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(jobCategoryArray, JOBCATEGORY$0);
            }
        }
        
        /**
         * Sets ith "job_category" element
         */
        public void setJobCategoryArray(int i, com.abctech.transition.xmladbeans.webtemp.JobCategoryDocument.JobCategory jobCategory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webtemp.JobCategoryDocument.JobCategory target = null;
                target = (com.abctech.transition.xmladbeans.webtemp.JobCategoryDocument.JobCategory)get_store().find_element_user(JOBCATEGORY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(jobCategory);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "job_category" element
         */
        public com.abctech.transition.xmladbeans.webtemp.JobCategoryDocument.JobCategory insertNewJobCategory(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webtemp.JobCategoryDocument.JobCategory target = null;
                target = (com.abctech.transition.xmladbeans.webtemp.JobCategoryDocument.JobCategory)get_store().insert_element_user(JOBCATEGORY$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "job_category" element
         */
        public com.abctech.transition.xmladbeans.webtemp.JobCategoryDocument.JobCategory addNewJobCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webtemp.JobCategoryDocument.JobCategory target = null;
                target = (com.abctech.transition.xmladbeans.webtemp.JobCategoryDocument.JobCategory)get_store().add_element_user(JOBCATEGORY$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "job_category" element
         */
        public void removeJobCategory(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(JOBCATEGORY$0, i);
            }
        }
        
        /**
         * Gets the "duration" element
         */
        public java.lang.String getDuration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "duration" element
         */
        public org.apache.xmlbeans.XmlString xgetDuration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DURATION$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "duration" element
         */
        public boolean isSetDuration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DURATION$2) != 0;
            }
        }
        
        /**
         * Sets the "duration" element
         */
        public void setDuration(java.lang.String duration)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DURATION$2);
                }
                target.setStringValue(duration);
            }
        }
        
        /**
         * Sets (as xml) the "duration" element
         */
        public void xsetDuration(org.apache.xmlbeans.XmlString duration)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DURATION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DURATION$2);
                }
                target.set(duration);
            }
        }
        
        /**
         * Unsets the "duration" element
         */
        public void unsetDuration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DURATION$2, 0);
            }
        }
        
        /**
         * Gets the "sector" element
         */
        public java.lang.String getSector()
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
         * Gets (as xml) the "sector" element
         */
        public org.apache.xmlbeans.XmlString xgetSector()
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
         * Sets the "sector" element
         */
        public void setSector(java.lang.String sector)
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
         * Sets (as xml) the "sector" element
         */
        public void xsetSector(org.apache.xmlbeans.XmlString sector)
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
         * Gets the "role" element
         */
        public java.lang.String getRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROLE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "role" element
         */
        public org.apache.xmlbeans.XmlString xgetRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROLE$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "role" element
         */
        public boolean isSetRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ROLE$6) != 0;
            }
        }
        
        /**
         * Sets the "role" element
         */
        public void setRole(java.lang.String role)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROLE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROLE$6);
                }
                target.setStringValue(role);
            }
        }
        
        /**
         * Sets (as xml) the "role" element
         */
        public void xsetRole(org.apache.xmlbeans.XmlString role)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROLE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ROLE$6);
                }
                target.set(role);
            }
        }
        
        /**
         * Unsets the "role" element
         */
        public void unsetRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ROLE$6, 0);
            }
        }
        
        /**
         * Gets the "extent" element
         */
        public java.lang.String getExtent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTENT$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "extent" element
         */
        public org.apache.xmlbeans.XmlString xgetExtent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTENT$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "extent" element
         */
        public boolean isSetExtent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXTENT$8) != 0;
            }
        }
        
        /**
         * Sets the "extent" element
         */
        public void setExtent(java.lang.String extent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTENT$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTENT$8);
                }
                target.setStringValue(extent);
            }
        }
        
        /**
         * Sets (as xml) the "extent" element
         */
        public void xsetExtent(org.apache.xmlbeans.XmlString extent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTENT$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTENT$8);
                }
                target.set(extent);
            }
        }
        
        /**
         * Unsets the "extent" element
         */
        public void unsetExtent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXTENT$8, 0);
            }
        }
    }
}
