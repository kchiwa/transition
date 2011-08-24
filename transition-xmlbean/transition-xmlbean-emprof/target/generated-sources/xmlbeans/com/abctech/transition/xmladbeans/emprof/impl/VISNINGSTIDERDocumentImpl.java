/*
 * An XML document type.
 * Localname: VISNINGSTIDER
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one VISNINGSTIDER(@) element.
 *
 * This is a complex type.
 */
public class VISNINGSTIDERDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument
{
    private static final long serialVersionUID = 1L;
    
    public VISNINGSTIDERDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VISNINGSTIDER$0 = 
        new javax.xml.namespace.QName("", "VISNINGSTIDER");
    
    
    /**
     * Gets the "VISNINGSTIDER" element
     */
    public com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER getVISNINGSTIDER()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER target = null;
            target = (com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER)get_store().find_element_user(VISNINGSTIDER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "VISNINGSTIDER" element
     */
    public void setVISNINGSTIDER(com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER visningstider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER target = null;
            target = (com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER)get_store().find_element_user(VISNINGSTIDER$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER)get_store().add_element_user(VISNINGSTIDER$0);
            }
            target.set(visningstider);
        }
    }
    
    /**
     * Appends and returns a new empty "VISNINGSTIDER" element
     */
    public com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER addNewVISNINGSTIDER()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER target = null;
            target = (com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER)get_store().add_element_user(VISNINGSTIDER$0);
            return target;
        }
    }
    /**
     * An XML VISNINGSTIDER(@).
     *
     * This is a complex type.
     */
    public static class VISNINGSTIDERImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument.VISNINGSTIDER
    {
        private static final long serialVersionUID = 1L;
        
        public VISNINGSTIDERImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VISNING$0 = 
            new javax.xml.namespace.QName("", "VISNING");
        
        
        /**
         * Gets the "VISNING" element
         */
        public com.abctech.transition.xmladbeans.emprof.VISNINGDocument.VISNING getVISNING()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.emprof.VISNINGDocument.VISNING target = null;
                target = (com.abctech.transition.xmladbeans.emprof.VISNINGDocument.VISNING)get_store().find_element_user(VISNING$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "VISNING" element
         */
        public void setVISNING(com.abctech.transition.xmladbeans.emprof.VISNINGDocument.VISNING visning)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.emprof.VISNINGDocument.VISNING target = null;
                target = (com.abctech.transition.xmladbeans.emprof.VISNINGDocument.VISNING)get_store().find_element_user(VISNING$0, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.emprof.VISNINGDocument.VISNING)get_store().add_element_user(VISNING$0);
                }
                target.set(visning);
            }
        }
        
        /**
         * Appends and returns a new empty "VISNING" element
         */
        public com.abctech.transition.xmladbeans.emprof.VISNINGDocument.VISNING addNewVISNING()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.emprof.VISNINGDocument.VISNING target = null;
                target = (com.abctech.transition.xmladbeans.emprof.VISNINGDocument.VISNING)get_store().add_element_user(VISNING$0);
                return target;
            }
        }
    }
}
