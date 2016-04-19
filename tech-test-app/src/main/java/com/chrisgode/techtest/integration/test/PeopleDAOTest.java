package com.chrisgode.techtest.integration.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.chrisgode.techtest.dao.FilePeopleDAO;
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
		peopleDAO = new FilePeopleDAO();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSavePeople() {
		
		People people = new People();
		people = peopleDAO.savePeople(people);
		assertNotNull(people);
	}

}
