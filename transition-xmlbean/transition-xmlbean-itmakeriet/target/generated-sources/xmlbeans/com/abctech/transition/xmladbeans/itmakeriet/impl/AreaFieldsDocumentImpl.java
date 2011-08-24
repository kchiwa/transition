/*
 * An XML document type.
 * Localname: AreaFields
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one AreaFields(@) element.
 *
 * This is a complex type.
 */
public class AreaFieldsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument
{
    private static final long serialVersionUID = 1L;
    
    public AreaFieldsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AREAFIELDS$0 = 
        new javax.xml.namespace.QName("", "AreaFields");
    
    
    /**
     * Gets the "AreaFields" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument.AreaFields getAreaFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument.AreaFields target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument.AreaFields)get_store().find_element_user(AREAFIELDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AreaFields" element
     */
    public void setAreaFields(com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument.AreaFields areaFields)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument.AreaFields target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument.AreaFields)get_store().find_element_user(AREAFIELDS$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument.AreaFields)get_store().add_element_user(AREAFIELDS$0);
            }
            target.set(areaFields);
        }
    }
    
    /**
     * Appends and returns a new empty "AreaFields" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument.AreaFields addNewAreaFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument.AreaFields target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument.AreaFields)get_store().add_element_user(AREAFIELDS$0);
            return target;
        }
    }
    /**
     * An XML AreaFields(@).
     *
     * This is a complex type.
     */
    public static class AreaFieldsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.AreaFieldsDocument.AreaFields
    {
        private static final long serialVersionUID = 1L;
        
        public AreaFieldsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AREA$0 = 
            new javax.xml.namespace.QName("", "Area");
        private static final javax.xml.namespace.QName TEXT$2 = 
            new javax.xml.namespace.QName("", "Text");
        
        
        /**
         * Gets array of all "Area" elements
         */
        public com.abctech.transition.xmladbeans.itmakeriet.AreaDocument.Area[] getAreaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(AREA$0, targetList);
                com.abctech.transition.xmladbeans.itmakeriet.AreaDocument.Area[] result = new com.abctech.transition.xmladbeans.itmakeriet.AreaDocument.Area[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Area" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.AreaDocument.Area getAreaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.AreaDocument.Area target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.AreaDocument.Area)get_store().find_element_user(AREA$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Area" element
         */
        public int sizeOfAreaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AREA$0);
            }
        }
        
        /**
         * Sets array of all "Area" element
         */
        public void setAreaArray(com.abctech.transition.xmladbeans.itmakeriet.AreaDocument.Area[] areaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(areaArray, AREA$0);
            }
        }
        
        /**
         * Sets ith "Area" element
         */
        public void setAreaArray(int i, com.abctech.transition.xmladbeans.itmakeriet.AreaDocument.Area area)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.AreaDocument.Area target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.AreaDocument.Area)get_store().find_element_user(AREA$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(area);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Area" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.AreaDocument.Area insertNewArea(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.AreaDocument.Area target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.AreaDocument.Area)get_store().insert_element_user(AREA$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Area" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.AreaDocument.Area addNewArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.AreaDocument.Area target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.AreaDocument.Area)get_store().add_element_user(AREA$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Area" element
         */
        public void removeArea(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AREA$0, i);
            }
        }
        
        /**
         * Gets array of all "Text" elements
         */
        public com.abctech.transition.xmladbeans.itmakeriet.TextDocument.Text[] getTextArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TEXT$2, targetList);
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
                target = (com.abctech.transition.xmladbeans.itmakeriet.TextDocument.Text)get_store().find_element_user(TEXT$2, i);
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
                return get_store().count_elements(TEXT$2);
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
                arraySetterHelper(textArray, TEXT$2);
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
                target = (com.abctech.transition.xmladbeans.itmakeriet.TextDocument.Text)get_store().find_element_user(TEXT$2, i);
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
                target = (com.abctech.transition.xmladbeans.itmakeriet.TextDocument.Text)get_store().insert_element_user(TEXT$2, i);
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
                target = (com.abctech.transition.xmladbeans.itmakeriet.TextDocument.Text)get_store().add_element_user(TEXT$2);
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
                get_store().remove_element(TEXT$2, i);
            }
        }
    }
}
