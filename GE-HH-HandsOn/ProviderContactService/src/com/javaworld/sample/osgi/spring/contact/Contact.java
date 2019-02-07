package com.javaworld.sample.osgi.spring.contact;

public class Contact {
	int contactId;
    String firstName;
    public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	String lastName;
    public int getContactId() {
            return contactId;
    }
    @Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", firstName=" + firstName
				+ ", lastName=" + lastName + "]";
	}
	public void setContactId(int contactId) {
            this.contactId = contactId;
    }
}
