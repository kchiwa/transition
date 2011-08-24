package com.abctech.transition.core.transformation.adTransformation;

import no.zett.model.AdObject;
import no.zett.model.base.ObjectAttribute;
import no.zett.model.enums.ObjectAttributeType;
import no.zett.xml.attributes.AttributesValues;
import org.apache.log4j.Logger;

public final class AdTransformationUtility {

    private static final Logger log = Logger.getLogger(AdTransformationUtility.class);

    private AdTransformationUtility() {
    }

    public static void addAdAttribute(AdObject ad, String name, Object value) {
        if (name == null || value == null) {
            return;
        }
        ObjectAttribute oa = AttributesValues.getInstance().getClonedObjectAttribute(name);
        //TODO this will be fixed later on. When zett code gets updated
        if (oa != null) {
            oa.setValue(value.toString());
            //log.debug("Adding attribute to the adobject: " + name + ":" + value);
            ad.addAttribute(oa);
        } else {
            log.warn("ObjectAttribute with the name: " + name + " is not in the registry");
        }
    }

    public static void addAttributeWithType(AdObject ad, String name,  ObjectAttributeType type ,Object value) {
        if (name == null || value == null) {
            return;

        }
        ObjectAttribute oa = AttributesValues.getInstance().getClonedObjectAttribute(name);
        if (oa != null) {
            oa.setValue(value.toString());
            oa.setType(type);
            ad.addAttribute(oa);
        } else {
                log.warn("ObjectAttribute with the name: " + name + " is not in the registry");
        }


    }


    public static void addAdAttributeWithLabel(AdObject ad, String name, String label, String value) {
        if (name == null || value == null || label == null) {
            return;
        }
        ObjectAttribute oa = AttributesValues.getInstance().getClonedObjectAttribute(name);
        if (oa != null) {
            oa.setValue(value);
            oa.setLabel(label);
            //log.debug("Adding attribute to the adobject: " + name + ":" + value +" Label:" + label);
            ad.addAttribute(oa);
        } else {
            log.warn("ObjectAttribute with the name: " + name + " is not in the registry");
        }
    }


}
