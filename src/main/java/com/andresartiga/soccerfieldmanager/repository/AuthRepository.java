package com.andresartiga.soccerfieldmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andresartiga.soccerfieldmanager.models.User;

public interface AuthRepository extends JpaRepository<User, String> {
    User findByEmail(String email);
}
