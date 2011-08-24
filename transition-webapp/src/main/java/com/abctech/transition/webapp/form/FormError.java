package com.abctech.transition.webapp.form;

/**
 * @author Pun (pun@abctech-thailand.com)
 * @since 2011-03-14
 */
public class FormError {
    private String errorMessage;

    public FormError(String errorMessage){
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
