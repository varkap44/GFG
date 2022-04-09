package com.varun.mywallet.model;

public class NoUserException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NoUserException() {
	    super("No users could be found ");
	  }
	}
