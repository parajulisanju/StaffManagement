package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Staff;
import com.example.service.StaffService;

@RestController
@RequestMapping("/staffs")
@CrossOrigin(origins = "*")
public class StaffController {

	@Autowired
	private StaffService staffService;

	@RequestMapping(method = RequestMethod.POST, value = "")
	public String addStaff(@RequestBody Staff staff) {
		staffService.saveStaff(staff);
		return "success";
	}

	@RequestMapping(method = RequestMethod.GET, value = "")
	public List<Staff> getList() {
		List<Staff> staffList = staffService.getStaff();
		return staffList;

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void delete(@PathVariable("id") Integer id) {
	 staffService.deleteStaff(id);

	}

	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public Staff getById(@PathVariable("id") Integer id) {
		Staff staff=staffService.findById(id);
		return staff;
	} 
//	    
	 
	
	
	
}
