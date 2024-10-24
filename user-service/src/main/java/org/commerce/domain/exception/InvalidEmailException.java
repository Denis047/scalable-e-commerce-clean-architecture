package org.commerce.domain.exception;

public class InvalidEmailException extends RuntimeException {

    private static final String INVALID_EMAIL_LENGTH_MESSAGE = "";
    private static final String INVALID_EMAIL_FORMAT_MESSAGE = "Email specified is not a valid email.";

    public InvalidEmailException(String message) {
        super(message);
    }

    public static InvalidEmailException invalidLength() {
        return new InvalidEmailException(INVALID_EMAIL_LENGTH_MESSAGE);
    }

    public static InvalidEmailException invalidFormat() {
        return new InvalidEmailException(INVALID_EMAIL_FORMAT_MESSAGE);
    }

}
