package com.ty.hospital_app.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String Street;
	private String State;
	private String Country;
	private int Pin;
	@OneToOne
	@JoinColumn
	private Branch branch;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public int getPin() {
		return Pin;
	}

	public void setPin(int pin) {
		Pin = pin;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

}
