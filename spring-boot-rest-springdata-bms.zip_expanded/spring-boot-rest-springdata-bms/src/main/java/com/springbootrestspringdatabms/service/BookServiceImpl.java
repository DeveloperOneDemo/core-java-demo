package com.springbootrestspringdatabms.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootrestspringdatabms.dao.BookDao;
import com.springbootrestspringdatabms.entity.BookEntity;
import com.springbootrestspringdatabms.exception.BooksNotFoundException;
import com.springbootrestspringdatabms.exception.SystemException;
import com.springbootrestspringdatabms.pojo.BookPojo;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookDao bookDao;
	
	public BookServiceImpl() {
		//bookDao = new BookDaoImpl();
		
		// commenting this because of using @Autowired
		//bookDao = new BookHibernateDaoImpl();
	}

	@Override
	public List<BookPojo> fetchAllBooks()throws SystemException, BooksNotFoundException {
		List<BookPojo> allBookPojo = new ArrayList<BookPojo>();
		List<BookEntity> allBookEntity = bookDao.findAll();
		for(BookEntity bookEntity: allBookEntity) {
			BookPojo bookPojo = new BookPojo(bookEntity.getBookId(), bookEntity.getBookTitle(), bookEntity.getBookAuthor(), bookEntity.getBookGenre(), bookEntity.getBookCost(), bookEntity.getBookImageUrl());
			allBookPojo.add(bookPojo);
		}
		return allBookPojo;
	}

	@Override
	public BookPojo addBook(BookPojo bookPojo)throws SystemException {
		BookEntity bookEntity = new BookEntity(bookPojo.getBookId(), bookPojo.getBookTitle(), bookPojo.getBookAuthor(), bookPojo.getBookGenre(), bookPojo.getBookCost(), bookPojo.getBookImageUrl());
		bookDao.saveAndFlush(bookEntity);
		bookPojo = new BookPojo(bookEntity.getBookId(), bookEntity.getBookTitle(), bookEntity.getBookAuthor(), bookEntity.getBookGenre(), bookEntity.getBookCost(), bookEntity.getBookImageUrl());
		return bookPojo;
	}

	@Override
	public BookPojo updateBook(BookPojo bookPojo)throws SystemException {
		BookEntity bookEntity = new BookEntity(bookPojo.getBookId(), bookPojo.getBookTitle(), bookPojo.getBookAuthor(), bookPojo.getBookGenre(), bookPojo.getBookCost(), bookPojo.getBookImageUrl());
		bookDao.save(bookEntity);
		bookPojo = new BookPojo(bookEntity.getBookId(), bookEntity.getBookTitle(), bookEntity.getBookAuthor(), bookEntity.getBookGenre(), bookEntity.getBookCost(), bookEntity.getBookImageUrl());
		return bookPojo;
	}

	@Override
	public void deleteBook(int bookId)throws SystemException {
		bookDao.deleteById(bookId);
	}

	@Override
	public BookPojo fetchABook(int bookId)throws SystemException {
		Optional<BookEntity> optional = bookDao.findById(bookId);
		BookPojo bookPojo = null;
		if(optional.isPresent()) {
			BookEntity bookEntity = optional.get();
			bookPojo = new BookPojo(bookEntity.getBookId(), bookEntity.getBookTitle(), bookEntity.getBookAuthor(), bookEntity.getBookGenre(), bookEntity.getBookCost(), bookEntity.getBookImageUrl());	
		}
		return bookPojo;
	}
}
