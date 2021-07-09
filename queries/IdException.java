package com.te.ProductManagementSystem.queries;

public class IdException extends RuntimeException {
	
	String message;

	public IdException(String message) {
		super();
		this.message = message;
	}
	@Override
	public String getMessage() {
		return message;
	}
}
