package com.univerity.diploma.doctoronlie.repository;

import com.reserver.common.starter.data.jpa.basecrud.repository.BaseCrudRepository;
import com.univerity.diploma.doctoronlie.entity.employee.Employee;

import java.util.Optional;

public interface EmployeeRepository extends BaseCrudRepository<Employee> {

    Optional<Employee> findByLogin(String login);
}
