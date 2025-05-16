package com.medicnote.medicnote.service;

import com.medicnote.medicnote.Model.Doctor;
import com.medicnote.medicnote.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public Doctor createDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    public Optional<Doctor> getDoctorByEmail(String email) {
        return doctorRepository.findByEmail(email);
    }

    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    public Optional<Doctor> getDoctorById(Long id) {
        return doctorRepository.findById(id);
    }

    public void deleteDoctor(Long id) {
        doctorRepository.deleteById(id);
    }

    public Doctor updateDoctor(Long id, Doctor doctor) {
        Doctor docter = getDoctorById(id).get();
        if(docter != null) {
            docter.setEmail(doctor.getEmail());
            docter.setName(doctor.getName());
            docter.setPrescriptions(docter.getPrescriptions());
            docter.setSpecialization(docter.getSpecialization());
            return doctorRepository.save(doctor);
        }
        return null;
    }

}
