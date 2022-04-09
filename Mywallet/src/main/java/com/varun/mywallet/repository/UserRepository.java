package com.varun.mywallet.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.varun.mywallet.entity.User;

@Repository
public interface UserRepository 
					extends CrudRepository<User, Long> {

}
