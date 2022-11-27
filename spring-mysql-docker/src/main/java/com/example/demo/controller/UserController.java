package com.example.demo.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/all")
	public List<User> getAllUsers()
	{
		return userRepository.findAll();
	}
	
	@GetMapping("/create")
	public String saveOneRandomUser()
	{
		User user = new User();
		user.setUsername("Nikhil");
		user.setPassword("password");
		User savedUser = userRepository.save(user);
		return Objects.nonNull(savedUser) ? "User saved successfully !" : "Operation failed !";
	}

}
