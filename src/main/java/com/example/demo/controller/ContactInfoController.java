package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;




import com.example.demo.service.ContactService;
import com.exmple.dto.Contact;

@Controller
public class ContactInfoController {
	
	
	
	
	private static Logger logger=LoggerFactory.getLogger(ContactInfoController.class);
	
	
	@Autowired
	
	private ContactService   cns;
	
	@GetMapping("/")
	
	public String index(Model model) {
		
		Contact cn=new Contact();
		
		model.addAttribute("contact",cn);
		logger.debug("start method  log4j also completed   hooooooooooooooooooooooooooooooooooooooooooo");
		
		return "index";
		} // to display form
	@PostMapping("/save")
	   
    public String handleSubmitBtn(@ModelAttribute("contact")Contact contact, RedirectAttributes attributes) {
		
		
		 boolean value=cns.saveContact(contact);
		
		if(value) {
			if(contact.getId()!=0) {
		//	model.addAttribute("sucess", "your contact saved sucessfully");	
			attributes.addFlashAttribute("sucess", "your contact saved sucessfully");
		}
		else {
			
			//model.addAttribute("failure", "your contact not saved");	
			attributes.addFlashAttribute("failure", "your contact  updatedd");

		}
		}
	return "redirect:/";
	}// form submission

	@GetMapping("/views")
    public String handleViewCtctsHyperlink(Model model) {
		
		List<Contact> conta=cns.getAllContacts();
		
		model.addAttribute("contactForm",conta);
		logger.debug("all views method is exceuting");
		logger.debug("start method  log4j also completed   hooooooooooooooooooooooooooooooooooooooooooo");

		
		return "view"; 
		} 

    @GetMapping(value="/editContact{id}")
	public String editContact(@PathVariable("id") Integer cid, Model model) {
   	 
   	Contact cons= cns.getContactById(cid);
   	
   //	Contact con=new Contact();
 //  	BeanUtils.copyProperties(cons, con);
   	model.addAttribute("contact", cons);
   	System.out.println(cons);
		return  "index";
		}
	

  /*  @GetMapping(value="/editContacts/{id}")
	public String editContacts(@RequestParam("id") Integer cid, Model model) {
   	 
   	Contact cons= cns.getContactById(cid);
   	
   //	Contact con=new Contact();
 //  	BeanUtils.copyProperties(cons, con);
   	model.addAttribute("contact", cons);
   	System.out.println(cons);
		return  "index";
		}*/

}
