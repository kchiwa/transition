/*
 * An XML document type.
 * Localname: infotexts
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.sologstrand.InfotextsDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.sologstrand.impl;
/**
 * A document containing one infotexts(@) element.
 *
 * This is a complex type.
 */
public class InfotextsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.InfotextsDocument
{
    private static final long serialVersionUID = 1L;
    
    public InfotextsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INFOTEXTS$0 = 
        new javax.xml.namespace.QName("", "infotexts");
    
    
    /**
     * Gets the "infotexts" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.InfotextsDocument.Infotexts getInfotexts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.InfotextsDocument.Infotexts target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.InfotextsDocument.Infotexts)get_store().find_element_user(INFOTEXTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "infotexts" element
     */
    public void setInfotexts(com.abctech.transition.xmladbeans.sologstrand.InfotextsDocument.Infotexts infotexts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.InfotextsDocument.Infotexts target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.InfotextsDocument.Infotexts)get_store().find_element_user(INFOTEXTS$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.sologstrand.InfotextsDocument.Infotexts)get_store().add_element_user(INFOTEXTS$0);
            }
            target.set(infotexts);
        }
    }
    
    /**
     * Appends and returns a new empty "infotexts" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.InfotextsDocument.Infotexts addNewInfotexts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.InfotextsDocument.Infotexts target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.InfotextsDocument.Infotexts)get_store().add_element_user(INFOTEXTS$0);
            return target;
        }
    }
    /**
     * An XML infotexts(@).
     *
     * This is a complex type.
     */
    public static class InfotextsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.InfotextsDocument.Infotexts
    {
        private static final long serialVersionUID = 1L;
        
        public InfotextsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INFOTEXT$0 = 
            new javax.xml.namespace.QName("", "infotext");
        
        
        /**
         * Gets array of all "infotext" elements
         */
        public com.abctech.transition.xmladbeans.sologstrand.InfotextDocument.Infotext[] getInfotextArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INFOTEXT$0, targetList);
                com.abctech.transition.xmladbeans.sologstrand.InfotextDocument.Infotext[] result = new com.abctech.transition.xmladbeans.sologstrand.InfotextDocument.Infotext[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "infotext" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.InfotextDocument.Infotext getInfotextArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.InfotextDocument.Infotext target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.InfotextDocument.Infotext)get_store().find_element_user(INFOTEXT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "infotext" element
         */
        public int sizeOfInfotextArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INFOTEXT$0);
            }
        }
        
        /**
         * Sets array of all "infotext" element
         */
        public void setInfotextArray(com.abctech.transition.xmladbeans.sologstrand.InfotextDocument.Infotext[] infotextArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(infotextArray, INFOTEXT$0);
            }
        }
        
        /**
         * Sets ith "infotext" element
         */
        public void setInfotextArray(int i, com.abctech.transition.xmladbeans.sologstrand.InfotextDocument.Infotext infotext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.InfotextDocument.Infotext target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.InfotextDocument.Infotext)get_store().find_element_user(INFOTEXT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(infotext);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "infotext" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.InfotextDocument.Infotext insertNewInfotext(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.InfotextDocument.Infotext target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.InfotextDocument.Infotext)get_store().insert_element_user(INFOTEXT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "infotext" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.InfotextDocument.Infotext addNewInfotext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.InfotextDocument.Infotext target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.InfotextDocument.Infotext)get_store().add_element_user(INFOTEXT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "infotext" element
         */
        public void removeInfotext(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INFOTEXT$0, i);
            }
        }
    }
}
