package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Person;
import com.app.entityDTO.PersonDTO;
import com.app.service.PersonService;

@RestController
public class PersonController {
   
	@Autowired
	private PersonService service;
	
	@GetMapping
	public List<Person> get(Person p) {
		return service.getAll(p);
	}
	@PostMapping("/save")
	public PersonDTO savetest(@RequestBody Person p) {
		return service.savePerson(p);
	}
}
