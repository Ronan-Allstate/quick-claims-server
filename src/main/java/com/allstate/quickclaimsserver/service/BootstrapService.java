package com.allstate.quickclaimsserver.service;

import com.allstate.quickclaimsserver.data.ClaimsRepository;
import com.allstate.quickclaimsserver.data.UserRepository;
import com.allstate.quickclaimsserver.domain.Claims;
import com.allstate.quickclaimsserver.domain.User;
import com.allstate.quickclaimsserver.domain.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.sql.Date;

@Service
public class BootstrapService {

    @Autowired
    private ClaimsRepository claimsRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @PostConstruct
    public void setUpInitialData() {
        int numberOfClaims = claimsRepository.findAll().size();
        if (numberOfClaims == 0) {
            Claims newClaim = new Claims(1,"123456", "Ronan", "Donnelly", "Mr", "IRE","01 Street Name", "City/Town", "ZipCode", 1, "Home", 5000, "Fire", "Cooking Failure", true, Date.valueOf("2022-01-16"));
            Claims savedClaim = claimsRepository.save(newClaim);
            System.out.println("Claim saved with Id: " + savedClaim.getId());
        }
    }

    @PostConstruct
    public void createInitialUsers() {
        if (userRepository.count() == 0) {
            User user1 = new User("ronan", "Ronan", "pass1", UserRole.USER);
            User user2 = new User("sally", "Sally", "pass1", UserRole.MANAGER);
            userService.save(user1);
            userService.save(user2);
        }
    }
}
