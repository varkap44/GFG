package com.varun.GFGAssignment11;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Node {
	
	UserInfo userInfo;
	
	Node left = null;
	
	Node right = null;

}
