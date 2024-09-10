package com.upload.demo.serviceimplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upload.demo.hibernaterepoimp.UserRepoImp;
import com.upload.demo.model.User;
import com.upload.demo.service.UserService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserImp implements UserService {

	@Autowired
	private UserRepoImp service;

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		service.addUser(user);

	}

	@Override
	public void delUser(int id) {
		// TODO Auto-generated method stub
		service.delUser(id);

	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		service.updateUser(user);

	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub

		return service.getAllUsers();
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return service.findById(id);
	}

	@Override
	public Optional<User> findByEmail(String email) {
		return service.findByEmail(email);
	}

	@Override
	public User Login(String email, String password) {
		User user = null;
		try {
			user = service.Login(email, password);
		}catch(Exception e) {
			user = null;
		}
		return user;
	}

}
