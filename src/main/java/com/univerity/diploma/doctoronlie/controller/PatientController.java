package com.univerity.diploma.doctoronlie.controller;

import com.univerity.diploma.doctoronlie.dto.PatientDto;
import com.univerity.diploma.doctoronlie.dto.converter.PatientDtoConverter;
import com.univerity.diploma.doctoronlie.service.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/patient")
public class PatientController {

    private final PatientService patientService;
    private final PatientDtoConverter patientDtoConverter;

    public PatientController(PatientService patientService, PatientDtoConverter patientDtoConverter) {
        this.patientService = patientService;
        this.patientDtoConverter = patientDtoConverter;
    }

    @GetMapping("/all")
    public List<PatientDto> getAll() {
        return patientService.getAll().stream()
                .map(patientDtoConverter::toDto)
                .collect(Collectors.toList());
    }

    @PostMapping("/save")
    public PatientDto save(@RequestBody PatientDto patientDto) {
        return patientDtoConverter.toDto(patientService.save(patientDtoConverter.toEntity(patientDto)));
    }

}
