package com.durgasoft.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.durgasoft.dto.Student;
//to create the object and store the attributes
@Repository
public class StudentDaoImpl implements StudentDao {
//Only one constructor of any given bean class may declare 
	//this annotation with the required attribute set to true, indicating the constructorto 
	@Autowired
	JdbcTemplate jdbcTemplate ;
	
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	@Override
	public String add(Student student) {
	String status="";
	   
	 Student std = search(student.getSid()) ; 
	if(std == null)
	{
		
		  int rowCount = jdbcTemplate.update("insert into student values('" +
		  student.getSid()+"','"+student.getSname()+"'.'"+student.getSaddr()+"'") ;
		  if (rowCount ==1 )
		  {
			  status="success";
		  }
		  else
		  {
			  status="failure";
		  }
		  
	}
	else
	{
		status="existed" ; 
	}
		return status;
	}

	@Override
	public Student search(String sid) {
		Student student = null ; 
		List<Student> stdList = jdbcTemplate.query("select * from student where SID='"+sid+"'", (rs, rowNo) ->{ 
			Student s = new Student();
			s.setSid(rs.getString("SID"));
			s.setSname(rs.getString("SNAME"));
			s.setSaddr(rs.getString("SADDR"));
			return s ; 
			
		} );

		if (stdList.isEmpty() == true)
		{		student= null ; 
			
		}
		else
		{
			return stdList.get(0); 
		}
		return student ; 
	}

	@Override
	public String update(Student student) {
		
		return null;
	}

	@Override
	public String delee(String sid) {
		
		return null;
	}

}
