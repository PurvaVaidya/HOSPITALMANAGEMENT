package com.hospital.hospitalmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.hospitalmanagement.entity.Patient;
import com.hospital.hospitalmanagement.repository.PatientRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    PatientRepository repo;

    // GET ALL PATIENTS
    @GetMapping
    public List<Patient> getAllPatients() {

        return repo.findAll();
    }

    // ADD PATIENT
    @PostMapping
    public Patient addPatient(@RequestBody Patient patient) {

        return repo.save(patient);
    }
}