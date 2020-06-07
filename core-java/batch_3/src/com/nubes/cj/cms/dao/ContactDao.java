package com.nubes.cj.cms.dao;

import java.util.List;

import com.nubes.cj.cms.domain.Contact;

public interface ContactDao {
	
		public Contact addContact(Contact contact);
		public List<Contact> getContacts();
		public Contact updateContact(Contact contact);
		public boolean deleteContact(String cid);
		public List<Contact> search(String str);
		public Contact getContactById(String cid);
}
