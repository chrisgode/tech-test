package com.chrisgode.techtest.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.chrisgode.techtest.domain.People;

@Repository("peopleDAO")
public class FilePeopleDAO implements PeopleDAO{

	@Override
	public People savePeople(People people) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<People> retrieveAllPeople() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public People getByFirstLastName(String firstName, String surname) {
		// TODO Auto-generated method stub
		return null;
	}

}
