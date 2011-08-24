package com.abctech.transition.core.exception;

public class JmsMessageTypeNotSupportException extends TransitionException{

	public JmsMessageTypeNotSupportException(String message, Throwable cause) {
        super(message, cause);
    }

    public JmsMessageTypeNotSupportException(String msg) {
        super(msg);
    }
}
