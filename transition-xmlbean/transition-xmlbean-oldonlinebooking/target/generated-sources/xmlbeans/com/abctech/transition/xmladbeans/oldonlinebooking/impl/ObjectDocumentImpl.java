/*
 * An XML document type.
 * Localname: object
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.oldonlinebooking.impl;
/**
 * A document containing one object(@) element.
 *
 * This is a complex type.
 */
public class ObjectDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument
{
    private static final long serialVersionUID = 1L;
    
    public ObjectDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECT$0 = 
        new javax.xml.namespace.QName("", "object");
    
    
    /**
     * Gets the "object" element
     */
    public com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument.Object getObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument.Object target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument.Object)get_store().find_element_user(OBJECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "object" element
     */
    public void setObject(com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument.Object object)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument.Object target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument.Object)get_store().find_element_user(OBJECT$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument.Object)get_store().add_element_user(OBJECT$0);
            }
            target.set(object);
        }
    }
    
    /**
     * Appends and returns a new empty "object" element
     */
    public com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument.Object addNewObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument.Object target = null;
            target = (com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument.Object)get_store().add_element_user(OBJECT$0);
            return target;
        }
    }
    /**
     * An XML object(@).
     *
     * This is a complex type.
     */
    public static class ObjectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.oldonlinebooking.ObjectDocument.Object
    {
        private static final long serialVersionUID = 1L;
        
        public ObjectImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("", "type");
        private static final javax.xml.namespace.QName PUBLISH$2 = 
            new javax.xml.namespace.QName("", "publish");
        private static final javax.xml.namespace.QName TITLE$4 = 
            new javax.xml.namespace.QName("", "title");
        private static final javax.xml.namespace.QName TEXT$6 = 
            new javax.xml.namespace.QName("", "text");
        private static final javax.xml.namespace.QName CONTACTS$8 = 
            new javax.xml.namespace.QName("", "contacts");
        private static final javax.xml.namespace.QName METADATA$10 = 
            new javax.xml.namespace.QName("", "metadata");
        private static final javax.xml.namespace.QName MEDIAOBJECT$12 = 
            new javax.xml.namespace.QName("", "media_object");
        private static final javax.xml.namespace.QName ID$14 = 
            new javax.xml.namespace.QName("", "id");
        
        
        /**
         * Gets the "type" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.TypeDocument.Type getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.TypeDocument.Type target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.TypeDocument.Type)get_store().find_element_user(TYPE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "type" element
         */
        public void setType(com.abctech.transition.xmladbeans.oldonlinebooking.TypeDocument.Type type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.TypeDocument.Type target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.TypeDocument.Type)get_store().find_element_user(TYPE$0, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.oldonlinebooking.TypeDocument.Type)get_store().add_element_user(TYPE$0);
                }
                target.set(type);
            }
        }
        
        /**
         * Appends and returns a new empty "type" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.TypeDocument.Type addNewType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.TypeDocument.Type target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.TypeDocument.Type)get_store().add_element_user(TYPE$0);
                return target;
            }
        }
        
        /**
         * Gets the "publish" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.PublishDocument.Publish getPublish()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.PublishDocument.Publish target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.PublishDocument.Publish)get_store().find_element_user(PUBLISH$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "publish" element
         */
        public void setPublish(com.abctech.transition.xmladbeans.oldonlinebooking.PublishDocument.Publish publish)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.PublishDocument.Publish target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.PublishDocument.Publish)get_store().find_element_user(PUBLISH$2, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.oldonlinebooking.PublishDocument.Publish)get_store().add_element_user(PUBLISH$2);
                }
                target.set(publish);
            }
        }
        
        /**
         * Appends and returns a new empty "publish" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.PublishDocument.Publish addNewPublish()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.PublishDocument.Publish target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.PublishDocument.Publish)get_store().add_element_user(PUBLISH$2);
                return target;
            }
        }
        
        /**
         * Gets the "title" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.TitleDocument.Title getTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.TitleDocument.Title target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.TitleDocument.Title)get_store().find_element_user(TITLE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "title" element
         */
        public void setTitle(com.abctech.transition.xmladbeans.oldonlinebooking.TitleDocument.Title title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.TitleDocument.Title target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.TitleDocument.Title)get_store().find_element_user(TITLE$4, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.oldonlinebooking.TitleDocument.Title)get_store().add_element_user(TITLE$4);
                }
                target.set(title);
            }
        }
        
        /**
         * Appends and returns a new empty "title" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.TitleDocument.Title addNewTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.TitleDocument.Title target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.TitleDocument.Title)get_store().add_element_user(TITLE$4);
                return target;
            }
        }
        
        /**
         * Gets array of all "text" elements
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.TextDocument.Text[] getTextArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TEXT$6, targetList);
                com.abctech.transition.xmladbeans.oldonlinebooking.TextDocument.Text[] result = new com.abctech.transition.xmladbeans.oldonlinebooking.TextDocument.Text[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "text" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.TextDocument.Text getTextArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.TextDocument.Text target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.TextDocument.Text)get_store().find_element_user(TEXT$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "text" element
         */
        public int sizeOfTextArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TEXT$6);
            }
        }
        
        /**
         * Sets array of all "text" element
         */
        public void setTextArray(com.abctech.transition.xmladbeans.oldonlinebooking.TextDocument.Text[] textArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(textArray, TEXT$6);
            }
        }
        
        /**
         * Sets ith "text" element
         */
        public void setTextArray(int i, com.abctech.transition.xmladbeans.oldonlinebooking.TextDocument.Text text)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.TextDocument.Text target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.TextDocument.Text)get_store().find_element_user(TEXT$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(text);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "text" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.TextDocument.Text insertNewText(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.TextDocument.Text target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.TextDocument.Text)get_store().insert_element_user(TEXT$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "text" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.TextDocument.Text addNewText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.TextDocument.Text target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.TextDocument.Text)get_store().add_element_user(TEXT$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "text" element
         */
        public void removeText(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TEXT$6, i);
            }
        }
        
        /**
         * Gets array of all "contacts" elements
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.ContactsDocument.Contacts[] getContactsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CONTACTS$8, targetList);
                com.abctech.transition.xmladbeans.oldonlinebooking.ContactsDocument.Contacts[] result = new com.abctech.transition.xmladbeans.oldonlinebooking.ContactsDocument.Contacts[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "contacts" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.ContactsDocument.Contacts getContactsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.ContactsDocument.Contacts target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.ContactsDocument.Contacts)get_store().find_element_user(CONTACTS$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "contacts" element
         */
        public int sizeOfContactsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTACTS$8);
            }
        }
        
        /**
         * Sets array of all "contacts" element
         */
        public void setContactsArray(com.abctech.transition.xmladbeans.oldonlinebooking.ContactsDocument.Contacts[] contactsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(contactsArray, CONTACTS$8);
            }
        }
        
        /**
         * Sets ith "contacts" element
         */
        public void setContactsArray(int i, com.abctech.transition.xmladbeans.oldonlinebooking.ContactsDocument.Contacts contacts)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.ContactsDocument.Contacts target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.ContactsDocument.Contacts)get_store().find_element_user(CONTACTS$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(contacts);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "contacts" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.ContactsDocument.Contacts insertNewContacts(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.ContactsDocument.Contacts target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.ContactsDocument.Contacts)get_store().insert_element_user(CONTACTS$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "contacts" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.ContactsDocument.Contacts addNewContacts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.ContactsDocument.Contacts target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.ContactsDocument.Contacts)get_store().add_element_user(CONTACTS$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "contacts" element
         */
        public void removeContacts(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTACTS$8, i);
            }
        }
        
        /**
         * Gets array of all "metadata" elements
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.MetadataDocument.Metadata[] getMetadataArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(METADATA$10, targetList);
                com.abctech.transition.xmladbeans.oldonlinebooking.MetadataDocument.Metadata[] result = new com.abctech.transition.xmladbeans.oldonlinebooking.MetadataDocument.Metadata[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "metadata" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.MetadataDocument.Metadata getMetadataArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.MetadataDocument.Metadata target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.MetadataDocument.Metadata)get_store().find_element_user(METADATA$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "metadata" element
         */
        public int sizeOfMetadataArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(METADATA$10);
            }
        }
        
        /**
         * Sets array of all "metadata" element
         */
        public void setMetadataArray(com.abctech.transition.xmladbeans.oldonlinebooking.MetadataDocument.Metadata[] metadataArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(metadataArray, METADATA$10);
            }
        }
        
        /**
         * Sets ith "metadata" element
         */
        public void setMetadataArray(int i, com.abctech.transition.xmladbeans.oldonlinebooking.MetadataDocument.Metadata metadata)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.MetadataDocument.Metadata target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.MetadataDocument.Metadata)get_store().find_element_user(METADATA$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(metadata);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "metadata" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.MetadataDocument.Metadata insertNewMetadata(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.MetadataDocument.Metadata target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.MetadataDocument.Metadata)get_store().insert_element_user(METADATA$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "metadata" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.MetadataDocument.Metadata addNewMetadata()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.MetadataDocument.Metadata target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.MetadataDocument.Metadata)get_store().add_element_user(METADATA$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "metadata" element
         */
        public void removeMetadata(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(METADATA$10, i);
            }
        }
        
        /**
         * Gets array of all "media_object" elements
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject[] getMediaObjectArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(MEDIAOBJECT$12, targetList);
                com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject[] result = new com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "media_object" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject getMediaObjectArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject)get_store().find_element_user(MEDIAOBJECT$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "media_object" element
         */
        public int sizeOfMediaObjectArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MEDIAOBJECT$12);
            }
        }
        
        /**
         * Sets array of all "media_object" element
         */
        public void setMediaObjectArray(com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject[] mediaObjectArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(mediaObjectArray, MEDIAOBJECT$12);
            }
        }
        
        /**
         * Sets ith "media_object" element
         */
        public void setMediaObjectArray(int i, com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject mediaObject)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject)get_store().find_element_user(MEDIAOBJECT$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(mediaObject);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "media_object" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject insertNewMediaObject(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject)get_store().insert_element_user(MEDIAOBJECT$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "media_object" element
         */
        public com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject addNewMediaObject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject target = null;
                target = (com.abctech.transition.xmladbeans.oldonlinebooking.MediaObjectDocument.MediaObject)get_store().add_element_user(MEDIAOBJECT$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "media_object" element
         */
        public void removeMediaObject(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MEDIAOBJECT$12, i);
            }
        }
        
        /**
         * Gets the "id" attribute
         */
        public java.lang.String getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$14);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" attribute
         */
        public org.apache.xmlbeans.XmlString xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$14);
                return target;
            }
        }
        
        /**
         * True if has "id" attribute
         */
        public boolean isSetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ID$14) != null;
            }
        }
        
        /**
         * Sets the "id" attribute
         */
        public void setId(java.lang.String id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$14);
                }
                target.setStringValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" attribute
         */
        public void xsetId(org.apache.xmlbeans.XmlString id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$14);
                }
                target.set(id);
            }
        }
        
        /**
         * Unsets the "id" attribute
         */
        public void unsetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ID$14);
            }
        }
    }
}
