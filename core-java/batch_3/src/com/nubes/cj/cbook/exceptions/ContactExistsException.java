package com.nubes.cj.cbook.exceptions;

public class ContactExistsException extends Exception {
	
	private static final long serialVersionUID = 1L;
	public ContactExistsException() {
		super();
	}
	public ContactExistsException(String message) {
		super(message);
	}
}
