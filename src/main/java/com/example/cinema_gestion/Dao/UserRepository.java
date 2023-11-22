package com.example.cinema_gestion.Dao;

import com.example.cinema_gestion.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String userEmail);
}
