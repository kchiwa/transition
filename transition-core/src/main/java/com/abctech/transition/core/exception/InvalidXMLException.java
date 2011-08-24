package com.abctech.transition.core.exception;


public class InvalidXMLException extends TransitionException{

	public InvalidXMLException(String message, Throwable cause) {
        super(message, cause);
    }

	public InvalidXMLException(String message) {
		super(message);
	}
}
