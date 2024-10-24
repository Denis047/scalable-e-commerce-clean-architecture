package org.commerce.domain.entity;

import org.commerce.domain.exception.InvalidUsernameException;
import org.commerce.domain.vo.*;

public record User(UserId id, String username, UserProfile userProfile, Password password, Email email, Role role) {

    public User {
        validateUsername(username);
    }

    private void validateUsername(String username) {
        if (username.length() < 5) {
            throw new InvalidUsernameException();
        }
    }

}
