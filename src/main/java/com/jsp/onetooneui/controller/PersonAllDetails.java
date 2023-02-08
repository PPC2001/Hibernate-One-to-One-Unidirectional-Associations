package com.jsp.onetooneui.controller;

import com.jsp.onetooneui.dto.Person;
import com.jsp.onetooneui.service.PersonService;

public class PersonAllDetails {
	public static void main(String[] args) {
		
		PersonService personService = new PersonService();

		for (Person p : personService.getAllPersons()) {
			System.out.println("------------");
			System.out.println(p.getId());
			System.out.println(p.getName());
			System.out.println(p.getGmail());
		}
	}
}
