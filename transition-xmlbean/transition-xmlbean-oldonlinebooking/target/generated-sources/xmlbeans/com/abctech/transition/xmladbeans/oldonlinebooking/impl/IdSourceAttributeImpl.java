/*
 * An XML attribute type.
 * Localname: id_source
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.oldonlinebooking.IdSourceAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.oldonlinebooking.impl;
/**
 * A document containing one id_source(@) attribute.
 *
 * This is a complex type.
 */
public class IdSourceAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.oldonlinebooking.IdSourceAttribute
{
    private static final long serialVersionUID = 1L;
    
    public IdSourceAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDSOURCE$0 = 
        new javax.xml.namespace.QName("", "id_source");
    
    
    /**
     * Gets the "id_source" attribute
     */
    public java.lang.String getIdSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDSOURCE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id_source" attribute
     */
    public org.apache.xmlbeans.XmlString xgetIdSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IDSOURCE$0);
            return target;
        }
    }
    
    /**
     * True if has "id_source" attribute
     */
    public boolean isSetIdSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(IDSOURCE$0) != null;
        }
    }
    
    /**
     * Sets the "id_source" attribute
     */
    public void setIdSource(java.lang.String idSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDSOURCE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IDSOURCE$0);
            }
            target.setStringValue(idSource);
        }
    }
    
    /**
     * Sets (as xml) the "id_source" attribute
     */
    public void xsetIdSource(org.apache.xmlbeans.XmlString idSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IDSOURCE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(IDSOURCE$0);
            }
            target.set(idSource);
        }
    }
    
    /**
     * Unsets the "id_source" attribute
     */
    public void unsetIdSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(IDSOURCE$0);
        }
    }
}
