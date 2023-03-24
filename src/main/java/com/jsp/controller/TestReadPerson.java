package com.jsp.controller;

import com.jsp.dto.Person;
import com.jsp.service.PersonService;

public class TestReadPerson {
	public static void main(String[] args) {
		int id = 1;
		PersonService personService=new PersonService();
		Person person =personService.readById(id);

		System.out.println(person.getId());
		System.out.println(person.getName());
		System.out.println(person.getC_no());

	}

}
