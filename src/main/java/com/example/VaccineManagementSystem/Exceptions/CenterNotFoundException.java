package com.example.VaccineManagementSystem.Exceptions;

/**
 * @author Amresh Tripathy
 */
public class CenterNotFoundException extends Exception {
    public CenterNotFoundException() {
        super("Center Id enter is incorrect!");
    }
}
