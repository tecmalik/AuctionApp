package org.acalltoauction.dto.requests;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDeleteRequest {
    @Valid
    @Email(message = "Valid Email Required")
    private String email;
    @Size(min = 3,message = "password must have at least 3 characters!")
    @Size(max = 20,message = "password must have most 20 characters")
    public String password;
}
