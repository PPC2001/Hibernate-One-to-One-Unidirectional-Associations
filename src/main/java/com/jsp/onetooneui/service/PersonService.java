package com.jsp.onetooneui.service;

import java.util.List;

import javax.persistence.Query;

import com.jsp.onetooneui.dao.PersonDao;
import com.jsp.onetooneui.dto.Person;

public class PersonService {

	PersonDao personDao = new PersonDao();

	public Person createPerson(Person person) {
		return personDao.createPerson(person);
	}

	public Person deletePersonById(int id) {
		return personDao.deletePersonById(id);
	}

	public Person updatePersonById(int id, String name, String gmail) {

		return personDao.updatePersonById(id, name, gmail);
	}

	public Person getPersonById(int id) {

		return personDao.getPersonById(id);
	}
	
	public List<Person> getAllPersons(){

		return personDao.getAllPersons();
	}

}
