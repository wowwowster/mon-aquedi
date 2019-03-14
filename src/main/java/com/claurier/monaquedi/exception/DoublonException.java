package com.claurier.monaquedi.exception;

public class DoublonException extends ApplicationException {

    public DoublonException(String message) {
        super(message);
    }

    public DoublonException(Throwable cause) {
        super(cause);
    }

    public DoublonException(String message, Throwable cause) {
        super(message, cause);
    }
}
