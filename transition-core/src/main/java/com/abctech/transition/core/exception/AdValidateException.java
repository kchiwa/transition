package com.abctech.transition.core.exception;

/**
 * Thrown when there is validation error in the ad.
 * @author tuan
 *
 */
public class AdValidateException extends TransitionException {

	public AdValidateException(String message, Throwable cause) {
        super(message, cause);
    }
	
	public AdValidateException(String message) {
		super(message);
	}
	
}
