package com.univerity.diploma.doctoronlie.service;

import com.reserver.common.starter.data.jpa.basecrud.service.BaseCrudService;
import com.univerity.diploma.doctoronlie.entity.employee.Employee;
import com.univerity.diploma.doctoronlie.filter.IdFilter;

import java.util.Optional;

public interface EmployeeService extends BaseCrudService<Employee , IdFilter> {

    Optional<Employee> getByLogin(String login);
}
