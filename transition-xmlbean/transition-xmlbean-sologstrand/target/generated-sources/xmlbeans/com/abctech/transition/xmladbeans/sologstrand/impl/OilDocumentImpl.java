/*
 * An XML document type.
 * Localname: oil
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.sologstrand.OilDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.sologstrand.impl;
/**
 * A document containing one oil(@) element.
 *
 * This is a complex type.
 */
public class OilDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.OilDocument
{
    private static final long serialVersionUID = 1L;
    
    public OilDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OIL$0 = 
        new javax.xml.namespace.QName("", "oil");
    
    
    /**
     * Gets the "oil" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.OilDocument.Oil getOil()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.OilDocument.Oil target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.OilDocument.Oil)get_store().find_element_user(OIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "oil" element
     */
    public void setOil(com.abctech.transition.xmladbeans.sologstrand.OilDocument.Oil oil)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.OilDocument.Oil target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.OilDocument.Oil)get_store().find_element_user(OIL$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.sologstrand.OilDocument.Oil)get_store().add_element_user(OIL$0);
            }
            target.set(oil);
        }
    }
    
    /**
     * Appends and returns a new empty "oil" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.OilDocument.Oil addNewOil()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.OilDocument.Oil target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.OilDocument.Oil)get_store().add_element_user(OIL$0);
            return target;
        }
    }
    /**
     * An XML oil(@).
     *
     * This is an atomic type that is a restriction of com.abctech.transition.xmladbeans.sologstrand.OilDocument$Oil.
     */
    public static class OilImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.abctech.transition.xmladbeans.sologstrand.OilDocument.Oil
    {
        private static final long serialVersionUID = 1L;
        
        public OilImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected OilImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName TEXTDK$0 = 
            new javax.xml.namespace.QName("", "text_dk");
        private static final javax.xml.namespace.QName TEXTDE$2 = 
            new javax.xml.namespace.QName("", "text_de");
        private static final javax.xml.namespace.QName TEXTSE$4 = 
            new javax.xml.namespace.QName("", "text_se");
        private static final javax.xml.namespace.QName TEXTNO$6 = 
            new javax.xml.namespace.QName("", "text_no");
        private static final javax.xml.namespace.QName TEXTUK$8 = 
            new javax.xml.namespace.QName("", "text_uk");
        private static final javax.xml.namespace.QName TEXTNL$10 = 
            new javax.xml.namespace.QName("", "text_nl");
        
        
        /**
         * Gets the "text_dk" attribute
         */
        public java.lang.String getTextDk()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTDK$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "text_dk" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTextDk()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTDK$0);
                return target;
            }
        }
        
        /**
         * True if has "text_dk" attribute
         */
        public boolean isSetTextDk()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TEXTDK$0) != null;
            }
        }
        
        /**
         * Sets the "text_dk" attribute
         */
        public void setTextDk(java.lang.String textDk)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTDK$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEXTDK$0);
                }
                target.setStringValue(textDk);
            }
        }
        
        /**
         * Sets (as xml) the "text_dk" attribute
         */
        public void xsetTextDk(org.apache.xmlbeans.XmlString textDk)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTDK$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TEXTDK$0);
                }
                target.set(textDk);
            }
        }
        
        /**
         * Unsets the "text_dk" attribute
         */
        public void unsetTextDk()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TEXTDK$0);
            }
        }
        
        /**
         * Gets the "text_de" attribute
         */
        public java.lang.String getTextDe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTDE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "text_de" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTextDe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTDE$2);
                return target;
            }
        }
        
        /**
         * True if has "text_de" attribute
         */
        public boolean isSetTextDe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TEXTDE$2) != null;
            }
        }
        
        /**
         * Sets the "text_de" attribute
         */
        public void setTextDe(java.lang.String textDe)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTDE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEXTDE$2);
                }
                target.setStringValue(textDe);
            }
        }
        
        /**
         * Sets (as xml) the "text_de" attribute
         */
        public void xsetTextDe(org.apache.xmlbeans.XmlString textDe)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTDE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TEXTDE$2);
                }
                target.set(textDe);
            }
        }
        
        /**
         * Unsets the "text_de" attribute
         */
        public void unsetTextDe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TEXTDE$2);
            }
        }
        
        /**
         * Gets the "text_se" attribute
         */
        public java.lang.String getTextSe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTSE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "text_se" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTextSe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTSE$4);
                return target;
            }
        }
        
        /**
         * True if has "text_se" attribute
         */
        public boolean isSetTextSe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TEXTSE$4) != null;
            }
        }
        
        /**
         * Sets the "text_se" attribute
         */
        public void setTextSe(java.lang.String textSe)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTSE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEXTSE$4);
                }
                target.setStringValue(textSe);
            }
        }
        
        /**
         * Sets (as xml) the "text_se" attribute
         */
        public void xsetTextSe(org.apache.xmlbeans.XmlString textSe)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTSE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TEXTSE$4);
                }
                target.set(textSe);
            }
        }
        
        /**
         * Unsets the "text_se" attribute
         */
        public void unsetTextSe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TEXTSE$4);
            }
        }
        
        /**
         * Gets the "text_no" attribute
         */
        public java.lang.String getTextNo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTNO$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "text_no" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTextNo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTNO$6);
                return target;
            }
        }
        
        /**
         * True if has "text_no" attribute
         */
        public boolean isSetTextNo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TEXTNO$6) != null;
            }
        }
        
        /**
         * Sets the "text_no" attribute
         */
        public void setTextNo(java.lang.String textNo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTNO$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEXTNO$6);
                }
                target.setStringValue(textNo);
            }
        }
        
        /**
         * Sets (as xml) the "text_no" attribute
         */
        public void xsetTextNo(org.apache.xmlbeans.XmlString textNo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTNO$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TEXTNO$6);
                }
                target.set(textNo);
            }
        }
        
        /**
         * Unsets the "text_no" attribute
         */
        public void unsetTextNo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TEXTNO$6);
            }
        }
        
        /**
         * Gets the "text_uk" attribute
         */
        public java.lang.String getTextUk()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTUK$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "text_uk" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTextUk()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTUK$8);
                return target;
            }
        }
        
        /**
         * True if has "text_uk" attribute
         */
        public boolean isSetTextUk()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TEXTUK$8) != null;
            }
        }
        
        /**
         * Sets the "text_uk" attribute
         */
        public void setTextUk(java.lang.String textUk)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTUK$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEXTUK$8);
                }
                target.setStringValue(textUk);
            }
        }
        
        /**
         * Sets (as xml) the "text_uk" attribute
         */
        public void xsetTextUk(org.apache.xmlbeans.XmlString textUk)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTUK$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TEXTUK$8);
                }
                target.set(textUk);
            }
        }
        
        /**
         * Unsets the "text_uk" attribute
         */
        public void unsetTextUk()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TEXTUK$8);
            }
        }
        
        /**
         * Gets the "text_nl" attribute
         */
        public java.lang.String getTextNl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTNL$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "text_nl" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTextNl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTNL$10);
                return target;
            }
        }
        
        /**
         * True if has "text_nl" attribute
         */
        public boolean isSetTextNl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TEXTNL$10) != null;
            }
        }
        
        /**
         * Sets the "text_nl" attribute
         */
        public void setTextNl(java.lang.String textNl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTNL$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEXTNL$10);
                }
                target.setStringValue(textNl);
            }
        }
        
        /**
         * Sets (as xml) the "text_nl" attribute
         */
        public void xsetTextNl(org.apache.xmlbeans.XmlString textNl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTNL$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TEXTNL$10);
                }
                target.set(textNl);
            }
        }
        
        /**
         * Unsets the "text_nl" attribute
         */
        public void unsetTextNl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TEXTNL$10);
            }
        }
    }
}
