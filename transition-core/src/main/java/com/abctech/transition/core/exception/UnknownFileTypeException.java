package com.abctech.transition.core.exception;

public class UnknownFileTypeException extends TransitionException{

	public UnknownFileTypeException(String message, Throwable cause) {
        super(message, cause);
    }

	public UnknownFileTypeException(String message) {
		super(message);
	}
}
