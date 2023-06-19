package com.example.VaccineManagementSystem.Controllers;

import com.example.VaccineManagementSystem.Models.Doctor;
import com.example.VaccineManagementSystem.Services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Amresh Tripathy
 */

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping("/add")
    public String addDoctor(@RequestBody Doctor doctor) {
        try {
            return doctorService.addDoctor(doctor);
        } catch (Exception ex) {
            return ex.getMessage();
        }
    }
}
