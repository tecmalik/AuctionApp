package org.calltoauction.data.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
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
