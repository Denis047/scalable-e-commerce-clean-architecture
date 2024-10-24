package org.commerce.domain.vo;

import org.commerce.domain.exception.InvalidFirstNameException;
import org.commerce.domain.exception.InvalidLastNameException;
import org.commerce.domain.exception.InvalidNameException;
import org.commerce.domain.exception.InvalidPhoneNumber;

import java.time.LocalDate;

public record UserProfile(String firstname, String lastname, String phoneNumber, String address,
                          LocalDate dateOfBirth) {

    public UserProfile {
        validateProfile(firstname, lastname, phoneNumber);
    }

    private void validateProfile(String firstname, String lastname, String phoneNumber) {
        if (firstname.length() < 2) {
            throw InvalidFirstNameException.invalidLength();
        }

        if (lastname.length() < 2) {
            throw InvalidLastNameException.invalidLength();
        }

        if (isOnlyLetters(firstname) || isOnlyLetters(lastname)) {
            throw new InvalidNameException();
        }

        if (isValidPhoneNumber(phoneNumber)) {
            throw new InvalidPhoneNumber();
        }
    }

    private boolean isOnlyLetters(String str) {
        return !str.matches("^[a-zA-Z]+$");
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        return !phoneNumber.matches("^(\\+?\\d{1,3}[- ]?)?\\(?\\d{1,4}\\)?[- ]?\\d{1,4}[- ]?\\d{1,9}$");
    }

}
