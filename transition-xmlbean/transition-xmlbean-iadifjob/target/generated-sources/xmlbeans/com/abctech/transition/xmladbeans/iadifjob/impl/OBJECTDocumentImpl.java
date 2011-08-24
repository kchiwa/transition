/*
 * An XML document type.
 * Localname: OBJECT
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifjob.impl;
/**
 * A document containing one OBJECT(@) element.
 *
 * This is a complex type.
 */
public class OBJECTDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument
{
    private static final long serialVersionUID = 1L;
    
    public OBJECTDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECT$0 = 
        new javax.xml.namespace.QName("", "OBJECT");
    
    
    /**
     * Gets the "OBJECT" element
     */
    public com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument.OBJECT getOBJECT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument.OBJECT target = null;
            target = (com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument.OBJECT)get_store().find_element_user(OBJECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OBJECT" element
     */
    public void setOBJECT(com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument.OBJECT object)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument.OBJECT target = null;
            target = (com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument.OBJECT)get_store().find_element_user(OBJECT$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument.OBJECT)get_store().add_element_user(OBJECT$0);
            }
            target.set(object);
        }
    }
    
    /**
     * Appends and returns a new empty "OBJECT" element
     */
    public com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument.OBJECT addNewOBJECT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument.OBJECT target = null;
            target = (com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument.OBJECT)get_store().add_element_user(OBJECT$0);
            return target;
        }
    }
    /**
     * An XML OBJECT(@).
     *
     * This is a complex type.
     */
    public static class OBJECTImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument.OBJECT
    {
        private static final long serialVersionUID = 1L;
        
        public OBJECTImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OBJECTHEAD$0 = 
            new javax.xml.namespace.QName("", "OBJECT_HEAD");
        private static final javax.xml.namespace.QName JOB$2 = 
            new javax.xml.namespace.QName("", "JOB");
        private static final javax.xml.namespace.QName JOBEXECUTIVE$4 = 
            new javax.xml.namespace.QName("", "JOB_EXECUTIVE");
        private static final javax.xml.namespace.QName JOBPARTTIME$6 = 
            new javax.xml.namespace.QName("", "JOB_PARTTIME");
        
        
        /**
         * Gets the "OBJECT_HEAD" element
         */
        public com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument.OBJECTHEAD getOBJECTHEAD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument.OBJECTHEAD target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument.OBJECTHEAD)get_store().find_element_user(OBJECTHEAD$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "OBJECT_HEAD" element
         */
        public void setOBJECTHEAD(com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument.OBJECTHEAD objecthead)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument.OBJECTHEAD target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument.OBJECTHEAD)get_store().find_element_user(OBJECTHEAD$0, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument.OBJECTHEAD)get_store().add_element_user(OBJECTHEAD$0);
                }
                target.set(objecthead);
            }
        }
        
        /**
         * Appends and returns a new empty "OBJECT_HEAD" element
         */
        public com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument.OBJECTHEAD addNewOBJECTHEAD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument.OBJECTHEAD target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.OBJECTHEADDocument.OBJECTHEAD)get_store().add_element_user(OBJECTHEAD$0);
                return target;
            }
        }
        
        /**
         * Gets the "JOB" element
         */
        public com.abctech.transition.xmladbeans.iadifjob.JOBDocument.JOB getJOB()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.JOBDocument.JOB target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.JOBDocument.JOB)get_store().find_element_user(JOB$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "JOB" element
         */
        public boolean isSetJOB()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(JOB$2) != 0;
            }
        }
        
        /**
         * Sets the "JOB" element
         */
        public void setJOB(com.abctech.transition.xmladbeans.iadifjob.JOBDocument.JOB job)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.JOBDocument.JOB target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.JOBDocument.JOB)get_store().find_element_user(JOB$2, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifjob.JOBDocument.JOB)get_store().add_element_user(JOB$2);
                }
                target.set(job);
            }
        }
        
        /**
         * Appends and returns a new empty "JOB" element
         */
        public com.abctech.transition.xmladbeans.iadifjob.JOBDocument.JOB addNewJOB()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.JOBDocument.JOB target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.JOBDocument.JOB)get_store().add_element_user(JOB$2);
                return target;
            }
        }
        
        /**
         * Unsets the "JOB" element
         */
        public void unsetJOB()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(JOB$2, 0);
            }
        }
        
        /**
         * Gets the "JOB_EXECUTIVE" element
         */
        public com.abctech.transition.xmladbeans.iadifjob.JOBEXECUTIVEDocument.JOBEXECUTIVE getJOBEXECUTIVE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.JOBEXECUTIVEDocument.JOBEXECUTIVE target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.JOBEXECUTIVEDocument.JOBEXECUTIVE)get_store().find_element_user(JOBEXECUTIVE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "JOB_EXECUTIVE" element
         */
        public boolean isSetJOBEXECUTIVE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(JOBEXECUTIVE$4) != 0;
            }
        }
        
        /**
         * Sets the "JOB_EXECUTIVE" element
         */
        public void setJOBEXECUTIVE(com.abctech.transition.xmladbeans.iadifjob.JOBEXECUTIVEDocument.JOBEXECUTIVE jobexecutive)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.JOBEXECUTIVEDocument.JOBEXECUTIVE target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.JOBEXECUTIVEDocument.JOBEXECUTIVE)get_store().find_element_user(JOBEXECUTIVE$4, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifjob.JOBEXECUTIVEDocument.JOBEXECUTIVE)get_store().add_element_user(JOBEXECUTIVE$4);
                }
                target.set(jobexecutive);
            }
        }
        
        /**
         * Appends and returns a new empty "JOB_EXECUTIVE" element
         */
        public com.abctech.transition.xmladbeans.iadifjob.JOBEXECUTIVEDocument.JOBEXECUTIVE addNewJOBEXECUTIVE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.JOBEXECUTIVEDocument.JOBEXECUTIVE target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.JOBEXECUTIVEDocument.JOBEXECUTIVE)get_store().add_element_user(JOBEXECUTIVE$4);
                return target;
            }
        }
        
        /**
         * Unsets the "JOB_EXECUTIVE" element
         */
        public void unsetJOBEXECUTIVE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(JOBEXECUTIVE$4, 0);
            }
        }
        
        /**
         * Gets the "JOB_PARTTIME" element
         */
        public com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument.JOBPARTTIME getJOBPARTTIME()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument.JOBPARTTIME target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument.JOBPARTTIME)get_store().find_element_user(JOBPARTTIME$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "JOB_PARTTIME" element
         */
        public boolean isSetJOBPARTTIME()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(JOBPARTTIME$6) != 0;
            }
        }
        
        /**
         * Sets the "JOB_PARTTIME" element
         */
        public void setJOBPARTTIME(com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument.JOBPARTTIME jobparttime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument.JOBPARTTIME target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument.JOBPARTTIME)get_store().find_element_user(JOBPARTTIME$6, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument.JOBPARTTIME)get_store().add_element_user(JOBPARTTIME$6);
                }
                target.set(jobparttime);
            }
        }
        
        /**
         * Appends and returns a new empty "JOB_PARTTIME" element
         */
        public com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument.JOBPARTTIME addNewJOBPARTTIME()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument.JOBPARTTIME target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.JOBPARTTIMEDocument.JOBPARTTIME)get_store().add_element_user(JOBPARTTIME$6);
                return target;
            }
        }
        
        /**
         * Unsets the "JOB_PARTTIME" element
         */
        public void unsetJOBPARTTIME()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(JOBPARTTIME$6, 0);
            }
        }
    }
}
