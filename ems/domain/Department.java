package com.flp.ems.domain;
import java .util.Scanner;

public class Department {
	int deptid;
	String Deptname;
	Scanner sc1= new Scanner(System.in);
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return Deptname;
	}
	public void setDeptname(String deptname) {
		Deptname = deptname;
	}
}
	

	