package com.claurier.monaquedi.exception;

import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Laurent Calvet <laurent.calvet@telino.com>
 */
public class ApplicationException extends RuntimeException {

    protected Map<String, Object> details = new HashMap<>();
    int codeErreur = 0;
    private String typeErreur;
    private HttpStatus status;

    public ApplicationException(String message) {
        super(message);
    }

    public ApplicationException(String message, int codeErreur) {
        super(message);
        this.codeErreur = codeErreur;
    }

    public ApplicationException(Throwable cause) {
        super(cause);
    }

    public ApplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApplicationException(String typeErreur, String message, HttpStatus status) {
        super(message);
        this.typeErreur = typeErreur;
        this.status = status;
    }

    public void setDetails(Map<String, Object> details) {
        this.details = details;
    }

    public Map<String, Object> getDetails() {
        return details;
    }

    public int getCodeErreur() {
        return codeErreur;
    }

}

