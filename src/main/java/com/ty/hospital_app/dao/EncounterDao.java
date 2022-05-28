package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.dto.Person;

public interface EncounterDao {
		public  Encounter  saveEncounter ( int Branchid,int Personid, Encounter  encounter);
		public    Encounter  getEncounterById ( int id);
		public  List<  Encounter >  getAllEncounter (  );
		public   Boolean deleteEncounterById(int id);
		public    Encounter  getEncounterByPersonID( Person Personid);

}
