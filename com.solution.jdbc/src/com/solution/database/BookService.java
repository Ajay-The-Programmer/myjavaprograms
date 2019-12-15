package com.solution.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.solution.model.Book;

public class BookService {

	public Book getBookByAuthorName(String authorName) {
		Book book = null;
		Connection conn = DataBaseConnection.getConnection();
		try (PreparedStatement ps = conn.prepareStatement("SELECT * FROM Book WHERE author=" + authorName);
				ResultSet rs = ps.executeQuery();) {

			while (rs.next()) {

				book = (preparedStatement(rs));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return book;
	}

	private Book preparedStatement(ResultSet rs) throws SQLException {
		return new Book(rs.getInt("id"), rs.getNString("name"), rs.getString("author"), rs.getDate("published"),rs.getFloat("price"));
	}

	public List<Book> getBookByGivenRange(int min, int max) {
		List<Book> book = new ArrayList<Book>();
		Connection conn = DataBaseConnection.getConnection();
		try (PreparedStatement ps = conn.prepareStatement("SELECT * FROM Book WHERE price BETWEEN " + min + " AND " + max);
				ResultSet rs = ps.executeQuery();) {

			while (rs.next()) {
				book.add(preparedStatement(rs));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return book;
	}

	public List<Book> getBookOfMaxPrice() {
		List<Book> book = new LinkedList<>();
		Connection conn = DataBaseConnection.getConnection();
		try (PreparedStatement ps = conn.prepareStatement("SELECT * FROM Book ORDER BY price DESC");
				ResultSet rs = ps.executeQuery();) {

			/*
			 * I use if condition bcz i only want to read one book which price is max so
			 * i followed DESC query and then arranging book by price by Descending order and i want that
			 * top Max price book.
			 */ 
			if (rs.next()) {

				book.add(preparedStatement(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return book;
	}

	public List<Book> getBookBeforePublisheDate(String date1) {
		List<Book> book = new LinkedList<Book>();
		Connection conn = DataBaseConnection.getConnection();
		try (PreparedStatement ps = conn.prepareStatement("SELECT * FROM Book WHERE published <=" + "'" + date1 + "'");
				ResultSet rs = ps.executeQuery();) {

			while (rs.next()) {
				book.add(preparedStatement(rs));
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
		return book;

	}
}