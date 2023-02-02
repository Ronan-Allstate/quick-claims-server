package com.allstate.quickclaimsserver.service;

import com.allstate.quickclaimsserver.data.ClaimsRepository;
import com.allstate.quickclaimsserver.domain.Claims;
import com.allstate.quickclaimsserver.exceptions.ClaimNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClaimsServiceImpl implements ClaimsService{

    @Autowired
    private ClaimsRepository claimsRepository;

    @Override
    public List<Claims> getAllClaims() {
        List<Claims> claims = claimsRepository.findAll();
        System.out.println("There were " + claims.size() + "found");
        return claims;
    }

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
    public List<Claims> getByCountry(String country) {
        return claimsRepository.findAllByCountry(country);
    }

    @Override
    public List<Claims> getByOrder(String order) {
        return claimsRepository.findAllByOrderId(order);
    }

    @Override
    public List<String> getAllCountries() {
        return claimsRepository.findAll().stream()
                .map( claims -> claims.getCountry().toLowerCase())
                .distinct()
                .collect(Collectors.toList());
    }

    @Override
    public List<Claims> getByFirstName(String firstName) { return claimsRepository.findAllByFirstName(firstName);}

    @Override
    public Claims saveClaim(Claims claims) {
        return claimsRepository.save(claims);
    }

    @Override
    public Claims updateClaims(Integer id, Map<String, Object> fields) {
        Claims claims = claimsRepository.findById(id).get();

        if (fields.containsKey("orderId")) {
            claims.setOrderId(fields.get("orderId").toString());
        }
        if (fields.containsKey("firstName")) {
            claims.setFirstName(fields.get("firstName").toString());
        }
        if (fields.containsKey("surname")) {
            claims.setSurname(fields.get("surname").toString());
        }
        if (fields.containsKey("title")) {
            claims.setTitle(fields.get("title").toString());
        }
        if (fields.containsKey("country")) {
            claims.setCountry(fields.get("country").toString());
        }
        if (fields.containsKey("streetName")) {
            claims.setStreetName(fields.get("streetName").toString());
        }
        if (fields.containsKey("city")) {
            claims.setCity(fields.get("city").toString());
        }
        if (fields.containsKey("zipCode")) {
            claims.setZipCode(fields.get("zipCode").toString());
        }
        if (fields.containsKey("policyNum")) {
            claims.setPolicyNum(Integer.parseInt(fields.get("policyNum").toString()));
        }
        if (fields.containsKey("insuranceType")) {
            claims.setInsuranceType(fields.get("insuranceType").toString());
        }
        if (fields.containsKey("claimEstimate")) {
            claims.setClaimEstimate(Integer.parseInt(fields.get("claimEstimate").toString()));
        }
        if (fields.containsKey("claimReason")) {
            claims.setClaimReason(fields.get("claimReason").toString());
        }
        if (fields.containsKey("claimDescription")) {
            claims.setClaimDescription(fields.get("claimDescription").toString());
        }

        return claimsRepository.save(claims);
    }
}
