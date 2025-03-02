package com.qsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.qsp.dto.Student;

@Component
public class StudentDao {

	@Autowired
	private EntityManager entityManager;

	public void saveStudent(Student std) {
		EntityTransaction et = entityManager.getTransaction();
		
		et.begin();
		entityManager.persist(std);
		et.commit();
	}
	
	
}
