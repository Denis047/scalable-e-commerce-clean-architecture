package org.commerce.domain.exception;

public class InvalidNameException extends RuntimeException {

    private final static String INVALID_NAME_MESSAGE = "Firstname and lastname should only contain letters.";

    private static final String INVALID_NAME_LENGTH_MESSAGE = "Invalid length less then 2 for firstname and lastname.";

    public InvalidNameException(String message) {
        super(message);
    }

    public static InvalidNameException invalidName() {
        return new InvalidNameException(INVALID_NAME_MESSAGE);
    }

    public static InvalidNameException invalidNameLength(){
        return new InvalidNameException(INVALID_NAME_LENGTH_MESSAGE);
    }

}
