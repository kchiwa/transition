package com.abctech.transition.core.drivers.transformers;

import com.abctech.transition.core.dao.valuemap.ValueMapManager;
import com.abctech.transition.core.drivers.ATransformationDriver;
import com.abctech.transition.core.drivers.xmlbeans.ItmakerietDriver;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.mediahandler.MediaHandlerUtility;
import com.abctech.transition.core.transformation.adTransformation.AdTransformationUtility;
import com.abctech.transition.xmladbeans.itmakeriet.*;
import no.zett.model.AdObject;
import no.zett.model.base.*;
import no.zett.model.enums.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class TransformItmakeriet extends ATransformationDriver {
	private final static Logger log = LoggerFactory.getLogger(TransformItmakeriet.class);
	private AdObject itmakerietAdObject = new AdObject();
	private TASImportDocument tasImportDocument = null;
	private PropertyDocument.Property property = null;
	private static final String ERROR = "ERROR: ";
	private static final String SYSTEM = CustomerFormat.ITMAKERIET.toTextValue();


	public TransformItmakeriet(ItmakerietDriver beanDriver) {
		setXmlBeanDriver(beanDriver);
		tasImportDocument = (TASImportDocument) getXmlBeanDriver().getDriverRootXmlBeanDocument();
		property = tasImportDocument.getTASImport().getPropertyArray(0);
	}


	public TASImportDocument getTasImportDocument() {
		return this.tasImportDocument;
	}

	/**
	 * The main method to transform ad to adObject. Which actually mapping values in XML ad into field in AdObject
	 *
	 * @return AdObject - The transformed adObject
	 */
	@Override
	protected AdObject mapping() throws DAOException {
		Timestamp currentTimestamp = new java.sql.Timestamp(new java.util.Date().getTime());

		// Main attributes
		itmakerietAdObject.setTemporaryCompanyId(getXmlBeanDriver().getClientId());
		itmakerietAdObject.setTransactionType(retrieveTransitonType(CustomerFormat.ITMAKERIET.toTextValue(), "transaction", getProperty().getAdType()));

		itmakerietAdObject.setContactPrivacyStatus(ContactPrivacyStatus.SHOW_ALL);
		itmakerietAdObject.setTransactionStatus(getXmlBeanDriver().getTransactionStatus());
		itmakerietAdObject.setCategoryId(getCategoryId(CustomerFormat.ITMAKERIET.toTextValue(), "type", getProperty().getType()));
		itmakerietAdObject.setCreatedBy(SYSTEM);
		itmakerietAdObject.setCreatedTime(currentTimestamp);
		itmakerietAdObject.setPublishFromTime(convertStringToDate(getProperty().getPublish().getFromDate() + " 00:00:00"));
		itmakerietAdObject.setPublishToTime(convertStringToDate(getProperty().getPublish().getToDate() + " 23:59:59"));
		itmakerietAdObject.setTitle(getXmlBeanDriver().getAdTitle());
        if (getProperty().getTextFields() != null && getProperty().getTextFields().getTextArray().length > 0) {
            itmakerietAdObject.setShortDescription(retrieveTextfieldValueByName("Beskrivelse", getProperty().getTextFields().getTextArray()));
        } else {
            itmakerietAdObject.setShortDescription(getXmlBeanDriver().getAdTitle());
        }
		itmakerietAdObject.setAddress(retrieveAddress(getProperty()));
		itmakerietAdObject.setExternalReferences(retrieveExternalReferances(getProperty()));
		itmakerietAdObject.addContact(retrieveContact(getProperty()));

		// Attributes
		AdTransformationUtility.addAdAttribute(itmakerietAdObject, "buildyear", getProperty().getBuiltYear());
		AdTransformationUtility.addAdAttribute(itmakerietAdObject, "bedrooms", getProperty().getBedRooms());
		AdTransformationUtility.addAdAttribute(itmakerietAdObject, "floor", getProperty().getFloor());
		AdTransformationUtility.addAdAttribute(itmakerietAdObject, "lotownership", capitalizeFirst(getProperty().getLotOwnershipType()));
		AdTransformationUtility.addAdAttribute(itmakerietAdObject, "ownership", ValueMapManager.lookupValue(CustomerFormat.ITMAKERIET.toTextValue(), "ownership", getProperty().getOwnershipType()));
		AdTransformationUtility.addAdAttribute(itmakerietAdObject, "propertytype", ValueMapManager.lookupValue(CustomerFormat.ITMAKERIET.toTextValue(),"type", getProperty().getType()));

		if (getProperty().getEnergyClass() != null) {
			AdTransformationUtility.addAdAttribute(itmakerietAdObject, "energy", getProperty().getEnergyClass());
		}
		if (getProperty().getHeatingColorCode() != null) {
			//AdTransformationUtility.addAdAttribute(itmakerietAdObject, "heating", getProperty().getHeatingColorCode());
			AdTransformationUtility.addAdAttribute(itmakerietAdObject, "heating", mapHeatingColorCode(getProperty().getHeatingColorCode()));
		}

		AdTransformationUtility.addAdAttribute(itmakerietAdObject, "rooms", getProperty().getRooms());
		retrieveViewings(getProperty());
		retrieveMatrikkel(getProperty());
		retrieveArea(getProperty());
		retireveAreaText(getProperty());
		retrievePriceFields(getProperty());
		retrieveTextFields(getProperty());
		retrieveOptionsField(getProperty());

		List<ObjectMedia> objectMediaList = MediaHandlerUtility.retrieveMedia(itmakerietAdObject.getTemporaryCompanyId(), getProperty().getClientsRef());
		if (objectMediaList != null && objectMediaList.size() > 0) {
			for (ObjectMedia objectMedia : objectMediaList) {
				itmakerietAdObject.addMediaElement(objectMedia);
			}
		}

		return itmakerietAdObject;
	}

    private String mapHeatingColorCode(String heatingColorCode) {
        if (heatingColorCode.trim().equals("1")) {
            return "GREEN";
        } else if (heatingColorCode.trim().equals("2")) {
            return "LIGHT_GREEN";
        } else if (heatingColorCode.trim().equals("3")) {
            return "YELLOW";
        } else if (heatingColorCode.trim().equals("4")) {
            return "ORANGE";
        } else if (heatingColorCode.trim().equals("5")) {
            return "RED";
        } else {
            return "";
        }
    }

    private AdObjectTransactionType retrieveTransitonType(String itmakeriet, String transaction, String adType) throws DAOException {
		String transactionType = ValueMapManager.lookupValue(itmakeriet, transaction, adType);
		return AdObjectTransactionType.fromEnumValue(transactionType);
	}

	private void retrieveMatrikkel(PropertyDocument.Property property) {
		if (property.getMatrikkel() == null) {
			return;
		}
		if (property.getMatrikkel().getKommune() != null && Integer.parseInt(property.getMatrikkel().getKommune().toString()) > 0) {
			AdTransformationUtility.addAdAttribute(itmakerietAdObject, "municipalnumber", property.getMatrikkel().getKommune().toString());
		}
		if (property.getMatrikkel().getGNR() != null && Integer.parseInt(property.getMatrikkel().getGNR().toString()) > 0) {
			AdTransformationUtility.addAdAttribute(itmakerietAdObject, "cadastralnumber", property.getMatrikkel().getGNR().toString());
		}
		if (property.getMatrikkel().getBNR() != null && Integer.parseInt(property.getMatrikkel().getBNR().toString()) > 0) {
			AdTransformationUtility.addAdAttribute(itmakerietAdObject, "holdingnumber", property.getMatrikkel().getBNR().toString());
		}
		if (property.getMatrikkel().getSNR() != null && Integer.parseInt(property.getMatrikkel().getSNR().toString()) > 0) {
			AdTransformationUtility.addAdAttribute(itmakerietAdObject, "sectionnumber", property.getMatrikkel().getSNR().toString());
		}
		if (property.getMatrikkel().getFNR() != null && Integer.parseInt(property.getMatrikkel().getFNR().toString()) > 0) {
			AdTransformationUtility.addAdAttribute(itmakerietAdObject, "leasenumber", property.getMatrikkel().getFNR().toString());
		}
	}

	private void retrieveOptionsField(PropertyDocument.Property property) {
		if (property.getOptions() == null) {
			return;
		}
		List<String> optionList = new ArrayList<String>();
		OptionDocument.Option[] optionsArray = property.getOptions().getOptionArray();
		if (optionsArray.length > 0) {
			for (OptionDocument.Option option : optionsArray) {
				optionList.add(option.getName());
			}
			Collections.sort(optionList);
			int pos = 1;
			StringBuilder stringBuilder = new StringBuilder();
			for (String option : optionList) {
				stringBuilder.append(option);
				if (pos < optionList.size()) {
					stringBuilder.append("<br/>");
				}
				pos++;
			}
			AdTransformationUtility.addAdAttributeWithLabel(itmakerietAdObject, "text", "Nøkkelinformasjon", stringBuilder.toString());
		}
	}

	private void retrieveTextFields(PropertyDocument.Property property) {
		if (property.getTextFields() == null) {
			return;
		}
		TextDocument.Text[] textsArray = property.getTextFields().getTextArray();
		if (textsArray.length > 0) {
			for (TextDocument.Text text : textsArray) {
				AdTransformationUtility.addAdAttributeWithLabel(itmakerietAdObject, "text", text.getName(), text.getStringValue().trim());
			}
		}
	}

	private void retrievePriceFields(PropertyDocument.Property property) throws DAOException {
		if (property.getPriceFields() == null) {
			return;
		}
		PriceDocument.Price[] pricesArray = property.getPriceFields().getPriceArray();
		String transactionType = retrieveTransitonType(CustomerFormat.ITMAKERIET.toTextValue(), "transaction", property.getAdType()).toString();
		if (pricesArray.length > 0) {
			for (PriceDocument.Price price : pricesArray) {
				addPriceAttributes(price, "Prisantydning", "price");
				addPriceAttributes(price, "Verditakst", "valueestimate");
				addPriceAttributes(price, "Lånetakst", "loanestimate");
				addPriceAttributes(price, "Ligningsverdi", "taxvalue");
				addPriceAttributes(price, "Andel fellesgjeld", "shareddebt");
				addPriceAttributes(price, "Formue", "sharedfortune");
				addPriceAttributes(price, "Fellesutg", "sharedexpences");
				addPriceAttributes(price, "Kommunale avgifter", "municipalexpences");
				addOtherPriceAttribute(price, transactionType);
			}
		}
	}

	private void addOtherPriceAttribute(PriceDocument.Price price, String transactionType) {
		retrieveRentPrice(price, transactionType);
		if (price.getName().equalsIgnoreCase("Fellesutgifter_inkluderer")) {
			AdTransformationUtility.addAdAttribute(itmakerietAdObject, "sharedexpencesdesc", price.getStringValue());
		}
		if (price.getName().equalsIgnoreCase("Omkostninger_for_kjoper")) {
			AdTransformationUtility.addAdAttribute(itmakerietAdObject, "charges", price.getStringValue());
		}
		if (price.getName().equalsIgnoreCase("Laanevilkaar_fellesgjeld")) {
			AdTransformationUtility.addAdAttribute(itmakerietAdObject, "shareddebtcondition", price.getStringValue());
		}
	}


	private void retrieveRentPrice(PriceDocument.Price price, String transactionType) {
		retrieveMonthPrice(price, transactionType);

		if (price.getName().equalsIgnoreCase("Leie") && price.getPer().equalsIgnoreCase("År") && Integer.parseInt(price.getStringValue()) > 0) {
			AdTransformationUtility.addAdAttribute(itmakerietAdObject, "yearlyrent", price.getStringValue());
		}
	}


	private void retrieveMonthPrice(PriceDocument.Price price,
			String transactionType) {
		if ((price.getName().equalsIgnoreCase("Leie") || price.getName().equalsIgnoreCase("Husleie")) &&
				(price.getPer().equalsIgnoreCase("Måned") || price.getPer().equalsIgnoreCase("mnd")) &&
				(transactionType.equalsIgnoreCase("FOR_SALE"))) {
			AdTransformationUtility.addAdAttribute(itmakerietAdObject, "sharedexpences", price.getStringValue());
		}

		if ((price.getName().equalsIgnoreCase("Leie") || price.getName().equalsIgnoreCase("Husleie")) &&
				(price.getPer().equalsIgnoreCase("Måned") || price.getPer().equalsIgnoreCase("mnd")) &&
				((transactionType.equalsIgnoreCase("FOR_RENT")) && (Integer.parseInt(price.getStringValue()) > 0))) {
			AdTransformationUtility.addAdAttribute(itmakerietAdObject, "monthlyrent", price.getStringValue());
		}
	}

	private void addPriceAttributes(PriceDocument.Price price, String name, String zettAttrName) {
		if (price.getName().equalsIgnoreCase(name) && Integer.parseInt(price.getStringValue()) > 0) {
			AdTransformationUtility.addAdAttribute(itmakerietAdObject, zettAttrName, price.getStringValue());
		}
	}

	private void retireveAreaText(PropertyDocument.Property property) {
		if (property.getAreaFields() == null) {
			return;
		}
		TextDocument.Text[] textsArray = property.getAreaFields().getTextArray();
		if (textsArray.length > 0) {
			for (TextDocument.Text text : textsArray) {
				if (text.getName().equalsIgnoreCase("primaererom_inneholder") && text.getStringValue().trim().length() > 0) {
                   // AdTransformationUtility.addAdAttribute(itmakerietAdObject, "primaryroomcontains", text.getStringValue().trim());
                    AdTransformationUtility.addAttributeWithType(itmakerietAdObject ,"primaryroomcontains",ObjectAttributeType.PREFORMATTED_STRING ,text.getStringValue().trim());
				}
			}

		}
	}

	private void retrieveArea(PropertyDocument.Property property) {
		if (property.getAreaFields() == null) {
			return;
		}
		AreaDocument.Area[] areasArray = property.getAreaFields().getAreaArray();
		if (areasArray.length > 0) {
			for (AreaDocument.Area area : areasArray) {
				String areaName = area.getName().trim();
				if (areaName.equalsIgnoreCase("Boligareal BOA") || areaName.equalsIgnoreCase("Boligareal") || areaName.equalsIgnoreCase("boa")) {
					AdTransformationUtility.addAdAttribute(itmakerietAdObject, "livingarea", area.getStringValue());
				} else if (areaName.equalsIgnoreCase("bta") || areaName.equalsIgnoreCase("Bruttoareal")) {
					AdTransformationUtility.addAdAttribute(itmakerietAdObject, "grossarea", area.getStringValue());
				} else if (areaName.equalsIgnoreCase("Tomteareal")) {
					AdTransformationUtility.addAdAttribute(itmakerietAdObject, "lotarea", area.getStringValue());
				} else if (areaName.equalsIgnoreCase("primaererom_areal")) {
					AdTransformationUtility.addAdAttribute(itmakerietAdObject, "primaryroomarea", area.getStringValue());
				} else if (areaName.equalsIgnoreCase("primaererom_inneholder")) {
				//	AdTransformationUtility.addAdAttribute(itmakerietAdObject, "primaryroomcontains", area.getStringValue());
                    AdTransformationUtility.addAttributeWithType(itmakerietAdObject,"primaryroomcontains", ObjectAttributeType.PREFORMATTED_STRING ,area.getStringValue());
				} else {
					AdTransformationUtility.addAdAttribute(itmakerietAdObject, "area", area.getStringValue());
				}
			}
		}
	}

	private void retrieveViewingTime(PropertyDocument.Property property) {
		ViewingDocument.Viewing[] viewingsArray = property.getViewings().getViewingArray();
		for (ViewingDocument.Viewing viewing : viewingsArray) {
			StringBuilder stringBuilder = new StringBuilder();
			if (viewing.getDate()!=null) {
				stringBuilder.append(formatViewingDate(viewing.getDate().getTime())).append(" ").append(viewing.getFrom()).append(" - ").append(viewing.getTo());
				AdTransformationUtility.addAdAttribute(itmakerietAdObject, "viewingtime", stringBuilder.toString());
			}

		}
	}

	private void retrieveViewings(PropertyDocument.Property property) {
		if (property.getViewings() != null && property.getViewings().getViewingText() != null && property.getViewings().getViewingText().trim().length() > 0) {
			AdTransformationUtility.addAdAttribute(itmakerietAdObject, "viewing", property.getViewings().getViewingText().trim()); 
		}
		else if (property.getViewings()!=null && property.getViewings().getViewingArray()!=null && property.getViewings().getViewingArray().length>0) { 
			retrieveViewingTime(property);
		} 
		else {
			AdTransformationUtility.addAdAttribute(itmakerietAdObject, "viewing","Visning etter avtale med megler");
		}
	}


	private Contact retrieveContact(PropertyDocument.Property property) {
		Contact contact = new Contact();
		ContactDocument.Contact retrievedContact = property.getContacts().getContact();
		contact.setName(retrievedContact.getName());
		contact.setEmail(retrievedContact.getEmail());

		if (property.getContacts().getContact().getPhone() != null && property.getContacts().getContact().getPhone().length() > 0) {
			ContactAttribute contactPhoneAttribute = new ContactAttribute();
			contactPhoneAttribute.setSection("DEFAULT");
			contactPhoneAttribute.setType(ContactAttributeType.PHONE);
			contactPhoneAttribute.setValue(property.getContacts().getContact().getPhone());
			contact.addAttribute(contactPhoneAttribute);
		}
		if (property.getContacts().getContact().getFax() != null && property.getContacts().getContact().getFax().length() > 0) {
			ContactAttribute contactFaxAttribute = new ContactAttribute();
			contactFaxAttribute.setSection("DEFAULT");
			contactFaxAttribute.setType(ContactAttributeType.FAX);
			contactFaxAttribute.setValue(property.getContacts().getContact().getFax());
			contact.addAttribute(contactFaxAttribute);
		}
		if (property.getContacts().getContact().getMobile() != null && property.getContacts().getContact().getMobile().length() > 0) {
			ContactAttribute contactMobileAttribute = new ContactAttribute();
			contactMobileAttribute.setSection("DEFAULT");
			contactMobileAttribute.setType(ContactAttributeType.MOBILE);
			contactMobileAttribute.setValue(property.getContacts().getContact().getMobile());
			contact.addAttribute(contactMobileAttribute);
		}
		return contact;
	}

	public List<ObjectExternalReference> retrieveExternalReferances(PropertyDocument.Property property) throws DAOException {
		List<ObjectExternalReference> objectExternalReferenceList = new ArrayList<ObjectExternalReference>();
		ObjectExternalReference objectExternalReference = new ObjectExternalReference();
		objectExternalReference.setReference(getXmlBeanDriver().getClientRef());
		objectExternalReference.setSource(getXmlBeanDriver().getClientId().toString());
		objectExternalReference.setSystem(SYSTEM);
		objectExternalReference.setSystemVersion(VERSION);
		objectExternalReference.setType(ObjectExternalReferenceType.COMPANY_REFERENCE);
		objectExternalReferenceList.add(objectExternalReference);
		return objectExternalReferenceList;
	}

	private Address retrieveAddress(PropertyDocument.Property property) throws DAOException {
		Address address = new Address();
		address.setPrimaryAddress(property.getAddress().getStreet());
		address.setPostCode(property.getAddress().getPostCode().toString());
		address.setPostLocation(property.getAddress().getCity());

		// TODO : PHP need to check if it correct
		String countryCode = property.getAddress().getCountryCode();
		String geography = ValueMapManager.lookupValue(CustomerFormat.ITMAKERIET.toTextValue(), "country", countryCode);
		address.setGeography(geography);
		return address;
	}

	private String retrieveTextfieldValueByName(String name, TextDocument.Text[] textArray) {
		for (TextDocument.Text text : textArray) {
			if (text.getName().equalsIgnoreCase(name)) {
				return text.getStringValue();
			}
		}
		return null;
	}

	protected Date convertStringToDate(String dateString) {
		Date convertedDate = null;
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			convertedDate = dateFormat.parse(dateString);
		} catch (ParseException e) {
			log.error(ERROR + "error in converting string to date");
		}
		return convertedDate;
	}

	private String formatViewingDate(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
		return dateFormat.format(date);
	}

    // TODO CR Erlend 2011.05.26: Do we have a test on this method? If not, add it.
	private String capitalizeFirst(String text) {
		if (text == null) {
            return null;
        }

		String formattedString = "";
		if(text.length()>0){
			formattedString = text.substring(0,1).toUpperCase();
		}				
		
		if(text.length()>1){
			formattedString += text.substring(1);
		}
		return formattedString;
	}	
	
	public void setProperty(PropertyDocument.Property property) {
		this.property = property;
	}

	public PropertyDocument.Property getProperty() {
		return property;
	}
}
