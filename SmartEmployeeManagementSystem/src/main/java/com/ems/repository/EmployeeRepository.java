package com.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.entity.Employee;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
public interface EmployeeRepository
        extends JpaRepository<Employee, Integer> {

	Page<Employee> findByNameContaining(
	        String name,
	        Pageable pageable);
}