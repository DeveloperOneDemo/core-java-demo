package com.bms.springbootrestjdbcbms.exception;

public class BooksNotFoundException extends Exception{

	@Override
	public String getMessage() {
		return "No Books Found!!";
	}

	
}
