package com.lwl.ipl.auth.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lwl.ipl.auth.domain.Role;

public interface RoleRepo extends JpaRepository<Role, Integer> {

}
