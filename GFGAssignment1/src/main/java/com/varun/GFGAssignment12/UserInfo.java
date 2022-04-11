package com.varun.GFGAssignment12;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class UserInfo implements Comparable<UserInfo> {
	
	private Integer height;

	@Override
	public int compareTo(UserInfo uf) {
		// TODO Auto-generated method stub
		if (this.getHeight() == null || uf.getHeight() == null) {
		      return 0;
		    }
		return this.getHeight().compareTo(uf.getHeight());
	}
	
	

}
