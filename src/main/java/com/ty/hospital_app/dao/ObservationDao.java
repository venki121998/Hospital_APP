package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Observation;

public interface ObservationDao {
		public  Observation saveObservation ( int encounterid,Observation observation);
		public   Observation  getObservationById ( int id);
		public  List< Observation>  getAllObservation (  );
		public  Boolean  deleteObservationById(int id);
		public Observation  getObservationByDoctorName(String  name);

}
