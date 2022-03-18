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
}
