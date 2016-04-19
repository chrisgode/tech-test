package com.chrisgode.techtest.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.chrisgode.techtest.domain.People;

@Component
public interface PeopleDAO {

	public People savePeople(People people);
	public List<People> retrieveAllPeople();
	public People getByFirstLastName(String firstName, String surname);
}
