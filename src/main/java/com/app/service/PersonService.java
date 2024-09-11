package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Person;
import com.app.entityDTO.PersonDTO;
import com.app.repository.PersonRepository;

@Service
public class PersonService {
	 @Autowired
	private PersonRepository repo;
	 
	 public List<Person> getAll(Person p) {
		 return repo.findAll();
	}
	 
	 public PersonDTO savePerson(Person p) {
		 repo.save(p);
		return entityToPerson(p);
		
		 
	 }
	 
	 private PersonDTO entityToPerson(Person p) {
		 return PersonDTO.builder().personId(p.getPersonId()).personName(p.getPersonName()).build();
	 }
	
	

}
