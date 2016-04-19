package com.chrisgode.techtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chrisgode.techtest.domain.People;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/people")
public class PeopleController {
	
	@RequestMapping(value ="/all", method = RequestMethod.GET)
	public String getAllPeople() {
		
		return "markup.html";
	}
	
	@RequestMapping(value ="/save", method = RequestMethod.POST)
	public String saveAllPeople(HttpServletRequest request) {
		
		List<People> peopleList = new ArrayList<People>();
		
		for(int i = 1; i<=5; i++){
			People people = new People();
			people.setFirstname(request.getParameter("people["+i+"][firstname]"));
			people.setSurname(request.getParameter("people["+i+"][surname]"));
			peopleList.add(people);
		}
		
		System.out.println(peopleList.size());
		
		return "markup.html";
	}
}