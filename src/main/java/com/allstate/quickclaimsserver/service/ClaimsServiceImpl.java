package com.allstate.quickclaimsserver.service;

import com.allstate.quickclaimsserver.data.ClaimsRepository;
import com.allstate.quickclaimsserver.domain.Claims;
import com.allstate.quickclaimsserver.exceptions.ClaimNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClaimsServiceImpl implements ClaimsService{

    @Autowired
    private ClaimsRepository claimsRepository;

    @Override
    public List<Claims> getAllClaims() {return claimsRepository.findAll();}

    @Override
    public Claims getById(Integer id) throws ClaimNotFoundException {
        Optional<Claims> optionalClaim = claimsRepository.findById(id);
        if (optionalClaim.isPresent()) {
            return optionalClaim.get();
        }
        else {
            throw new ClaimNotFoundException("There is no claim with id: " + id);
        }
    }

    @Override
    public List<Claims> getByFirstName(String firstName) { return claimsRepository.findAllByFirstName(firstName);}
}
