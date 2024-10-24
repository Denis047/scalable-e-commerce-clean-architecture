package org.commerce.domain.exception;

public class InvalidUsernameException extends RuntimeException {

    public InvalidUsernameException() {
        super("Invalid length less than 5 for username");
    }

}
