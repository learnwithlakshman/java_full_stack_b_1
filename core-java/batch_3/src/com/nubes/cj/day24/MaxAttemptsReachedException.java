package com.nubes.cj.day24;

public class MaxAttemptsReachedException extends RuntimeException{

	public MaxAttemptsReachedException() {
		super();
	}
	public MaxAttemptsReachedException(String message) {
		super(message);
	}
}
