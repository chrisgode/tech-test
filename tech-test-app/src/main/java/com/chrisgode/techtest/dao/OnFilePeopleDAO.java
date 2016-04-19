package com.chrisgode.techtest.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.chrisgode.techtest.domain.People;

@Repository("peopleDAO")
public class OnFilePeopleDAO implements PeopleDAO{

	@Override
	public boolean savePeople(List<People> people) {
		
		FileOutputStream fout;
		ObjectOutputStream oos;
		
		try {
			
			File peopleFile = new File("/home/desenvolvedor/people.txt");
			if(!peopleFile.exists()) peopleFile.createNewFile();
			
			fout = new FileOutputStream(peopleFile, false);
			oos = new ObjectOutputStream(fout);
			oos.writeObject(people);
			oos.close();
			
		} catch (FileNotFoundException e2) {
			e2.printStackTrace();
			return false;
		} catch (IOException e1) {
			e1.printStackTrace();
			return false;
		}
		
		return true;
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
