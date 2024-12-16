package com.ajinternatinal.AjINational.controller;




import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ajinternatinal.AjINational.model.Contact;
import com.ajinternatinal.AjINational.service.ContactService;

import jakarta.validation.Valid;

@Controller
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	private  org.slf4j.Logger logger= LoggerFactory.getLogger(ContactController.class);

	@RequestMapping(value="/contact")
	public String contactPage(Model model) {
		model.addAttribute("contact",new Contact());
		
		return "contact.html";
		
	}
	
	@RequestMapping(value="/saveMsg", method = RequestMethod.POST)
	public String saveMessage(@Valid @ModelAttribute("contact") Contact contact, Errors errors) {
		
		if(errors.hasErrors()) {
			logger.error("Contact form validation is failed due to:" + errors.toString());
			return "contact.html";
		}
		contactService.saveContactDetails(contact);
		contactService.setCounter(contactService.getCounter()+1);
		logger.info("Number of times counter gets called  Contact form is submitted :" +contactService.getCounter());
		
		return "redirect:/contact";
		
	}
}
