package com.lwl.ipl.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lwl.ipl.auth.config.JwtUtil;
import com.lwl.ipl.auth.domain.AuthResponse;
import com.lwl.ipl.auth.domain.LoginUser;
import com.lwl.ipl.auth.domain.User;
import com.lwl.ipl.auth.service.AuthUserService;
import com.lwl.ipl.service.UserService;

@RestController
@RequestMapping("app/user/")
public class LoginController {

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private AuthUserService authUserService;
	
	@Autowired
	private JwtUtil jwtUtil;

	@PostMapping("/register")
	public User registerUser(@RequestBody User user) {
		
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		
		return userService.addUser(user);
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody LoginUser loginUser) throws Exception {
		authenticate(loginUser.getUsername(), loginUser.getPassword());
		final UserDetails userDetails = authUserService.loadUserByUsername(loginUser.getUsername());
		final String token = jwtUtil.generateToken(userDetails);
		return ResponseEntity.ok(new AuthResponse(token));
	}
	
	private void authenticate(String username, String password) throws Exception {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}
	}
}