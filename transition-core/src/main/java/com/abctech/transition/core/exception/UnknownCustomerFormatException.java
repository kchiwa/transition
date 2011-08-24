package com.abctech.transition.core.exception;

/**
 * Thrown whenever we get an unknown format used by the customer.
 * @author tuan
 *
 */
public class UnknownCustomerFormatException extends TransitionException{

	public UnknownCustomerFormatException(String message, Throwable cause) {
        super(message, cause);
    }

	public UnknownCustomerFormatException(String message) {
		super(message);
	}
}
