package com.springbootrestspringdatabms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootrestspringdatabms.exception.BooksNotFoundException;
import com.springbootrestspringdatabms.exception.SystemException;
import com.springbootrestspringdatabms.pojo.BookPojo;
import com.springbootrestspringdatabms.service.BookService;
import com.springbootrestspringdatabms.service.BookServiceImpl;

@RestController
@RequestMapping("api")
public class BookController {
	
	//BookService bookService = new BookServiceImpl();
	
	@Autowired
	BookService bookService;
	
	// http://localhost:1010/api/books
	@GetMapping("books")
	List<BookPojo> fetchAllBooks() throws SystemException, BooksNotFoundException{
		return bookService.fetchAllBooks();
	}

	// Create
	// http://localhost:1010/api/books
	@PostMapping("books")
	BookPojo addBook(@RequestBody BookPojo bookPojo) throws SystemException {
		return bookService.addBook(bookPojo);
	}

	// Update
	// http://localhost:1010/api/books
	@PutMapping("books")
	BookPojo updateBook(@RequestBody BookPojo bookPojo) throws SystemException {
		return bookService.updateBook(bookPojo);
	}

	// Delete
	// http://localhost:1010/api/books/101
	@DeleteMapping("books/{bookId}")
	void deleteBook(@PathVariable("bookId") int bid) throws SystemException {
		bookService.deleteBook(bid);
	}  

	// Read - fetch a book
	// http://localhost:1010/api/books/102
	@GetMapping("books/{bookId}")
	BookPojo fetchABook(@PathVariable("bookId") int bid) throws SystemException {
		return bookService.fetchABook(bid);
	}
	
	
}
