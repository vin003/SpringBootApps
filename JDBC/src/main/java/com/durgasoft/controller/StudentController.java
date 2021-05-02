package com.durgasoft.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.durgasoft.dto.Student;
import com.durgasoft.service.StudentService;

public class StudentController {
	
	StudentService studentService ; 
	
	@RequestMapping("/welcome")
	public String welcomepage()
	{
		return "welcome" ; 
	}
	@RequestMapping("/addform")
	public String addform()
	{
		return "addform" ;
	}
	
	
	@RequestMapping("/searchform")
	public String searchform()
	{
		return "searchform" ;
	}

	@RequestMapping(value="/add" , method=RequestMethod.POST)
	public String addStudent(ModelMap map,@RequestParam String sid ,@RequestParam String sname , @RequestParam String saddr )
	{ 		map.addAttribute("studentoperation", "Insertion Student");
		Student std = new Student();
		std.setSid(sid);
		std.setSaddr(saddr);
		std.setSname(sname);
	 String status = studentService.addStudent(std);
	 return status  ; 
		
	}
	
	
	@RequestMapping(value="/search" , method=RequestMethod.POST)
	public String addStudent(ModelMap map,@RequestParam String sid)
	{ 		map.addAttribute("studentoperation", "Search Student");
		Student std = new Student();
		std.setSid(sid);
		String status = studentService.addStudent(std);
	 return status  ; 
		
	}
	
}
