package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.MedOrder;

public interface MedOrderDao {
	public MedOrder saveMedOrder(int encounterid, MedOrder MedOrder);

	public MedOrder getMedOrderById(int id);

	public List<MedOrder> getAllMedOrder();

	public boolean deleteMedOrderById(int id);

	public MedOrder getMedOrderByDoctorName(String name);

	public MedOrder getMedOrderByDate(String date);

}
