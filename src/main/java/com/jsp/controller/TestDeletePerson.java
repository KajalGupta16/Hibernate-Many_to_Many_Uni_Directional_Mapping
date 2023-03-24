package com.jsp.controller;

import com.jsp.service.PersonService;

public class TestDeletePerson {
	public static void main(String[] args) {
		int person_id = 1;
		PersonService personService=new PersonService();
		personService.delete(person_id);
	}

}
