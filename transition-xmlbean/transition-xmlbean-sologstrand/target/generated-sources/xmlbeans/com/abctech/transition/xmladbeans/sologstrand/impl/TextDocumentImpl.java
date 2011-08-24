/*
 * An XML document type.
 * Localname: text
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.sologstrand.TextDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.sologstrand.impl;
/**
 * A document containing one text(@) element.
 *
 * This is a complex type.
 */
public class TextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.TextDocument
{
    private static final long serialVersionUID = 1L;
    
    public TextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXT$0 = 
        new javax.xml.namespace.QName("", "text");
    
    
    /**
     * Gets the "text" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.TextDocument.Text getText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.TextDocument.Text target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.TextDocument.Text)get_store().find_element_user(TEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "text" element
     */
    public void setText(com.abctech.transition.xmladbeans.sologstrand.TextDocument.Text text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.TextDocument.Text target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.TextDocument.Text)get_store().find_element_user(TEXT$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.sologstrand.TextDocument.Text)get_store().add_element_user(TEXT$0);
            }
            target.set(text);
        }
    }
    
    /**
     * Appends and returns a new empty "text" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.TextDocument.Text addNewText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.TextDocument.Text target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.TextDocument.Text)get_store().add_element_user(TEXT$0);
            return target;
        }
    }
    /**
     * An XML text(@).
     *
     * This is a complex type.
     */
    public static class TextImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.TextDocument.Text
    {
        private static final long serialVersionUID = 1L;
        
        public TextImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NO$0 = 
            new javax.xml.namespace.QName("", "no");
        
        
        /**
         * Gets the "no" element
         */
        public java.lang.String getNo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NO$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "no" element
         */
        public org.apache.xmlbeans.XmlString xgetNo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NO$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "no" element
         */
        public void setNo(java.lang.String no)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NO$0);
                }
                target.setStringValue(no);
            }
        }
        
        /**
         * Sets (as xml) the "no" element
         */
        public void xsetNo(org.apache.xmlbeans.XmlString no)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NO$0);
                }
                target.set(no);
            }
        }
    }
}
