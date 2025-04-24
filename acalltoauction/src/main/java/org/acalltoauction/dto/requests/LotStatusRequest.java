package org.acalltoauction.dto.requests;

import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LotStatusRequest {
    @Size(min = 3,message = "Lot Name must have at least 3 characters!")
    @Size(max = 20,message = "Lot Name must have most 20 characters")
    private String lotName;
}
