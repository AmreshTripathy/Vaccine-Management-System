package com.example.VaccineManagementSystem.Models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

/**
 * @author Amresh Tripathy
 */

@Entity
@Table(name = "dose1")
public class Dose1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "dose_id", unique = true)
    private String doseId;

    @CreationTimestamp
    @Column(name = "vaccination_date")
    private Date vaccinationDate;

    @OneToOne
    @JoinColumn
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDoseId() {
        return doseId;
    }

    public void setDoseId(String doseId) {
        this.doseId = doseId;
    }

    public Date getVaccinationDate() {
        return vaccinationDate;
    }

    public void setVaccinationDate(Date vaccinationDate) {
        this.vaccinationDate = vaccinationDate;
    }
}
