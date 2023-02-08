package com.jsp.onetooneui.controller;

import com.jsp.onetooneui.service.PersonService;

public class PersonUpdate {
	public static void main(String[] args) {
		
		PersonService personService = new PersonService();
		personService.updatePersonById(1, "sumit", "sumit@gmail.com");
	}
}
