package com.example.VaccineManagementSystem.Models;

import com.example.VaccineManagementSystem.Enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Amresh Tripathy
 */

@Entity
@Table(name = "doctors")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doc_id")
    private int docId;

    private String name;

    private int age;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "email_id", unique = true)
    private String emailId;
}