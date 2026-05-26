package com.hospital.hospitalmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.hospitalmanagement.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}