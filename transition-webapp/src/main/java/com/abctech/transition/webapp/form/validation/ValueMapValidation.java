package com.abctech.transition.webapp.form.validation;

import com.abctech.transition.webapp.form.ValueMapSearchForm;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @author Pun (pun@abctech-thailand.com)
 * @since 2011-06-01
 */
public class ValueMapValidation implements Validator{
    @Override
    public boolean supports(Class<?> aClass) {
        return ValueMapSearchForm.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "customerFormat", "error.form.customerFormat.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "field", "error.form.field.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lookup", "error.form.lookup.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "zettValue", "error.form.zettValue.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "categoryId", "error.form.categoryId.required");
        ValueMapSearchForm valueMapSearchForm = (ValueMapSearchForm) o;
        if (!errors.hasFieldErrors("categoryId")) {
            try {
                     Integer.parseInt(valueMapSearchForm.getCategoryId());
                 }catch (NumberFormatException e) {
                    errors.rejectValue("categoryId", "error.form.categoryId.only.number");
                 }

        }

    }
}
