package org.acalltoauction.dto.requests;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserSignUpRequest {
    @Email(message = "enter a valid email")
    private String email;
    @Size(min = 3,message = "password must have at least 3 characters!")
    @Size(max = 20,message = "password must have most 20 characters")
    private String password;
    @Size(min = 11,max=11, message="input a valid national identification number ")
    private String nin;
}