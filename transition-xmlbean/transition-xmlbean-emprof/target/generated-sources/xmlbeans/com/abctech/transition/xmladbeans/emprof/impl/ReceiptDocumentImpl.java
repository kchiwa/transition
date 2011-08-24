/*
 * An XML document type.
 * Localname: Receipt
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.emprof.ReceiptDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.emprof.impl;
/**
 * A document containing one Receipt(@) element.
 *
 * This is a complex type.
 */
public class ReceiptDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.ReceiptDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReceiptDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECEIPT$0 = 
        new javax.xml.namespace.QName("", "Receipt");
    
    
    /**
     * Gets the "Receipt" element
     */
    public com.abctech.transition.xmladbeans.emprof.ReceiptDocument.Receipt getReceipt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.emprof.ReceiptDocument.Receipt target = null;
            target = (com.abctech.transition.xmladbeans.emprof.ReceiptDocument.Receipt)get_store().find_element_user(RECEIPT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Receipt" element
     */
    public void setReceipt(com.abctech.transition.xmladbeans.emprof.ReceiptDocument.Receipt receipt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.emprof.ReceiptDocument.Receipt target = null;
            target = (com.abctech.transition.xmladbeans.emprof.ReceiptDocument.Receipt)get_store().find_element_user(RECEIPT$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.emprof.ReceiptDocument.Receipt)get_store().add_element_user(RECEIPT$0);
            }
            target.set(receipt);
        }
    }
    
    /**
     * Appends and returns a new empty "Receipt" element
     */
    public com.abctech.transition.xmladbeans.emprof.ReceiptDocument.Receipt addNewReceipt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.emprof.ReceiptDocument.Receipt target = null;
            target = (com.abctech.transition.xmladbeans.emprof.ReceiptDocument.Receipt)get_store().add_element_user(RECEIPT$0);
            return target;
        }
    }
    /**
     * An XML Receipt(@).
     *
     * This is a complex type.
     */
    public static class ReceiptImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.emprof.ReceiptDocument.Receipt
    {
        private static final long serialVersionUID = 1L;
        
        public ReceiptImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AD$0 = 
            new javax.xml.namespace.QName("", "Ad");
        private static final javax.xml.namespace.QName ATTACHMENT$2 = 
            new javax.xml.namespace.QName("", "Attachment");
        
        
        /**
         * Gets the "Ad" element
         */
        public com.abctech.transition.xmladbeans.emprof.AdDocument.Ad getAd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.emprof.AdDocument.Ad target = null;
                target = (com.abctech.transition.xmladbeans.emprof.AdDocument.Ad)get_store().find_element_user(AD$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Ad" element
         */
        public void setAd(com.abctech.transition.xmladbeans.emprof.AdDocument.Ad ad)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.emprof.AdDocument.Ad target = null;
                target = (com.abctech.transition.xmladbeans.emprof.AdDocument.Ad)get_store().find_element_user(AD$0, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.emprof.AdDocument.Ad)get_store().add_element_user(AD$0);
                }
                target.set(ad);
            }
        }
        
        /**
         * Appends and returns a new empty "Ad" element
         */
        public com.abctech.transition.xmladbeans.emprof.AdDocument.Ad addNewAd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.emprof.AdDocument.Ad target = null;
                target = (com.abctech.transition.xmladbeans.emprof.AdDocument.Ad)get_store().add_element_user(AD$0);
                return target;
            }
        }
        
        /**
         * Gets array of all "Attachment" elements
         */
        public com.abctech.transition.xmladbeans.emprof.AttachmentDocument.Attachment[] getAttachmentArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ATTACHMENT$2, targetList);
                com.abctech.transition.xmladbeans.emprof.AttachmentDocument.Attachment[] result = new com.abctech.transition.xmladbeans.emprof.AttachmentDocument.Attachment[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Attachment" element
         */
        public com.abctech.transition.xmladbeans.emprof.AttachmentDocument.Attachment getAttachmentArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.emprof.AttachmentDocument.Attachment target = null;
                target = (com.abctech.transition.xmladbeans.emprof.AttachmentDocument.Attachment)get_store().find_element_user(ATTACHMENT$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Attachment" element
         */
        public int sizeOfAttachmentArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ATTACHMENT$2);
            }
        }
        
        /**
         * Sets array of all "Attachment" element
         */
        public void setAttachmentArray(com.abctech.transition.xmladbeans.emprof.AttachmentDocument.Attachment[] attachmentArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(attachmentArray, ATTACHMENT$2);
            }
        }
        
        /**
         * Sets ith "Attachment" element
         */
        public void setAttachmentArray(int i, com.abctech.transition.xmladbeans.emprof.AttachmentDocument.Attachment attachment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.emprof.AttachmentDocument.Attachment target = null;
                target = (com.abctech.transition.xmladbeans.emprof.AttachmentDocument.Attachment)get_store().find_element_user(ATTACHMENT$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(attachment);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Attachment" element
         */
        public com.abctech.transition.xmladbeans.emprof.AttachmentDocument.Attachment insertNewAttachment(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.emprof.AttachmentDocument.Attachment target = null;
                target = (com.abctech.transition.xmladbeans.emprof.AttachmentDocument.Attachment)get_store().insert_element_user(ATTACHMENT$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Attachment" element
         */
        public com.abctech.transition.xmladbeans.emprof.AttachmentDocument.Attachment addNewAttachment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.emprof.AttachmentDocument.Attachment target = null;
                target = (com.abctech.transition.xmladbeans.emprof.AttachmentDocument.Attachment)get_store().add_element_user(ATTACHMENT$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "Attachment" element
         */
        public void removeAttachment(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ATTACHMENT$2, i);
            }
        }
    }
}
