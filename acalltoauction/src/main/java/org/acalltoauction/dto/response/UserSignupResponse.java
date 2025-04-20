package org.acalltoauction.dto.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserSignupResponse {
    private String token;
    private String message;
}
