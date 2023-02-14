package com.allstate.quickclaimsserver.domain;

import javax.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "ClaimsTransactions")
public class Claims {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="order_id")
    private String orderId;
    private String firstName;
    private String surname;
    private String title;
    private String country;
    private String streetName;
    private String city;
    private String zipCode;
    private String make;
    private String model;
    private String modelYear;
    private String animalType;
    private String animalBreed;
    private Integer policyNum;
    private String insuranceType;
    private Integer claimEstimate;
    private String claimReason;
    private String claimDescription;
    private String claimStatus;
    private Double payout;
    private String task;
    private String note;
    private LocalDate date;

    public Claims(Integer id, String orderId, String firstName, String surname, String title, String country, String streetName, String city, String zipCode, String make, String model, String modelYear, String animalType, String animalBreed, Integer policyNum, String insuranceType, Integer claimEstimate, String claimReason, String claimDescription, String claimStatus, Double payout, String task, String note, LocalDate date) {
        this.id = id;
        this.orderId = orderId;
        this.firstName = firstName;
        this.surname = surname;
        this.title = title;
        this.country = country;
        this.streetName = streetName;
        this.city = city;
        this.zipCode = zipCode;
        this.make = make;
        this.model = model;
        this.modelYear = modelYear;
        this.animalType = animalType;
        this.animalBreed = animalBreed;
        this.policyNum = policyNum;
        this.insuranceType = insuranceType;
        this.claimEstimate = claimEstimate;
        this.claimReason = claimReason;
        this.claimDescription = claimDescription;
        this.claimStatus = claimStatus;
        this.payout = payout;
        this.task = task;
        this.note = note;
        this.date = date;
    }

    public Claims() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModelYear() {
        return modelYear;
    }

    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getAnimalBreed() {
        return animalBreed;
    }

    public void setAnimalBreed(String animalBreed) {
        this.animalBreed = animalBreed;
    }

    public Integer getPolicyNum() {
        return policyNum;
    }

    public void setPolicyNum(Integer policyNum) {
        this.policyNum = policyNum;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public Integer getClaimEstimate() {
        return claimEstimate;
    }

    public void setClaimEstimate(Integer claimEstimate) {
        this.claimEstimate = claimEstimate;
    }

    public String getClaimReason() {
        return claimReason;
    }

    public void setClaimReason(String claimReason) {
        this.claimReason = claimReason;
    }

    public String getClaimDescription() {
        return claimDescription;
    }

    public void setClaimDescription(String claimDescription) {
        this.claimDescription = claimDescription;
    }

    public String getClaimStatus() {
        return claimStatus;
    }

    public void setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
    }

    public Double getPayout() {
        return payout;
    }

    public void setPayout(Double payout) {
        this.payout = payout;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Claims claims = (Claims) o;
        return Objects.equals(id, claims.id) && Objects.equals(orderId, claims.orderId) && Objects.equals(firstName, claims.firstName) && Objects.equals(surname, claims.surname) && Objects.equals(title, claims.title) && Objects.equals(country, claims.country) && Objects.equals(streetName, claims.streetName) && Objects.equals(city, claims.city) && Objects.equals(zipCode, claims.zipCode) && Objects.equals(make, claims.make) && Objects.equals(model, claims.model) && Objects.equals(modelYear, claims.modelYear) && Objects.equals(animalType, claims.animalType) && Objects.equals(animalBreed, claims.animalBreed) && Objects.equals(policyNum, claims.policyNum) && Objects.equals(insuranceType, claims.insuranceType) && Objects.equals(claimEstimate, claims.claimEstimate) && Objects.equals(claimReason, claims.claimReason) && Objects.equals(claimDescription, claims.claimDescription) && Objects.equals(claimStatus, claims.claimStatus) && Objects.equals(payout, claims.payout) && Objects.equals(task, claims.task) && Objects.equals(note, claims.note) && Objects.equals(date, claims.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderId, firstName, surname, title, country, streetName, city, zipCode, make, model, modelYear, animalType, animalBreed, policyNum, insuranceType, claimEstimate, claimReason, claimDescription, claimStatus, payout, task, note, date);
    }

    @Override
    public String toString() {
        return "Claims{" +
                "id=" + id +
                ", orderId='" + orderId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", title='" + title + '\'' +
                ", country='" + country + '\'' +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", modelYear='" + modelYear + '\'' +
                ", animalType='" + animalType + '\'' +
                ", animalBreed='" + animalBreed + '\'' +
                ", policyNum=" + policyNum +
                ", insuranceType='" + insuranceType + '\'' +
                ", claimEstimate=" + claimEstimate +
                ", claimReason='" + claimReason + '\'' +
                ", claimDescription='" + claimDescription + '\'' +
                ", claimStatus='" + claimStatus + '\'' +
                ", payout=" + payout +
                ", task='" + task + '\'' +
                ", note='" + note + '\'' +
                ", date=" + date +
                '}';
    }
}
