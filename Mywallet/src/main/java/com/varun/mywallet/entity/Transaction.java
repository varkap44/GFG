package com.varun.mywallet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

//import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(appliesTo = "Transaction")
@Getter
@Setter
@ToString
@NoArgsConstructor
//@Builder

public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long transactionId;
	
	private String fromUserId;
	
	@Column(nullable = false)
	private Boolean isBankTransaction;
	
	@Column(nullable = false)
	private String toUserId;
	
	@Column(nullable = false)
	private Double amount; 

}