/*
 * An XML document type.
 * Localname: generator
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.GeneratorDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one generator(@) element.
 *
 * This is a complex type.
 */
public class GeneratorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.GeneratorDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeneratorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERATOR$0 = 
        new javax.xml.namespace.QName("", "generator");
    
    
    /**
     * Gets the "generator" element
     */
    public java.lang.String getGenerator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "generator" element
     */
    public org.apache.xmlbeans.XmlString xgetGenerator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENERATOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "generator" element
     */
    public void setGenerator(java.lang.String generator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENERATOR$0);
            }
            target.setStringValue(generator);
        }
    }
    
    /**
     * Sets (as xml) the "generator" element
     */
    public void xsetGenerator(org.apache.xmlbeans.XmlString generator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENERATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GENERATOR$0);
            }
            target.set(generator);
        }
    }
}
