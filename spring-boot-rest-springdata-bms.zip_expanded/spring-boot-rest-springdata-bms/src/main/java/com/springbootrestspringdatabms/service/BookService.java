package com.springbootrestspringdatabms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springbootrestspringdatabms.exception.BooksNotFoundException;
import com.springbootrestspringdatabms.exception.SystemException;
import com.springbootrestspringdatabms.pojo.BookPojo;

//@Component

public interface BookService {

	// Read - fetch all books
	List<BookPojo> fetchAllBooks()throws SystemException, BooksNotFoundException;

	// Create
	BookPojo addBook(BookPojo bookPojo)throws SystemException;

	// Update
	BookPojo updateBook(BookPojo bookPojo)throws SystemException;

	// Delete
	void deleteBook(int bookId)throws SystemException;

	// Read - fetch a book
	BookPojo fetchABook(int bookId)throws SystemException;
	
}
