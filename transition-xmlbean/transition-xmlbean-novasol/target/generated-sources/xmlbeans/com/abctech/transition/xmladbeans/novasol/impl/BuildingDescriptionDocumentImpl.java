/*
 * An XML document type.
 * Localname: BuildingDescription
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.BuildingDescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one BuildingDescription(@) element.
 *
 * This is a complex type.
 */
public class BuildingDescriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.BuildingDescriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public BuildingDescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUILDINGDESCRIPTION$0 = 
        new javax.xml.namespace.QName("", "BuildingDescription");
    
    
    /**
     * Gets the "BuildingDescription" element
     */
    public java.lang.String getBuildingDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUILDINGDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BuildingDescription" element
     */
    public org.apache.xmlbeans.XmlString xgetBuildingDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BUILDINGDESCRIPTION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BuildingDescription" element
     */
    public void setBuildingDescription(java.lang.String buildingDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUILDINGDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUILDINGDESCRIPTION$0);
            }
            target.setStringValue(buildingDescription);
        }
    }
    
    /**
     * Sets (as xml) the "BuildingDescription" element
     */
    public void xsetBuildingDescription(org.apache.xmlbeans.XmlString buildingDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BUILDINGDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BUILDINGDESCRIPTION$0);
            }
            target.set(buildingDescription);
        }
    }
}
