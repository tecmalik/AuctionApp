package org.acalltoauction.dto.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LotStatusRequest {
    @Size(min = 3,message = "Lot Name must have at least 3 characters!")
    @Size(max = 20,message = "Lot Name must have most 20 characters")
    @NotBlank(message = "filed can not be blank ")
    private String lotName;
}
