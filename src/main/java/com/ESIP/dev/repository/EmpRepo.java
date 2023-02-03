package com.ESIP.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ESIP.dev.entity.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer>{

}
