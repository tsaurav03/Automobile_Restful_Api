package com.automobile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.automobile.dtos.ApiResponse;
import com.automobile.entities.User;
import com.automobile.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {
     @Autowired
	private UserRepository repo;
	@Override
	public ApiResponse createUser(User user) {
		repo.save(user);
		return new ApiResponse("User registered");
	}

}
