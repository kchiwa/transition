package com.abctech.transition.webapp.webservice.iadif;

import org.springframework.stereotype.Service;

@Service
public interface IFinnIadifService {

	/**
	 * importXml is a webservice method, that imports the xml of iadif formats.
	 * @param xml
	 * @return a iadif response in xml
	 */
	public String importXml(String xml);
	
	/**
	 * importXmlWithAttachments is used to import picture xml for iadif formats.
	 * @param xml the picture xml 
	 * @param images the images, base64 encoded
	 * @param imageNames the image names.
	 * @return

	@WebMethod
	public String importXmlWithAttachments(String xmlIn, String [] imagesIn, String[] imageNamesIn);
	
		 */

}
