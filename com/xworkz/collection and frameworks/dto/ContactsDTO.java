package com.xworkz.tasks.dto;

public class ContactsDTO {

	private int contactId;
	private String contactName;
	
	public ContactsDTO(int contactId, String contactName) {
		this.contactId=contactId;
		this.contactName=contactName;
	}


	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactName() {
		return contactName;
	}


	@Override
	public String toString() {
		return "ContactsDTO [contactId=" + contactId + ", contactName=" + contactName + "]";
	}

	
}

