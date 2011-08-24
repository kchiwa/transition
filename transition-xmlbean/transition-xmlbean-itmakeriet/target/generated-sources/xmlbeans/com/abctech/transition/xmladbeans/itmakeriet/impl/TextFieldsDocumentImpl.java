/*
 * An XML document type.
 * Localname: TextFields
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one TextFields(@) element.
 *
 * This is a complex type.
 */
public class TextFieldsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument
{
    private static final long serialVersionUID = 1L;
    
    public TextFieldsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXTFIELDS$0 = 
        new javax.xml.namespace.QName("", "TextFields");
    
    
    /**
     * Gets the "TextFields" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument.TextFields getTextFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument.TextFields target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument.TextFields)get_store().find_element_user(TEXTFIELDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TextFields" element
     */
    public void setTextFields(com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument.TextFields textFields)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument.TextFields target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument.TextFields)get_store().find_element_user(TEXTFIELDS$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument.TextFields)get_store().add_element_user(TEXTFIELDS$0);
            }
            target.set(textFields);
        }
    }
    
    /**
     * Appends and returns a new empty "TextFields" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument.TextFields addNewTextFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument.TextFields target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument.TextFields)get_store().add_element_user(TEXTFIELDS$0);
            return target;
        }
    }
    /**
     * An XML TextFields(@).
     *
     * This is a complex type.
     */
    public static class TextFieldsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.TextFieldsDocument.TextFields
    {
        private static final long serialVersionUID = 1L;
        
        public TextFieldsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TEXT$0 = 
            new javax.xml.namespace.QName("", "Text");
        
        
        /**
         * Gets array of all "Text" elements
         */
        public com.abctech.transition.xmladbeans.itmakeriet.TextDocument.Text[] getTextArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TEXT$0, targetList);
                com.abctech.transition.xmladbeans.itmakeriet.TextDocument.Text[] result = new com.abctech.transition.xmladbeans.itmakeriet.TextDocument.Text[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Text" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.TextDocument.Text getTextArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.TextDocument.Text target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.TextDocument.Text)get_store().find_element_user(TEXT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Text" element
         */
        public int sizeOfTextArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TEXT$0);
            }
        }
        
        /**
         * Sets array of all "Text" element
         */
        public void setTextArray(com.abctech.transition.xmladbeans.itmakeriet.TextDocument.Text[] textArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(textArray, TEXT$0);
            }
        }
        
        /**
         * Sets ith "Text" element
         */
        public void setTextArray(int i, com.abctech.transition.xmladbeans.itmakeriet.TextDocument.Text text)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.TextDocument.Text target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.TextDocument.Text)get_store().find_element_user(TEXT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(text);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Text" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.TextDocument.Text insertNewText(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.TextDocument.Text target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.TextDocument.Text)get_store().insert_element_user(TEXT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Text" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.TextDocument.Text addNewText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.TextDocument.Text target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.TextDocument.Text)get_store().add_element_user(TEXT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Text" element
         */
        public void removeText(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TEXT$0, i);
            }
        }
    }
}
