/*
 * An XML document type.
 * Localname: pdffile_name
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.PdffileNameDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one pdffile_name(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class PdffileNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.PdffileNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public PdffileNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PDFFILENAME$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "pdffile_name");
    
    
    /**
     * Gets the "pdffile_name" element
     */
    public java.lang.String getPdffileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PDFFILENAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "pdffile_name" element
     */
    public org.apache.xmlbeans.XmlString xgetPdffileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PDFFILENAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "pdffile_name" element
     */
    public void setPdffileName(java.lang.String pdffileName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PDFFILENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PDFFILENAME$0);
            }
            target.setStringValue(pdffileName);
        }
    }
    
    /**
     * Sets (as xml) the "pdffile_name" element
     */
    public void xsetPdffileName(org.apache.xmlbeans.XmlString pdffileName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PDFFILENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PDFFILENAME$0);
            }
            target.set(pdffileName);
        }
    }
}
