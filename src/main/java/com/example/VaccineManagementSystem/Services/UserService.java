package com.example.VaccineManagementSystem.Services;

import com.example.VaccineManagementSystem.Models.User;
import com.example.VaccineManagementSystem.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author Amresh Tripathy
 */

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User addUser(User user) {
        user = userRepository.save(user);
        return user;
    }

    public Date getVaccinationDate(Integer id) {
        return userRepository.findById(id).get().getDose().getVaccinationDate();
    }
}
