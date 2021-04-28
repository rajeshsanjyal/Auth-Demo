package com.asterisk.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.asterisk.demo.dao.UserRepository;
import com.asterisk.demo.model.User;

@Controller
public class UserController {
	@Autowired
	private UserRepository urepo;
	
	@GetMapping("/login")
	public String loginForm() {
		return "login";
	}
	@PostMapping("/login")
	public String login(@ModelAttribute User user) {
		User u=urepo.login(user.getUserName(), user.getPassword());
				//urepo.findByUserNameAndPassword(user.getUserName(), user.getPassword());
		if(u!=null) {
		return "home";
		}
		return "login";
	}
	@GetMapping("/signup")
	public String signupForm() {
		return "signup";
	}
	@PostMapping("/signup")
	public String saveUser(@ModelAttribute User user) {
		urepo.save(user);
		return "login";
	}
}
