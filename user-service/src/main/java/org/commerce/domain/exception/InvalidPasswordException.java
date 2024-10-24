package org.commerce.domain.exception;

public class InvalidPasswordException extends RuntimeException {

    private static final String INVALID_PASSWORD_LENGTH_MESSAGE = "Password must be between 7 and 64 characters.";

    private static final String INVALID_PASSWORD_NO_DIGIT_MESSAGE = "No digit in password.";

    private static final String INVALID_PASSWORD_NO_UPPER_CASE_MESSAGE= "No upper case character in password.";

    public InvalidPasswordException(String message) {
        super(message);
    }

    public static InvalidPasswordException invalidLength() {
        return new InvalidPasswordException(INVALID_PASSWORD_LENGTH_MESSAGE);
    }

    public static InvalidPasswordException noDigit(){
        return new InvalidPasswordException(INVALID_PASSWORD_NO_DIGIT_MESSAGE);
    }

    public static InvalidPasswordException noUpperCase(){
        return new InvalidPasswordException(INVALID_PASSWORD_NO_UPPER_CASE_MESSAGE);
    }

}
