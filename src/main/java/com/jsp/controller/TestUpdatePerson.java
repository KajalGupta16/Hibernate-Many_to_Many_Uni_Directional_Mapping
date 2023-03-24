package com.jsp.controller;
import com.jsp.dao.PersonDao;
import com.jsp.dto.Person;
import com.jsp.service.PersonService;

public class TestUpdatePerson {
	public static void main(String[] args) {
		Person person = new Person();
		person.setId(1);
		person.setName("AYAAN");

		PersonService personService=new PersonService();
		personService.update(person);
	}

}
