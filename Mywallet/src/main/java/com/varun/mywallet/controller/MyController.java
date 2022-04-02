package com.varun.mywallet.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.varun.mywallet.model.UserInfo;

@RestController
@RequestMapping("/mywallet")
public class MyController implements InitializingBean {
	
	private Map<String, UserInfo> idToUserMap = new HashMap<>();

	@Override
	public void afterPropertiesSet() throws Exception {
		UserInfo user1 = createUser("Heckya", "heckya@gmail.com", "8875757767", "California");
		idToUserMap.put(user1.getId(), user1);
		UserInfo user2 = createUser("Money", "money@gmail.com", "848475775", "Chicago");
		idToUserMap.put(user2.getId(), user2);
		
	}

	private UserInfo createUser(String name, String email, String phone, String address) {
		// TODO Auto-generated method stub
		UserInfo user = new UserInfo(name, email, phone, address);
		return user;
	}
	
	@GetMapping("/users")
	public List<UserInfo> getAll() {
		return idToUserMap.values().stream().toList();
	}
	
	

}
