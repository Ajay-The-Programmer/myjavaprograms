package com.solution.sqlmodule;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;

public class MainBookData {

	public static void main(String[] args) throws SQLClientInfoException {

		// Steps to retrieve data from db.
		try {
			// 1. Load driver into memory & drive itself registers with DriverManager.

			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Obtain the database connection.

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nobelit", "ajay", "ajay1312");

//			PreparedStatement ps=conn.prepareStatement("SELECT * FROM Book WHERE published <'2019-12-13'");
//			PreparedStatement ps=conn.prepareStatement("SELECT * FROM Book WHERE author='Kathy Sierra'");
//			PreparedStatement ps=conn.prepareStatement("SELECT * FROM Book WHERE price BETWEEN 300 AND 550");
			PreparedStatement ps = conn.prepareStatement("SELECT MAX(price) FROM Book");

			// 4 Execute Query

			ResultSet rs = ps.executeQuery();

			// 5.Read row by row data from rs & get column values.
			while (rs.next()) {
//				int id = rs.getInt(1);
//				String bookName = rs.getString("name");
//				String authorName = rs.getString("author");
//				Date publishedDate = rs.getDate("published");
				float price = rs.getFloat("price");
				System.out.println( price);

			}

			// 6. Close the resources
			rs.close();
			ps.close();
			conn.close();

		} catch (Exception e) {
			System.out.println(e.toString());

		}

	}

}
