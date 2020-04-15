package com.univerity.diploma.doctoronlie.service.impl;

import com.reserver.common.starter.data.jpa.basecrud.filter.BaseFilter;
import com.reserver.common.starter.data.jpa.basecrud.service.impl.AbstractBaseCrudService;
import com.univerity.diploma.doctoronlie.entity.employee.Patient;
import com.univerity.diploma.doctoronlie.filter.IdFilter;
import com.univerity.diploma.doctoronlie.repository.PatientRepository;
import com.univerity.diploma.doctoronlie.service.PatientService;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl extends AbstractBaseCrudService<Patient, IdFilter> implements PatientService {

    private final PatientRepository repository;

    public PatientServiceImpl(PatientRepository repository) {
        super(repository);
        this.repository = repository;
    }

    @Override
    public Example<Patient> createExample(BaseFilter baseFilter) {
        return null;
    }
}
