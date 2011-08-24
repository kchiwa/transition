package com.abctech.transition.core.exception;

/**
 * This is thrown when something fails in the persist component
 * @author tuan
 *
 */
public class PersistException extends TransitionException {


	public PersistException(String message, Throwable cause) {
        super(message, cause);
    }
	
	public PersistException(String message) {
		super(message);
	}
	
}
