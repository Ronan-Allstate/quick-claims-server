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
            Claims newClaim = new Claims(1, 200.00, "Ire", "Euro", Date.valueOf("2022-01-16"), "20", 4, 0.5, "Home");
            Claims savedClaim = claimsRepository.save(newClaim);
            System.out.println("Claim saved with Id: " + savedClaim.getId());
        }
    }
}
