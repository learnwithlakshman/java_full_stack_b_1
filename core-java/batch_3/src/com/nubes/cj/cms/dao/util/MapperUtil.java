package com.nubes.cj.cms.dao.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nubes.cj.cms.domain.Contact;



public final class MapperUtil {

		private MapperUtil() {
			
		}
		
		public static Contact rsToObject(ResultSet rs) {
			Contact contact= null;
			try {
				if(rs.next()) {
					int cid = rs.getInt("cid");
					String name = rs.getString("name");
					String email = rs.getString("email");
					String mobile = rs.getString("mobile");
					contact = Contact.builder().cid(cid).name(name).email(email).mobile(mobile).build();
				}
			} catch (SQLException e) {
				System.out.println("While processing rs to object :"+e);
			}
			return contact;
		}
		
		public static List<Contact> rsToObjectList(ResultSet rs) {
			List<Contact> contacts = new ArrayList<Contact>();
			try {
				while(rs.next()) {
					Contact contact= null;
					int cid = rs.getInt("cid");
					String name = rs.getString("name");
					String email = rs.getString("email");
					String mobile = rs.getString("mobile");
					contact = Contact.builder().cid(cid).name(name).email(email).mobile(mobile).build();
					contacts.add(contact);
				}
			} catch (SQLException e) {
				System.out.println("While processing rs to objects list :"+e);
			}
			return contacts;
		}
}
