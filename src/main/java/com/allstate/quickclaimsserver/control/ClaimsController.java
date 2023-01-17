package com.allstate.quickclaimsserver.control;

import com.allstate.quickclaimsserver.domain.Claims;
import com.allstate.quickclaimsserver.exceptions.ClaimNotFoundException;
import com.allstate.quickclaimsserver.service.ClaimsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/claim")
public class ClaimsController {

    @Autowired
    private ClaimsService claimsService;

    @GetMapping
    public List<Claims> getAllClaims(@RequestParam(value="country", required = false) String country) {
        if (country == null) {
            return claimsService.getAllClaims();
        }
        else {
            return claimsService.getByCountry(country);
        }
    }

    @GetMapping("/{id}")
    public Claims findById(@PathVariable Integer id) throws ClaimNotFoundException {
        return claimsService.getById(id);
    }
}
