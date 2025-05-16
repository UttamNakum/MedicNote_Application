package com.medicnote.medicnote.repository;

import com.medicnote.medicnote.Model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
