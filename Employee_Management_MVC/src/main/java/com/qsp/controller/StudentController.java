package com.qsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.qsp.dao.StudentDao;
import com.qsp.dto.Student;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class StudentController {

	@Autowired
	private StudentDao dao;
	
	@PostMapping("/userLogin")
	public ModelAndView registerStudent(@ModelAttribute Student std, ModelAndView mv)
	{
		dao.saveStudent(std);
		mv.addObject("message", "Registerd Student Successfully "+std.getName());
		mv.setViewName("message.jsp");
		return mv;
	}
	
	@PostMapping("/adminLogin")
	public ModelAndView adminLogin(HttpServletRequest req, ModelAndView mv)
	{
	
		String email = req.getParameter("email");
		String password = req.getParameter("password");
			
		if(email == "rishabh@gmail.com" && password == "abc123")
		{	
			System.out.println(email);
			System.out.println(password);
			List<Student> students = dao.showAll();
			mv.addObject("std", students);
			mv.setViewName("displayStudent.jsp");
			
		
		}
		else {
			System.out.println(email);
			System.out.println(password);

			mv.addObject("message", "Invalid Creadentials.............");
			mv.setViewName("error.jsp");
		}
		
		return mv;
	}
	
}
