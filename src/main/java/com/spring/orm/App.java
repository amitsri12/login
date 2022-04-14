package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dao.StudentDao;
import com.spring.entities.Student;

 
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=  new ClassPathXmlApplicationContext("config.xml");
    StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
	/*
	 * Student student=new Student(23245,"Amit1","chakia1");
	 * 
	 * int r=studentDao.insert(student); System.out.println("done"+r);
	 */
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 
    boolean go=true;
    
    while(go) {
	 System.out.println("press 1 for add new Student");
	   System.out.println("press 2 for display new Student"); 
	   System.out.println("press 3 for get detail of single Student");
	   System.out.println("press 4 for delete Students");
	    System.out.println("press 5 for update Student");
	    System.out.println("press 6 for exit");

 try {
	int input=Integer.parseInt(br.readLine());
	/*
	 * if(input==1) { //add new Student }else if(input==2) { //display }
	 */
	
	
	
	switch(input) {
	case 1:
	//add a new Student
		break;
	case 2:
		//display
		break;
	case 3:
		//get single student
		break;
	case 4:
		
		//delete
		
		break;
	case 5:
		
		//update
		break;
	case 6:
	
		//exit
		go=false;
		break;
	}
	
	
 }catch(Exception e) {
	 System.out.println("Invalid input try another one!!!!");
System.out.println(e.getMessage());
 }
 
 
 
 
 }
    System.out.println("thank you for using This Application");
    System.out.println("see yoou soon");
    }
}
