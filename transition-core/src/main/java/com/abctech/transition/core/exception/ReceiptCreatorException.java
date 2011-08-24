package com.abctech.transition.core.exception;

/**
 * Created by IntelliJ IDEA.
 * User: bow
 * Date: 8/18/11
 * Time: 1:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReceiptCreatorException extends TransitionException {
    public ReceiptCreatorException (String message, Throwable cause) {
        super(message, cause);
    }

    public ReceiptCreatorException (String message) {
        super(message);
    }

}
