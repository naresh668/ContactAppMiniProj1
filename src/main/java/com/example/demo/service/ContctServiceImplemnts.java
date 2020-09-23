package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ContactDtls;
import com.example.demo.entity.ContactEntity;
import com.exmple.dto.Contact;
@Service

public class ContctServiceImplemnts implements ContactService {
	@Autowired
	private ContactDtls cdtls;

	@Override
	public boolean saveContact(Contact contact) {
		// TODO Auto-generated method stub
		
		
		ContactEntity cns=new ContactEntity();
		
		BeanUtils.copyProperties(contact,cns);
		
		ContactEntity cfs=cdtls.save(cns);
		
		return (cfs.getId()!=0) ;
	}

	
		

	



	@Override
	public List<Contact> getAllContacts() {
		// TODO Auto-generated method stub
		
		List<Contact>  cnts=new ArrayList<Contact>();
   Iterable<ContactEntity>  cdts= cdtls.findAll();
  /* for(ContactEntity con:cdts) {
   Contact c=new Contact();
   BeanUtils.copyProperties(con, c);
   cnts.add(c);
   }*/
   cdts.forEach(con->{
	   Contact c=new Contact();
	   BeanUtils.copyProperties(con, c);
	   cnts.add(c);
	   
   });
   
  /* cnts.forEach(t->System.out.println(t));*/
		return cnts;
	}

	@Override
	public Contact getContactById(Integer cid) {
		// TODO Auto-generated method stub
		
		
	Optional<ContactEntity> ces=cdtls.findById(cid);
	if(ces.isPresent()) {
	ContactEntity cs=	ces.get();
		Contact c=new Contact();
		BeanUtils.copyProperties(cs, c);
	   	 System.out.println(c);

		return c;
	}else {
		return null;
		
	}
		
	}

	@Override
	public boolean updateContact(Contact contact) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteContactById(Integer cid) {
		// TODO Auto-generated method stub
		cdtls.deleteById(cid);
		
		return false;
	}

}
