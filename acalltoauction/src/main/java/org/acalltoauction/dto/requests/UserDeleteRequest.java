package org.acalltoauction.dto.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDeleteRequest {
    private String email;
    public String password;
}
