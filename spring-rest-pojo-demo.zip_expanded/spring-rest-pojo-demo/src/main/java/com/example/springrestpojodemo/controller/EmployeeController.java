package com.example.springrestpojodemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springrestpojodemo.pojo.EmployeePojo;

@RestController
public class EmployeeController {

	//rest methods
	
	@GetMapping("employees")
	public EmployeePojo fetchEmployee() {
		EmployeePojo empPojo = new EmployeePojo(123, "FGH");
		return empPojo;
	}
	
	
}
