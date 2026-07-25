package com.klef.soa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.soa.service.PatientService;

@RestController
public class PatientController
{
	@Autowired
	private PatientService service;
	
	
	
	@GetMapping("/")
  public String test()
  {
	  return "SOA Programming & Microservices";
	  
  }
}
