package com.allstate.quickclaimsserver.service;

import com.allstate.quickclaimsserver.data.ClaimsRepository;
import com.allstate.quickclaimsserver.domain.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.sql.Date;

@Service
public class BootstrapService {

    @Autowired
    private ClaimsRepository claimsRepository;

    @PostConstruct
    public void setUpInitialData() {
        int numberOfClaims = claimsRepository.findAll().size();
        if (numberOfClaims == 0) {
            Claims newClaim = new Claims(1, "Ronan", "Donnelly", "Mr", "01 Street Name", "City/Town", "ZipCode", 1, "Home", 5000, "Fire", "Cooking Failure", true, Date.valueOf("2022-01-16"));
            Claims savedClaim = claimsRepository.save(newClaim);
            System.out.println("Claim saved with Id: " + savedClaim.getId());
        }
    }
}
