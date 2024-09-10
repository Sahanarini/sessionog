package com.upload.demo.hibernaterepoimp;

import java.util.List;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.upload.demo.hibernaterepo.ApplicationRepo;
import com.upload.demo.model.Application;

import jakarta.persistence.EntityManager;

@Repository
public class ApplicationRepoImp implements ApplicationRepo {

	@Autowired
	EntityManager em;

	@Override
	public void addApply(Application app) {
		em.persist(app);

	}

	@Override
	public void deleteApply(int n) {
		Application app = em.find(Application.class, n);
		if (app != null) {
			em.remove(app);
		}

	}

	@Override
	public void updateApply(Application app) {
		em.merge(app);

	}

	@Override
	public Application findById(int id) {
		Query q = (Query) em.createQuery("from Application where id = ?1");
		q.setParameter(1, id);
		return (Application) q.getSingleResult();
	}

	@Override
	public Application findByUserId(int userId) {
		try {
			Query<Application> query = (Query<Application>) em
					.createQuery("from Application where user.userId = ?1", Application.class).setParameter(1, userId);
			return query.getSingleResult();

		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<Application> getAllApply() {
		return em.createQuery("from Application").getResultList();
	}

}
