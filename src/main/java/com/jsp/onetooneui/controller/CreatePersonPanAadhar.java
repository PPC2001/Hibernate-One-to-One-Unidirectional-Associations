package com.jsp.onetooneui.controller;

import org.hibernate.loader.entity.NaturalIdEntityJoinWalker;

import com.jsp.onetooneui.dto.Aadhar;
import com.jsp.onetooneui.dto.Pan;
import com.jsp.onetooneui.dto.Person;
import com.jsp.onetooneui.service.AadharService;
import com.jsp.onetooneui.service.PanService;
import com.jsp.onetooneui.service.PersonService;

public class CreatePersonPanAadhar {
	public static void main(String[] args) {
		
		PanService panService = new PanService();
		AadharService aadharService = new AadharService();
		PersonService personService = new PersonService();

		Pan pan1 = new Pan();
		pan1.setName("sahil");
		pan1.setPan_no(777456);
		panService.createPan(pan1);
		
		Aadhar aadhar1 = new Aadhar();
		aadhar1.setName("sahil");
		aadhar1.setAadhar_no(887456123);
		aadharService.createAadhar(aadhar1);
		
		Person p1 = new Person();
		p1.setName("sahil");
		p1.setGmail("sahil@gmail.com");
		p1.setAadhar(aadhar1);
		p1.setPan(pan1);
		personService.createPerson(p1);
		
		Pan pan2 = new Pan();
		pan2.setName("pratik");
		pan2.setPan_no(123456);
		
		Aadhar aadhar2 = new Aadhar();
		aadhar2.setName("pratik");
		aadhar2.setAadhar_no(123456789);
		aadharService.createAadhar(aadhar2);
		
		Person p2 = new Person();
		p2.setName("pratik");
		p2.setGmail("pratik@gmail.com");
		p2.setAadhar(aadhar2);
		p2.setPan(pan2);
		personService.createPerson(p2);
	
		

		
		
		
		
		
		
		
	}
}
