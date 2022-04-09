package com.varun.mywallet.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.varun.mywallet.model.Transaction;
import com.varun.mywallet.model.UserInfo;
import com.varun.mywallet.service.TransactionService;
import com.varun.mywallet.service.UserService;

@RestController
@RequestMapping("/mywallet")
public class MyController implements InitializingBean {
	
	private Map<String, UserInfo> idToUserMap = new HashMap<>();
	
	@Autowired
	private TransactionService tranServ;
	
	@Autowired
	private UserService userServ;

	@Override
	public void afterPropertiesSet() throws Exception {
		UserInfo user1 = createUser("Heckya", "heckya@gmail.com", "8875757767", "California");
		idToUserMap.put(user1.getUserId(), user1);
		UserInfo user2 = createUser("Money", "money@gmail.com", "848475775", "Chicago");
		idToUserMap.put(user2.getUserId(), user2);
		
	}

	private UserInfo createUser(String name, String email, String phone, String address) {
		// TODO Auto-generated method stub
		UserInfo user = new UserInfo(name, email, phone, address);
		return user;
	}
	
	@GetMapping("/users")
	public List<UserInfo> getAll() {
		if (CollectionUtils.isEmpty(idToUserMap)) {
			throw new RuntimeException("The Map is empty");
		}
		return idToUserMap.values().stream().toList();
	}
	
	
	@GetMapping("/userDetails/{id}")
	public UserInfo getUser(@PathVariable String id) {
		return idToUserMap.get(id);
	}
	
	@GetMapping("/fetchTransaction/{id}")
	public Transaction fetchTransactionById(@PathVariable String Id) {
		return tranServ.fetchTransactionById(Long.valueOf(Id));
	}
	
	@PostMapping("/transferMoney")
	public Transaction transferAmount(@RequestBody Transaction transaction) {
		
		if (transaction.getAmount() == null || transaction.getFromUserId() == null || transaction.getToUserId() == null ) {
			throw new RuntimeException("Invalid request");
		}
		
		return tranServ.saveTransaction(transaction);
	}
	
	@PostMapping("/createUser")
	public UserInfo newUser(@Valid @RequestBody UserInfo userInfo) {
		return userServ.newUser(userInfo);
	}

}
