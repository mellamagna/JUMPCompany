package com.cognixia.jump.advancedjava.finalproject;

import java.util.List;

public interface DepartmentDAO {

	public List<Department> getAllDepartments();
	
	public Department getDepartmentByName(String deptName);
	
	public boolean addDepartment(Department dept);
	
	public boolean deleteDepartmentByName(String deptName);
	
	public boolean updateDepartment(Department dept);

}
