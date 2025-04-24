package org.acalltoauction.dto.requests;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserLoginRequest {
    @Email(message = "Enter a valid email")
    private String email;
    @Size(min = 3,message = "password must have at least 3 characters!")
    @Size(max = 20,message = "password must have most 20 characters")
    private String password;
}
