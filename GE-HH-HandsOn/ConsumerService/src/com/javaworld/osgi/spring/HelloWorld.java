package com.javaworld.osgi.spring;

import com.javaworld.sample.osgi.spring.contact.ContactDAO;

public class HelloWorld {
	ContactDAO contactDAO;
    public ContactDAO getContactDAO() {
        return contactDAO;
    }
    public void setContactDAO(ContactDAO contactDAO) {
        this.contactDAO = contactDAO;
    }
    
    public void start() throws Exception {
        System.out.println("Hello Spring World!! " );
        System.out.println("HelloWorld --> start -->" +contactDAO.getContactList());
    }
    public void stop() throws Exception {
        System.out.println("Goodbye Spring World!!");
    }
}
