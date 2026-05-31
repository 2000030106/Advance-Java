package com.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.entity.Employee;
import com.ems.repository.EmployeeRepository;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.PageRequest;

import org.springframework.data.domain.Pageable;
@Service
public class EmployeeService {

    
    @Autowired
    EmployeeRepository repo;

    
    
    public Employee saveEmployee(
            Employee e) {

        return repo.save(e);
    }

    
    
    public List<Employee> getEmployees() {

        return repo.findAll();
    }

    
    
    public Employee updateEmployee(
            Employee e) {

        return repo.save(e);
    }

    
    
    public void deleteEmployee(
            int id) {

        repo.deleteById(id);
    }
    
    public Page<Employee>
    getEmployeesWithPagination(

            int page,

            int size,

            String keyword) {

        
        Pageable pageable =
                PageRequest.of(page, size);

        
        return repo.findByNameContaining(
                keyword,
                pageable);
    }
    public Employee getEmployeeById(
            int id) {

        return repo.findById(id).get();
    }
}