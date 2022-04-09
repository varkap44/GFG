package com.varun.mywallet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.Email;

import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	@JsonIgnore
	private String id;
	
	@NonNull
	@Column(unique=true)
	private String userId;
	
	@NonNull
	@Column
	private String name;
	
	@Email
	@Column(unique=true)
	private String email;
	
	@NonNull
	@Column
	private String phone;
	
	@NonNull
	@Column
	private String address;
	

}
