package org.acalltoauction.dto.requests;

import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DeleteLotRequest {
    @Size(min = 3,message = "password must have at least 3 characters!")
    @Size(max = 20,message = "lot name must have most 20 characters")
    private String lotName;
}
