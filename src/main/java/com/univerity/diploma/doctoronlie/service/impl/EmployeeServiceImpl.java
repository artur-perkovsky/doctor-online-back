package com.univerity.diploma.doctoronlie.service.impl;

import com.reserver.common.starter.data.jpa.basecrud.filter.BaseFilter;
import com.reserver.common.starter.data.jpa.basecrud.service.impl.AbstractBaseCrudService;
import com.univerity.diploma.doctoronlie.entity.employee.Employee;
import com.univerity.diploma.doctoronlie.filter.IdFilter;
import com.univerity.diploma.doctoronlie.repository.EmployeeRepository;
import com.univerity.diploma.doctoronlie.service.EmployeeService;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl extends AbstractBaseCrudService<Employee, IdFilter> implements EmployeeService {

    private EmployeeRepository repository;

    public EmployeeServiceImpl(EmployeeRepository repository) {
        super(repository);
        this.repository = repository;
    }

    @Override
    public Example<Employee> createExample(BaseFilter filter) {
        return null;
    }

    @Override
    public Optional<Employee> getByLogin(String login) {
        return repository.findByLogin(login);
    }
}
