package com.allstate.quickclaimsserver.service;

import com.allstate.quickclaimsserver.domain.Claims;
import com.allstate.quickclaimsserver.exceptions.ClaimNotFoundException;

import java.util.List;
import java.util.Map;

public interface ClaimsService {

    public List<Claims> getAllClaims();
    public Claims getById(Integer id) throws ClaimNotFoundException;
    public List<Claims> getByOrder(String order);
    public List<Claims> getByCountry(String country);
    public List<String> getAllCountries();

    public List<Claims> getByFirstName(String firstName);

    public Claims saveClaim(Claims claims);
    public Claims updateClaims(Integer id, Map<String, Object> fields);
}
