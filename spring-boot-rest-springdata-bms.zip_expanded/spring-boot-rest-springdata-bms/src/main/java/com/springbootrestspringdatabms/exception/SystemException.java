package com.springbootrestspringdatabms.exception;

public class SystemException extends Exception{

	@Override
	public String getMessage() {
		return "Appplication Failed! Please try after somtime!!";
	}
	
	

}
