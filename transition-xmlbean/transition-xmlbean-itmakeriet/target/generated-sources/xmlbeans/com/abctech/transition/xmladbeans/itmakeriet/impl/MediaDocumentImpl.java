/*
 * An XML document type.
 * Localname: Media
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.MediaDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one Media(@) element.
 *
 * This is a complex type.
 */
public class MediaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.MediaDocument
{
    private static final long serialVersionUID = 1L;
    
    public MediaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDIA$0 = 
        new javax.xml.namespace.QName("", "Media");
    
    
    /**
     * Gets the "Media" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.MediaDocument.Media getMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.MediaDocument.Media target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.MediaDocument.Media)get_store().find_element_user(MEDIA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Media" element
     */
    public void setMedia(com.abctech.transition.xmladbeans.itmakeriet.MediaDocument.Media media)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.MediaDocument.Media target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.MediaDocument.Media)get_store().find_element_user(MEDIA$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.itmakeriet.MediaDocument.Media)get_store().add_element_user(MEDIA$0);
            }
            target.set(media);
        }
    }
    
    /**
     * Appends and returns a new empty "Media" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.MediaDocument.Media addNewMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.MediaDocument.Media target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.MediaDocument.Media)get_store().add_element_user(MEDIA$0);
            return target;
        }
    }
    /**
     * An XML Media(@).
     *
     * This is a complex type.
     */
    public static class MediaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.MediaDocument.Media
    {
        private static final long serialVersionUID = 1L;
        
        public MediaImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MAINPICTURE$0 = 
            new javax.xml.namespace.QName("", "MainPicture");
        private static final javax.xml.namespace.QName PICTURE$2 = 
            new javax.xml.namespace.QName("", "Picture");
        private static final javax.xml.namespace.QName PDF$4 = 
            new javax.xml.namespace.QName("", "PDF");
        
        
        /**
         * Gets the "MainPicture" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.MainPictureDocument.MainPicture getMainPicture()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.MainPictureDocument.MainPicture target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.MainPictureDocument.MainPicture)get_store().find_element_user(MAINPICTURE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "MainPicture" element
         */
        public void setMainPicture(com.abctech.transition.xmladbeans.itmakeriet.MainPictureDocument.MainPicture mainPicture)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.MainPictureDocument.MainPicture target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.MainPictureDocument.MainPicture)get_store().find_element_user(MAINPICTURE$0, 0);
                if (target == null)
                {
                    target = (com.abctech.transition.xmladbeans.itmakeriet.MainPictureDocument.MainPicture)get_store().add_element_user(MAINPICTURE$0);
                }
                target.set(mainPicture);
            }
        }
        
        /**
         * Appends and returns a new empty "MainPicture" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.MainPictureDocument.MainPicture addNewMainPicture()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.MainPictureDocument.MainPicture target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.MainPictureDocument.MainPicture)get_store().add_element_user(MAINPICTURE$0);
                return target;
            }
        }
        
        /**
         * Gets array of all "Picture" elements
         */
        public com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture[] getPictureArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PICTURE$2, targetList);
                com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture[] result = new com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Picture" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture getPictureArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture)get_store().find_element_user(PICTURE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Picture" element
         */
        public int sizeOfPictureArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PICTURE$2);
            }
        }
        
        /**
         * Sets array of all "Picture" element
         */
        public void setPictureArray(com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture[] pictureArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(pictureArray, PICTURE$2);
            }
        }
        
        /**
         * Sets ith "Picture" element
         */
        public void setPictureArray(int i, com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture picture)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture)get_store().find_element_user(PICTURE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(picture);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Picture" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture insertNewPicture(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture)get_store().insert_element_user(PICTURE$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Picture" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture addNewPicture()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.PictureDocument.Picture)get_store().add_element_user(PICTURE$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "Picture" element
         */
        public void removePicture(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PICTURE$2, i);
            }
        }
        
        /**
         * Gets array of all "PDF" elements
         */
        public com.abctech.transition.xmladbeans.itmakeriet.PDFDocument.PDF[] getPDFArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PDF$4, targetList);
                com.abctech.transition.xmladbeans.itmakeriet.PDFDocument.PDF[] result = new com.abctech.transition.xmladbeans.itmakeriet.PDFDocument.PDF[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "PDF" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.PDFDocument.PDF getPDFArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.PDFDocument.PDF target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.PDFDocument.PDF)get_store().find_element_user(PDF$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "PDF" element
         */
        public int sizeOfPDFArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PDF$4);
            }
        }
        
        /**
         * Sets array of all "PDF" element
         */
        public void setPDFArray(com.abctech.transition.xmladbeans.itmakeriet.PDFDocument.PDF[] pdfArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(pdfArray, PDF$4);
            }
        }
        
        /**
         * Sets ith "PDF" element
         */
        public void setPDFArray(int i, com.abctech.transition.xmladbeans.itmakeriet.PDFDocument.PDF pdf)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.PDFDocument.PDF target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.PDFDocument.PDF)get_store().find_element_user(PDF$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(pdf);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PDF" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.PDFDocument.PDF insertNewPDF(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.PDFDocument.PDF target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.PDFDocument.PDF)get_store().insert_element_user(PDF$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PDF" element
         */
        public com.abctech.transition.xmladbeans.itmakeriet.PDFDocument.PDF addNewPDF()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.itmakeriet.PDFDocument.PDF target = null;
                target = (com.abctech.transition.xmladbeans.itmakeriet.PDFDocument.PDF)get_store().add_element_user(PDF$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "PDF" element
         */
        public void removePDF(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PDF$4, i);
            }
        }
    }
}
