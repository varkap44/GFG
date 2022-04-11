package com.varun.GFGAssignment11;

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
public class UserInfo extends Object {
	
	private String name;
	
	private int age;
	
	private long height;
	
	@Override
	public boolean equals(Object ui) {
		if (((UserInfo)ui).getName().equals(this.name) &&
				((UserInfo)ui).getAge() == this.getAge() && 
						((UserInfo)ui).getHeight() == this.getHeight()) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return ((int)(this.getAge()*31 + this.getHeight() ) * 31) 
				+ this.getName().length();
	}
 
}
