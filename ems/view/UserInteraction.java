package com.flp.ems.view;
import java.util.HashMap; 

import java.util.Scanner;

public class UserInteraction{
	HashMap<String,String>emp=new HashMap<String,String>();
	Scanner sc=new Scanner(System.in);
	public void AddEmployee(){
		
		String name,kinid,email,phoneno,address,dob,doj,deptid,projectid,roleid;
		
		
		System.out.println("Enter the name of the employee:");
		name=sc.next();
		emp.put("name",name);
		
		System.out.println("Enter the kinid:");
		kinid=sc.next();
		emp.put("kinid",kinid);
		
		System.out.println("Enter the email of the employee:");
		email=sc.next();
		emp.put("email",email);
		
		
		System.out.println("Enter the phoneno of the employee:");
		phoneno=sc.next();
		emp.put("phoneno",phoneno);
		
		System.out.println("Enter the address of the employee:");
		address=sc.next();
		emp.put("address",address);
		
		
		System.out.println("Enter the dob of the employee:");
		dob=sc.next();
		emp.put("dob",dob);
		
		System.out.println("Enter the doj of the employee:");
		doj=sc.next();
		emp.put("doj",doj);
		
		System.out.println("Enter the deptid of the employee:");
		deptid=sc.next();
		emp.put("deptid",deptid);
		
		
		System.out.println("Enter the projectid of the employee:");
		projectid=sc.next();
		emp.put("projectid",projectid);
		
		
		System.out.println("Enter the roleid of the employee:");
		roleid=sc.next();
		emp.put("roleid",roleid);
		System.out.println(emp);
		
		
	}
	public void ModifyEmployee(){
	}
	public void RemoveEmployee(){
	}
	public void SearchEmployee(){
	}
	public void GetallEmployee(){
	}
	}
		
		
	
		


