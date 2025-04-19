package org.calltoauction.data.models;

import lombok.Data;

import java.time.LocalDate;


@Data
public class User {


 private String id;
 private String username;
 private String password;
 private String firstname;
 private String lastname;
 private String email;
 private String phone;
 public LocalDate dateOfBirth;
 private Address address;

}
