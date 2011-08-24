package com.abctech.transition.core.drivers.transformers;


import com.abctech.transition.core.dao.valuemap.ValueMapManager;
import com.abctech.transition.core.drivers.ATransformationDriver;
import com.abctech.transition.core.drivers.xmlbeans.IadIfJobDriver;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.mediahandler.MediaHandlerUtility;
import com.abctech.transition.core.transformation.adTransformation.AdTransformationUtility;
import com.abctech.transition.xmladbeans.iadifjob.IADIFJOBDocument;
import com.abctech.transition.xmladbeans.iadifjob.OBJECTDocument;
import no.zett.model.AdObject;
import no.zett.model.base.*;
import no.zett.model.enums.AdObjectTransactionType;
import no.zett.model.enums.ContactAttributeType;
import no.zett.model.enums.ContactPrivacyStatus;
import no.zett.model.enums.ObjectExternalReferenceType;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class TransformIadiFJob extends ATransformationDriver {
    private final static Logger log = LoggerFactory.getLogger(TransformIadiFJob.class);
    private static final String DEFAULT = "DEFAULT";
    private AdObject adObject = new AdObject();
    private OBJECTDocument.OBJECT adiFJobAdObject = null;
    private String partner = "jobzone";

    private static final String INGRESS_ADECCOOKONOMI = "Adecco er Norges største bemanningsselskap. Vi har over 70 kontorer og avdelinger, og hver dag går over 8.000 personer til en jobb formidlet av Adecco. Vi tilbyr midlertidige og faste stillinger i norsk næringsliv og offentlig sektor. Adecco Økonomi og Regnskap leverer medarbeidere til fagområder innen finans, regnskap og lønn. Vi rekrutterer regnskapsmedarbeidere, controllere, økonomisjefer, lønnsmedarbeidere og annet personell med spesialistkompetanse på alle nivåer.";
    private static final String INGRESS_ADECCOINGENIOR = "Ingeniør Compagniet AS er en av Norges største leverandører av tekniske konsulenttjenester, en totalleverandør av ingeniør- og prosjektadministrative tjenester på alle nivåer. Våre kunder er operatørselskap, leverandørindustrien innen olje & gass, industri og rådgivende virksomheter. Vi tilbyr spennende jobbmuligheter i Norge og i utlandet, meget konkurransedyktige betingelser og et profesjonelt markedsapparat med god oppfølging. Selskapet ble etablert i 1998, er nå en del av Adecco Gruppen og har kontorer i Oslo, Drammen, Kongsberg, Stavanger, Bergen og Trondheim.";
    private static final String INGRESS_ADECCOIT = "Adecco er Norges største bemanningsselskap. Vi har over 70 kontorer og avdelinger, og hver dag går over 8.000 personer til en jobb formidlet av Adecco. Adecco Information Technology er totalleverandør innen drift, support, utvikling, system, sikkerhet og ledelse. Våre kunder er ledende konsulent-, programvare- og telekomselskaper, samt øvrige selskaper med behov innen IKT. Adecco IT tilbyr spennende jobbmuligheter i Norge og utlandet, meget konkurransedyktige betingelser og profesjonell oppfølging.";
    private static final String INGRESS_ADECCOHELSE = "Adecco er Norges største bemanningsselskap. Vi har over 70 kontorer og avdelinger, og hver dag går over 8.000 personer til en jobb formidlet av Adecco. Vi tilbyr midlertidige og faste stillinger i norsk næringsliv og offentlig sektor. Adecco Helse er Norges ledende aktør innen utleie av helsepersonell til sykehus, kommuner, private institusjoner, offshore og andre som har behov for helsepersonell. Vårt mål er å være en god samarbeidspartner for helsevesenet.";
    private static final String INGRESS_ADECCOSALG = "Adecco er Norges største bemanningsselskap. Vi har over 70 kontorer og avdelinger, og hver dag går over 8.000 personer til en jobb formidlet av Adecco. Adecco Salg og Marked rekrutterer ledere og spesialister innen fagområdene salg, marked, kommunikasjon og media. Adecco Salg og Marked tilbyr spennende jobbmuligheter gjennom et solid kundenettverk både i Norge og utlandet.";
    private static final String INGRESS_ADECCOHOSPITALITY = "Adecco er Norges største bemanningsselskap. Vi har over 70 kontorer og avdelinger, og hver dag går over 8.000 personer til en jobb formidlet av Adecco. Vi tilbyr midlertidige og faste stillinger i norsk næringsliv og offentlig sektor. Adecco Hospitality rekrutterer personale til hotell- og restaurantbransjen, catering, events, dagligvare og turisme. Adecco Hospitality er en ledende aktør innen sitt felt i Norge.";
    private static final String INGRESS_ADECCOBYGG = "Adecco er Norges største bemanningsselskap. Vi har over 70 kontorer og avdelinger, og hver dag går over 8.000 personer til en jobb formidlet av Adecco. Vi tilbyr midlertidige og faste stillinger i norsk næringsliv og offentlig sektor. Adecco Bygg og Industri leier ut faglært og ufaglært personell til bygge- og anleggsnæringen samt industrien i Norge. Vi er ledende innenfor vårt segment i Norge med over 2500 medarbeidere ute i oppdrag.";
    private static final String INGRESS_ADECCOTRANSPORT = "Adecco er Norges største bemanningsselskap. Vi har over 70 kontorer og avdelinger, og hver dag går over 8.000 personer til en jobb formidlet av Adecco. Vi tilbyr midlertidige og faste stillinger i norsk næringsliv og offentlig sektor. Adecco Transport og Logistikk leverer personell til store og små aktører innenfor fagområdene, lager, logistikk, transport og lett industri. Vi har oppdrag av både kortere og lengre varighet, og rekrutterer medarbeidere på alle nivåer, fra ufaglært personell til tunge logistikkmedarbeidere.";
    private static final String INGRESS_ADECCOBASIS = "Adecco er verdens største aktør innen bemanning. I Norge er vi ledende med mer enn 70 kontorer og avdelinger, som hver dag formidler jobb til over 8.000 personer. Vi tilbyr midlertidige og faste stillinger i norsk næringsliv og offentlig sektor. Vi har også spisskompetanse på rekruttering av ledere og spesialister til faste stillinger, outsourcing og rådgivning i omstillingsprosesser.";
    private static final String INGRESS_ADECCOFINANS = "Adecco er Norges største bemanningsselskap. Vi har over 70 kontorer og avdelinger, og hver dag går over 8.000 personer til en jobb formidlet av Adecco. Adecco Finans rekrutterer medarbeidere til bank, finans og forsikring. Vi tilbyr midlertidige og faste stillinger i norsk næringsliv og offentlig sektor og er de fremste til å hjelpe kunder og kandidater med riktig bemanning i en bransje hvor behovet for arbeidskraft skifter raskt.";
    private static final String INGRESS_ADECCOJURIDISK = "Adecco er Norges største bemanningsselskap. I Norge har vi over 70 kontorer og avdelinger, og hver dag går over 8.000 personer til en jobb formidlet av Adecco. Vi tilbyr midlertidige og faste stillinger i norsk næringsliv og offentlig sektor. Adecco Juridisk rekrutterer saksbehandlere, sekretærer, jurister, advokater og annet juridisk personell til det offentlige og advokatkontorer.";
    private static final String INGRESS_ADECCOMARINE = "Adecco er Norges største bemanningsselskap. Vi har over 70 kontorer og avdelinger, og hver dag går over 8.000 personer til en jobb formidlet av Adecco. Adecco Marine Weld rekrutterer personell til industrielle stillinger innen offshore, onshore, verksteds- og skipsbyggingsindustrien i Norge. Våre medarbeidere er fagfolk med høy kompetanse innen sitt felt, og vi utfører en rekke store oppdrag for spennende kunder.";
    private static final String INGRESS_ADECCOFINANSPERSONLELL = "Finanspersonell AS har ansvaret for alle eksterne vikariater i DnB NOR. Selskapet skal sikre og utvikle spesialisert arbeidskraft med kompetanse spesielt tilpasset DnB NOR sitt behov.Finanspersonell AS er et selskap eiet av DnB NOR ASA og Adecco Norge AS.";
    private static final String INGRESS_ADECCOPEDAGOGISK = "Adecco er Norges største bemanningsselskap. Vi har over 70 kontorer og avdelinger, og hver dag går over 8.000 personer til en jobb formidlet av Adecco. Adecco Pedagogisk arbeider med å betjene kunder innen privat og offentlig sektor. Mange års samarbeid med ulike deler av denne sektoren over hele landet har gitt oss gode kunnskaper om offentlig virksomhet og de spesielle krav som gjelder i dette markedet.";
    private static final String INGRESS_ADECCOKONTOR = "Adecco er Norges største bemanningsselskap. Vi har over 70 kontorer og avdelinger, og hver dag går over 8.000 personer til en jobb formidlet av Adecco.Adecco Kontor og administrasjon rekrutterer alle typer personell til stillinger innenfor administrasjon, personal, innkjøp og prosjekter. Våre kunder er alt fra små lokale virksomheter til store verdensomspennende selskaper. ";


    public TransformIadiFJob(IadIfJobDriver beanDriver) {
        setXmlBeanDriver(beanDriver);
        IADIFJOBDocument obj = (IADIFJOBDocument) getXmlBeanDriver().getDriverRootXmlBeanDocument();
        adiFJobAdObject = obj.getIADIFJOB().getOBJECTArray(0);
        partner = obj.getIADIFJOB().getHEAD().getPARTNER().toString();


    }

    @Override
    protected AdObject mapping() throws DAOException {


        String categoryName = adiFJobAdObject.getJOB().getJOBCATEGORYArray(0).getCATEGORY() + "/" + adiFJobAdObject.getJOB().getJOBCATEGORYArray(0).getSUBCATEGORY();
        String applicationurl = adiFJobAdObject.getJOB().getMOREINFOArray(0).getURL(); ;

        adObject.setTemporaryCompanyId(getXmlBeanDriver().getClientId());
        adObject.setContactPrivacyStatus(ContactPrivacyStatus.SHOW_ALL);
        adObject.setTransactionStatus(getXmlBeanDriver().getTransactionStatus());
        adObject.setTransactionType(AdObjectTransactionType.JOB_AVAILABLE);
        adObject.setCreatedBy(CustomerFormat.IADIFJOB.toTextValue());
        adObject.setModifiedBy(CustomerFormat.IADIFJOB.toTextValue());
        adObject.setPublishFromTime(convertStringToDate(adiFJobAdObject.getOBJECTHEAD().getFROMDATE()));
        adObject.setPublishToTime(convertStringToDate(adiFJobAdObject.getOBJECTHEAD().getTODATE()));
        //adObject.setTitle(getXmlBeanDriver().getAdTitle());
        adObject.setTitle(adiFJobAdObject.getOBJECTHEAD().getHEADING());
        adObject.setShortDescription(adiFJobAdObject.getJOB().getCOMPANYArray(0).getINGRESS());
        adObject.setAddress(getIadiFinnJobAddess());
        adObject.setCategoryId(getCategoryId(CustomerFormat.FINNJOB.toTextValue(), "categories", categoryName));
        adObject.addExternalReference(getAdiFJobExternalRef());
        adObject.setContacts(getAdiFJobContractList());

        AdTransformationUtility.addAdAttribute(adObject, "employerhomepage", adiFJobAdObject.getJOB().getCOMPANYArray(0).getURL().toString());
        log.debug("URL" + adiFJobAdObject.getJOB().getCOMPANYArray(0).getURL().toString());
        log.debug("GeneralText >>>>>>"  + adiFJobAdObject.getJOB().getGENERALTEXTJOBArray(0).getGENERALTEXT());
        //AdTransformationUtility.addAdAttribute(adObject,"employerdescription" , adiFJobAdObject.getJOB().getCOMPANYArray(0).getINGRESS());
        AdTransformationUtility.addAdAttribute(adObject, "employerdescription", retreiveEmployerdescription(partner));
        AdTransformationUtility.addAdAttribute(adObject, "applicationtag" , adiFJobAdObject.getJOB().getAPPLICATIONLABEL());
        if( applicationurl != null) {
        AdTransformationUtility.addAdAttribute(adObject, "applicationurl", applicationurl);
        }

        log.debug("applicationurl >>>>>>>>>>>>>"  + applicationurl);

        String text = adiFJobAdObject.getJOB().getGENERALTEXTJOBArray(0).getGENERALTEXT();
        text = StringUtils.replace(text, "\n", "");
        text = StringUtils.normalizeSpace(text);
        AdTransformationUtility.addAdAttribute(adObject, "text", text);
        AdTransformationUtility.addAdAttribute(adObject, "applicationdue", adiFJobAdObject.getJOB().getAPPLICATIONDEADLINE());
        AdTransformationUtility.addAdAttribute(adObject, "applicationemail", adiFJobAdObject.getJOB().getAPPLICATIONEMAIL());
        AdTransformationUtility.addAdAttribute(adObject, "starttime", adiFJobAdObject.getJOB().getSTARTDATE());
        AdTransformationUtility.addAdAttribute(adObject, "positioncount", adiFJobAdObject.getJOB().getNOOFPOSITIONS());
        AdTransformationUtility.addAdAttribute(adObject, "positiontitle", adiFJobAdObject.getJOB().getJOBTITLE());
        AdTransformationUtility.addAdAttribute(adObject, "worklocation", adiFJobAdObject.getJOB().getSITUATION());
        AdTransformationUtility.addAdAttribute(adObject, "worksector", ValueMapManager.lookupValue(CustomerFormat.FINNJOB.toTextValue(), "sectors", adiFJobAdObject.getJOB().getSECTOR()));
        AdTransformationUtility.addAdAttribute(adObject, "engagementtype", ValueMapManager.lookupValue(CustomerFormat.FINNJOB.toTextValue(), "duration", adiFJobAdObject.getJOB().getDURATION()));
        AdTransformationUtility.addAdAttribute(adObject, "workrole", ValueMapManager.lookupValue(CustomerFormat.FINNJOB.toTextValue(), "role", adiFJobAdObject.getJOB().getROLE()));
        AdTransformationUtility.addAdAttribute(adObject, "salary", adiFJobAdObject.getJOB().getSALARY());
        AdTransformationUtility.addAdAttribute(adObject, "workhours", ValueMapManager.lookupValue(CustomerFormat.FINNJOB.toTextValue(), "extent", adiFJobAdObject.getJOB().getEXTENT()));
        AdTransformationUtility.addAdAttribute(adObject, "education", adiFJobAdObject.getJOB().getEDUCATION());
        AdTransformationUtility.addAdAttribute(adObject, "employer", adiFJobAdObject.getJOB().getCOMPANYArray(0).getCOMPANYNAME());
        log.debug(" Partner >>>>>>>>>>>>" + partner);
        log.debug("employerdescription >>>>>>>>>>>>>>>" + adObject.getAttribute("employerdescription").getValue());

        List<ObjectMedia> objectMediaList = MediaHandlerUtility.retrieveMedia(getXmlBeanDriver().getClientId(), getXmlBeanDriver().getClientRef());
        if (objectMediaList != null && objectMediaList.size() > 0) {
            for (ObjectMedia objectMedia : objectMediaList) {
                adObject.addMediaElement(objectMedia);
            }
        }
        return adObject;
    }


    private Date convertStringToDate(String dateString) {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date date = null;
        try {
            date = dateFormat.parse(dateString);
        } catch (ParseException e) {
            log.error("Can not parse this date string to Date");
        }
        return date;
    }

    private Address getIadiFinnJobAddess() {
        Address address = new Address();
        if (adiFJobAdObject.getOBJECTHEAD().getOBJECTLOCATION().getCOUNTRYCODE().trim().equalsIgnoreCase("NO")) {
            address.setGeography("Norge");
        } else {
            address.setGeography(adiFJobAdObject.getOBJECTHEAD().getOBJECTLOCATION().getCOUNTRYCODE());
        }
        address.setPostCode(adiFJobAdObject.getOBJECTHEAD().getOBJECTLOCATION().getZIPCODE());
        address.setPostLocation(adiFJobAdObject.getOBJECTHEAD().getOBJECTLOCATION().getSTREETADDRESS());
        address.setPrimaryAddress(adiFJobAdObject.getOBJECTHEAD().getOBJECTLOCATION().getSTREETADDRESS());
        return address;
    }

    private List<Contact> getAdiFJobContractList() {
        List<Contact> listOfContact = new ArrayList<Contact>();
        for (int i = 0; i < adiFJobAdObject.getJOB().getJOBCONTACTArray().length; i++) {
            Contact contact = new Contact();
            contact.setName(adiFJobAdObject.getJOB().getJOBCONTACTArray(i).getNAME());
            contact.setEmail(adiFJobAdObject.getJOB().getJOBCONTACTArray(i).getEMAIL());

            ContactAttribute titleAttribute = new ContactAttribute();
            titleAttribute.setType(ContactAttributeType.TITLE);
            titleAttribute.setValue(adiFJobAdObject.getJOB().getJOBCONTACTArray(i).getTITLE());
            titleAttribute.setSection(DEFAULT);
            titleAttribute.setOrder(null);
            contact.addAttribute(titleAttribute);

            ContactAttribute telephoneAttribute = new ContactAttribute();
            telephoneAttribute.setType(ContactAttributeType.PHONE);
            telephoneAttribute.setValue(adiFJobAdObject.getJOB().getJOBCONTACTArray(i).getPHONE());
            telephoneAttribute.setSection(DEFAULT);
            telephoneAttribute.setOrder(null);
            contact.addAttribute(telephoneAttribute);

            ContactAttribute mobilePhoneAttribute = new ContactAttribute();
            mobilePhoneAttribute.setType(ContactAttributeType.MOBILE);
            mobilePhoneAttribute.setValue(adiFJobAdObject.getJOB().getJOBCONTACTArray(i).getMOBILE());
            mobilePhoneAttribute.setSection(DEFAULT);
            mobilePhoneAttribute.setOrder(null);
            contact.addAttribute(mobilePhoneAttribute);

            ContactAttribute faxAttribute = new ContactAttribute();
            faxAttribute.setType(ContactAttributeType.FAX);
            faxAttribute.setValue(adiFJobAdObject.getJOB().getJOBCONTACTArray(i).getFAX());
            faxAttribute.setSection(DEFAULT);
            faxAttribute.setOrder(null);
            contact.addAttribute(faxAttribute);

            listOfContact.add(contact);
        }
        log.debug("===============> " + listOfContact.size());
        return listOfContact;
    }

    private ObjectExternalReference getAdiFJobExternalRef() throws DAOException {

        ObjectExternalReference aObjectExternalReference = new ObjectExternalReference();
        aObjectExternalReference.setSource(Integer.toString(getXmlBeanDriver().getClientId()));
        aObjectExternalReference.setSystem(CustomerFormat.IADIFJOB.toTextValue());
        aObjectExternalReference.setSystemVersion(VERSION);
        aObjectExternalReference.setType(ObjectExternalReferenceType.COMPANY_REFERENCE);
        aObjectExternalReference.setReference(getXmlBeanDriver().getClientRef());

        return aObjectExternalReference;
    }

    private String retreiveEmployerdescription(String partner) {
        log.debug(("partner >>>>>>>>>>") + partner);
        if (partner.startsWith("adecco")) {
            Map<String, String> adeccoPartner = new HashMap<String, String>();
            adeccoPartner.put("adeccookonomi", INGRESS_ADECCOOKONOMI);
            adeccoPartner.put("adeccoingenior", INGRESS_ADECCOINGENIOR);
            adeccoPartner.put("adeccoit", INGRESS_ADECCOIT);
            adeccoPartner.put("adeccohelse", INGRESS_ADECCOHELSE);
            adeccoPartner.put("adeccosalg", INGRESS_ADECCOSALG);
            adeccoPartner.put("adeccohospitality", INGRESS_ADECCOHOSPITALITY);
            adeccoPartner.put("adeccobygg", INGRESS_ADECCOBYGG);
            adeccoPartner.put("adeccotransport", INGRESS_ADECCOTRANSPORT);
            adeccoPartner.put("adeccobasis", INGRESS_ADECCOBASIS);
            adeccoPartner.put("adeccofinans", INGRESS_ADECCOFINANS);
            adeccoPartner.put("adeccojuridisk", INGRESS_ADECCOJURIDISK);
            adeccoPartner.put("adeccomarine", INGRESS_ADECCOMARINE);
            adeccoPartner.put("adeccofinanspersonell", INGRESS_ADECCOFINANSPERSONLELL);
            adeccoPartner.put("adeccopedagogisk", INGRESS_ADECCOPEDAGOGISK);
            adeccoPartner.put("adeccokontor", INGRESS_ADECCOKONTOR);
            String employerDes = adeccoPartner.get(partner);



            return employerDes;



        } else {
            String employerdescription = adiFJobAdObject.getJOB().getCOMPANYArray(0).getINGRESS();
            return employerdescription;
        }


    }

}
