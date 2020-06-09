package com.flipcard.exception;

public class NotDeliveringAtLocationException extends Exception {
	String location;
	
	public NotDeliveringAtLocationException(String location) {
		this.location = location;
	}
	
	public String getMessage() {
		return "Not Delivering on given location: " + location;
	}
}
