package com.univerity.diploma.doctoronlie.service;

import com.reserver.common.starter.data.jpa.basecrud.service.BaseCrudService;
import com.univerity.diploma.doctoronlie.entity.employee.Patient;
import com.univerity.diploma.doctoronlie.filter.IdFilter;

public interface PatientService extends BaseCrudService<Patient, IdFilter> {
}
