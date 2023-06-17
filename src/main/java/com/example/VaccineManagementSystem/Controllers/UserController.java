package com.example.VaccineManagementSystem.Controllers;

import com.example.VaccineManagementSystem.Models.User;
import com.example.VaccineManagementSystem.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author Amresh Tripathy
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/getVaccinationDate")
    public Date getVaccinationDate(@RequestParam(name = "userId") Integer id) {
        return userService.getVaccinationDate(id);
    }
}
