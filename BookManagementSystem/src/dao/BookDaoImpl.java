package dao;

import java.util.ArrayList;
import java.util.List;

import pojo.BookPojo;

public class BookDaoImpl implements BookDao {

	List<BookPojo> allBooks;
	
	public BookDaoImpl() {
		allBooks = new ArrayList<BookPojo>();
		allBooks.add(new BookPojo(101, "Harry Potter and the Chamber of Secrets", "J.K.Rowling", "Fiction", 40, ""));
		allBooks.add(new BookPojo(102, "Harry Potter and the Goblet of Fire", "J.K.Rowling", "Fiction", 35, ""));
		allBooks.add(new BookPojo(103, "Harry Potter and the Half Blood Prince", "J.K.Rowling", "Fiction", 45, ""));
	}

	@Override
	public List<BookPojo> fetchAllBooks() {
		return allBooks;
	}

	@Override
	public BookPojo addBook(BookPojo bookPojo) {
		int newBookId = allBooks.get(allBooks.size()-1).getBookId() + 1;
		
		// breading down line 26
		//int lastIndex = allBooks.size()-1;
		//BookPojo lastBook = allBooks.get(lastIndex);
		//int lastBookId = lastBook.getBookId();
		//int newBookId = lastBookId + 1;
		
		bookPojo.setBookId(newBookId);
		allBooks.add(bookPojo);
		return bookPojo;
	}

	@Override
	public BookPojo updateBook(BookPojo bookPojo) {
		for(int i=0; i<allBooks.size(); i++) {
			if(allBooks.get(i).getBookId() == bookPojo.getBookId()) {
				allBooks.set(i, bookPojo);
			}
		}
		return bookPojo;
	}

	@Override // bookId = 109
	public BookPojo deleteBook(int bookId) {
		BookPojo returnBookPojo = null;
		for(int i=0; i<allBooks.size(); i++) {
			if(allBooks.get(i).getBookId() == bookId) {
				returnBookPojo = allBooks.get(i);
				allBooks.remove(i);
			}
		}
		return returnBookPojo;
	}

	@Override
	public BookPojo fetchABook(int bookId) {
		BookPojo returnBookPojo = null;
		for(int i=0; i<allBooks.size(); i++) {
			if(allBooks.get(i).getBookId() == bookId) {
				returnBookPojo = allBooks.get(i);
			}
		}
		return returnBookPojo;
	}

}
