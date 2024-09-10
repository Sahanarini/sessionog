package com.upload.demo.hibernaterepo;

import java.util.List;

import com.upload.demo.model.Application;

public interface ApplicationRepo {

	public void addApply(Application app);

	public void deleteApply(int n);

	public void updateApply(Application app);

	public Application findById(int id);

	public Application findByUserId(int userId);

	List<Application> getAllApply();

}
