package org.calltoauction.dto.responses;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserSIgnUpResponse {
    private String token;
    private String message;
}
