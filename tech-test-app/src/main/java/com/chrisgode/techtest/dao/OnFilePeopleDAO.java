package com.chrisgode.techtest.dao;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.chrisgode.techtest.domain.People;

@Repository("peopleDAO")
public class OnFilePeopleDAO implements PeopleDAO{

	@Value("${people.file.location}")
	private String fileLocation;
	
	public OnFilePeopleDAO(){}
	public OnFilePeopleDAO(String fileLocation){
		this.fileLocation=fileLocation;
	}
	
	@Override
	public boolean savePeople(List<People> people) {
		
		FileOutputStream fout;
		ObjectOutputStream oos;
		
		try {
			
			File peopleFile = new File(fileLocation);
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
		
		
		try {

			InputStream file = new FileInputStream(fileLocation);
			InputStream buffer = new BufferedInputStream(file);
			ObjectInput input = new ObjectInputStream(buffer);
			@SuppressWarnings("unchecked")
			List<People> retrievedPeople  = (List<People>) input.readObject();
			input.close();
			
			return retrievedPeople;
			
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
			return null;
		} catch (IOException ex) {
			ex.printStackTrace();
			return null;
		}
		
	}

}
