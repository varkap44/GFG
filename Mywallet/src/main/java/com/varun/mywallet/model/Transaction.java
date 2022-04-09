package com.varun.mywallet.model;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Transaction implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Setter(AccessLevel.NONE)
	private Long transactionId;
	
	@NonNull
	private String fromUserId;
	
	@NonNull
	private Boolean isBankTransaction;
	
	@NonNull
	private String toUserId;
	
	@NonNull
	private Double amount;
}
