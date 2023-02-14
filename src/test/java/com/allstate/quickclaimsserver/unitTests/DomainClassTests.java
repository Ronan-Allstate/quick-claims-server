package com.allstate.quickclaimsserver.unitTests;

import com.allstate.quickclaimsserver.domain.Claims;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;
import java.time.LocalDate;

public class DomainClassTests {

    @Test
    public void test2ClaimsWithSameIdAreEqual() {
        Claims claim1 = new Claims(1,"123456", "Homer", "Simpson", "Mr", "USA","01 Street Name", "City/Town", "ZipCode", "Make", "Model", "ModelYear", "AnimalType", "AnimalBreed", 1, "Property", 5000, "Fire", "Cooking Failure", "Awaiting Assessment", 100.00, "Task","Note", LocalDate.of(2022,01,16));;
        Claims claim2 = new Claims(1,"123456", "Homer", "Simpson", "Mr", "USA","01 Street Name", "City/Town", "ZipCode", "Make", "Model", "ModelYear", "AnimalType", "AnimalBreed", 1, "Property", 5000, "Fire", "Cooking Failure", "Awaiting Assessment", 100.00, "Task","Note", LocalDate.of(2022,01,16));;

        assertEquals(claim1, claim2);
    }
}
