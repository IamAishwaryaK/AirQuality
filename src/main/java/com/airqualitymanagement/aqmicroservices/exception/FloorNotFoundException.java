package com.airqualitymanagement.aqmicroservices.exception;

public class FloorNotFoundException extends RuntimeException {
	private String message;
	public FloorNotFoundException() {}
	 //Displays Exception message
    public FloorNotFoundException(String msg)
    {
        super(msg);
        this.message = msg;
    }

}
