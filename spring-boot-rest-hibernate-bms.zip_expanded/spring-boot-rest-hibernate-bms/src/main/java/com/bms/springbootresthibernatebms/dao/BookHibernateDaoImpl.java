package com.bms.springbootresthibernatebms.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bms.springbootresthibernatebms.entity.BookEntity;
import com.bms.springbootresthibernatebms.exception.BooksNotFoundException;
import com.bms.springbootresthibernatebms.exception.SystemException;
import com.bms.springbootresthibernatebms.pojo.BookPojo;

public class BookHibernateDaoImpl implements BookDao{

	@Override
	public List<BookPojo> fetchAllBooks() throws SystemException, BooksNotFoundException {
		List<BookPojo> allBookPojo = new ArrayList<BookPojo>();
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery("FROM BookEntity");
		List<BookEntity> allBookEntity = query.getResultList();
		//copying collection of entity into collection of pojo
		for(BookEntity bookEntity: allBookEntity) {
			BookPojo bookPojo = new BookPojo(bookEntity.getBookId(), bookEntity.getBookTitle(), bookEntity.getBookAuthor(), bookEntity.getBookGenre(), bookEntity.getBookCost(), bookEntity.getBookImageUrl());
			allBookPojo.add(bookPojo);
		}
		return allBookPojo;
	}

	@Override
	public BookPojo addBook(BookPojo bookPojo) throws SystemException {
		//copy pojo into entity
		BookEntity bookEntity = new BookEntity(bookPojo.getBookId(), bookPojo.getBookTitle(), bookPojo.getBookAuthor(), bookPojo.getBookGenre(), bookPojo.getBookCost(), bookPojo.getBookImageUrl());
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(bookEntity);
		session.flush();
		System.out.println(bookEntity);
		transaction.commit();	
		
		bookPojo.setBookId(bookEntity.getBookId());
		return bookPojo;
	}

	@Override
	public BookPojo updateBook(BookPojo bookPojo) throws SystemException {
		//copy pojo into entity
		BookEntity bookEntity = new BookEntity(bookPojo.getBookId(), bookPojo.getBookTitle(), bookPojo.getBookAuthor(), bookPojo.getBookGenre(), bookPojo.getBookCost(), bookPojo.getBookImageUrl());
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.update(bookEntity);
		System.out.println(bookEntity);
		transaction.commit();	
		
		return bookPojo;
	}

	@Override
	public BookPojo deleteBook(int bookId) throws SystemException {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		BookEntity bookEntity = session.find(BookEntity.class, bookId);
		session.delete(bookEntity);
		System.out.println(bookEntity);
		transaction.commit();	
		
		BookPojo bookPojo = new BookPojo(bookEntity.getBookId(), bookEntity.getBookTitle(), bookEntity.getBookAuthor(), bookEntity.getBookGenre(), bookEntity.getBookCost(), bookEntity.getBookImageUrl());
		return bookPojo;
	}

	@Override
	public BookPojo fetchABook(int bookId) throws SystemException {
		Session session = HibernateUtil.getSessionFactory().openSession();
		BookEntity bookEntity = session.find(BookEntity.class, bookId);
		//copying entity into pojo
		BookPojo bookPojo = new BookPojo(bookEntity.getBookId(), bookEntity.getBookTitle(), bookEntity.getBookAuthor(), bookEntity.getBookGenre(), bookEntity.getBookCost(), bookEntity.getBookImageUrl());
		return bookPojo;
	}

}
