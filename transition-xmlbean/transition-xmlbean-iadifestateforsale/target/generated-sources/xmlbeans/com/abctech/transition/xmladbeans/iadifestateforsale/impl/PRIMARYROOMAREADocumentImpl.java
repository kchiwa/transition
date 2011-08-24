/*
 * An XML document type.
 * Localname: PRIMARY_ROOM_AREA
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.PRIMARYROOMAREADocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one PRIMARY_ROOM_AREA(@) element.
 *
 * This is a complex type.
 */
public class PRIMARYROOMAREADocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.PRIMARYROOMAREADocument
{
    private static final long serialVersionUID = 1L;
    
    public PRIMARYROOMAREADocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRIMARYROOMAREA$0 = 
        new javax.xml.namespace.QName("", "PRIMARY_ROOM_AREA");
    
    
    /**
     * Gets the "PRIMARY_ROOM_AREA" element
     */
    public java.lang.String getPRIMARYROOMAREA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYROOMAREA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PRIMARY_ROOM_AREA" element
     */
    public org.apache.xmlbeans.XmlString xgetPRIMARYROOMAREA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMARYROOMAREA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PRIMARY_ROOM_AREA" element
     */
    public void setPRIMARYROOMAREA(java.lang.String primaryroomarea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYROOMAREA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIMARYROOMAREA$0);
            }
            target.setStringValue(primaryroomarea);
        }
    }
    
    /**
     * Sets (as xml) the "PRIMARY_ROOM_AREA" element
     */
    public void xsetPRIMARYROOMAREA(org.apache.xmlbeans.XmlString primaryroomarea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMARYROOMAREA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRIMARYROOMAREA$0);
            }
            target.set(primaryroomarea);
        }
    }
}
