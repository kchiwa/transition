/*
 * An XML document type.
 * Localname: PRIMARY_ROOM_DESCRIPTION
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.PRIMARYROOMDESCRIPTIONDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one PRIMARY_ROOM_DESCRIPTION(@) element.
 *
 * This is a complex type.
 */
public class PRIMARYROOMDESCRIPTIONDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.PRIMARYROOMDESCRIPTIONDocument
{
    private static final long serialVersionUID = 1L;
    
    public PRIMARYROOMDESCRIPTIONDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRIMARYROOMDESCRIPTION$0 = 
        new javax.xml.namespace.QName("", "PRIMARY_ROOM_DESCRIPTION");
    
    
    /**
     * Gets the "PRIMARY_ROOM_DESCRIPTION" element
     */
    public java.lang.String getPRIMARYROOMDESCRIPTION()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYROOMDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PRIMARY_ROOM_DESCRIPTION" element
     */
    public org.apache.xmlbeans.XmlString xgetPRIMARYROOMDESCRIPTION()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMARYROOMDESCRIPTION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PRIMARY_ROOM_DESCRIPTION" element
     */
    public void setPRIMARYROOMDESCRIPTION(java.lang.String primaryroomdescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYROOMDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIMARYROOMDESCRIPTION$0);
            }
            target.setStringValue(primaryroomdescription);
        }
    }
    
    /**
     * Sets (as xml) the "PRIMARY_ROOM_DESCRIPTION" element
     */
    public void xsetPRIMARYROOMDESCRIPTION(org.apache.xmlbeans.XmlString primaryroomdescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMARYROOMDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRIMARYROOMDESCRIPTION$0);
            }
            target.set(primaryroomdescription);
        }
    }
}
