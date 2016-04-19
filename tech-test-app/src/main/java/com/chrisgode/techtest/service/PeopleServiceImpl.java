package com.chrisgode.techtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.chrisgode.techtest.dao.PeopleDAO;
import com.chrisgode.techtest.domain.People;

@Component("peopleService")
public class PeopleServiceImpl implements PeopleService{

	@Autowired
	PeopleDAO peopleDAO;
	
	public PeopleServiceImpl(){}
	public PeopleServiceImpl(PeopleDAO peopleDAO){
		this.peopleDAO=peopleDAO;
	}
	
	@Override
	public boolean savePeople(List<People> people) {
		return peopleDAO.savePeople(people);
	}

	@Override
	public People getByFirstLastName(String firstName, String surname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<People> retrieveAllPeople() {
		return peopleDAO.retrieveAllPeople();
	}

}
