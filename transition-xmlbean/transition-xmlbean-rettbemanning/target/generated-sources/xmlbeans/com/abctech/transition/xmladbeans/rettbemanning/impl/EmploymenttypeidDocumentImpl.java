/*
 * An XML document type.
 * Localname: employmenttypeid
 * Namespace: http://www.intelliplan.se
 * Java type: com.abctech.transition.xmladbeans.rettbemanning.EmploymenttypeidDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.rettbemanning.impl;
/**
 * A document containing one employmenttypeid(@http://www.intelliplan.se) element.
 *
 * This is a complex type.
 */
public class EmploymenttypeidDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.rettbemanning.EmploymenttypeidDocument
{
    private static final long serialVersionUID = 1L;
    
    public EmploymenttypeidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMPLOYMENTTYPEID$0 = 
        new javax.xml.namespace.QName("http://www.intelliplan.se", "employmenttypeid");
    
    
    /**
     * Gets the "employmenttypeid" element
     */
    public java.lang.String getEmploymenttypeid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPLOYMENTTYPEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "employmenttypeid" element
     */
    public org.apache.xmlbeans.XmlString xgetEmploymenttypeid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPLOYMENTTYPEID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "employmenttypeid" element
     */
    public void setEmploymenttypeid(java.lang.String employmenttypeid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPLOYMENTTYPEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMPLOYMENTTYPEID$0);
            }
            target.setStringValue(employmenttypeid);
        }
    }
    
    /**
     * Sets (as xml) the "employmenttypeid" element
     */
    public void xsetEmploymenttypeid(org.apache.xmlbeans.XmlString employmenttypeid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPLOYMENTTYPEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMPLOYMENTTYPEID$0);
            }
            target.set(employmenttypeid);
        }
    }
}
