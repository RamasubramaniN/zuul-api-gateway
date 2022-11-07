package com.psg.ramasubramani.userservice.model;

import lombok.Getter;

@Getter
public class UserInfo {
	
	private long id;
	private String name;
	private int age;
	private String address;
	
	public UserInfo(long id, String name,
			int age, String address) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.address = address;
	}
}
