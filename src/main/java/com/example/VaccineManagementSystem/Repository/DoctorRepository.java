package com.example.VaccineManagementSystem.Repository;

import com.example.VaccineManagementSystem.Models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Amresh Tripathy
 */

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

    public Doctor findByEmailId(String emailId);
}
