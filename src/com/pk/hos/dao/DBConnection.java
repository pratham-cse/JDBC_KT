package com.pk.hos.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	String url = "jdbc:mysql://localhost:3306/hosmng";
	String user = "root";
	String password = "admin";
	
	private static Connection connection;
	
	public static Connection getConnection()
	{
		try {
			if(connection == null || connection.isClosed())
				new DBConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	private DBConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url,user,password);
		}
		catch(ClassNotFoundException  | SQLException e)
		{
			System.out.println(e);
		}
	}
	
	//singleton design pattern , if want to create a single object of a class
	//create a private constructor, no objects at all
	//static method to create one object

}
