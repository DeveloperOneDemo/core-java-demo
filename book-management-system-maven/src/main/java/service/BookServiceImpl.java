package service;

import java.util.List;

import dao.BookDao;
import dao.BookDaoImpl;
import pojo.BookPojo;

public class BookServiceImpl implements BookService {

	BookDao bookDao;
	
	public BookServiceImpl() {
		bookDao = new BookDaoImpl();
	}

	@Override
	public List<BookPojo> fetchAllBooks() {
		return bookDao.fetchAllBooks();
	}

	@Override
	public BookPojo addBook(BookPojo bookPojo) {
		return bookDao.addBook(bookPojo);
	}

	@Override
	public BookPojo updateBook(BookPojo bookPojo) {
		return bookDao.updateBook(bookPojo);
	}

	@Override
	public BookPojo deleteBook(int bookId) {
		return bookDao.deleteBook(bookId);
	}

	@Override
	public BookPojo fetchABook(int bookId) {
		return bookDao.fetchABook(bookId);
	}

}
