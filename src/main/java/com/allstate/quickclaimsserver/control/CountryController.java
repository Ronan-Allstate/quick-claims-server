package com.allstate.quickclaimsserver.control;

import com.allstate.quickclaimsserver.service.ClaimsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/country")
public class CountryController {

    @Autowired
    private ClaimsService claimsService;

    @GetMapping()
    public List<String> getAllCountries() {

        return claimsService.getAllCountries();
    }

}
