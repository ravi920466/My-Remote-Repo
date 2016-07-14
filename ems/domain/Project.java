package com.flp.ems.domain;
import java .util.Scanner;

public class Project {
	int projectid;
	String Projectname;
	Scanner sc1= new Scanner(System.in);
	public int getProjectid() {
		return projectid;
	}
	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}
	public String getProjectname() {
		return Projectname;
	}
	public void setProjectname(String projectname) {
		Projectname = projectname;
	}
}

