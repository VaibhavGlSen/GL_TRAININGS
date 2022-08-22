package com.vaibhav.Learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vaibhav.Learn.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

	public Department findByDepartmentName(String departmentName);  // with naming convention we wont have to create a new method body

	// sql query with annotation for query and true for native query
}
