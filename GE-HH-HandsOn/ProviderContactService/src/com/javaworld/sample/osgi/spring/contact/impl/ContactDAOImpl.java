package com.javaworld.sample.osgi.spring.contact.impl;

import java.util.ArrayList;
import java.util.List;

import com.javaworld.sample.osgi.spring.contact.Contact;
import com.javaworld.sample.osgi.spring.contact.ContactDAO;

public class ContactDAOImpl implements ContactDAO {

	@Override
	public List<Contact> getContactList() {
		System.out.println("Done");
		List<Contact> list = new ArrayList<Contact>(); 
		Contact contact = new Contact();
		contact.setContactId(1);
		contact.setFirstName("Tusharkak");
		contact.setLastName("joshi");
		
		Contact contact1 = new Contact();
		contact1.setContactId(2);
		contact1.setFirstName("Chand");
		contact1.setLastName("Ali");
		list.add(contact);
		list.add(contact1);
		return list;
	}

	/*@Override
	public Contact getContact(int contactId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertContact(Contact contact) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateContact(Contact contact) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteContact(int contactId) {
		// TODO Auto-generated method stub

	}*/

}
