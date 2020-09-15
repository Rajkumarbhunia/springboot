package com.user.registration.controller;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.registration.model.User;
import com.user.registration.repo.RegistrationRepo;
import com.user.registration.service.RegistrationService;

@RestController
@RequestMapping(value = "/api/mongo/user")
public class Registrationcontroller {

	@Autowired
	RegistrationService service;

	@PostMapping("/register")
	public User registerUser(@RequestBody User user) throws Exception
	{
		String tempEmailId=user.getEmail();
		if(tempEmailId!=null && !"".equals(tempEmailId))
		{
			User userObj=service.fetchUserByEmailId(tempEmailId);
			if (userObj !=null)
			{
				throw new Exception ("Email id already exist");
			}
		}
		User userObj=null;
		userObj = service.saveUser(user);
		return userObj;
}
	@PostMapping("/login")
	public User loginUser(@RequestBody User user) throws Exception
	{
		String tempEmailId=user.getEmail();
		String tempPass=user.getPassword();
		User userObj=null;
		if(tempEmailId!=null && tempPass!=null)
		{
			userObj=service.fetchUserByEmailIdAndPaaword(tempEmailId,tempPass);
		}
		if(userObj==null)
		{
			throw new Exception("Bad credential");
		}
		return userObj;
}}