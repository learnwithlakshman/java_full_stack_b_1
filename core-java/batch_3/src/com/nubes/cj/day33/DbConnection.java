package com.nubes.cj.day33;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.PreparedStatement;

public enum DbConnection {
	util;
	
	private static Properties properties = new Properties();
	static {
		try {
			properties.load(new FileInputStream(new File("db.properties")));
		} catch (IOException e) {
			System.out.println("While loading properties:"+e);
		}
	}
	public Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(properties.getProperty("url"),properties);
		}catch (SQLException e) {
			System.out.println("While connecting with db:"+e);
		}
		return con;
	}
	
	public void close(Statement st, Connection con) {
		try {
			if(st!=null)
				st.close();
			if(con!=null)
				st.close();
		}catch (SQLException e) {
			System.out.println("While closing resources :"+e);
		}
	}
	public void close(ResultSet rs,Statement st, Connection con) {
		try {
			close(st,con);
			if(rs!=null) {
				rs.close();
			}
		}catch (SQLException e) {
			System.out.println("While closing resources :"+e);
		}
	}
	
	public void close(ResultSet rs,PreparedStatement st, Connection con) {
		try {
			close(st,con);
			if(rs!=null) {
				rs.close();
			}
		}catch (SQLException e) {
			System.out.println("While closing resources :"+e);
		}
	}
	
	public void close(CallableStatement st, Connection con) {
			close(st,con);
	}
}
