package com.upload.demo.service;

import java.util.List;

import com.upload.demo.model.Application;

public interface ApplicationService {
	public void addApply(Application app);
	public void deleteApply(int n);
	public void updateApply(Application app);
	public Application findById(int id) ;
	public Application findByUserId(int userId);
	public List<Application> getAllApply() ;

}
