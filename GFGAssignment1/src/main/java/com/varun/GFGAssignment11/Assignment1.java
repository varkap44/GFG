package com.varun.GFGAssignment11;

import java.util.HashMap;
import java.util.Map;

public class Assignment1 {
	
	private static Map<UserInfo, Integer> finalMap = new HashMap<>();

	public static void main(String[] args) {
		
		Assignment1 ass1 = new Assignment1();
		Node root = ass1.createABinaryTree();
		finalMap = ass1.findUserInfoMap(root);
		System.out.println(finalMap);

	}
	
	private Node createABinaryTree() {
		UserInfo user1 = new UserInfo("Galib", 49, 156);
		UserInfo user2 = new UserInfo("Lata", 88, 143);
		UserInfo user3 = new UserInfo("Gaurav", 34, 178);
		UserInfo user4 = new UserInfo("Galib", 49, 156);
		UserInfo user5 = new UserInfo("Galib", 35, 178);
		UserInfo user6 = new UserInfo("Lata", 88, 143);
		UserInfo user7 = new UserInfo("Lata", 56, 156);
		UserInfo user8 = new UserInfo("Alka", 58, 159);
		UserInfo user9 = new UserInfo("Var", 87, 185);
		UserInfo user10 = new UserInfo("Ullu", 56, 183);
		UserInfo user11 = new UserInfo("Laddu", 56, 183);
		UserInfo user12 = new UserInfo("Ponchu", 56, 183);
		
 		Node n1 = new Node();
		Node n2 = new Node();
		Node n3 = new Node();
		Node n4 = new Node();
		Node n5 = new Node();
		Node n6 = new Node();
		Node n7 = new Node();
		Node n8 = new Node();
		Node n9 = new Node();
		Node n10 = new Node();
 		Node root = new Node(user1, n1, n2);
 		n1.setUserInfo(user2);
 		n2.setUserInfo(user3);
 		n1.setLeft(n3);
 		n1.setRight(n4);
 		n2.setLeft(n5);
 		n2.setRight(n6);
 		n3.setUserInfo(user4);
 		n3.setLeft(n7);
 		n3.setRight(n8);
 		n4.setUserInfo(user5);
 		n4.setRight(n10);
 		n4.setLeft(n9);
 		n5.setUserInfo(user6);
 		n6.setUserInfo(user7);
 		n7.setUserInfo(user8);
 		n8.setUserInfo(user9);
 		n8.setUserInfo(user10);
 		n9.setUserInfo(user11);
 		n10.setUserInfo(user12);
 		
 		return root;
	}

	public Map<UserInfo, Integer> findUserInfoMap(Node root){
		
		traverseBinaryTree(root);
		return finalMap;
	}

	private static void traverseBinaryTree(Node root) {
		// TODO Auto-generated method stub
		if (root == null) {
			return;
		}
		
		if (!finalMap.containsKey(root.getUserInfo())) {
			finalMap.put(root.getUserInfo(), 1);
		} else {
			finalMap.put(root.getUserInfo(), finalMap.get(root.getUserInfo()) + 1);
		}
		
		traverseBinaryTree(root.left);
		
		traverseBinaryTree(root.right);
	}


}
