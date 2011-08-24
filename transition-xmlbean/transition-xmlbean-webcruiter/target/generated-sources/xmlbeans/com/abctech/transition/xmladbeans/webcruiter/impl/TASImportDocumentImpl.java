/*
 * An XML document type.
 * Localname: TAS.Import
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webcruiter.TASImportDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webcruiter.impl;
/**
 * A document containing one TAS.Import(@) element.
 *
 * This is a complex type.
 */
public class TASImportDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webcruiter.TASImportDocument
{
    private static final long serialVersionUID = 1L;
    
    public TASImportDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TASIMPORT$0 = 
        new javax.xml.namespace.QName("", "TAS.Import");
    
    
    /**
     * Gets the "TAS.Import" element
     */
    public com.abctech.transition.xmladbeans.webcruiter.TASImportDocument.TASImport getTASImport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webcruiter.TASImportDocument.TASImport target = null;
            target = (com.abctech.transition.xmladbeans.webcruiter.TASImportDocument.TASImport)get_store().find_element_user(TASIMPORT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TAS.Import" element
     */
    public void setTASImport(com.abctech.transition.xmladbeans.webcruiter.TASImportDocument.TASImport tasImport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webcruiter.TASImportDocument.TASImport target = null;
            target = (com.abctech.transition.xmladbeans.webcruiter.TASImportDocument.TASImport)get_store().find_element_user(TASIMPORT$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.webcruiter.TASImportDocument.TASImport)get_store().add_element_user(TASIMPORT$0);
            }
            target.set(tasImport);
        }
    }
    
    /**
     * Appends and returns a new empty "TAS.Import" element
     */
    public com.abctech.transition.xmladbeans.webcruiter.TASImportDocument.TASImport addNewTASImport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webcruiter.TASImportDocument.TASImport target = null;
            target = (com.abctech.transition.xmladbeans.webcruiter.TASImportDocument.TASImport)get_store().add_element_user(TASIMPORT$0);
            return target;
        }
    }
    /**
     * An XML TAS.Import(@).
     *
     * This is a complex type.
     */
    public static class TASImportImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webcruiter.TASImportDocument.TASImport
    {
        private static final long serialVersionUID = 1L;
        
        public TASImportImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName JOB$0 = 
            new javax.xml.namespace.QName("", "Job");
        private static final javax.xml.namespace.QName VERSION$2 = 
            new javax.xml.namespace.QName("", "Version");
        private static final javax.xml.namespace.QName LANG$4 = 
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
        
        
        /**
         * Gets array of all "Job" elements
         */
        public com.abctech.transition.xmladbeans.webcruiter.JobDocument.Job[] getJobArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(JOB$0, targetList);
                com.abctech.transition.xmladbeans.webcruiter.JobDocument.Job[] result = new com.abctech.transition.xmladbeans.webcruiter.JobDocument.Job[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Job" element
         */
        public com.abctech.transition.xmladbeans.webcruiter.JobDocument.Job getJobArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.JobDocument.Job target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.JobDocument.Job)get_store().find_element_user(JOB$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Job" element
         */
        public int sizeOfJobArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(JOB$0);
            }
        }
        
        /**
         * Sets array of all "Job" element
         */
        public void setJobArray(com.abctech.transition.xmladbeans.webcruiter.JobDocument.Job[] jobArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(jobArray, JOB$0);
            }
        }
        
        /**
         * Sets ith "Job" element
         */
        public void setJobArray(int i, com.abctech.transition.xmladbeans.webcruiter.JobDocument.Job job)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.JobDocument.Job target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.JobDocument.Job)get_store().find_element_user(JOB$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(job);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Job" element
         */
        public com.abctech.transition.xmladbeans.webcruiter.JobDocument.Job insertNewJob(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.JobDocument.Job target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.JobDocument.Job)get_store().insert_element_user(JOB$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Job" element
         */
        public com.abctech.transition.xmladbeans.webcruiter.JobDocument.Job addNewJob()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webcruiter.JobDocument.Job target = null;
                target = (com.abctech.transition.xmladbeans.webcruiter.JobDocument.Job)get_store().add_element_user(JOB$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Job" element
         */
        public void removeJob(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(JOB$0, i);
            }
        }
        
        /**
         * Gets the "Version" attribute
         */
        public java.lang.String getVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Version" attribute
         */
        public org.apache.xmlbeans.XmlString xgetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSION$2);
                return target;
            }
        }
        
        /**
         * True if has "Version" attribute
         */
        public boolean isSetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VERSION$2) != null;
            }
        }
        
        /**
         * Sets the "Version" attribute
         */
        public void setVersion(java.lang.String version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$2);
                }
                target.setStringValue(version);
            }
        }
        
        /**
         * Sets (as xml) the "Version" attribute
         */
        public void xsetVersion(org.apache.xmlbeans.XmlString version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSION$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VERSION$2);
                }
                target.set(version);
            }
        }
        
        /**
         * Unsets the "Version" attribute
         */
        public void unsetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VERSION$2);
            }
        }
        
        /**
         * Gets the "lang" attribute
         */
        public java.lang.String getLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "lang" attribute
         */
        public org.apache.xmlbeans.XmlNCName xgetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNCName target = null;
                target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(LANG$4);
                return target;
            }
        }
        
        /**
         * True if has "lang" attribute
         */
        public boolean isSetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LANG$4) != null;
            }
        }
        
        /**
         * Sets the "lang" attribute
         */
        public void setLang(java.lang.String lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$4);
                }
                target.setStringValue(lang);
            }
        }
        
        /**
         * Sets (as xml) the "lang" attribute
         */
        public void xsetLang(org.apache.xmlbeans.XmlNCName lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNCName target = null;
                target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(LANG$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(LANG$4);
                }
                target.set(lang);
            }
        }
        
        /**
         * Unsets the "lang" attribute
         */
        public void unsetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LANG$4);
            }
        }
    }
}
