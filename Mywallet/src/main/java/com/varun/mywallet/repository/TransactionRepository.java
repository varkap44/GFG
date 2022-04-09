package com.varun.mywallet.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.varun.mywallet.entity.Transaction;

@Repository
public interface TransactionRepository 
				extends CrudRepository<Transaction, Long> {

}
