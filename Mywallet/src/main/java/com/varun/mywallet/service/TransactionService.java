package com.varun.mywallet.service;

import java.util.List;

import com.varun.mywallet.model.Transaction;

public interface TransactionService {
	
   Transaction saveTransaction(Transaction transaction);
	 
    // Read operation
   List<Transaction> fetchTransactionList();
    
   Transaction fetchTransactionById(Long transactionId);

}
