package com.gfarm.security.service;

import com.gfarm.security.entiry.Users;

public interface UserService {

    public Users register(Users user);

    public String verify(Users user);
}
