package com.example.VaccineManagementSystem.Services;

import com.example.VaccineManagementSystem.Models.User;
import com.example.VaccineManagementSystem.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
