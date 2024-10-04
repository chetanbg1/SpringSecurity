package com.gfarm.security.repo;

import com.gfarm.security.entiry.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users , Integer> {

    public Users findByUsername(String username);
}
