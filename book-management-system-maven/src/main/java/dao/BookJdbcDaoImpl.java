package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import pojo.BookPojo;

public class BookJdbcDaoImpl implements BookDao {

	@Override
	public List<BookPojo> fetchAllBooks() {

		// create an array list to hold all the book info fetched from the DB
		List<BookPojo> allBooks = new ArrayList<BookPojo>();
		Connection conn = DBUtil.obtainConnection();
		
		try {
			Statement stmt = conn.createStatement();
			String query = "SELECT * FROM book_details";
			ResultSet rs = stmt.executeQuery(query);
			// iterate through the result set 
			while(rs.next()) {
				//copy each record into a book pojo object 
				BookPojo bookPojo = new BookPojo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6));
				// add the book pojo object to the collection
				allBooks.add(bookPojo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// return the collection
		return allBooks;
	}

	@Override
	public BookPojo addBook(BookPojo bookPojo) {
		Connection conn = DBUtil.obtainConnection();
		try {
			Statement stmt = conn.createStatement();
			int lastBookId = 0;
			String query1 = "SELECT MAX(book_id) FROM book_details";
			ResultSet rs = stmt.executeQuery(query1);
			if(rs.next()) {
				lastBookId = rs.getInt(1);
			}
			int newBookId = lastBookId + 1;
			
			String query2 = "INSERT INTO book_details VALUES("+newBookId+",'"+bookPojo.getBookTitle()+"','"+bookPojo.getBookAuthor()+"','"+bookPojo.getBookGenre()+"',"+bookPojo.getBookCost()+",'"+bookPojo.getBookImageUrl()+"')";
			int rows = stmt.executeUpdate(query2);
			bookPojo.setBookId(newBookId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return bookPojo;
	}

	@Override
	public BookPojo updateBook(BookPojo bookPojo) {
		Connection conn = DBUtil.obtainConnection();
		try {
			Statement stmt = conn.createStatement();
			String query = "UPDATE book_details SET book_cost="+bookPojo.getBookCost()+" WHERE book_id="+bookPojo.getBookId();
			int rows = stmt.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return bookPojo;
	}

	@Override
	public BookPojo deleteBook(int bookId) {
		
		BookPojo bookPojo = null;
		Connection conn = DBUtil.obtainConnection();
		try {
			Statement stmt = conn.createStatement();
			bookPojo = fetchABook(bookId);
			String query = "DELETE FROM book_details WHERE book_id="+bookId;
			int rows = stmt.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return bookPojo;
	}

	@Override
	public BookPojo fetchABook(int bookId) {
		
		BookPojo bookPojo = null;
		Connection conn = DBUtil.obtainConnection();
		
		try {
			Statement stmt = conn.createStatement();
			String query = "SELECT * FROM book_details WHERE book_id="+bookId;
			ResultSet rs = stmt.executeQuery(query);
			if(rs.next()) {
				bookPojo = new BookPojo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return bookPojo;
	}

}
