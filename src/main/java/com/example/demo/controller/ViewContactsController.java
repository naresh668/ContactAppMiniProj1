package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.service.ContactService;
import com.exmple.dto.Contact;

@Controller
public class ViewContactsController {
	
	

	
@Autowired
	
	private ContactService   cns;
	
	
	
	
@GetMapping("/deleteContact{id}")
	public String deleteContact(@PathVariable("id")Integer cid,RedirectAttributes attributes){
	
	cns.deleteContactById(cid);
	
	attributes.addFlashAttribute("delete","your  contact delete sucessfuly");
		return  "redirect:/views";
		}

}
