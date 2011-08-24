package com.abctech.transition.core.exception;

/**
 * If priming of data or other startup or runtime sanity methods reveal that
 * we have some problem with the internal consistency, this is thrown
 */
public class InternalConsistencyException extends TransitionRuntimeException {
    public InternalConsistencyException(String message, Throwable cause) {
        super(message, cause);
    }

    public InternalConsistencyException(String msg) {
        super(msg);
    }
}
