package com.allstate.quickclaimsserver.control;

import com.allstate.quickclaimsserver.domain.Claims;
import com.allstate.quickclaimsserver.exceptions.ClaimNotFoundException;
import com.allstate.quickclaimsserver.service.ClaimsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/claim")
public class ClaimsController {

    @Autowired
    private ClaimsService claimsService;

    @GetMapping
    public List<Claims> getAllClaims(@RequestParam(value="country", required = false) String country,
                                     @RequestParam(value="order", required = false) String order) {
        if (order != null) {
            return claimsService.getByOrder(order);
        }
        else if (country != null) {
            return claimsService.getByCountry(country);
        }
        else
        {
            return claimsService.getAllClaims();
        }
    }

    @GetMapping("/{id}")
    public Claims findById(@PathVariable Integer id) throws ClaimNotFoundException {
        return claimsService.getById(id);
    }

    @PostMapping
    public Claims saveNewClaim(@RequestBody Claims claim) {
        System.out.println(claim);
        return claimsService.saveClaim(claim);
    }

    @PutMapping("/{id}")
    public Claims updateClaims(@PathVariable Integer id, @RequestBody HashMap<String, Object> fields) {
        return claimsService.updateClaims(id, fields);
    }
}
