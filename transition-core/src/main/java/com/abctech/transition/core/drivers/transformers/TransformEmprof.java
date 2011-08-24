package com.abctech.transition.core.drivers.transformers;

import com.abctech.transition.core.dao.valuemap.ValueMapManager;
import com.abctech.transition.core.drivers.ATransformationDriver;
import com.abctech.transition.core.drivers.xmlbeans.EmprofDriver;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.mediahandler.MediaHandlerUtility;
import com.abctech.transition.core.transformation.adTransformation.AdTransformationUtility;
import com.abctech.transition.xmladbeans.emprof.DATADocument;
import com.abctech.transition.xmladbeans.emprof.OPPDRAGDocument;
import com.abctech.transition.xmladbeans.emprof.VISNINGSTIDERDocument;
import no.zett.model.AdObject;
import no.zett.model.base.*;
import no.zett.model.enums.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransformEmprof extends ATransformationDriver {
	//private static final Logger log = LoggerFactory.getLogger(TransformEmprof.class);
	private static final String TEXT = "text";
    private AdObject emprofAdObject = new AdObject();
	private DATADocument dataDocument;
	private OPPDRAGDocument.OPPDRAG oppdrag = null;


	public TransformEmprof(EmprofDriver beanDriver) {
		setXmlBeanDriver(beanDriver);
		dataDocument = (DATADocument) getXmlBeanDriver().getDriverRootXmlBeanDocument();
		oppdrag = dataDocument.getDATA().getOPPDRAGArray(0);
	}

	public DATADocument getDATADataDocument() {
		return this.getDataDocument();
	}

	/**
	 * The main method to transform ad to adObject. Which actually mapping values in XML ad into field in AdObject
	 *
	 * @return AdObject - The transformed adObject
	 */

	@Override
	protected AdObject mapping() throws DAOException {

		Date currentDate = new Date();
		emprofAdObject.setTemporaryCompanyId(getXmlBeanDriver().getClientId());
		emprofAdObject.setContactPrivacyStatus(ContactPrivacyStatus.SHOW_ALL);
		emprofAdObject.setTransactionStatus(getXmlBeanDriver().getTransactionStatus());
		emprofAdObject.setTransactionType(getTransactionType());
		emprofAdObject.setCreatedBy(CustomerFormat.EMPROF.toTextValue());
		emprofAdObject.setModifiedBy(CustomerFormat.EMPROF.toTextValue());
		emprofAdObject.setPublishFromTime(currentDate);
		emprofAdObject.setPublishToTime(currentDate);
		emprofAdObject.setTitle(getXmlBeanDriver().getAdTitle());
		emprofAdObject.setShortDescription(getOppdrag().getINNHOLD());
		emprofAdObject.setAddress(getEmprofAddress());
		emprofAdObject.setCategoryId(getCategoryId(CustomerFormat.EMPROF.toTextValue(), "type", getOppdrag().getBOLIGTYPE()));
		emprofAdObject.addExternalReference(getEmprofExternalReferences());
		emprofAdObject.setContacts(getEmprofContractList());

        AdTransformationUtility.addAdAttribute(emprofAdObject, "energy", getOppdrag().getENERGYLABEL());
        AdTransformationUtility.addAdAttribute(emprofAdObject, "heating", getOppdrag().getENERGYLABELCOLORCODE());
		AdTransformationUtility.addAdAttribute(emprofAdObject, "propertytype", ValueMapManager.lookupValue(CustomerFormat.EMPROF.toTextValue(), "type", getOppdrag().getBOLIGTYPE()));
		AdTransformationUtility.addAdAttribute(emprofAdObject, "municipalnumber", getOppdrag().getKOMMUNENR());
		AdTransformationUtility.addAdAttribute(emprofAdObject, "cadastralnumber", getOppdrag().getGNR());
		AdTransformationUtility.addAdAttribute(emprofAdObject, "holdingnumber", getOppdrag().getBNR());
		AdTransformationUtility.addAdAttribute(emprofAdObject, "sectionnumber", getOppdrag().getSNR());
		AdTransformationUtility.addAdAttribute(emprofAdObject, "leasenumber", getOppdrag().getFNR());
		AdTransformationUtility.addAdAttribute(emprofAdObject, "buildyear", getOppdrag().getBYGGEAAR().toString());
		if (getOppdrag().getMODERNISERINGSAAR().intValue() > 0) {
			AdTransformationUtility.addAdAttribute(emprofAdObject, "modernizedyear", getOppdrag().getMODERNISERINGSAAR().toString());
		}
		AdTransformationUtility.addAdAttribute(emprofAdObject, "price", getOppdrag().getPRISANTYDNINGVERDI().toString());
		AdTransformationUtility.addAdAttribute(emprofAdObject, "valueestimate", getOppdrag().getMARKEDSVERDI().toString());
		AdTransformationUtility.addAdAttribute(emprofAdObject, "loanestimate", getOppdrag().getLAANEVERDI().toString());
		AdTransformationUtility.addAdAttribute(emprofAdObject, "leasefee", getOppdrag().getFESTEAVGIFT());
		AdTransformationUtility.addAdAttribute(emprofAdObject, "livingarea", getOppdrag().getBOAREAL().toString());
		AdTransformationUtility.addAdAttribute(emprofAdObject, "grossarea", getOppdrag().getBRUTTOAREAL().toString());
		AdTransformationUtility.addAdAttribute(emprofAdObject, "ownership", getOppdrag().getEIERFORM());
		if (getOppdrag().getETASJE().intValue() > 0) {
			AdTransformationUtility.addAdAttribute(emprofAdObject, "floor", getOppdrag().getETASJE().toString());
		}
		AdTransformationUtility.addAdAttribute(emprofAdObject, "bedrooms", getOppdrag().getANTALLSOVEROM().toString());
		AdTransformationUtility.addAdAttribute(emprofAdObject, "sharedexpences", getOppdrag().getFELLESUTGIFTER());
		AdTransformationUtility.addAdAttribute(emprofAdObject, "shareddebt", getOppdrag().getFELLESGJELD());
		AdTransformationUtility.addAdAttribute(emprofAdObject, "lotarea", getOppdrag().getTOMTESTORRELSE().toString());
		AdTransformationUtility.addAdAttribute(emprofAdObject, "viewing", getViewing());

		// Text attributes for emprof needs special handling
		AdTransformationUtility.addAdAttributeWithLabel(emprofAdObject, TEXT, "Innhold", getOppdrag().getINNHOLD());
		AdTransformationUtility.addAdAttributeWithLabel(emprofAdObject, TEXT, "Adkomst", getOppdrag().getADKOMST());
		AdTransformationUtility.addAdAttributeWithLabel(emprofAdObject, TEXT, "Tomtebeskrivelse", getOppdrag().getTOMTEBESKRIVELSE());
		AdTransformationUtility.addAdAttributeWithLabel(emprofAdObject, TEXT, "Standard", getOppdrag().getSTANDARD());
		AdTransformationUtility.addAdAttributeWithLabel(emprofAdObject, TEXT, "Beliggenhet", getOppdrag().getBELIGGENHET());
		AdTransformationUtility.addAdAttributeWithLabel(emprofAdObject, TEXT, "Vei, vann og kloakk", getOppdrag().getVEIVANNKLOAKK());

        //add new attribute from BKK-680
        addSharedexpencesdescAttribute();
        addChargesAttribute();
        addShareddebtcondition();

		getViewingTime();

		//AdTransformationUtility.addAdAttribute(emprofAdObject,"_importsourcefile",getSourceFile());

		//emprofAddMediaObject();

		List<ObjectMedia> objectMediaList = MediaHandlerUtility.retrieveMedia(emprofAdObject.getTemporaryCompanyId(), getOppdrag().getOPPDRAGSNR());
		if (objectMediaList != null && objectMediaList.size() > 0) {
			for (ObjectMedia objectMedia : objectMediaList) {
				objectMedia.setReference(objectMedia.getReference().substring(objectMedia.getReference().lastIndexOf("/") + 1 ));
				emprofAdObject.addMediaElement(objectMedia);
			}
		}

		return emprofAdObject;
	}


    private void addSharedexpencesdescAttribute(){
        //Name="sharedexpencesdesc" Type="STRING" Label="Fellesutg. inkl."
        ObjectAttribute objectAttribute = new ObjectAttribute();
        objectAttribute.setOrder(1);
        objectAttribute.setName("sharedexpencesdesc");
        objectAttribute.setLabel("Fellesutg. inkl.");
        objectAttribute.setType(ObjectAttributeType.STRING);
        objectAttribute.setValue(getOppdrag().getHUSLEIEINKLUDERER());
        emprofAdObject.addAttribute(objectAttribute);
    }

    private void addChargesAttribute(){
        //Name="charges" Type="STRING" Label="Omkostninger"
        ObjectAttribute objectAttribute = new ObjectAttribute();
        objectAttribute.setOrder(1);
        objectAttribute.setName("charges");
        objectAttribute.setLabel("Omkostninger");
        objectAttribute.setType(ObjectAttributeType.STRING);
        objectAttribute.setValue(getOppdrag().getOMKOSTNINGER());
        emprofAdObject.addAttribute(objectAttribute);
    }

    private void addShareddebtcondition(){
        //Name="shareddebtcondition" Type="STRING" Label="Lånevilkår for fellesgjeld"
        ObjectAttribute objectAttribute = new ObjectAttribute();
        objectAttribute.setOrder(1);
        objectAttribute.setName("shareddebtcondition");
        objectAttribute.setLabel("Lånevilkår for fellesgjeld");
        objectAttribute.setType(ObjectAttributeType.STRING);
        objectAttribute.setValue(getOppdrag().getLAANEVILKAARFELLESGJELD());
        emprofAdObject.addAttribute(objectAttribute);
    }


	/**
	 * function for get the viewingtime attribute
	 *
	 * @return String that combine with FRA element + "-" + TIL element
	 */

	private String getViewingTime() {
		StringBuffer viewingTimeBuffer = new StringBuffer(); //VISNINGSTIDER
		VISNINGSTIDERDocument.VISNINGSTIDER[] visningstiders = getDataDocument().getDATA().getOPPDRAGArray(0).getVISNINGSTIDERArray();
		for (int i = 0; i < visningstiders.length; i++) {
			viewingTimeBuffer.append(getDataDocument().getDATA().getOPPDRAGArray(0).getVISNINGSTIDERArray(i).getVISNING().getFRA());
			viewingTimeBuffer.append("-");
			viewingTimeBuffer.append(getDataDocument().getDATA().getOPPDRAGArray(0).getVISNINGSTIDERArray(i).getVISNING().getTIL());
			AdTransformationUtility.addAdAttribute(emprofAdObject, "viewingtime", viewingTimeBuffer.toString());
		}
		return null;
	}

	/**
	 * function for get transaction type by check from  dataDocument.getDATA().getOPPDRAGArray(0).getBOLIGTYPE()
	 *
	 * @return transaction type
	 */

	private AdObjectTransactionType getTransactionType() {
		int tran = Integer.parseInt(getDataDocument().getDATA().getOPPDRAGArray(0).getOPPDRAGHOVEDTYPE().toString());
		if (tran == 1) {
			return AdObjectTransactionType.FOR_RENT;
		} 
		else {
			return AdObjectTransactionType.FOR_SALE;
		}
	}

	/**
	 * the function that return viewing
	 * @return String - view
	 */

	private String getViewing() {
		String viewing = "test";
		//check by use VISNINGSTIDER
		VISNINGSTIDERDocument.VISNINGSTIDER[] visningstider = getDataDocument().getDATA().getOPPDRAGArray(0).getVISNINGSTIDERArray();

		for(int i=0;i< visningstider.length;i++){
			if (getDataDocument().getDATA().getOPPDRAGArray(0).getVISNINGSAVTALE().equals("")) {
				viewing = getDataDocument().getDATA().getOPPDRAGArray(0).getVISNINGSAVTALE();
			} else {
				StringBuffer viewingBuffer = new StringBuffer();
				//DATO,FRA_KL,TIL_KL
				viewing = viewingBuffer.toString();
			}
		}

		return viewing;
	}

	/*
         function for create the list of contact object that it get the information from emprof xml
         @return ArrayList<Contact>
	 */

	private List<Contact> getEmprofContractList() {
		List<Contact> listOfContact = new ArrayList<Contact>();
		Contact aContact = new Contact();
		aContact.setName(getOppdrag().getSAKSBEHANDLERNAVN());
		aContact.setEmail(getOppdrag().getSAKSBEHANDLEREMAIL());

		if (getOppdrag().getSAKSBEHANDLERSTELEFON() != null && getOppdrag().getSAKSBEHANDLERSTELEFON().length() != 0) {
			ContactAttribute aContactAttribute = new ContactAttribute();
			aContactAttribute.setSection("DEFAULT");
			aContactAttribute.setOrder(null);
			aContactAttribute.setType(ContactAttributeType.PHONE);
			aContactAttribute.setValue(getOppdrag().getSAKSBEHANDLERSTELEFON());
            aContact.addAttribute(aContactAttribute);
		}
        if (getOppdrag().getSAKSBEHANDLERSMOBIL() != null && getOppdrag().getSAKSBEHANDLERSMOBIL().length() != 0) {
            ContactAttribute aContactAttribute = new ContactAttribute();
            aContactAttribute.setSection("DEFAULT");
            aContactAttribute.setOrder(null);
            aContactAttribute.setType(ContactAttributeType.MOBILE);
            aContactAttribute.setValue(getOppdrag().getSAKSBEHANDLERSMOBIL());
            aContact.addAttribute(aContactAttribute);
        }
		listOfContact.add(aContact);
		return listOfContact;
	}

	/*
        function for create the external reference object that it get the information from emprof xml and internal function
        @return ArrayList<ObjectExternalReference>
	 */

	public ObjectExternalReference getEmprofExternalReferences() {

		ObjectExternalReference aObjectExternalReference = new ObjectExternalReference();

		aObjectExternalReference.setSource((getDataDocument().getDATA().getMEGLERDATA().getMEGLERKONTORID()).toString());
		aObjectExternalReference.setSystem(CustomerFormat.EMPROF.toTextValue());
		aObjectExternalReference.setSystemVersion(VERSION);
		aObjectExternalReference.setType(ObjectExternalReferenceType.COMPANY_REFERENCE);
		aObjectExternalReference.setReference(getXmlBeanDriver().getClientRef());

		return aObjectExternalReference;
	}

	/*
        function for create the address object that get from emprof xml
        @return Address object
	 */

	public Address getEmprofAddress() {
		Address emprofAddress = new Address();
		String[] postnrSted = getOppdrag().getPOSTNR().split(" ");
		String postCode = null;
		String postLocation = null;

		if (postnrSted.length == 2) {
			postCode = postnrSted[0];
			postLocation = postnrSted[1];
		}

		if ((getOppdrag().getPOSTNR()).length() > 0) {
			postCode = postnrSted[0];
		}

		emprofAddress.setGeography("Norge");
		emprofAddress.setPostCode(postCode);
		emprofAddress.setPostLocation(postLocation);
		emprofAddress.setPrimaryAddress(getOppdrag().getEIENDOMSNAVN());

		return emprofAddress;
	}

	public void setDataDocument(DATADocument dataDocument) {
		this.dataDocument = dataDocument;
	}

	public DATADocument getDataDocument() {
		return dataDocument;
	}

	public void setOppdrag(OPPDRAGDocument.OPPDRAG oppdrag) {
		this.oppdrag = oppdrag;
	}

	public OPPDRAGDocument.OPPDRAG getOppdrag() {
		return oppdrag;
	}
}
