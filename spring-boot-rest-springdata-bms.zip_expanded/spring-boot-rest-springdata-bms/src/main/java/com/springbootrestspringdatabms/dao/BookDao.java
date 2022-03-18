package com.springbootrestspringdatabms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootrestspringdatabms.entity.BookEntity;
import com.springbootrestspringdatabms.exception.BooksNotFoundException;
import com.springbootrestspringdatabms.exception.SystemException;
import com.springbootrestspringdatabms.pojo.BookPojo;

@Repository
public interface BookDao extends JpaRepository<BookEntity, Integer>{
	
	// create finder methods here
	
	//select * from book_details where book_genre='Comedy';
	List<BookEntity> findByBookGenre(String bookGenre);
}
