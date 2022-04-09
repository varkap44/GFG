package com.varun.mywallet.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.varun.mywallet.entity.User;
import com.varun.mywallet.model.UserInfo;
import com.varun.mywallet.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private ModelMapper mapper;

	@Override
	public UserInfo newUser(UserInfo userInfo) {
		return  mapper.map(userRepo.save(mapper.map(userInfo, com.varun.mywallet.entity.User.class)), com.varun.mywallet.model.UserInfo.class);
	}

}
