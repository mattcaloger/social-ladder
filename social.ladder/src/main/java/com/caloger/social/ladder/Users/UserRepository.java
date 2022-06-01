package com.caloger.social.ladder.Users;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserModel, Long> {
    public Optional<UserModel> findUserByUsername(String username);
}
