package org.calltoauction.dto.requests;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UserSignUpRequest {
    private String username;
    private String email;
    private String password;
}