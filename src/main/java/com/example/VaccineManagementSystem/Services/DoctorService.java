package com.example.VaccineManagementSystem.Services;

import com.example.VaccineManagementSystem.Exceptions.EmailIdEmptyException;
import com.example.VaccineManagementSystem.Exceptions.DoctorAlreadyExistException;
import com.example.VaccineManagementSystem.Models.Doctor;
import com.example.VaccineManagementSystem.Repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Amresh Tripathy
 */

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public String addDoctor(Doctor doctor) throws EmailIdEmptyException, DoctorAlreadyExistException {
        if (doctor.getEmailId() == null)
            throw new EmailIdEmptyException("Email Id is mandatory!");

        if (doctorRepository.findByEmailId(doctor.getEmailId()) != null)
            throw new DoctorAlreadyExistException("Doctor with this emailId already exists.");


        doctorRepository.save(doctor);

        return "A new doctor " + doctor.getName() + " has been added to the database.";
    }
}
