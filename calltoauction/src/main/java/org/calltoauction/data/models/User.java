package org.calltoauction.data.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "users")
@Data
@NoArgsConstructor
public class User {
@Id
 private String id ;
 private String username;
 private String password;
 private String firstname;
 private String lastname;
 private String email;
 private String phone;
 private String dateOfBirth;
 private Address address;



}
