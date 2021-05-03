package com.durgasoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.durgasoft.dao.StudentDao;
import com.durgasoft.dto.Student;

@Controller
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentDao studentDao  ;
	
	@Override
	public String addStudent(Student student) {
	String status ="";
	  	
	 status = studentDao.add(student);
	 
		return status;
	}

	@Override
	public Student searchStudent(String sid) {
	
		Student student= studentDao.search(sid);
		return student;
	}

	@Override
	public String updateStudent(Student student) {
	
		String status = studentDao.update(student) ;
		return status;
	}

	@Override
	public String deleteStudent(String sid) {
	String status = studentDao.delee(sid); 
		return status;
	}

}
