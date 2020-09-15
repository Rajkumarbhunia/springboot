package com.user.registration.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.user.registration.model.User;

@Repository
public interface RegistrationRepo extends MongoRepository<User, Integer> {

	public User findByEmailId(String email);
	public User fetchUserByEmailIdAndPaaword(String email,String password);
}