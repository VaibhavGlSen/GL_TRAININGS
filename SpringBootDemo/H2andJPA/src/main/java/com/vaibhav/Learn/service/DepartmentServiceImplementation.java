package com.vaibhav.Learn.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaibhav.Learn.entity.Department;
import com.vaibhav.Learn.error.DepartmentNotFoundException;
import com.vaibhav.Learn.repository.DepartmentRepository;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@Service
public class DepartmentServiceImplementation implements DepartmentService{

	@Autowired
	private DepartmentRepository departmentRepository;
	@Override
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}
	@Override
	public List<Department> fetchDepartmentList() {
		return departmentRepository.findAll();
	}
	@Override
	 public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException {
        java.util.Optional<Department> department =
                departmentRepository.findById(departmentId);

        if(!department.isPresent()) {
            throw new DepartmentNotFoundException("Department Not Available");
        }

        return  department.get();
    }
	@Override
	public void deleteDepartmentById(Long departmentId) {
        		departmentRepository.deleteById(departmentId);
	}
    @Override
	public Department updateDepartment(Long departmentId, Department department) {
		Department depDB=departmentRepository.findById(departmentId).get();
		if(Objects.nonNull(department.getDepartmentName())&& !"".equalsIgnoreCase(department.getDepartmentName()))
				{
			       depDB.setDepartmentName(department.getDepartmentName());
				}
		if(Objects.nonNull(department.getDepartmentAddresString())&& !"".equalsIgnoreCase(department.getDepartmentAddresString()))
		{
	       depDB.setDepartmentAddresString(department.getDepartmentAddresString());
		}
		if(Objects.nonNull(department.getDepartmentCode())&& !"".equalsIgnoreCase(department.getDepartmentCode()))
				{
			       depDB.setDepartmentCode(department.getDepartmentCode());
				}
		return departmentRepository.save(depDB);
	}	
    @Override
    public Department fetchDepartmentByName(String departmentName) {
    	return departmentRepository.findByDepartmentName(departmentName);   }
}