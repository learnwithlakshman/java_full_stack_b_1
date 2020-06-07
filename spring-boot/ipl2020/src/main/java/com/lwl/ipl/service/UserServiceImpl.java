package com.lwl.ipl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import com.lwl.ipl.auth.domain.User;
import com.lwl.ipl.auth.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepo userRepo;
	
	@PreAuthorize("hasrole('ADMIN')")
	@Override
	public User addUser(User user) {
		return userRepo.save(user);
	}

}
