package com.example.salesrecordapp.salesrecord.repository;
import java.util.Optional;

import com.example.salesrecordapp.salesrecord.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
}