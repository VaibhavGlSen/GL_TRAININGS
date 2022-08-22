package com.vaibhav.Learn.service;

import java.util.List;

import com.vaibhav.Learn.entity.Department;
import com.vaibhav.Learn.error.DepartmentNotFoundException;

public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List<Department> fetchDepartmentList();

	public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

	public void deleteDepartmentById(Long departmentId);

	public Department updateDepartment(Long departmentId, Department department);

	public Department fetchDepartmentByName(String departmentName);
}
