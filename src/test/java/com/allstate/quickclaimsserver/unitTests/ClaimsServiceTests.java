package com.allstate.quickclaimsserver.unitTests;


import com.allstate.quickclaimsserver.data.ClaimsRepository;
import com.allstate.quickclaimsserver.data.UserRepository;
import com.allstate.quickclaimsserver.domain.Claims;
import com.allstate.quickclaimsserver.service.ClaimsService;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.*;
import org.mockito.*;
import org.mockito.junit.jupiter.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.autoconfigure.jdbc.*;
import org.springframework.boot.autoconfigure.orm.jpa.*;
import org.springframework.boot.test.autoconfigure.web.servlet.*;
import org.springframework.boot.test.context.*;
import org.springframework.boot.test.mock.mockito.*;
import org.springframework.test.context.junit.jupiter.*;

import javax.activation.*;
import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;


import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class ClaimsServiceTests {

    @Autowired
    private ClaimsService claimsService;

    @MockBean
    private ClaimsRepository claimsRepository;

    @MockBean
    private UserRepository userRepository;

    @BeforeEach
    public void setUp() {
        List<Claims> claims = new ArrayList<>();
        claims.add(new Claims(1,"123456", "Homer", "Simpson", "Mr", "USA","01 Street Name", "City/Town", "ZipCode", "Make", "Model", "ModelYear", "AnimalType", "AnimalBreed", 1, "Property", 5000, "Fire", "Cooking Failure", "Awaiting Assessment", 100.00, "Task","Note", LocalDate.of(2022,01,16)));
        claims.add(new Claims(1,"123456", "Homer", "Simpson", "Mr", "FRA","01 Street Name", "City/Town", "ZipCode", "Make", "Model", "ModelYear", "AnimalType", "AnimalBreed", 1, "Property", 5000, "Fire", "Cooking Failure", "Awaiting Assessment", 100.00, "Task","Note", LocalDate.of(2022,01,16)));
        claims.add(new Claims(1,"123456", "Homer", "Simpson", "Mr", "USA","01 Street Name", "City/Town", "ZipCode", "Make", "Model", "ModelYear", "AnimalType", "AnimalBreed", 1, "Property", 5000, "Fire", "Cooking Failure", "Awaiting Assessment", 100.00, "Task","Note", LocalDate.of(2022,01,16)));
        claims.add(new Claims(1,"123456", "Homer", "Simpson", "Mr", "ENG","01 Street Name", "City/Town", "ZipCode", "Make", "Model", "ModelYear", "AnimalType", "AnimalBreed", 1, "Property", 5000, "Fire", "Cooking Failure", "Awaiting Assessment", 100.00, "Task","Note", LocalDate.of(2022,01,16)));
        claims.add(new Claims(1,"123456", "Homer", "Simpson", "Mr", "IRE","01 Street Name", "City/Town", "ZipCode", "Make", "Model", "ModelYear", "AnimalType", "AnimalBreed", 1, "Property", 5000, "Fire", "Cooking Failure", "Awaiting Assessment", 100.00, "Task","Note", LocalDate.of(2022,01,16)));
        claims.add(new Claims(1,"123456", "Homer", "Simpson", "Mr", "USA","01 Street Name", "City/Town", "ZipCode", "Make", "Model", "ModelYear", "AnimalType", "AnimalBreed", 1, "Property", 5000, "Fire", "Cooking Failure", "Awaiting Assessment", 100.00, "Task","Note", LocalDate.of(2022,01,16)));
        Mockito.when(claimsRepository.findAll()).thenReturn(claims);

        Mockito.when(claimsRepository.findById(1)).thenReturn(java.util.Optional.of(claims.get(0)));
        Mockito.when(claimsRepository.findById(2)).thenReturn(java.util.Optional.of(claims.get(1)));
        Mockito.when(claimsRepository.findAllByCountry("USA")).thenReturn(List.of(claims.get(2)));
    }

    @Test
    public void testGetById() {

        try{
            Claims claim = claimsService.getById(1);
            assertEquals(1, claim.getId());
        } catch(Exception e) {
            System.out.println(e);
        }

    }

    @Test
    public void testGetByCountry() {
        List<Claims> claim = claimsService.getByCountry("USA");
        assertEquals(1, claim.size());
    }

    @Test
    public void testGetAllCountries() {
        List<String> countries = claimsService.getAllCountries();
        assertEquals(4, countries.size());
    }
}
