package com.example.pgsqlspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.pgsqlspringboot.dao.vehicleRepo;
import com.example.pgsqlspringboot.model.vehicleForm;

@Controller
public class vehicleFormController {

	@Autowired
	vehicleRepo vehicleData;
	
	@RequestMapping("/index")
	public String goToIndex() {
		return "index.html";
	}
	
	@RequestMapping("/addVehicle")
	public String addVehicle(vehicleForm VF)
	{
		vehicleData.save(VF);
		return "index.html";
	}
	
}
