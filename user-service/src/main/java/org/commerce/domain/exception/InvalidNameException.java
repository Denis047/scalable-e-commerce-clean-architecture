package org.commerce.domain.exception;

public class InvalidNameException extends RuntimeException {

    public InvalidNameException() {
        super("Firstname and lastname should only contain letters.");
    }

}
