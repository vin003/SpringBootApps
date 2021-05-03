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
	
	

	@RequestMapping("/updateform")
	public String updateform()
	{
		return "updateform" ;
	}

	
	@RequestMapping("/deleteform")
	public String showDeletePage()
	{
		return "deleteform" ;
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
	public String searchStudent(ModelMap map,@RequestParam String sid)
	{ 		
		Student std = studentService.searchStudent(sid);
		if ( std != null ) 
		{
			map.addAttribute("student", std);
			return "display" ;
		}
		else
		{
			return "notexisted"  ;	
		}
		
	}
		@RequestMapping(value="/editform" , method=RequestMethod.POST)
		public String getEditStudent(ModelMap map,@RequestParam String sid)
		{ 		
			Student std = studentService.searchStudent(sid);
			if ( std != null ) 
			{
				map.addAttribute("student", std);
				return "editform" ;
			}
			else
			{
				return "notexisted"  ;		
			}
			
			
	}
		
		
		@RequestMapping(value="/update" , method=RequestMethod.POST)
		public String update(ModelMap map,@RequestParam String sid ,@RequestParam String sname , @RequestParam String saddr )
		{ 		map.addAttribute("studentoperation", "Insertion Student");
			Student std = new Student();
			std.setSid(sid);
			std.setSaddr(saddr);
			std.setSname(sname);
		 String status = studentService.updateStudent(std);
		 return status  ; 
			
		}
		
		@RequestMapping(value="/delete" , method=RequestMethod.POST)
		public String addStudent(ModelMap map,@RequestParam String sid)
		{ 
			map.addAttribute("studentoperation", "Deletion Student");
			Student student = studentService.searchStudent(sid);
			if ( student !=null)
			{
				String status = studentService.deleteStudent(sid);
				return status ; 
			}
			else
			{
				return "notexisted" ; 
			}
			
		}
		
}
