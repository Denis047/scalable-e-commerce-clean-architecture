package org.commerce.domain.vo;

import org.commerce.domain.exception.InvalidUserIdException;

import java.util.Objects;
import java.util.UUID;

public class UserId {

    private final UUID uuid;

    public UserId() {
        this.uuid = UUID.randomUUID();
    }

    public UserId(UUID uuid) {
        if (Objects.isNull(uuid)) {
            throw new InvalidUserIdException();
        }
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserId userId = (UserId) o;
        return Objects.equals(uuid, userId.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(uuid);
    }

}
