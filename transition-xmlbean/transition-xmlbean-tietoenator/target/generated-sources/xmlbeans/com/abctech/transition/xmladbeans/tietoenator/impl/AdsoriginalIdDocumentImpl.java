/*
 * An XML document type.
 * Localname: adsoriginal_id
 * Namespace: http://www.tietoenator.com
 * Java type: com.abctech.transition.xmladbeans.tietoenator.AdsoriginalIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.tietoenator.impl;
/**
 * A document containing one adsoriginal_id(@http://www.tietoenator.com) element.
 *
 * This is a complex type.
 */
public class AdsoriginalIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.tietoenator.AdsoriginalIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public AdsoriginalIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADSORIGINALID$0 = 
        new javax.xml.namespace.QName("http://www.tietoenator.com", "adsoriginal_id");
    
    
    /**
     * Gets the "adsoriginal_id" element
     */
    public java.math.BigInteger getAdsoriginalId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADSORIGINALID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "adsoriginal_id" element
     */
    public org.apache.xmlbeans.XmlInteger xgetAdsoriginalId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ADSORIGINALID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "adsoriginal_id" element
     */
    public void setAdsoriginalId(java.math.BigInteger adsoriginalId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADSORIGINALID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADSORIGINALID$0);
            }
            target.setBigIntegerValue(adsoriginalId);
        }
    }
    
    /**
     * Sets (as xml) the "adsoriginal_id" element
     */
    public void xsetAdsoriginalId(org.apache.xmlbeans.XmlInteger adsoriginalId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ADSORIGINALID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(ADSORIGINALID$0);
            }
            target.set(adsoriginalId);
        }
    }
}
