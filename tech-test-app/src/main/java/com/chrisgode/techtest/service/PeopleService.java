package com.chrisgode.techtest.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.chrisgode.techtest.domain.People;

@Component
public interface PeopleService {
	
	public People savePeople(People people);
	public People getByFirstLastName(String firstName, String surname);
	public List<People> retrieveAllPeople();
}
