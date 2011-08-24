/*
 * An XML document type.
 * Localname: DATA
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.DATADocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one DATA(@) element.
 *
 * This is a complex type.
 */
public class DATADocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.DATADocument
{
    private static final long serialVersionUID = 1L;
    
    public DATADocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATA$0 = 
        new javax.xml.namespace.QName("", "DATA");
    
    
    /**
     * Gets the "DATA" element
     */
    public com.abctech.transition.xmladbeans.emprof.DATADocument.DATA getDATA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.emprof.DATADocument.DATA target = null;
            target = (com.abctech.transition.xmladbeans.emprof.DATADocument.DATA)get_store().find_element_user(DATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DATA" element
     */
    public void setDATA(com.abctech.transition.xmladbeans.emprof.DATADocument.DATA data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.emprof.DATADocument.DATA target = null;
            target = (com.abctech.transition.xmladbeans.emprof.DATADocument.DATA)get_store().find_element_user(DATA$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.emprof.DATADocument.DATA)get_store().add_element_user(DATA$0);
            }
            target.set(data);
        }
    }
    
    /**
     * Appends and returns a new empty "DATA" element
     */
    public com.abctech.transition.xmladbeans.emprof.DATADocument.DATA addNewDATA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.emprof.DATADocument.DATA target = null;
            target = (com.abctech.transition.xmladbeans.emprof.DATADocument.DATA)get_store().add_element_user(DATA$0);
            return target;
        }
    }
    /**
     * An XML DATA(@).
     *
     * This is a complex type.
     */
    public static class DATAImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.DATADocument.DATA
    {
        private static final long serialVersionUID = 1L;
        
        public DATAImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MEGLERDATA$0 = 
            new javax.xml.namespace.QName("", "MEGLERDATA");
        private static final javax.xml.namespace.QName OPPDRAG$2 = 
            new javax.xml.namespace.QName("", "OPPDRAG");
        
        
        /**
         * Gets the "MEGLERDATA" element
         */
        public com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument.MEGLERDATA getMEGLERDATA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument.MEGLERDATA target = null;
                target = (com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument.MEGLERDATA)get_store().find_element_user(MEGLERDATA$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "MEGLERDATA" element
         */
        public void setMEGLERDATA(com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument.MEGLERDATA meglerdata)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument.MEGLERDATA target = null;
                target = (com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument.MEGLERDATA)get_store().find_element_user(MEGLERDATA$0, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument.MEGLERDATA)get_store().add_element_user(MEGLERDATA$0);
                }
                target.set(meglerdata);
            }
        }
        
        /**
         * Appends and returns a new empty "MEGLERDATA" element
         */
        public com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument.MEGLERDATA addNewMEGLERDATA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument.MEGLERDATA target = null;
                target = (com.abctech.transition.xmladbeans.emprof.MEGLERDATADocument.MEGLERDATA)get_store().add_element_user(MEGLERDATA$0);
                return target;
            }
        }
        
        /**
         * Gets array of all "OPPDRAG" elements
         */
        public com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG[] getOPPDRAGArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OPPDRAG$2, targetList);
                com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG[] result = new com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "OPPDRAG" element
         */
        public com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG getOPPDRAGArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG target = null;
                target = (com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG)get_store().find_element_user(OPPDRAG$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "OPPDRAG" element
         */
        public int sizeOfOPPDRAGArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OPPDRAG$2);
            }
        }
        
        /**
         * Sets array of all "OPPDRAG" element
         */
        public void setOPPDRAGArray(com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG[] oppdragArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(oppdragArray, OPPDRAG$2);
            }
        }
        
        /**
         * Sets ith "OPPDRAG" element
         */
        public void setOPPDRAGArray(int i, com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG oppdrag)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG target = null;
                target = (com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG)get_store().find_element_user(OPPDRAG$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(oppdrag);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "OPPDRAG" element
         */
        public com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG insertNewOPPDRAG(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG target = null;
                target = (com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG)get_store().insert_element_user(OPPDRAG$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "OPPDRAG" element
         */
        public com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG addNewOPPDRAG()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG target = null;
                target = (com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument.OPPDRAG)get_store().add_element_user(OPPDRAG$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "OPPDRAG" element
         */
        public void removeOPPDRAG(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OPPDRAG$2, i);
            }
        }
    }
}
