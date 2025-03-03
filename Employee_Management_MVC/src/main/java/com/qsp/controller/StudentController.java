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
import jakarta.servlet.http.HttpSession;

@Controller
public class StudentController {

	@Autowired
	private StudentDao dao;

	@PostMapping("/userLogin")
	public ModelAndView registerStudent(@ModelAttribute Student std, ModelAndView mv) {
		dao.saveStudent(std);
		mv.addObject("message", "Registerd Student Successfully " + std.getName());
		mv.setViewName("message.jsp");
		return mv;
	}

	@GetMapping("/adminLogin")
	public ModelAndView adminLogin(HttpServletRequest req, ModelAndView mv) {

		String email = req.getParameter("email");
		String password = req.getParameter("password");

		if (email.equals("rishabh@gmail.com") && password.equals("abc123")) {
			List<Student> students = dao.showAll();
			System.out.println(students.toString());
			HttpSession session = req.getSession();
			session.setAttribute("std", students);

			mv.addObject("std", students);
			mv.setViewName("displayStudent.jsp");

			System.out.println(email);
			System.out.println(password);
			return mv;

		}

		else {
			System.out.println(email);
			mv.addObject("message", "Invalid Creadentials.............");
			mv.setViewName("error.jsp");
		}
		return mv;
	}

}
