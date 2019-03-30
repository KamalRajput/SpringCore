package com.Kamal.Spring.SpringCoreList;

import java.util.List;

public class Hospital {

	
	private String name;
	private  List<String> Departments;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getDepartments() {
		return Departments;
	}
	public void setDepartments(List<String> departments) {
		Departments = departments;
	}
	
}
