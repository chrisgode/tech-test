package com.chrisgode.techtest.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.chrisgode.techtest.domain.People;

@Component("peopleService")
public class PeopleServiceImpl implements PeopleService{

	@Override
	public void savePeople(People people) {
		// TODO Auto-generated method stub
	}

	@Override
	public People getByFirstLastName(String firstName, String surname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<People> retrieveAllPeople() {
		// TODO Auto-generated method stub
		return null;
	}

}
