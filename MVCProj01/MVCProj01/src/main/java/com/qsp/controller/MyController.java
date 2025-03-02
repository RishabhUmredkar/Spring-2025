package com.qsp.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@Component
public class MyController {

	@GetMapping("/reg")
	public ModelAndView getStudentDetails(HttpServletRequest req)
	{
		String name = req.getParameter("n");
		String phone = req.getParameter("p");
		String email = req.getParameter("e");
		
		ModelAndView mv = new ModelAndView("StudentDisplay.jsp");
		mv.addObject("na",name);
		mv.addObject("ph",phone);
		mv.addObject("em",email);
		 return mv ;
		
	}
	
	@GetMapping("/get")
	public String getName(Model m)
	{
		m.addAttribute("name","Suresh");
		return "info.jsp";
	}
	@GetMapping("/empReg")
	public ModelAndView getEmpData(@RequestParam (name="id") int id, @RequestParam (name="name")String name, @RequestParam(name="sal") double sal)
	{
		ModelAndView mv = new ModelAndView("displayEmp.jsp");
		mv.addObject("id1",id);
		mv.addObject("name1",name);
		mv.addObject("salary",sal);
		return mv;
	}
}
