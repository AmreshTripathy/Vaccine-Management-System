package com.example.VaccineManagementSystem.Repository;

import com.example.VaccineManagementSystem.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Amresh Tripathy
 */

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
