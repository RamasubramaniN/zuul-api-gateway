package com.psg.ramasubramani.userservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psg.ramasubramani.userservice.model.UserInfo;

@RequestMapping(path="/users")
@RestController
public class UserController {
	
	@GetMapping(path="/{id}")
	public UserInfo getUserInfo(@PathVariable("id") long id) {
		//Returning default user info
		UserInfo userInfo = new UserInfo(id, "Ramasubramani N", 30, "Address1");
		return userInfo;
	}
}
