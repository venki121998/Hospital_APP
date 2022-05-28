package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Branch;

public interface BranchDao {
		 public Branch saveBranch (int hid,Branch branch);
		public Branch  getBranchById ( int id);
		public  List<Branch>  getAllBranch (  );
		public  Boolean deleteHospitalById(int id);
		public Branch  updateBranchById(int id, Branch branch);
		public  Branch  getBranchByCountry(String country);
			public Branch  getBranchAddress( int id);

}
