package com.upload.demo.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upload.demo.hibernaterepoimp.ApplicationRepoImp;
import com.upload.demo.model.Application;
import com.upload.demo.service.ApplicationService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ApplicationImp implements ApplicationService {

	@Autowired
	ApplicationRepoImp repo;

	@Override
	public void addApply(Application app) {
		repo.addApply(app);

	}

	@Override
	public void deleteApply(int n) {
		repo.deleteApply(n);

	}

	@Override
	public void updateApply(Application app) {
		repo.updateApply(app);

	}

	@Override
	public Application findById(int id) {
		return repo.findById(id);
	}

	@Override
	public Application findByUserId(int userId) {
		return repo.findByUserId(userId);
	}

	@Override
	public List<Application> getAllApply() {
		return repo.getAllApply();
	}

}
