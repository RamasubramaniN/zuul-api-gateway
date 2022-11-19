package com.psg.ramasubramani.userservice;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psg.ramasubramani.userservice.model.UserInfo;

@RequestMapping(path="/users")
@RestController
public class UserController {
	
	//Via Zuul Proxy Server : http://localhost:8081/user-service/users/1
	@GetMapping(path="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserInfo> getUserInfo(@PathVariable("id") long id) {
		//Returning default user info
		UserInfo userInfo = new UserInfo(id, "Ramasubramani N", 30, "Address1");
		return ResponseEntity.ok(userInfo);
	}
}
