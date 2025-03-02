package com.qsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ETag;
import org.springframework.stereotype.Component;

import com.qsp.dto.Employee;

import java.util.*;

@Component
public class EmployeeDao {
	@Autowired
	private EntityManager em;
	
	public void saveEmployee(Employee employee)
	{
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(employee);
		et.commit();
	}
	
	public Employee findById(int id)
	{
		return em.find(Employee.class, id);
	}
	
	public void deleteById(int id)
	{
		EntityTransaction et = em.getTransaction();
		Employee employee =findById(id);
		if(employee != null)
		{
			et.begin();
			em.remove(employee);
			et.commit();
		}
	}
	
	public void uodateEmployee(Employee employee)
	{
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.merge(employee);
		et.commit();
	}
	
	public List<Employee> findAllEmployee()
	{
		Query query = em.createQuery("select e from Employee e");
		return query.getResultList();
	}
	
	
}
