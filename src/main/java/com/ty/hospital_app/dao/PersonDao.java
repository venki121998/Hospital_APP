package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.dto.Person;

public interface PersonDao {
		public  Person savePerson ( Branch Branchid,Person  person);
	    public  Person getpersonById ( int id);
		public  List< Person >  getAllPerson (  );
		public  boolean deletePersonById(int id);
		public  List <Person> getPersonByGender(String gender);
		public  List <Person> getPersonByAge(String age);
		public  Person getPersonByPhone( long phone);
		public   Person getEncounterById( Encounter encounterid);

}
