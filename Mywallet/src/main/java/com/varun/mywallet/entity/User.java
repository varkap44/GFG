package com.varun.mywallet.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.Email;

import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(appliesTo = "User")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	
	@NonNull
	private String userId;
	
	@NonNull
	private String name;
	
	@Email
	private String email;
	
	@NonNull
	private String phone;
	
	@NonNull
	private String address;
	

}
