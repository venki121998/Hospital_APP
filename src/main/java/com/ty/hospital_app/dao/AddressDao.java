package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Address;
import com.ty.hospital_app.dto.Branch;

public interface AddressDao {
		public  Address saveAddress (Branch branchId,Address address);
		public  Address  getAddressById( int id);
		public  List<Address>  getAllAddress(  );
		public  Boolean deleteAddressById(int id);



}
