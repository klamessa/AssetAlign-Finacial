package com.example.demo.customer;

import java.time.LocalDate;


public class Customer {
    private String firstName;
    private String lastName;
    private String middleName;
    private String phoneNumber;
    private String email;
    private String username;
    private String password;
    private String accountNumber;
    private String SSN;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String aptNumber;
    private LocalDate dateOfBirth;
    private String gender;
    private String martialStatus;


    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", SSN='" + SSN + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", gender='" + gender + '\'' +
                ", aptNumber='" + aptNumber + '\'' +
                ", dateOfBirth=" + dateOfBirth + '\'' +
                ", martialStatus=" + martialStatus+
                '}';
    }

    
    public Customer(String firstName,
                    String lastName,
                    String middleName,
                    LocalDate dateOfBirth,
                    String SSN,
                    String phoneNumber,
                    String email,
                    String username,
                    String password,
                    String street,
                    String city,
                    String state,
                    String zipCode,
                    String aptNumber,
                    String gender,
                    String martialStatus) {

                    this.firstName = firstName;
                    this.lastName = lastName;
                    this.middleName = middleName;
                    this.dateOfBirth = dateOfBirth;
                    this.SSN = SSN;
                    this.phoneNumber = phoneNumber;
                    this.email = email;
                    this.username = username;
                    this.password = password;
                    this.street = street;
                    this.city = city;
                    this.state = state;
                    this.zipCode = zipCode;
                    this.aptNumber = aptNumber;
                    this.gender = gender;
                    this.martialStatus = martialStatus;
    }
    public String getMartialStatus() {
        return martialStatus;
    }

    public void setMartialStatus(String martialStatus) {
        this.martialStatus = martialStatus;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStreet() {
        return street;
    }
     public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getAptNumber() {
        return aptNumber;
    }

    public void setAptNumber(String aptNumber) {
        this.aptNumber = aptNumber;
    }

   



