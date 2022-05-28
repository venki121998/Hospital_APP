package com.ty.hospital_app.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Encounter {

	private int id;
	private String reason;
	private String dateofjoin;
	private String discharge;
	@OneToMany(mappedBy="observation", cascade= CascadeType.ALL)
	private List<Observation> observation;
	@OneToOne
	private Person person;
	@ManyToOne
	private Branch branch;
	@OneToMany
	private MedOrder order;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getDateofjoin() {
		return dateofjoin;
	}

	public void setDateofjoin(String dateofjoin) {
		this.dateofjoin = dateofjoin;
	}

	public String getDischarge() {
		return discharge;
	}

	public void setDischarge(String discharge) {
		this.discharge = discharge;
	}

	public List<Observation> getObservation() {
		return observation;
	}

	public void setObservation(List<Observation> observation) {
		this.observation = observation;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public MedOrder getOrder() {
		return order;
	}

	public void setOrder(MedOrder order) {
		this.order = order;
	}

}
