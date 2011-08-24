/*
 * An XML document type.
 * Localname: matchekriterier
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webmegler.MatchekriterierDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webmegler.impl;
/**
 * A document containing one matchekriterier(@) element.
 *
 * This is a complex type.
 */
public class MatchekriterierDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webmegler.MatchekriterierDocument
{
    private static final long serialVersionUID = 1L;
    
    public MatchekriterierDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MATCHEKRITERIER$0 = 
        new javax.xml.namespace.QName("", "matchekriterier");
    
    
    /**
     * Gets the "matchekriterier" element
     */
    public com.abctech.transition.xmladbeans.webmegler.MatchekriterierDocument.Matchekriterier getMatchekriterier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webmegler.MatchekriterierDocument.Matchekriterier target = null;
            target = (com.abctech.transition.xmladbeans.webmegler.MatchekriterierDocument.Matchekriterier)get_store().find_element_user(MATCHEKRITERIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "matchekriterier" element
     */
    public void setMatchekriterier(com.abctech.transition.xmladbeans.webmegler.MatchekriterierDocument.Matchekriterier matchekriterier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webmegler.MatchekriterierDocument.Matchekriterier target = null;
            target = (com.abctech.transition.xmladbeans.webmegler.MatchekriterierDocument.Matchekriterier)get_store().find_element_user(MATCHEKRITERIER$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.webmegler.MatchekriterierDocument.Matchekriterier)get_store().add_element_user(MATCHEKRITERIER$0);
            }
            target.set(matchekriterier);
        }
    }
    
    /**
     * Appends and returns a new empty "matchekriterier" element
     */
    public com.abctech.transition.xmladbeans.webmegler.MatchekriterierDocument.Matchekriterier addNewMatchekriterier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webmegler.MatchekriterierDocument.Matchekriterier target = null;
            target = (com.abctech.transition.xmladbeans.webmegler.MatchekriterierDocument.Matchekriterier)get_store().add_element_user(MATCHEKRITERIER$0);
            return target;
        }
    }
    /**
     * An XML matchekriterier(@).
     *
     * This is a complex type.
     */
    public static class MatchekriterierImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webmegler.MatchekriterierDocument.Matchekriterier
    {
        private static final long serialVersionUID = 1L;
        
        public MatchekriterierImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MATCHEKRITERIE$0 = 
            new javax.xml.namespace.QName("", "matchekriterie");
        
        
        /**
         * Gets array of all "matchekriterie" elements
         */
        public com.abctech.transition.xmladbeans.webmegler.MatchekriterieDocument.Matchekriterie[] getMatchekriterieArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(MATCHEKRITERIE$0, targetList);
                com.abctech.transition.xmladbeans.webmegler.MatchekriterieDocument.Matchekriterie[] result = new com.abctech.transition.xmladbeans.webmegler.MatchekriterieDocument.Matchekriterie[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "matchekriterie" element
         */
        public com.abctech.transition.xmladbeans.webmegler.MatchekriterieDocument.Matchekriterie getMatchekriterieArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.MatchekriterieDocument.Matchekriterie target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.MatchekriterieDocument.Matchekriterie)get_store().find_element_user(MATCHEKRITERIE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "matchekriterie" element
         */
        public int sizeOfMatchekriterieArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MATCHEKRITERIE$0);
            }
        }
        
        /**
         * Sets array of all "matchekriterie" element
         */
        public void setMatchekriterieArray(com.abctech.transition.xmladbeans.webmegler.MatchekriterieDocument.Matchekriterie[] matchekriterieArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(matchekriterieArray, MATCHEKRITERIE$0);
            }
        }
        
        /**
         * Sets ith "matchekriterie" element
         */
        public void setMatchekriterieArray(int i, com.abctech.transition.xmladbeans.webmegler.MatchekriterieDocument.Matchekriterie matchekriterie)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.MatchekriterieDocument.Matchekriterie target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.MatchekriterieDocument.Matchekriterie)get_store().find_element_user(MATCHEKRITERIE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(matchekriterie);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "matchekriterie" element
         */
        public com.abctech.transition.xmladbeans.webmegler.MatchekriterieDocument.Matchekriterie insertNewMatchekriterie(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.MatchekriterieDocument.Matchekriterie target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.MatchekriterieDocument.Matchekriterie)get_store().insert_element_user(MATCHEKRITERIE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "matchekriterie" element
         */
        public com.abctech.transition.xmladbeans.webmegler.MatchekriterieDocument.Matchekriterie addNewMatchekriterie()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.webmegler.MatchekriterieDocument.Matchekriterie target = null;
                target = (com.abctech.transition.xmladbeans.webmegler.MatchekriterieDocument.Matchekriterie)get_store().add_element_user(MATCHEKRITERIE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "matchekriterie" element
         */
        public void removeMatchekriterie(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MATCHEKRITERIE$0, i);
            }
        }
    }
}
