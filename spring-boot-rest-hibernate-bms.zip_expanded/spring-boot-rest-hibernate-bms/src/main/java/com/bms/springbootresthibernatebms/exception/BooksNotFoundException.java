package com.bms.springbootresthibernatebms.exception;

public class BooksNotFoundException extends Exception{

	@Override
	public String getMessage() {
		return "No Books Found!!";
	}

	
}
