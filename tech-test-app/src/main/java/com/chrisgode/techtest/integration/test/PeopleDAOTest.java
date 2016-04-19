package com.chrisgode.techtest.integration.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.chrisgode.techtest.dao.OnFilePeopleDAO;
import com.chrisgode.techtest.dao.PeopleDAO;
import com.chrisgode.techtest.domain.People;

public class PeopleDAOTest {

	PeopleDAO peopleDAO;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		peopleDAO = new OnFilePeopleDAO();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSavePeople() {
		
		People onePeople = new People();
		List<People> people = new ArrayList<People>();
		people.add(onePeople);
		assertTrue(peopleDAO.savePeople(people));
	}

}
