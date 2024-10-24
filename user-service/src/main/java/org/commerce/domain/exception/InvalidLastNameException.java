package org.commerce.domain.exception;

public class InvalidLastNameException extends RuntimeException {

    private static final String INVALID_LAST_NAME_LENGTH_MESSAGE = "Invalid length less then 2 for lastName";

    public InvalidLastNameException(String message) {
        super(message);
    }

    public static InvalidLastNameException invalidLength() {
        return new InvalidLastNameException(INVALID_LAST_NAME_LENGTH_MESSAGE);
    }

}
