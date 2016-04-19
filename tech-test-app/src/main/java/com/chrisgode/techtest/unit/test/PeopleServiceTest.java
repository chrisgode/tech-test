package com.chrisgode.techtest.unit.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.chrisgode.techtest.dao.PeopleDAO;
import com.chrisgode.techtest.domain.People;
import com.chrisgode.techtest.service.PeopleService;
import com.chrisgode.techtest.service.PeopleServiceImpl;

public class PeopleServiceTest {

	PeopleService peopleService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		PeopleDAO peopleDAO = mock(PeopleDAO.class);
		when(peopleDAO.savePeople(any())).thenReturn(true);
		peopleService = new PeopleServiceImpl(peopleDAO);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPeopleServiceNotNull() {
		assertNotNull(peopleService);
	}

	@Test
	public void testSavePeople() {
		
		List<People> fakePeople = new ArrayList<People>();
		assertTrue(peopleService.savePeople(fakePeople));
	}

}
