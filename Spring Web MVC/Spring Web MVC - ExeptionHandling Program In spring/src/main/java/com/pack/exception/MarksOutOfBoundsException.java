package com.pack.exception;

public class MarksOutOfBoundsException extends RuntimeException 
{
	private static final long serialVersionUID = 1L;
	private String error_message;
	
	public MarksOutOfBoundsException(String erro_message) 
	{
		this.error_message = erro_message;
	}
	public void setError_message(String error_message) {
		this.error_message = error_message;
	}
	public String getError_message() {
		return error_message;
	}
	
}
