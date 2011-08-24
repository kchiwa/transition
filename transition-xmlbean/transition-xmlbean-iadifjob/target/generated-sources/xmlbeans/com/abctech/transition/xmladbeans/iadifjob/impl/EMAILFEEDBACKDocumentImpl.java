/*
 * An XML document type.
 * Localname: EMAIL_FEEDBACK
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifjob.EMAILFEEDBACKDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifjob.impl;
/**
 * A document containing one EMAIL_FEEDBACK(@) element.
 *
 * This is a complex type.
 */
public class EMAILFEEDBACKDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifjob.EMAILFEEDBACKDocument
{
    private static final long serialVersionUID = 1L;
    
    public EMAILFEEDBACKDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMAILFEEDBACK$0 = 
        new javax.xml.namespace.QName("", "EMAIL_FEEDBACK");
    
    
    /**
     * Gets the "EMAIL_FEEDBACK" element
     */
    public com.abctech.transition.xmladbeans.iadifjob.EMAILFEEDBACKDocument.EMAILFEEDBACK getEMAILFEEDBACK()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifjob.EMAILFEEDBACKDocument.EMAILFEEDBACK target = null;
            target = (com.abctech.transition.xmladbeans.iadifjob.EMAILFEEDBACKDocument.EMAILFEEDBACK)get_store().find_element_user(EMAILFEEDBACK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EMAIL_FEEDBACK" element
     */
    public void setEMAILFEEDBACK(com.abctech.transition.xmladbeans.iadifjob.EMAILFEEDBACKDocument.EMAILFEEDBACK emailfeedback)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifjob.EMAILFEEDBACKDocument.EMAILFEEDBACK target = null;
            target = (com.abctech.transition.xmladbeans.iadifjob.EMAILFEEDBACKDocument.EMAILFEEDBACK)get_store().find_element_user(EMAILFEEDBACK$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifjob.EMAILFEEDBACKDocument.EMAILFEEDBACK)get_store().add_element_user(EMAILFEEDBACK$0);
            }
            target.set(emailfeedback);
        }
    }
    
    /**
     * Appends and returns a new empty "EMAIL_FEEDBACK" element
     */
    public com.abctech.transition.xmladbeans.iadifjob.EMAILFEEDBACKDocument.EMAILFEEDBACK addNewEMAILFEEDBACK()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifjob.EMAILFEEDBACKDocument.EMAILFEEDBACK target = null;
            target = (com.abctech.transition.xmladbeans.iadifjob.EMAILFEEDBACKDocument.EMAILFEEDBACK)get_store().add_element_user(EMAILFEEDBACK$0);
            return target;
        }
    }
    /**
     * An XML EMAIL_FEEDBACK(@).
     *
     * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.iadifjob.EMAILFEEDBACKDocument$EMAILFEEDBACK.
     */
    public static class EMAILFEEDBACKImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.abctech.transition.xmladbeans.iadifjob.EMAILFEEDBACKDocument.EMAILFEEDBACK
    {
        private static final long serialVersionUID = 1L;
        
        public EMAILFEEDBACKImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected EMAILFEEDBACKImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName FEEDBACKLEVEL$0 = 
            new javax.xml.namespace.QName("", "FEEDBACK_LEVEL");
        
        
        /**
         * Gets the "FEEDBACK_LEVEL" attribute
         */
        public com.abctech.transition.xmladbeans.iadifjob.EMAILFEEDBACKDocument.EMAILFEEDBACK.FEEDBACKLEVEL.Enum getFEEDBACKLEVEL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FEEDBACKLEVEL$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FEEDBACKLEVEL$0);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.abctech.transition.xmladbeans.iadifjob.EMAILFEEDBACKDocument.EMAILFEEDBACK.FEEDBACKLEVEL.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "FEEDBACK_LEVEL" attribute
         */
        public com.abctech.transition.xmladbeans.iadifjob.EMAILFEEDBACKDocument.EMAILFEEDBACK.FEEDBACKLEVEL xgetFEEDBACKLEVEL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.EMAILFEEDBACKDocument.EMAILFEEDBACK.FEEDBACKLEVEL target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.EMAILFEEDBACKDocument.EMAILFEEDBACK.FEEDBACKLEVEL)get_store().find_attribute_user(FEEDBACKLEVEL$0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifjob.EMAILFEEDBACKDocument.EMAILFEEDBACK.FEEDBACKLEVEL)get_default_attribute_value(FEEDBACKLEVEL$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "FEEDBACK_LEVEL" attribute
         */
        public boolean isSetFEEDBACKLEVEL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FEEDBACKLEVEL$0) != null;
            }
        }
        
        /**
         * Sets the "FEEDBACK_LEVEL" attribute
         */
        public void setFEEDBACKLEVEL(com.abctech.transition.xmladbeans.iadifjob.EMAILFEEDBACKDocument.EMAILFEEDBACK.FEEDBACKLEVEL.Enum feedbacklevel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FEEDBACKLEVEL$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FEEDBACKLEVEL$0);
                }
                target.setEnumValue(feedbacklevel);
            }
        }
        
        /**
         * Sets (as xml) the "FEEDBACK_LEVEL" attribute
         */
        public void xsetFEEDBACKLEVEL(com.abctech.transition.xmladbeans.iadifjob.EMAILFEEDBACKDocument.EMAILFEEDBACK.FEEDBACKLEVEL feedbacklevel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.iadifjob.EMAILFEEDBACKDocument.EMAILFEEDBACK.FEEDBACKLEVEL target = null;
                target = (com.abctech.transition.xmladbeans.iadifjob.EMAILFEEDBACKDocument.EMAILFEEDBACK.FEEDBACKLEVEL)get_store().find_attribute_user(FEEDBACKLEVEL$0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.iadifjob.EMAILFEEDBACKDocument.EMAILFEEDBACK.FEEDBACKLEVEL)get_store().add_attribute_user(FEEDBACKLEVEL$0);
                }
                target.set(feedbacklevel);
            }
        }
        
        /**
         * Unsets the "FEEDBACK_LEVEL" attribute
         */
        public void unsetFEEDBACKLEVEL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FEEDBACKLEVEL$0);
            }
        }
        /**
         * An XML FEEDBACK_LEVEL(@).
         *
         * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.iadifjob.EMAILFEEDBACKDocument$EMAILFEEDBACK$FEEDBACKLEVEL.
         */
        public static class FEEDBACKLEVELImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.abctech.transition.xmladbeans.iadifjob.EMAILFEEDBACKDocument.EMAILFEEDBACK.FEEDBACKLEVEL
        {
            private static final long serialVersionUID = 1L;
            
            public FEEDBACKLEVELImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected FEEDBACKLEVELImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
