package com.nubes.cj.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.nubes.cj.cms.domain.Contact;
import com.nubes.cj.cms.dao.util.DbConnectionUtil;
import com.nubes.cj.cms.dao.util.MapperUtil;

public class ContactDaoImpl implements ContactDao {

	private static final String ALL_CONTACTS = "select cid,name,email,mobile from contact";
	private static final String ADD_CONTACT = "insert into contact(name,email,mobile) values(?,?,?)";
	private static final String DELETE_CONTACT = "delete from contact where cid=?";
	
	private DbConnectionUtil dbUtil;

	public ContactDaoImpl() {
		dbUtil = DbConnectionUtil.obj;
	}

	@Override
	public Contact addContact(Contact contact) {
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		return null;
	}

	@Override
	public List<Contact> getContacts() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		List<Contact> contactList = null;
		try {
			con = dbUtil.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(ALL_CONTACTS);
			if (rs != null) {
				contactList = MapperUtil.rsToObjectList(rs);
			}
		} catch (SQLException e) {
			System.out.println("While getting all_contacts :" + e);
		} finally {
			dbUtil.close(rs, st, con);
		}
		return contactList;
	}

	@Override
	public Contact updateContact(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteContact(String cid) {
		Connection con = null;
		PreparedStatement st = null;
		int res = 0;
		try {
			con = dbUtil.getConnection();
			st = con.prepareStatement(DELETE_CONTACT);
			st.setString(1, cid);
			res = st.executeUpdate();
		}catch (SQLException e) {
			System.out.println("While deleting contact :"+e);
		}
		return res != 0; 
	}

	@Override
	public List<Contact> search(String str) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact getContactById(String cid) {
		// TODO Auto-generated method stub
		return null;
	}

}
