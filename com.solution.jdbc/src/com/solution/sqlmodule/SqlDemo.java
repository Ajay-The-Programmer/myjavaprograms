package com.solution.sqlmodule;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SqlDemo {

	public static void main(String[] args) throws SQLException {

		// Steps to retrieve data from db.

		try {
			// 1. Load driver into memory & drive itself registers with DriverManager.
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Obtain the database connection.
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nobelit?userSSL=false", "ajay","ajay1312");

			// 3. Prepare the statement
			PreparedStatement ps = conn.prepareStatement("select * from student");

			// 4. Execute Query
			ResultSet rs = ps.executeQuery();

			// 5.Read row by row data from rs & get column values.
			while (rs.next()) {
				int roll = rs.getInt(1);
				String name = rs.getString("name");
				float height = rs.getFloat("height");

				System.out.println(roll + "\t" + name + "\t" + height);
			}

			// 6. Close the resources
			rs.close();
			ps.close();
			conn.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
