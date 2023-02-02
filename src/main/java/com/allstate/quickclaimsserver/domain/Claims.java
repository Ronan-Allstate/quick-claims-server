package com.allstate.quickclaimsserver.domain;

import javax.persistence.*;
import java.util.Date;
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
    private int policyNum;
    private String insuranceType;
    private int claimEstimate;
    private String claimReason;
    private String claimDescription;
    private boolean claimStatus;
    private Date date;

    public Claims(Integer id, String orderId, String firstName, String surname, String title, String country, String streetName, String city, String zipCode, int policyNum, String insuranceType, int claimEstimate, String claimReason, String claimDescription, boolean claimStatus, Date date) {
        this.id = id;
        this.orderId = orderId;
        this.firstName = firstName;
        this.surname = surname;
        this.title = title;
        this.country = country;
        this.streetName = streetName;
        this.city = city;
        this.zipCode = zipCode;
        this.policyNum = policyNum;
        this.insuranceType = insuranceType;
        this.claimEstimate = claimEstimate;
        this.claimReason = claimReason;
        this.claimDescription = claimDescription;
        this.claimStatus = claimStatus;
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

    public int getPolicyNum() {
        return policyNum;
    }

    public void setPolicyNum(int policyNum) {
        this.policyNum = policyNum;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public int getClaimEstimate() {
        return claimEstimate;
    }

    public void setClaimEstimate(int claimEstimate) {
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

    public boolean isClaimStatus() {
        return claimStatus;
    }

    public void setClaimStatus(boolean claimStatus) {
        this.claimStatus = claimStatus;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Claims claims = (Claims) o;
        return policyNum == claims.policyNum && claimEstimate == claims.claimEstimate && claimStatus == claims.claimStatus && Objects.equals(id, claims.id) && Objects.equals(orderId, claims.orderId) && Objects.equals(firstName, claims.firstName) && Objects.equals(surname, claims.surname) && Objects.equals(title, claims.title) && Objects.equals(country, claims.country) && Objects.equals(streetName, claims.streetName) && Objects.equals(city, claims.city) && Objects.equals(zipCode, claims.zipCode) && Objects.equals(insuranceType, claims.insuranceType) && Objects.equals(claimReason, claims.claimReason) && Objects.equals(claimDescription, claims.claimDescription) && Objects.equals(date, claims.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderId, firstName, surname, title, country, streetName, city, zipCode, policyNum, insuranceType, claimEstimate, claimReason, claimDescription, claimStatus, date);
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
                ", policyNum=" + policyNum +
                ", insuranceType='" + insuranceType + '\'' +
                ", claimEstimate=" + claimEstimate +
                ", claimReason='" + claimReason + '\'' +
                ", claimDescription='" + claimDescription + '\'' +
                ", claimStatus=" + claimStatus +
                ", date=" + date +
                '}';
    }
}
