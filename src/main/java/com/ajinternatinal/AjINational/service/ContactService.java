package com.ajinternatinal.AjINational.service;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import com.ajinternatinal.AjINational.controller.ContactController;
import com.ajinternatinal.AjINational.model.Contact;

@Service
//@RequestScope
@SessionScope
public class ContactService {
	private  org.slf4j.Logger logger= LoggerFactory.getLogger(ContactService.class);
	private int counter=0;
	
	public ContactService() {
		logger.info("initizing the contact counter bean ");
		
	}
	
	
	
	public org.slf4j.Logger getLogger() {
		return logger;
	}



	public void setLogger(org.slf4j.Logger logger) {
		this.logger = logger;
	}



	public int getCounter() {
		return counter;
	}



	public void setCounter(int counter) {
		this.counter = counter;
	}



	public boolean saveContactDetails(Contact contact) {
		boolean isSaved= true;
		logger.info(contact.toString());
		
		return isSaved;
		
	}

}
