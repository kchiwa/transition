/*
 * An XML document type.
 * Localname: lenker
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webmegler.LenkerDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webmegler.impl;
/**
 * A document containing one lenker(@) element.
 *
 * This is a complex type.
 */
public class LenkerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webmegler.LenkerDocument
{
    private static final long serialVersionUID = 1L;
    
    public LenkerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LENKER$0 = 
        new javax.xml.namespace.QName("", "lenker");
    
    
    /**
     * Gets the "lenker" element
     */
    public com.abctech.transition.xmladbeans.webmegler.LenkerDocument.Lenker getLenker()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webmegler.LenkerDocument.Lenker target = null;
            target = (com.abctech.transition.xmladbeans.webmegler.LenkerDocument.Lenker)get_store().find_element_user(LENKER$0, 0);
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
            target = (com.abctech.transition.xmladbeans.webmegler.LenkerDocument.Lenker)get_store().find_element_user(LENKER$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.webmegler.LenkerDocument.Lenker)get_store().add_element_user(LENKER$0);
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
            target = (com.abctech.transition.xmladbeans.webmegler.LenkerDocument.Lenker)get_store().add_element_user(LENKER$0);
            return target;
        }
    }
    /**
     * An XML lenker(@).
     *
     * This is a complex type.
     */
    public static class LenkerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webmegler.LenkerDocument.Lenker
    {
        private static final long serialVersionUID = 1L;
        
        public LenkerImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LENKE$0 = 
            new javax.xml.namespace.QName("", "lenke");
        
        
        /**
         * Gets the "lenke" element
         */
        public com.abctech.transition.xmladbeans.webmegler.LenkeDocument.Lenke getLenke()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.LenkeDocument.Lenke target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.LenkeDocument.Lenke)get_store().find_element_user(LENKE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "lenke" element
         */
        public boolean isSetLenke()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LENKE$0) != 0;
            }
        }
        
        /**
         * Sets the "lenke" element
         */
        public void setLenke(com.abctech.transition.xmladbeans.webmegler.LenkeDocument.Lenke lenke)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.LenkeDocument.Lenke target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.LenkeDocument.Lenke)get_store().find_element_user(LENKE$0, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.webmegler.LenkeDocument.Lenke)get_store().add_element_user(LENKE$0);
                }
                target.set(lenke);
            }
        }
        
        /**
         * Appends and returns a new empty "lenke" element
         */
        public com.abctech.transition.xmladbeans.webmegler.LenkeDocument.Lenke addNewLenke()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.LenkeDocument.Lenke target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.LenkeDocument.Lenke)get_store().add_element_user(LENKE$0);
                return target;
            }
        }
        
        /**
         * Unsets the "lenke" element
         */
        public void unsetLenke()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LENKE$0, 0);
            }
        }
    }
}
