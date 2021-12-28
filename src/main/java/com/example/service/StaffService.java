package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Staff;
import com.example.repository.StaffRepository;

@Service
public class StaffService {

	@Autowired
	private StaffRepository staffRepository;

	public void saveStaff(Staff staff) {
		// TODO Auto-generated method stub
		staffRepository.save(staff);
	}

	public List<Staff> getStaff() {
		// TODO Auto-generated method stub

		List<Staff> myStaffList = staffRepository.findAll();
		return myStaffList;

	}

	public void deleteStaff(Integer id) {
		// TODO Auto-generated method stub
		staffRepository.deleteById(id);
	}

	public Staff findById(Integer id) {
		// TODO Auto-generated method stub
		Staff myStaff = staffRepository.findById(id).get();
		return myStaff;
	}
}
