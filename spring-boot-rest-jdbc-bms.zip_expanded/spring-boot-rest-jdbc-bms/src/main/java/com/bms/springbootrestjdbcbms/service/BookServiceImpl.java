package com.bms.springbootrestjdbcbms.service;

import java.util.List;

import com.bms.springbootrestjdbcbms.dao.BookDao;
import com.bms.springbootrestjdbcbms.dao.BookJdbcDaoImpl;
import com.bms.springbootrestjdbcbms.exception.BooksNotFoundException;
import com.bms.springbootrestjdbcbms.exception.SystemException;
import com.bms.springbootrestjdbcbms.pojo.BookPojo;

public class BookServiceImpl implements BookService {

	BookDao bookDao;
	
	public BookServiceImpl() {
		//bookDao = new BookDaoImpl();
		bookDao = new BookJdbcDaoImpl();
	}

	@Override
	public List<BookPojo> fetchAllBooks()throws SystemException, BooksNotFoundException {
		return bookDao.fetchAllBooks();
	}

	@Override
	public BookPojo addBook(BookPojo bookPojo)throws SystemException {
		return bookDao.addBook(bookPojo);
	}

	@Override
	public BookPojo updateBook(BookPojo bookPojo)throws SystemException {
		return bookDao.updateBook(bookPojo);
	}

	@Override
	public BookPojo deleteBook(int bookId)throws SystemException {
		return bookDao.deleteBook(bookId);
	}

	@Override
	public BookPojo fetchABook(int bookId)throws SystemException {
		return bookDao.fetchABook(bookId);
	}

	@Override
	public void exitApplication()throws SystemException {
		bookDao.exitApplication();
	}

}
