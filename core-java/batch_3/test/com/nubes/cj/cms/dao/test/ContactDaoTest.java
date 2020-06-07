package com.nubes.cj.cms.dao.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.nubes.cj.cms.dao.ContactDao;
import com.nubes.cj.cms.dao.ContactDaoImpl;
import com.nubes.cj.cms.domain.Contact;

class ContactDaoTest {

	
	@Test
	void getAllContacts() {
		ContactDao contactDao = new ContactDaoImpl();
		List<Contact> list = contactDao.getContacts();
		list.forEach(e->{
			System.out.println(e.getName()+" - "+e.getMobile());
		});
		assertTrue(list.size() > 0);
		
	}
	@Test
	void deleteContact() {
		ContactDao contactDao = new ContactDaoImpl();
		boolean res = contactDao.deleteContact("5 or 1 = 1");
		System.out.println(res);
	}

}
