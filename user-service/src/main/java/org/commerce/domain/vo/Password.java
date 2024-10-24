package org.commerce.domain.vo;

import org.commerce.domain.exception.InvalidPasswordException;

public record Password(String password) {

    public Password {
        validatePassword(password);
    }

    private void validatePassword(String password) {
        if (password.length() < 4 || password.length() > 64) {
            throw InvalidPasswordException.invalidLength();
        }

        if (password.chars().noneMatch(Character::isDigit)) {
            throw InvalidPasswordException.noDigit();
        }

        if (password.chars().noneMatch(Character::isUpperCase)) {
            throw InvalidPasswordException.noUpperCase();
        }
    }

}
