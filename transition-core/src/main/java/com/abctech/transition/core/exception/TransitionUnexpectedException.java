package com.abctech.transition.core.exception;

/**
 * @author Pun (pun@abctech-thailand.com)
 * @since 2011-04-20
 */

/**
 * Something entirely not expected happened.
 */

public class TransitionUnexpectedException extends TransitionRuntimeException  {
    public TransitionUnexpectedException(String s) {
        super(s);
    }
}
