package com.abctech.transition.xmladbeans.emprof;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Pun (pun@abctech-thailand.com)
 * @since 2011-02-02
 */
public class EmprofReceiptTest {
    private final Logger log = LoggerFactory.getLogger(EmprofReceiptTest.class);

    @Test
    public void testEmprofReceipt() {

       final String expectedResult = "<Receipt>\n" +
               "  <Ad>\n" +
               "    <ClientID>21913</ClientID>\n" +
               "    <MidasAdRef>7911036</MidasAdRef>\n" +
               "    <ZettID>2055967</ZettID>\n" +
               "    <ZettCode>P2055967</ZettCode>\n" +
               "    <URL>http://www.zett.no/P2055967</URL>\n" +
               "    <Status Code=\"SUCCESS\">Success ( Assigned ZettCode: P2055967 )</Status>\n" +
               "  </Ad>\n" +
               "  <Attachment>\n" +
               "    <MidasAdRef>7911036</MidasAdRef>\n" +
               "    <ImageURL>http://att.emprof.no/images2/AktivEiendom/Trondheimsentrum/Pictures/1024/79110361.JPG</ImageURL>\n" +
               "    <ImageRef>13396216</ImageRef>\n" +
               "    <Status Code=\"SUCCESS\">Attachment downloaded successfully</Status>\n" +
               "  </Attachment>\n" +
               "  <Attachment>\n" +
               "    <MidasAdRef>7911036</MidasAdRef>\n" +
               "    <ImageURL>http://att.emprof.no/images2/AktivEiendom/Trondheimsentrum/Pictures/1024/79110362.JPG</ImageURL>\n" +
               "    <ImageRef>13396217</ImageRef>\n" +
               "    <Status Code=\"SUCCESS\">Attachment downloaded successfully</Status>\n" +
               "  </Attachment>\n" +
               "</Receipt>";

        // Initialise the main receipt document
        ReceiptDocument receiptDocument = ReceiptDocument.Factory.newInstance();
        ReceiptDocument.Receipt receipt = receiptDocument.addNewReceipt();

        // Create the ad element and set data
        AdDocument.Ad ad = receipt.addNewAd();
        ad.setClientID("21913");
        ad.setMidasAdRef("7911036");
        ad.setZettID("2055967");
        ad.setZettCode("P2055967");
        ad.setURL("http://www.zett.no/P2055967");
        StatusAttribute.StatusAttribute2 status = ad.addNewStatusAttribute();
        status.setCode("SUCCESS");
        status.setStringValue("Success ( Assigned ZettCode: P2055967 )");

        // Create the attachment1
        AttachmentDocument.Attachment attachment1 = receipt.addNewAttachment();
        attachment1.setMidasAdRef("7911036");
        attachment1.setImageURL("http://att.emprof.no/images2/AktivEiendom/Trondheimsentrum/Pictures/1024/79110361.JPG");
        attachment1.setImageRef("13396216");
        StatusAttribute.StatusAttribute2 statusAtt1 = attachment1.addNewStatusAttribute();
        statusAtt1.setCode("SUCCESS");
        statusAtt1.setStringValue("Attachment downloaded successfully");

        // Create the attachment2
        AttachmentDocument.Attachment attachment2 = receipt.addNewAttachment();
        attachment2.setMidasAdRef("7911036");
        attachment2.setImageURL("http://att.emprof.no/images2/AktivEiendom/Trondheimsentrum/Pictures/1024/79110362.JPG");
        attachment2.setImageRef("13396217");
        StatusAttribute.StatusAttribute2 statusAtt2 = attachment2.addNewStatusAttribute();
        statusAtt2.setCode("SUCCESS");
        statusAtt2.setStringValue("Attachment downloaded successfully");

        //log.debug(receiptDocument.toString());
        Assert.assertEquals(expectedResult, receiptDocument.toString());
    }
}
