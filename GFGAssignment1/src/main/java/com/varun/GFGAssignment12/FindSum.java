package com.varun.GFGAssignment12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSum {

	public static void main(String[] args) {
		List<UserInfo> users = new ArrayList<>();
		UserInfo uf1 = new UserInfo(1);
		users.add(uf1);
		UserInfo uf2 = new UserInfo(3);
		users.add(uf2);
		UserInfo uf3 = new UserInfo(5);
		users.add(uf3);
		UserInfo uf4 = new UserInfo(7);
		users.add(uf4);
		UserInfo uf5 = new UserInfo(6);
		users.add(uf5);
		Collections.sort(users);
		FindSum fs = new FindSum();
		System.out.println("Size of the array" + users.size());
		System.out.println(fs.findMinimumOperationSum(users));
	}
	
	public int findMinimumOperationSum(List<UserInfo> users){
		
		int sum = 0;
		int intermediateSum = 0;
		
		while (users.size() > 1) {
			intermediateSum  = users.get(0).getHeight() + users.get(1).getHeight();
			UserInfo temp = new UserInfo(intermediateSum);
			users.remove(0);
			users.remove(0);
			users.add(0, temp);
			sum = sum + intermediateSum;
			intermediateSum = 0;
			Collections.sort(users);
		}
		
		return sum;
	}


}
