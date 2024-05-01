package com.tunehub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tunehub.entity.User;
import com.tunehub.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {

	@Autowired

	UserService userService;
	

	@PostMapping("/register")

	public String userdata(@ModelAttribute User user) {

	User userExists = userService.emailExists(user);

	if(userExists==null) {

	userService.saveUser(user);

	System.out.println("User added succesfully");

	}

	else {

	System.out.println("Duplicate User ");

	}
    return "login";
	}
	@PostMapping("/validate")

	public String validate(@RequestParam("email") String email,
			@RequestParam("password") String password, boolean credentials) {
		
		if(userService.validUser(email,password) == true) {
			
			String role = userService.getRole(email);
			System.out.println(email+"-"+password+"-login");
			
			if(role.equals("Admin")) {
				return "AdminHome";
			}else {
			return "CustomerHome";
		}
		}
		else {
		return "login";
}
	}
		@GetMapping("/logout")
		public String logout(HttpSession session) {
			session.invalidate();
			return "login";
		
}
	
}
