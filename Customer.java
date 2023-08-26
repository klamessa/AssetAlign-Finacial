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
    }


