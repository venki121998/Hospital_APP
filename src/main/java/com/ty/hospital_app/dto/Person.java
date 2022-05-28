package com.ty.hospital_app.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String address;
	private long phoneno;
	private String email;
	private int age;
	private String gender;
	@OneToMany
	List<Encounter> encounter;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Encounter> getEncounter() {
		return encounter;
	}

	public void setEncounter(List<Encounter> encounter) {
		this.encounter = encounter;
	}

}
