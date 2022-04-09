package com.varun.mywallet.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.varun.mywallet.model.Transaction;
import com.varun.mywallet.repository.TransactionRepository;

@Service
//@Transactional(isolation = Isolation.REPEATABLE_READ)
public class TransactionServiceImpl implements TransactionService {
	
	@Autowired
	private TransactionRepository transRepo;
	
	@Autowired
	private ModelMapper mapper;
	
	public Transaction saveTransaction(Transaction transaction) {
		return  mapper.map(transRepo.save(mapper.map(transaction, com.varun.mywallet.entity.Transaction.class)), com.varun.mywallet.model.Transaction.class);
	}

	@Override
	public List<Transaction> fetchTransactionList() {
		return ((List<com.varun.mywallet.entity.Transaction>)
				transRepo.findAll()).stream().map(transaction -> mapper.map(transaction,  Transaction.class)).collect(Collectors.toList());
	}

	@Override
	public Transaction fetchTransactionById(Long transactionId) {
		return mapper.map(transRepo.findById(transactionId).get(), com.varun.mywallet.model.Transaction.class);
		
	}

}
