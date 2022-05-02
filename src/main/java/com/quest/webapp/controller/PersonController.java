package com.quest.webapp.controller;

import com.quest.webapp.model.Person;
import com.quest.webapp.service.PersonService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@GetMapping("/")
	public String showHomePage(Model model) {
		return "Home";
	}
	
	@GetMapping("/showNewPersonForm")
	public String showNewPersonForm(Model model) {		
		// Generate a Person for the Model
		Person person = new Person();
		model.addAttribute("person", person);
		return "NewPerson";
	}
		
	@GetMapping("/showAllPersonsTable")
	public String showAllPersonsTable(Model model) {
		// Generate a List of Persons for the Model
		List<Person> listPersons=personService.getAllPersons();
		model.addAttribute("listPersons", listPersons);
		return "ListAllPersons";
	}
	
	@PostMapping("/savePerson")
	public String savePerson(@ModelAttribute("person") Person person) {
		personService.savePerson(person);
		return "redirect:/";
	}
	
	@GetMapping("/deletePerson/{ppsNumber}")
	public String deletePerson(@PathVariable (value = "ppsNumber") String ppsNumber) {
		this.personService.deletePersonByPPS(ppsNumber);
		return "redirect:/";
	}
	
}
