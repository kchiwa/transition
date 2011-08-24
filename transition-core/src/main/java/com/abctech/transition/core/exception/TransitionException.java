package com.abctech.transition.core.exception;

// this has to be checked, caught and handled by Camel Exceptions handling.
// do not make it unchecked please.
public class TransitionException extends Exception {
	public TransitionException(String message, Throwable cause) {
        super(message, cause);
    }

    public TransitionException(String msg) {
        super(msg);
    }
}
