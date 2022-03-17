package com.bms.springbootresthibernatebms.service;

import java.util.List;

import com.bms.springbootresthibernatebms.dao.BookDao;
import com.bms.springbootresthibernatebms.dao.BookHibernateDaoImpl;
import com.bms.springbootresthibernatebms.exception.BooksNotFoundException;
import com.bms.springbootresthibernatebms.exception.SystemException;
import com.bms.springbootresthibernatebms.pojo.BookPojo;

public class BookServiceImpl implements BookService {

	BookDao bookDao;
	
	public BookServiceImpl() {
		//bookDao = new BookDaoImpl();
		bookDao = new BookHibernateDaoImpl();
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
