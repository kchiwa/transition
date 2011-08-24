package com.abctech.transition.core.exception;

/**
 * Parent class of runtime problems in transition.
 */
public class TransitionRuntimeException extends RuntimeException {
    public TransitionRuntimeException(String message) {
        super(message);
    }

    public TransitionRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}
