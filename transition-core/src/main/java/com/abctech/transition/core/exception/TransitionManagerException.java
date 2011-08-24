package com.abctech.transition.core.exception;

/**
 * Trouble when managing transition. Usually the result of some
 * adjustment of a user, and not something that happens when
 * getting feeds or transforming data.
 * 
 * FIXME use InternalConsistencyException should be used here.
 */
public class TransitionManagerException extends TransitionRuntimeException {

    public TransitionManagerException(String message, Throwable cause) {
        super(message, cause);
    }
}
