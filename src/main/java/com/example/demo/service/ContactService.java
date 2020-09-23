package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exmple.dto.Contact;


@Service
public interface ContactService {
	
	
	
	
	

	   public boolean saveContact(Contact contact);

	   public List<Contact> getAllContacts( );

	   public Contact getContactById(Integer cid);

	   public boolean updateContact(Contact contact);

	   public boolean deleteContactById(Integer cid);

}
