package com.user.registration.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.registration.model.User;
import com.user.registration.repo.RegistrationRepo;


@Service
public class RegistrationServiceimpl implements RegistrationService {

	@Autowired
	RegistrationRepo repo;

	public User saveUser(User user)
	{
		return repo.save(user);
	}
	
	public User fetchUserByEmailId(String email)
	{
		return repo.findByEmailId(email);
	}
	public User fetchUserByEmailIdAndPaaword(String email,String password)
	{
		return repo.fetchUserByEmailIdAndPaaword(email,password);
	}
}