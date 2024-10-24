package org.commerce.domain.vo;

import org.commerce.domain.exception.InvalidEmailException;

import java.util.regex.Pattern;

public record Email(String email) {

    public Email {
        validateEmail(email);
    }

    private void validateEmail(String email) {
        if (email.length() < 5) {
            throw InvalidEmailException.invalidLength();
        }

        if (!isValidFormat(email)) {
            throw InvalidEmailException.invalidFormat();
        }
    }

    private boolean isValidFormat(String email) {
        var regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

        return Pattern.compile(regexPattern).matcher(email).find();
    }

}
