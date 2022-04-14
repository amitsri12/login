package com.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.entities.Student;

public class StudentDao {

	
	private HibernateTemplate hibernateTemplate;
	//save student
	@Transactional
	public int insert(Student student) {
		//Insert
		
	Integer i=(Integer)this.hibernateTemplate.save(student);
		return i;
		
	}
	
	//get the single data
	public 	Student getStudent(int studentId) {
	Student student=this.hibernateTemplate.get(Student.class,studentId);
		
	return student;
	
	}
	//get all the Data
	
	public List<Student> getAllStudent(){
		List<Student> students=this.hibernateTemplate.loadAll(Student.class);
	
	return students;
	
	}
	//delete the data
	@Transactional
	public void deleteStudent(int studentId) {
	this.hibernateTemplate.get(Student.class,studentId);
	
	}
	
	
	//update the data
	@Transactional
	public void updateStudent(Student student) {
		this.hibernateTemplate.update(student);
	}
	
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
}
