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
public class LoginValidation implements Validator{
    private Logger log = LoggerFactory.getLogger(LoginValidation.class);
    @Override
    public boolean supports(Class<?> aClass) {
        return PartnerForm.class.isAssignableFrom(aClass);
    }

    // TODO CR Erlend 02.06.2011: Never use o as variable name.
    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "login", "error.form.login.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "error.form.password.required");
        PartnerForm partnerForm = (PartnerForm) o;
        if (partnerForm.getCustomerFormat().equalsIgnoreCase("Please_select")) {
            log.error("Please select format.");
            errors.rejectValue("customerFormat", "error.form.customerFormat.required");
        }
    }
}
