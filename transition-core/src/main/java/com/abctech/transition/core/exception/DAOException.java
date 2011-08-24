package com.abctech.transition.core.exception;

public class DAOException extends TransitionException {


	public DAOException(String message, Throwable cause) {
        super(message, cause);
    }

    public DAOException(String msg) {
        super(msg);
    }
}
