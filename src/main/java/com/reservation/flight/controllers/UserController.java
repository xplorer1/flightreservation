package com.reservation.flight.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.reservation.flight.models.Users;
import com.reservation.flight.repositories.UsersRepository;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	UsersRepository usersRepository;
	
	@GetMapping
	public List<Users> listusers() {
		return usersRepository.findAll();
	}
	
	@PostMapping
	public Users saveUser(@RequestBody Users users) {
		usersRepository.saveAndFlush(users);
		
		return users;
	}
	
	@PostMapping("/login")
	public String login(@RequestParam("email") String email, @RequestParam("password") String password, ModelMap modelMap) {
		Users user = usersRepository.findByEmail(email);
		
		if(user.getPassword().equals(password)) {
			return "Credentials checks out.";
		}
		else {
			
			return "Invalid username or password.";
		}
	}
}
