package io.hhplus.tdd.point.repository;

import io.hhplus.tdd.point.UserPoint;

public interface UserPointReposirtory {
    public UserPoint findById(long id);

    public UserPoint save(UserPoint userPoint);

    public UserPoint update(long userId, long amount);
}
