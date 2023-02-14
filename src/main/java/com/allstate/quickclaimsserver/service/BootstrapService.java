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
import java.time.LocalDate;

@Service
public class BootstrapService {

    @Autowired
    private ClaimsRepository claimsRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;


//    @PostConstruct
//    public void setUpInitialData() {
//        int numberOfClaims = claimsRepository.findAll().size();
//        if (numberOfClaims == 0) {
//            Claims newClaim = new Claims(1,"123456", "Homer", "Simpson", "Mr", "USA","01 Street Name", "City/Town", "ZipCode", "Make", "Model", "ModelYear", "AnimalType", "AnimalBreed", 1, "Property", 5000, "Fire", "Cooking Failure", "Awaiting Assessment", 100.00, "Task","Note", LocalDate.of(2022,01,16));
//            Claims newClaim2 = new Claims(2,"234567", "Marge", "Simpson", "Mrs", "IRE","01 Street Name", "City/Town", "ZipCode", "", "", "", "", "", 1, "Property", 500, "Fire", "Cooking Failure", "Processing", null, "", "", LocalDate.of(2022,1,16));
//            Claims newClaim3 = new Claims(3,"345678", "Bart", "Simpson", "Mr", "ENG","", "", "", "Toyota", "Corolla", "2010", "", "", 1, "Motor", 300, "Flat tyre", "Ran over nail", "Rejected", null, "", "", LocalDate.of(2022,1,16));
//            Claims newClaim4 = new Claims(4,"465789", "Lisa", "Simpson", "Miss", "SCO","", "", "", "", "", "", "Dog", "German Shepard", 1, "Pet", 200, "Broken Leg", "Fell off a cliff", "Accepted: Awaiting Payment", null, "", "", LocalDate.of(2022,1,16));
//            Claims newClaim5 = new Claims(5,"098765", "Maggie", "Simpson", "Miss", "FRE","01 Springfield Road", "Springfield", "abc123", "", "", "", "", "", 1, "Property", 250, "Electrical Fault", "No power", "Accepted: Paid", 250.50, "", "", LocalDate.of(2022,1,16));
//            Claims newClaim6 = new Claims(6,"987654", "Ned", "Flanders", "Mr", "SPA","", "", "", "Ford", "Focus", "2000", "", "", 1, "Motor", 500, "New Bumper", "Small collision broke bumper", "Rejected: Claim value too high", null, "", "Claim value too high", LocalDate.of(2022,1,16));
//
//
//            Claims savedClaim = claimsRepository.save(newClaim);
//            Claims savedClaim2 = claimsRepository.save(newClaim2);
//            Claims savedClaim3 = claimsRepository.save(newClaim3);
//            Claims savedClaim4 = claimsRepository.save(newClaim4);
//            Claims savedClaim5 = claimsRepository.save(newClaim5);
//            Claims savedClaim6 = claimsRepository.save(newClaim6);
//            System.out.println("Claim saved with Id: " + savedClaim.getId());
//        }
//    }

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
