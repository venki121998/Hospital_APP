package com.ty.hospital_app.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Branch {

	private	int branchid;
	private	String branchname;
	private int phone;
	private String email;
	@ManyToOne
	@JoinColumn
    private Hospital hospital;
	@OneToOne(cascade=CascadeType.ALL,mappedBy="branch")
	private Address address;
	@OneToMany
	private List<Encounter> encounter;
	public int getBranchid() {
		return branchid;
	}
	public void setBranchid(int branchid) {
		this.branchid = branchid;
	}
	public String getBranchname() {
		return branchname;
	}
	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Hospital getHospitalid() {
		return hospital;
	}
	public void setHospitalid(Hospital hospitalid) {
		this.hospital = hospitalid;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Encounter> getEncounter() {
		return encounter;
	}
	public void setEncounter(List<Encounter> encounter) {
		this.encounter = encounter;
	}


}
