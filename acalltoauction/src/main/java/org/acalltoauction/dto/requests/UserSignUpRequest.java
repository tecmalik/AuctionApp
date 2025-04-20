package org.acalltoauction.dto.requests;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserSignUpRequest {
    private String email;
    private String password;
    private String nin;
}