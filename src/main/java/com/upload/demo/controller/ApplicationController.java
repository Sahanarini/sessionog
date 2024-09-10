package com.upload.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RestController;

import com.upload.demo.model.Application;
import com.upload.demo.serviceimplementation.ApplicationImp;

@RestController
@CrossOrigin("*")
public class ApplicationController {

	@Autowired
	ApplicationImp service;

	@PostMapping("/addApply")
	public String addApply(@RequestBody Application app) {
		service.addApply(app);
		return "added application";

	}

	@GetMapping("/getAllApplications")
	public List<Application> getAllApplications(Application applications) {
		return service.getAllApply();
	}

	@GetMapping("/findByID/{applicationId}")
	public Application getApplicationById(@PathVariable("applicationId") int applicationId) {
		return service.findById(applicationId);
	}

	@GetMapping("/findApplicationByUserId/{userId}")
	public Application findByUserId(@PathVariable("userId") int userId) {
		return service.findByUserId(userId);

	}

}
