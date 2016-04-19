package com.chrisgode.techtest.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.chrisgode.techtest.domain.People;

@Component
public interface PeopleDAO {

	public void savePeople(People people);
	public List<People> retrieveAllPeople();
}
