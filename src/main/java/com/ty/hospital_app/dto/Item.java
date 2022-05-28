package com.ty.hospital_app.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Item {
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public MedOrder getMedorder() {
		return medorder;
	}
	public void setMedorder(MedOrder medorder) {
		this.medorder = medorder;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String itemname;
	private int cost;
	private int quantity;
	@ManyToOne
	@JoinColumn
	private MedOrder medorder;

}
