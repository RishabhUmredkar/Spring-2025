package com.qsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.qsp.dao.EmployeeDao;
import com.qsp.dto.Employee;

@Controller
public class EmployeeController
{

	@RequestMapping("/reg")
	public String getRequest()
	{
		return "Employee.jsp";
	}
	
	
	@Autowired
	private EmployeeDao dao;
	
	@GetMapping("/regEmp")
	public ModelAndView registerEmployee(@ModelAttribute Employee employee,ModelAndView mv)
	{
		dao.saveEmployee(employee);
		mv.addObject("msg","Register employee with id"+employee.getId());
		mv.setViewName("msg.jsp");
		return mv;
	}
	
	@GetMapping("/findById")
	public ModelAndView getEmployeeById(@RequestParam(name="id") int id,ModelAndView mv)
	{
		Employee emp = dao.findById(id);
		mv.addObject("e", emp);
		mv.setViewName("finedById.jsp");
		return mv;
	}
	
	@GetMapping("/findAll")
	public ModelAndView findAll(ModelAndView mv)
	{
		List<Employee> list = dao.findAllEmployee();
		mv.addObject("employees",list);
		
		mv.setViewName("DisplayAll.jsp");
		return mv;
	}
	
	@GetMapping("/delete")
	public ModelAndView deleteByID(@RequestParam(name = "id")int id,ModelAndView mv)
	{
		dao.deleteById(id);
		mv.setViewName("findAll");
		return mv;
	}
	@GetMapping("/edit")
	public ModelAndView displayUpdateingData(@RequestParam(name ="id")int id,ModelAndView mv)
	{
		Employee employee = dao.findById(id);
		mv.addObject("emp",employee);
		mv.setViewName("edit.jsp");
		return mv;
	}
	
	@GetMapping("/update")
	public ModelAndView updateEmployee(@ModelAttribute Employee emp,ModelAndView mv)
	{
		dao.uodateEmployee(emp);
		mv.setViewName("findAll");
		return mv;
	}
}
