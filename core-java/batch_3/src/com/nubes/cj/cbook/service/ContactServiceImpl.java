package com.nubes.cj.cbook.service;

import java.util.List;

import org.junit.Assert;

import com.nubes.cj.cbook.dao.ContactDao;
import com.nubes.cj.cbook.dao.ContactDaoInMemoryDBImpl;
import com.nubes.cj.cbook.domain.Contact;
import com.nubes.cj.cbook.exceptions.ContactExistsException;



public class ContactServiceImpl implements ContactService {

	private static volatile ContactService contactService;

	private ContactDao contactDao;
	
	private ContactServiceImpl() {
		contactDao = ContactDaoInMemoryDBImpl.getInstance();
	}

	public static ContactService getInstance() {
		synchronized (ContactServiceImpl.class) {
			if (contactService == null) {
				contactService = new ContactServiceImpl();
			}

		}
		return contactService;
	}

	@Override
	public Contact addContact(Contact contact) throws ContactExistsException {
		Assert.assertNotNull("Contact object can't null",contact);
		Contact newContact = contactDao.addContact(contact);
		return newContact;
	}

	@Override
	public Contact updateContact(Contact contact) throws ContactExistsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> getAllContacts() {
		return contactDao.getAllContacts();
	}

	@Override
	public List<Contact> search(String str) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteContact(String cid) {
		// TODO Auto-generated method stub
		return false;
	}

}
