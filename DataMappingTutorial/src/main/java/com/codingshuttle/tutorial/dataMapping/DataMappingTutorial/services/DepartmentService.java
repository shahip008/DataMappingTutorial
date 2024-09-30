package com.codingshuttle.tutorial.dataMapping.DataMappingTutorial.services;

import com.codingshuttle.tutorial.dataMapping.DataMappingTutorial.entities.DepartmentEntity;
import com.codingshuttle.tutorial.dataMapping.DataMappingTutorial.entities.EmployeeEntity;
import com.codingshuttle.tutorial.dataMapping.DataMappingTutorial.repositories.DepartmentRepository;
import com.codingshuttle.tutorial.dataMapping.DataMappingTutorial.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;
    //private final EmployeeRepository employeeRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
       // this.employeeRepository = employeeRepository;
    }

    public DepartmentEntity createNewDepartment(DepartmentEntity departmentEntity) {
        return departmentRepository.save(departmentEntity);
    }

    public DepartmentEntity getDepartmentById(Long id) {
        return departmentRepository.findById(id).orElse(null);
    }

}








