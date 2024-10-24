package org.commerce.domain.exception;

public class InvalidUserIdException extends RuntimeException {

    private static final String INVALID_USER_ID_MESSAGE = "User id can't be null.";

    public InvalidUserIdException() {
        super(INVALID_USER_ID_MESSAGE);
    }

}
