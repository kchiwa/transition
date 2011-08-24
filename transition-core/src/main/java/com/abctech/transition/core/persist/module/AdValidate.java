package com.abctech.transition.core.persist.module;

import com.abctech.transition.core.exception.AdValidateException;
import no.zett.model.AdObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Do validation and sanity check before persisting the ad.
 * Should not alter the inputAdObject in anyway.
 * We expect if the inputAdObject failed the validation it should be fixed either by the client or
 * by the import system in other stages.
 * The validation stage should only be about validation and not touching the inputAdObject.
 * @author tuan
 *
 */
public class AdValidate {
    private final Logger log = LoggerFactory.getLogger(AdValidate.class);

	public AdObject validateAd(AdObject inputAdObject) throws AdValidateException {
        log.debug("START AdObject VALIDATION =====================================================");
		new AdValidationDelegate().validateAdObject(inputAdObject);
        log.debug("END AdObject VALIDATION =======================================================");
		return inputAdObject;
	}


}
