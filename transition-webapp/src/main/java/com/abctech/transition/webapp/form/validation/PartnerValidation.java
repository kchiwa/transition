package com.abctech.transition.webapp.form.validation;

import com.abctech.transition.webapp.form.PartnerForm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @author Pun (pun@abctech-thailand.com)
 * @since 2011-05-30
 */
public class PartnerValidation implements Validator {
    private Logger log = LoggerFactory.getLogger(PartnerValidation.class);

    @Override
    public boolean supports(Class<?> aClass) {
        return PartnerForm.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "identifier", "error.form.identifier.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "error.form.password.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "zClientID", "error.form.zClientID.required");
        PartnerForm partnerForm = (PartnerForm) o;
        if (partnerForm.getId().equals("Please_select")) {
            log.error("Please select a login.");
            errors.rejectValue("id", "error.form.id.required");
        }
        if (!errors.hasFieldErrors("zClientID")) {
            try {
                Integer.parseInt(partnerForm.getzClientID());
            } catch (NumberFormatException e) {
                log.error("ZClientID can only be number!!! " + e.getMessage());
                errors.rejectValue("zClientID", "error.form.zClientID.only.number");
            }
        }

    }
}
