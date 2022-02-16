package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import pojo.BookPojo;

public class BookJdbcDaoImpl implements BookDao {

	@Override
	public List<BookPojo> fetchAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookPojo addBook(BookPojo bookPojo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookPojo updateBook(BookPojo bookPojo) {
		// TODO Auto-generated method stub
		return null;
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
