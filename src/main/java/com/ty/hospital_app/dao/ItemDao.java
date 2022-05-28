package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Item;
import com.ty.hospital_app.dto.MedOrder;

public interface ItemDao {
		public Item saveItems ( MedOrder medid,Item items);
		public     Item  getItemsById ( int id);
		public  List< Item >  getAllItems (  );
		public  boolean  deleteItemsById(int id);
		public     Item  getItemsByMedOrderId ( int id);

}
