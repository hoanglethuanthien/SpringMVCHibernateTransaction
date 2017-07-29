package org.o7planning.dao;

import java.util.List;

import org.o7planning.entity.Department;

public interface DepartmentDAO {
	public List<Department> listDepartment();
	public Integer getMaxDeptId();
	public void createDepartment(String name, String location);  
}
