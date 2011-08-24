/*
 * An XML document type.
 * Localname: ExtraParameter
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol.impl;
/**
 * A document containing one ExtraParameter(@) element.
 *
 * This is a complex type.
 */
public class ExtraParameterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExtraParameterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTRAPARAMETER$0 = 
        new javax.xml.namespace.QName("", "ExtraParameter");
    
    
    /**
     * Gets the "ExtraParameter" element
     */
    public com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter getExtraParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter target = null;
            target = (com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter)get_store().find_element_user(EXTRAPARAMETER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ExtraParameter" element
     */
    public void setExtraParameter(com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter extraParameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter target = null;
            target = (com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter)get_store().find_element_user(EXTRAPARAMETER$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter)get_store().add_element_user(EXTRAPARAMETER$0);
            }
            target.set(extraParameter);
        }
    }
    
    /**
     * Appends and returns a new empty "ExtraParameter" element
     */
    public com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter addNewExtraParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter target = null;
            target = (com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter)get_store().add_element_user(EXTRAPARAMETER$0);
            return target;
        }
    }
    /**
     * An XML ExtraParameter(@).
     *
     * This is a complex type.
     */
    public static class ExtraParameterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter
    {
        private static final long serialVersionUID = 1L;
        
        public ExtraParameterImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EXTRADESCRIPTION$0 = 
            new javax.xml.namespace.QName("", "ExtraDescription");
        private static final javax.xml.namespace.QName EXTRAUNITVALUE$2 = 
            new javax.xml.namespace.QName("", "ExtraUnitValue");
        private static final javax.xml.namespace.QName EXTRAUNIT$4 = 
            new javax.xml.namespace.QName("", "ExtraUnit");
        private static final javax.xml.namespace.QName EXTRAUNITDESCRIPTION$6 = 
            new javax.xml.namespace.QName("", "ExtraUnitDescription");
        private static final javax.xml.namespace.QName ID$8 = 
            new javax.xml.namespace.QName("", "id");
        
        
        /**
         * Gets the "ExtraDescription" element
         */
        public java.lang.String getExtraDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRADESCRIPTION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ExtraDescription" element
         */
        public org.apache.xmlbeans.XmlString xgetExtraDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRADESCRIPTION$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ExtraDescription" element
         */
        public void setExtraDescription(java.lang.String extraDescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRADESCRIPTION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTRADESCRIPTION$0);
                }
                target.setStringValue(extraDescription);
            }
        }
        
        /**
         * Sets (as xml) the "ExtraDescription" element
         */
        public void xsetExtraDescription(org.apache.xmlbeans.XmlString extraDescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRADESCRIPTION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTRADESCRIPTION$0);
                }
                target.set(extraDescription);
            }
        }
        
        /**
         * Gets the "ExtraUnitValue" element
         */
        public java.lang.String getExtraUnitValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRAUNITVALUE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ExtraUnitValue" element
         */
        public org.apache.xmlbeans.XmlString xgetExtraUnitValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRAUNITVALUE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ExtraUnitValue" element
         */
        public void setExtraUnitValue(java.lang.String extraUnitValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRAUNITVALUE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTRAUNITVALUE$2);
                }
                target.setStringValue(extraUnitValue);
            }
        }
        
        /**
         * Sets (as xml) the "ExtraUnitValue" element
         */
        public void xsetExtraUnitValue(org.apache.xmlbeans.XmlString extraUnitValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRAUNITVALUE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTRAUNITVALUE$2);
                }
                target.set(extraUnitValue);
            }
        }
        
        /**
         * Gets the "ExtraUnit" element
         */
        public java.lang.String getExtraUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRAUNIT$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ExtraUnit" element
         */
        public org.apache.xmlbeans.XmlString xgetExtraUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRAUNIT$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ExtraUnit" element
         */
        public void setExtraUnit(java.lang.String extraUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRAUNIT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTRAUNIT$4);
                }
                target.setStringValue(extraUnit);
            }
        }
        
        /**
         * Sets (as xml) the "ExtraUnit" element
         */
        public void xsetExtraUnit(org.apache.xmlbeans.XmlString extraUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRAUNIT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTRAUNIT$4);
                }
                target.set(extraUnit);
            }
        }
        
        /**
         * Gets the "ExtraUnitDescription" element
         */
        public java.lang.String getExtraUnitDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRAUNITDESCRIPTION$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ExtraUnitDescription" element
         */
        public org.apache.xmlbeans.XmlString xgetExtraUnitDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRAUNITDESCRIPTION$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ExtraUnitDescription" element
         */
        public void setExtraUnitDescription(java.lang.String extraUnitDescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRAUNITDESCRIPTION$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTRAUNITDESCRIPTION$6);
                }
                target.setStringValue(extraUnitDescription);
            }
        }
        
        /**
         * Sets (as xml) the "ExtraUnitDescription" element
         */
        public void xsetExtraUnitDescription(org.apache.xmlbeans.XmlString extraUnitDescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRAUNITDESCRIPTION$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTRAUNITDESCRIPTION$6);
                }
                target.set(extraUnitDescription);
            }
        }
        
        /**
         * Gets the "id" attribute
         */
        public java.math.BigInteger getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ID$8);
                return target;
            }
        }
        
        /**
         * Sets the "id" attribute
         */
        public void setId(java.math.BigInteger id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$8);
                }
                target.setBigIntegerValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" attribute
         */
        public void xsetId(org.apache.xmlbeans.XmlInteger id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ID$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(ID$8);
                }
                target.set(id);
            }
        }
    }
}
