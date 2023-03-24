package com.jsp.service;

import java.util.List;

import com.jsp.dao.PersonDao;
import com.jsp.dto.Cab;
import com.jsp.dto.Person;

public class PersonService {
	PersonDao personDao=new PersonDao();
	public void create(Person p) {
		personDao.create(p);
	}

	public void update(Person p) {
		personDao.update(p);
	}

	public void delete(int id) {
		personDao.delete(id);
	}

	public Person readById(int id) {
		return personDao.readById(id);
	}
}
