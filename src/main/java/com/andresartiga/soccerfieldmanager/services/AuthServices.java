package com.andresartiga.soccerfieldmanager.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.andresartiga.soccerfieldmanager.models.User;
import com.andresartiga.soccerfieldmanager.repository.AuthRepository;

public class AuthServices implements IAuthService {
    @Autowired
    private AuthRepository authRepository;
    @Override
    public User save(User user){
        return authRepository.save(user);
    }
}
