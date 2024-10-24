package org.commerce.domain.exception;

public class InvalidPhoneNumber extends RuntimeException {

    public InvalidPhoneNumber() {
        super("Invalid phone number");
    }

}
