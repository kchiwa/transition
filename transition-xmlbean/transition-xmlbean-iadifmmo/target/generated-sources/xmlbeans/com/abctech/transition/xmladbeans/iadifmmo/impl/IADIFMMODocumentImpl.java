/*
 * An XML document type.
 * Localname: IAD.IF.MMO
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifmmo.IADIFMMODocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifmmo.impl;
/**
 * A document containing one IAD.IF.MMO(@) element.
 *
 * This is a complex type.
 */
public class IADIFMMODocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifmmo.IADIFMMODocument
{
    private static final long serialVersionUID = 1L;
    
    public IADIFMMODocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IADIFMMO$0 = 
        new javax.xml.namespace.QName("", "IAD.IF.MMO");
    
    
    /**
     * Gets the "IAD.IF.MMO" element
     */
    public com.abctech.transition.xmladbeans.iadifmmo.IADIFMMODocument.IADIFMMO getIADIFMMO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifmmo.IADIFMMODocument.IADIFMMO target = null;
            target = (com.abctech.transition.xmladbeans.iadifmmo.IADIFMMODocument.IADIFMMO)get_store().find_element_user(IADIFMMO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "IAD.IF.MMO" element
     */
    public void setIADIFMMO(com.abctech.transition.xmladbeans.iadifmmo.IADIFMMODocument.IADIFMMO iadifmmo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifmmo.IADIFMMODocument.IADIFMMO target = null;
            target = (com.abctech.transition.xmladbeans.iadifmmo.IADIFMMODocument.IADIFMMO)get_store().find_element_user(IADIFMMO$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifmmo.IADIFMMODocument.IADIFMMO)get_store().add_element_user(IADIFMMO$0);
            }
            target.set(iadifmmo);
        }
    }
    
    /**
     * Appends and returns a new empty "IAD.IF.MMO" element
     */
    public com.abctech.transition.xmladbeans.iadifmmo.IADIFMMODocument.IADIFMMO addNewIADIFMMO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifmmo.IADIFMMODocument.IADIFMMO target = null;
            target = (com.abctech.transition.xmladbeans.iadifmmo.IADIFMMODocument.IADIFMMO)get_store().add_element_user(IADIFMMO$0);
            return target;
        }
    }
    /**
     * An XML IAD.IF.MMO(@).
     *
     * This is a complex type.
     */
    public static class IADIFMMOImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifmmo.IADIFMMODocument.IADIFMMO
    {
        private static final long serialVersionUID = 1L;
        
        public IADIFMMOImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HEAD$0 = 
            new javax.xml.namespace.QName("", "HEAD");
        private static final javax.xml.namespace.QName OBJECT$2 = 
            new javax.xml.namespace.QName("", "OBJECT");
        
        
        /**
         * Gets the "HEAD" element
         */
        public com.abctech.transition.xmladbeans.iadifmmo.HEADDocument.HEAD getHEAD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifmmo.HEADDocument.HEAD target = null;
                target = (com.abctech.transition.xmladbeans.iadifmmo.HEADDocument.HEAD)get_store().find_element_user(HEAD$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "HEAD" element
         */
        public void setHEAD(com.abctech.transition.xmladbeans.iadifmmo.HEADDocument.HEAD head)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifmmo.HEADDocument.HEAD target = null;
                target = (com.abctech.transition.xmladbeans.iadifmmo.HEADDocument.HEAD)get_store().find_element_user(HEAD$0, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifmmo.HEADDocument.HEAD)get_store().add_element_user(HEAD$0);
                }
                target.set(head);
            }
        }
        
        /**
         * Appends and returns a new empty "HEAD" element
         */
        public com.abctech.transition.xmladbeans.iadifmmo.HEADDocument.HEAD addNewHEAD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifmmo.HEADDocument.HEAD target = null;
                target = (com.abctech.transition.xmladbeans.iadifmmo.HEADDocument.HEAD)get_store().add_element_user(HEAD$0);
                return target;
            }
        }
        
        /**
         * Gets the "OBJECT" element
         */
        public com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument.OBJECT getOBJECT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument.OBJECT target = null;
                target = (com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument.OBJECT)get_store().find_element_user(OBJECT$2, 0);
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
        public void setOBJECT(com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument.OBJECT object)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument.OBJECT target = null;
                target = (com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument.OBJECT)get_store().find_element_user(OBJECT$2, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument.OBJECT)get_store().add_element_user(OBJECT$2);
                }
                target.set(object);
            }
        }
        
        /**
         * Appends and returns a new empty "OBJECT" element
         */
        public com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument.OBJECT addNewOBJECT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument.OBJECT target = null;
                target = (com.abctech.transition.xmladbeans.iadifmmo.OBJECTDocument.OBJECT)get_store().add_element_user(OBJECT$2);
                return target;
            }
        }
    }
}
