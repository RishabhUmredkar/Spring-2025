package com.qsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.qsp.dao.StudentDao;
import com.qsp.dto.Student;

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
	
}
