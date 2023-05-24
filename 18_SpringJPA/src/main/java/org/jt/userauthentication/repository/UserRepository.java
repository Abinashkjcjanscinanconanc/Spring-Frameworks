package org.jt.userauthentication.repository;

import java.util.Optional;

import org.jt.userauthentication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByUsernameAndPassword(String username, String password);
}
