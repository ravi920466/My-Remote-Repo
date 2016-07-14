package com.flp.ems.domain;
import java .util.Scanner;

public class Employee {
	String Name;
	int kinid;
	String emailid;
	long phoneno;
	String address;
	int dob;
	int doj;
	Scanner sc1= new Scanner(System.in);
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getKinid() {
		return kinid;
	}
	public void setKinid(int kinid) {
		this.kinid = kinid;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getDob() {
		return dob;
	}
	public void setDob(int dob) {
		this.dob = dob;
	}
	public int getDoj() {
		return doj;
	}
	public void setDoj(int doj) {
		this.doj = doj;
	}
}