package com.qsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.qsp.dto.Employee;
@Component
public class EmployeeDao {
	@Autowired()
	private EntityManager entityManager ;
	
	public void saveEmployee(Employee employee)
	{
		EntityTransaction et = entityManager.getTransaction();
		et.begin();
		entityManager.persist(employee);
		et.commit();
	}
	
	public Employee findById(int id)
	{
		return entityManager.find(Employee.class,id);
	}
	
	public void deleteById(int id )
	{
		Employee employee = findById(id);
		EntityTransaction et = entityManager.getTransaction();
		if(employee!=null)
		{
			et.begin();
			entityManager.remove(employee);
			et.commit();
		}
		
	}
	
	public void updateEmployeeById(Employee employee)
	{
		EntityTransaction et = entityManager.getTransaction();
		et.begin();
		entityManager.merge(employee);
		et.commit();
	}
	
	public List<Employee> findAllEmployees(){
		Query query = entityManager.createQuery("Select e from Employee e");
		return query.getResultList();
		
	}
	
}
