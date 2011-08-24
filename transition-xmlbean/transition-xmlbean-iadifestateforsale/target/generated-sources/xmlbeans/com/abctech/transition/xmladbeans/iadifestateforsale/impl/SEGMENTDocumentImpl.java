/*
 * An XML document type.
 * Localname: SEGMENT
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one SEGMENT(@) element.
 *
 * This is a complex type.
 */
public class SEGMENTDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument
{
    private static final long serialVersionUID = 1L;
    
    public SEGMENTDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEGMENT$0 = 
        new javax.xml.namespace.QName("", "SEGMENT");
    
    
    /**
     * Gets the "SEGMENT" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT getSEGMENT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT)get_store().find_element_user(SEGMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SEGMENT" element
     */
    public void setSEGMENT(com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT segment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT)get_store().find_element_user(SEGMENT$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT)get_store().add_element_user(SEGMENT$0);
            }
            target.set(segment);
        }
    }
    
    /**
     * Appends and returns a new empty "SEGMENT" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT addNewSEGMENT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT)get_store().add_element_user(SEGMENT$0);
            return target;
        }
    }
    /**
     * An XML SEGMENT(@).
     *
     * This is a complex type.
     */
    public static class SEGMENTImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT
    {
        private static final long serialVersionUID = 1L;
        
        public SEGMENTImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INDICATOR$0 = 
            new javax.xml.namespace.QName("", "INDICATOR");
        
        
        /**
         * Gets the "INDICATOR" attribute
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT.INDICATOR.Enum getINDICATOR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDICATOR$0);
                if (target == null)
                {
                    return null;
                }
                return (com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT.INDICATOR.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "INDICATOR" attribute
         */
        public com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT.INDICATOR xgetINDICATOR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT.INDICATOR target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT.INDICATOR)get_store().find_attribute_user(INDICATOR$0);
                return target;
            }
        }
        
        /**
         * Sets the "INDICATOR" attribute
         */
        public void setINDICATOR(com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT.INDICATOR.Enum indicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDICATOR$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INDICATOR$0);
                }
                target.setEnumValue(indicator);
            }
        }
        
        /**
         * Sets (as xml) the "INDICATOR" attribute
         */
        public void xsetINDICATOR(com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT.INDICATOR indicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT.INDICATOR target = null;
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT.INDICATOR)get_store().find_attribute_user(INDICATOR$0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT.INDICATOR)get_store().add_attribute_user(INDICATOR$0);
                }
                target.set(indicator);
            }
        }
        /**
         * An XML INDICATOR(@).
         *
         * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument$SEGMENT$INDICATOR.
         */
        public static class INDICATORImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.abctech.transition.xmladbeans.iadifestateforsale.SEGMENTDocument.SEGMENT.INDICATOR
        {
            private static final long serialVersionUID = 1L;
            
            public INDICATORImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected INDICATORImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
