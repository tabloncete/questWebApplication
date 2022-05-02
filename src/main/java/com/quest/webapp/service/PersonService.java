package com.quest.webapp.service;

import com.quest.webapp.model.Person;

import java.util.List;

public interface PersonService {
	List<Person> getAllPersons();
	void savePerson(Person person);
	void deletePersonByPPS(String ppsNumber);
	//Person getPersonByPPS(String ppsNumber);
}