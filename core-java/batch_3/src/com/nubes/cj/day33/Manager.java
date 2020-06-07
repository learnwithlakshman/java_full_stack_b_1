package com.nubes.cj.day33;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Manager {
	private static final String ALL_CONTACTS = "select cid,name,email,mobile from contact";

	public static void main(String[] args) {
		showContact();
	}

	private static void showContact() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			con = DbConnection.util.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(ALL_CONTACTS);
			while(rs.next()) {
				System.out.println(rs.getInt("cid"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("email"));
				System.out.println(rs.getString("mobile"));
			}
		} catch (Exception e) {
			System.out.println("Exception occured while getting all contacts:"+e);
		} finally {
			DbConnection.util.close(rs, st, con);
		}
	}
}
