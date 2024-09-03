package com.andresartiga.soccerfieldmanager.services;

import com.andresartiga.soccerfieldmanager.models.User;

public interface IAuthService {
    public User save(User user);

    public User login(String email);
}
