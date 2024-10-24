package org.commerce.domain.exception;

public class InvalidFirstNameException extends RuntimeException {

    private static final String INVALID_FIRST_NAME_MESSAGE = "Invalid length less then 2 for firstName";

    public InvalidFirstNameException(String message) {
        super(message);
    }

    public static InvalidFirstNameException invalidLength() {
        throw new InvalidFirstNameException(INVALID_FIRST_NAME_MESSAGE);
    }

}
