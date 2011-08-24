/*
 * An XML document type.
 * Localname: OBJECT
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifstop.OBJECTDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifstop.impl;
/**
 * A document containing one OBJECT(@) element.
 *
 * This is a complex type.
 */
public class OBJECTDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifstop.OBJECTDocument
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
    public com.abctech.transition.xmladbeans.iadifstop.OBJECTDocument.OBJECT getOBJECT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifstop.OBJECTDocument.OBJECT target = null;
            target = (com.abctech.transition.xmladbeans.iadifstop.OBJECTDocument.OBJECT)get_store().find_element_user(OBJECT$0, 0);
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
    public void setOBJECT(com.abctech.transition.xmladbeans.iadifstop.OBJECTDocument.OBJECT object)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifstop.OBJECTDocument.OBJECT target = null;
            target = (com.abctech.transition.xmladbeans.iadifstop.OBJECTDocument.OBJECT)get_store().find_element_user(OBJECT$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifstop.OBJECTDocument.OBJECT)get_store().add_element_user(OBJECT$0);
            }
            target.set(object);
        }
    }
    
    /**
     * Appends and returns a new empty "OBJECT" element
     */
    public com.abctech.transition.xmladbeans.iadifstop.OBJECTDocument.OBJECT addNewOBJECT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifstop.OBJECTDocument.OBJECT target = null;
            target = (com.abctech.transition.xmladbeans.iadifstop.OBJECTDocument.OBJECT)get_store().add_element_user(OBJECT$0);
            return target;
        }
    }
    /**
     * An XML OBJECT(@).
     *
     * This is a complex type.
     */
    public static class OBJECTImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifstop.OBJECTDocument.OBJECT
    {
        private static final long serialVersionUID = 1L;
        
        public OBJECTImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OBJECTHEAD$0 = 
            new javax.xml.namespace.QName("", "OBJECT_HEAD");
        
        
        /**
         * Gets the "OBJECT_HEAD" element
         */
        public com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument.OBJECTHEAD getOBJECTHEAD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument.OBJECTHEAD target = null;
                target = (com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument.OBJECTHEAD)get_store().find_element_user(OBJECTHEAD$0, 0);
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
        public void setOBJECTHEAD(com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument.OBJECTHEAD objecthead)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument.OBJECTHEAD target = null;
                target = (com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument.OBJECTHEAD)get_store().find_element_user(OBJECTHEAD$0, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument.OBJECTHEAD)get_store().add_element_user(OBJECTHEAD$0);
                }
                target.set(objecthead);
            }
        }
        
        /**
         * Appends and returns a new empty "OBJECT_HEAD" element
         */
        public com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument.OBJECTHEAD addNewOBJECTHEAD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument.OBJECTHEAD target = null;
                target = (com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument.OBJECTHEAD)get_store().add_element_user(OBJECTHEAD$0);
                return target;
            }
        }
    }
}
