package com.varun.mywallet.model;

import java.util.UUID;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@AllArgsConstructor
public class UserInfo {
	
	@Setter(AccessLevel.NONE)
	private final String id = UUID.randomUUID().toString();
	
	private String name;
	
	private String email;
	
	private String phone;
	
	private String address;
 
}
