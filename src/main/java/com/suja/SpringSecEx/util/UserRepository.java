package com.suja.SpringSecEx.util;
import java.util.Optional;

import com.suja.SpringSecEx.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);
}
