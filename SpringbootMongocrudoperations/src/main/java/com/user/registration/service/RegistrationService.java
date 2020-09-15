package com.user.registration.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.user.registration.model.User;

public interface RegistrationService {
	
	public User saveUser(User user);
	
	public User fetchUserByEmailId(String email);
	public User fetchUserByEmailIdAndPaaword(String email,String password);
}