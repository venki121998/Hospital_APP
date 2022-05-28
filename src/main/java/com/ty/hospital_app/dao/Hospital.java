package com.ty.hospital_app.dao;

public interface Hospital {
		public  Hospital  saveHospital( Hospital  hospital);
		public Hospital  getHospitalDetailsByID( int id);
		public  boolean  deleteHospitalByID( int id) ;
		public  Hospital  updateById(int id, Hospital hospital);

}
