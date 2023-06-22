package com.example.VaccineManagementSystem.Exceptions;

/**
 * @author Amresh Tripathy
 */
public class DoctorNotFound extends Exception {
    public DoctorNotFound() {
        super("Doctor id is wrong");
    }
}
