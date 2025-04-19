package org.calltoauction.dto.requestdto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class UserSignUpRequest {
    private String username;
    private String email;
    private String password;
}
