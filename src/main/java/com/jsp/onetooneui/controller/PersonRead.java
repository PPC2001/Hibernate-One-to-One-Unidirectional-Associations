package com.jsp.onetooneui.controller;

import com.jsp.onetooneui.service.PersonService;

public class PersonRead {
	public static void main(String[] args) {
		
		PersonService personService = new PersonService();
		personService.getPersonById(1);
		
	}
}
