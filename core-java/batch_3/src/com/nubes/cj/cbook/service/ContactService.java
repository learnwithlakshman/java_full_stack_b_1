package com.nubes.cj.cbook.service;

import java.util.List;

import com.nubes.cj.cbook.domain.Contact;
import com.nubes.cj.cbook.exceptions.ContactExistsException;

public interface ContactService {

		Contact addContact(Contact contact)throws ContactExistsException;
		Contact updateContact(Contact contact)throws ContactExistsException;
		List<Contact> getAllContacts();
		List<Contact> search(String str);
		boolean deleteContact(String cid);
		default int count() {
			return getAllContacts().size();
		}
		
}
