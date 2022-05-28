package com.ty.hospital_app.dto;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Observation {

 private int Id;
private String Doctorname;
	private String	Reasonobservation;
	@ManyToOne
	@JoinColumn
	Encounter encounter;


}
