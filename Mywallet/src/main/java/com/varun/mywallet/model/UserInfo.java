package com.varun.mywallet.model;

import java.util.UUID;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
//@JsonInclude( JsonInclude.Include.NON_NULL )
public class UserInfo {
	
	@Setter(AccessLevel.NONE)
	private final String userId = UUID.randomUUID().toString();
	
	@NotBlank
	private String name;
//    @NotEmpty(message = "Email is mandatory.")
//    @Pattern(regexp = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", message = "Email be valid")
	@Email
    private String email;
	
	@NotNull
	private String phone;
	
	@NotBlank
	private String address;
 
}
