package com.allstate.quickclaimsserver.service;

import com.allstate.quickclaimsserver.domain.Claims;
import com.allstate.quickclaimsserver.exceptions.ClaimNotFoundException;

import java.util.List;

public interface ClaimsService {

    public List<Claims> getAllClaims();
    public Claims getById(Integer id) throws ClaimNotFoundException;
    public List<Claims> getByFirstName(String firstName);
}
