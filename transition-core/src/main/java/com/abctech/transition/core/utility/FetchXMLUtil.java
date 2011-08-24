/**
 * The FetchXMLUtil Calss contain utility method for
 * fetch xml data from url and copy xml file to ftp folder.
 *
 */

package com.abctech.transition.core.utility;

import com.abctech.transition.core.TransitionProperties;
import com.abctech.transition.core.dao.TransitionSpringContext;
import com.abctech.transition.core.drivers.AXmlBeanDriver;
import com.abctech.transition.core.drivers.TransitionDriverManager;
import com.abctech.transition.core.drivers.XmlBeanDriverIniValue;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.InvalidXMLException;
import com.abctech.transition.core.exception.TransitionException;
import com.abctech.transition.core.exception.UnknownCustomerFormatException;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.UUID;

/**
 * @author Tum (tum@abctech-thailand.com)
 * @since 07-07-2011
 * @version 1.2
 *
 */
public final class FetchXMLUtil {

    private static final Logger log = LoggerFactory.getLogger(FetchXMLUtil.class);

	private TransitionProperties transitionProperties = TransitionSpringContext.getTransitionProperties();

    private static FetchXMLUtil instance;

    private FetchXMLUtil(){}

    public static FetchXMLUtil getInstance() {
        if(instance == null) {
            return new FetchXMLUtil();
        } else {
            return instance;
        }
    }

    public byte[] downloadRSS(String url)throws TransitionException {
        try{
            URL urlGet = new URL(url);
            HttpURLConnection connection = (HttpURLConnection)urlGet.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            // Set connection timeout default is 30 sec
            Integer connectionTimeout = transitionProperties.getRSSFetchTimeout();
            if(connectionTimeout == null || connectionTimeout.intValue() == 0) {
                connectionTimeout = 30000; // set default value.
            }
            connection.setConnectTimeout(connectionTimeout.intValue());
            // End set connection timeout

            InputStream inputStream = connection.getInputStream();
            byte[] bytes = IOUtils.toByteArray(inputStream);
            return bytes;

        }catch (MalformedURLException e){
            throw new TransitionException("the url is malformed.",e);
        }catch (ProtocolException e){
            throw new TransitionException("the url is malformed.",e);
        }catch (IOException e){
            throw new TransitionException("can not download content from."+url,e);
        }
    }

    public AXmlBeanDriver convertRSS(byte[] bytes, CustomerFormat customerFormat) throws TransitionException {

        if(bytes == null || bytes.length == 0){
            throw new TransitionException("rss content can not be null");
        }

        try{
            XmlBeanDriverIniValue iniValue = new XmlBeanDriverIniValue();
            iniValue.setFormat(customerFormat);
            //iniValue.setXml(new String(bytes));
            iniValue.setXmlInputStream(new ByteArrayInputStream(bytes));
            //just mock xml file location. it doesn't use in any camel.
            iniValue.setXmlFileLocation(transitionProperties.getFtpPath()+"/"+customerFormat.toTextValue()+
                    "/"+customerFormat.toTextValue()+"/"+customerFormat+".xml");
            AXmlBeanDriver beanDriver = TransitionDriverManager.getXmlBeanDriver(iniValue);
            return beanDriver;
        }catch(InvalidXMLException e){
            throw new TransitionException("the xml file that you provide is invalid",e);
        }
        catch (UnknownCustomerFormatException e){
            throw new TransitionException("the system not support a customer type that you provide in XmlBeanDriverIniValue.",e);
        }

    }

    public String copyToFTPFolder(AXmlBeanDriver driver, String clientName, byte[] bytes)throws TransitionException {

        if(driver == null){
            throw new TransitionException("driver can not be null");
        }

        if(bytes == null){
            throw new TransitionException("bytes data can not be null");
        }

        if(clientName == null || clientName.equals("")){
            throw new TransitionException("client name can not be null or empty");
        }

        if(transitionProperties == null){
            throw new TransitionException("transitionProperties can not be null");
        }

        String format = driver.getCustomerFormat().toTextValue();
        String fileName = UUID.randomUUID().toString() + ".xml";
        String path = transitionProperties.getFtpPath()+"/"+format+"/"+clientName+"/"+fileName;
        log.debug("Copy to FTP Folder : " + path);

        try{
            if(bytes.length > 0){
                File file = new File(path);
                if(file!=null){
                    FileUtils.writeByteArrayToFile(file, bytes);
                }else{
                    throw new TransitionException("can not write an xml file to ftp folder");
                }
            }else{
                throw new TransitionException("file size need to greater than 0");
            }
        }catch (IOException e){
            throw new TransitionException("can not write input stream to file",e);
        }
      return path;
    }

}
