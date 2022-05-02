package com.quest.webapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.quest.webapp.model.Person;
import com.quest.webapp.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	private PersonRepository personRepository;

	@Override
	public List<Person> getAllPersons() {
		return personRepository.findAll();
	}

	@Override
	public void savePerson(Person person) {
		this.personRepository.save(person);
	}

	@Override
	public void deletePersonByPPS(String ppsNumber) {
		this.personRepository.deleteById(ppsNumber);
	}

}
