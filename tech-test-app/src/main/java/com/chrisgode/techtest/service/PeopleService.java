package com.chrisgode.techtest.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.chrisgode.techtest.domain.People;

@Component
public interface PeopleService {
	
	public void savePeople(People people);
	public List<People> retrieveAllPeople();
}
