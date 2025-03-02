package com.qsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.qsp.dao.EmployeeDao;
import com.qsp.dto.Employee;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeDao dao ;
	@GetMapping("/regEmp")
	public ModelAndView registerEmployee(@ModelAttribute Employee employee, ModelAndView mv)
	{
		dao.saveEmployee(employee);
		
		mv.addObject("message","Registerd employee with id "+employee.getId());
		
		mv.setViewName("message.jsp");
		return mv ;
	}
	
	@GetMapping("/findById")
	public ModelAndView findEmployeeById(@RequestParam(name="id")int id, ModelAndView mv)
	{
		Employee emp = dao.findById(id);
		
		mv.addObject("emp",emp);
		
		mv.setViewName("displayEmployee.jsp");
		return mv ;
	}
	
	@GetMapping("/findAll")
	public ModelAndView findAllEmployee(HttpServletRequest req,ModelAndView mv)
	{
		List<Employee> employees = dao.findAllEmployees();
		mv.addObject("emp",employees);
		HttpSession session = req.getSession();
		session.setAttribute("emp",employees );
		
		mv.setViewName("displayAllEmployee.jsp");
		return mv ;
	}
	
	@GetMapping("/delete")
	public ModelAndView deleteByID(@RequestParam(name = "id") int id, ModelAndView mv)
	{
		dao.deleteById(id);
		mv.setViewName("findAll");
		return mv;
	}
	
	@GetMapping("/edit")
	public ModelAndView displayUpdatingData(@RequestParam (name = "id") int id, ModelAndView mv)
	{
		Employee employee = dao.findById(id);
		mv.addObject("emp", employee);
		mv.setViewName("edit.jsp");
		return mv;
	}
	
	@GetMapping
	public ModelAndView updateEmployee(@ModelAttribute Employee emp, ModelAndView  mv)
	{
		dao.updateEmployeeById(emp);
		mv.setViewName("findAll");
		return mv;
	}
}
