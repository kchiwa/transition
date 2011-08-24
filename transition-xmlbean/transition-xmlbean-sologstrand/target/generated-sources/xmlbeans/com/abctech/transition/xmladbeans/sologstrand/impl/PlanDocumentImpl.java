/*
 * An XML document type.
 * Localname: plan
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.sologstrand.PlanDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.sologstrand.impl;
/**
 * A document containing one plan(@) element.
 *
 * This is a complex type.
 */
public class PlanDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.PlanDocument
{
    private static final long serialVersionUID = 1L;
    
    public PlanDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PLAN$0 = 
        new javax.xml.namespace.QName("", "plan");
    
    
    /**
     * Gets the "plan" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.PlanDocument.Plan getPlan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.PlanDocument.Plan target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.PlanDocument.Plan)get_store().find_element_user(PLAN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "plan" element
     */
    public void setPlan(com.abctech.transition.xmladbeans.sologstrand.PlanDocument.Plan plan)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.PlanDocument.Plan target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.PlanDocument.Plan)get_store().find_element_user(PLAN$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.sologstrand.PlanDocument.Plan)get_store().add_element_user(PLAN$0);
            }
            target.set(plan);
        }
    }
    
    /**
     * Appends and returns a new empty "plan" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.PlanDocument.Plan addNewPlan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.PlanDocument.Plan target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.PlanDocument.Plan)get_store().add_element_user(PLAN$0);
            return target;
        }
    }
    /**
     * An XML plan(@).
     *
     * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.sologstrand.PlanDocument$Plan.
     */
    public static class PlanImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.abctech.transition.xmladbeans.sologstrand.PlanDocument.Plan
    {
        private static final long serialVersionUID = 1L;
        
        public PlanImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected PlanImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName LARGE$0 = 
            new javax.xml.namespace.QName("", "large");
        
        
        /**
         * Gets the "large" attribute
         */
        public java.lang.String getLarge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LARGE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "large" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLarge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LARGE$0);
                return target;
            }
        }
        
        /**
         * True if has "large" attribute
         */
        public boolean isSetLarge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LARGE$0) != null;
            }
        }
        
        /**
         * Sets the "large" attribute
         */
        public void setLarge(java.lang.String large)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LARGE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LARGE$0);
                }
                target.setStringValue(large);
            }
        }
        
        /**
         * Sets (as xml) the "large" attribute
         */
        public void xsetLarge(org.apache.xmlbeans.XmlString large)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LARGE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LARGE$0);
                }
                target.set(large);
            }
        }
        
        /**
         * Unsets the "large" attribute
         */
        public void unsetLarge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LARGE$0);
            }
        }
    }
}
