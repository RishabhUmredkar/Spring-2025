package com.qsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Employee.Employee;
import com.Event.Event;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {

	@GetMapping("/reg")
	public ModelAndView registerEmp(@ModelAttribute Employee e, ModelAndView mv)
	{
		mv.addObject("Name" , e.getName());
		mv.addObject("Phone", e.getPhone());
		mv.addObject("Email", e.getEmail());
		mv.setViewName("EmpDisplay.jsp");
		return mv;
		
	}
	

	@PostMapping("/stdreg")
	public ModelAndView getStudentData(HttpServletRequest req)
	{
		String name = req.getParameter("name");
		String Mob = req.getParameter("phone");
		String Number = req.getParameter("email");
		
		ModelAndView mv = new ModelAndView("StudentDisplay.jsp");
		mv.addObject("naam" ,name);
		mv.addObject("mob" ,Mob);
		mv.addObject("mail" ,Number);
		
		return mv;
	}
	
	@GetMapping("/event")
	public ModelAndView registerEvent(@ModelAttribute Event e, ModelAndView mv)
	{
		mv.addObject("Name", e.getName());
		mv.addObject("Category", e.getCategory());
		mv.addObject("Loc", e.getAddress());
		mv.addObject("Price", e.getPrice());
		mv.setViewName("ShowEvent.jsp");
		
		return mv;
	}
}
