package com.amie.pma.dao;

import org.springframework.data.repository.CrudRepository;

import com.amie.pma.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>  {

}
