package com.flp.ems.service;

import java.util.List;

import com.flp.ems.domain.Employee;

public interface IEmployeeService {
	public int addEmployee(Employee emp,List<Employee>list);
	public void ModifyEmployee();
	public void RemoveEmployee();
	public void SearchEmployee();
	public void getallEmployee();
	

}
