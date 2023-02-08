package com.jsp.onetooneui.controller;

import com.jsp.onetooneui.service.PersonService;

public class PersonDelete {
	public static void main(String[] args) {

		PersonService personService = new PersonService();

		personService.deletePersonById(2);
	}
}
