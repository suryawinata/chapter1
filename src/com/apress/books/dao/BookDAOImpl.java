package com.apress.books.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.apress.books.model.Author;
import com.apress.books.model.Book;
import com.apress.books.model.Category;

public class BookDAOImpl implements BookDAO {

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch (ClassNotFoundException ex) {
			
		}
	}
	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/books","root", "password");
	}
	
	private void closeConnection(Connection connection) { 
		if (connection == null)
			return;
		
		try {
			connection.close();
		} 
		catch (SQLException ex) {
			
		}
	}

	public List<Book> findAllBooks() {
		List<Book> result = new ArrayList<>();
		List<Author> authorList = new ArrayList<>();
		
		String sql = "select * from book inner join author on book.id = author.book_id";
		
		Connection connection = null;
		
	}

	public List<Book> searchBooksByKeyword(String keyWord) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Category> findAllCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	public void insert(Book book) {
		// TODO Auto-generated method stub
		
	}

	public void update(Book book) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Long bookId) {
		// TODO Auto-generated method stub
		
	}
}
