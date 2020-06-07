package com.lwl.ipl.auth.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lwl.ipl.auth.domain.User;

public interface UserRepo extends JpaRepository<User,Integer> {

		Optional<User> findByUsername(String username);
}
