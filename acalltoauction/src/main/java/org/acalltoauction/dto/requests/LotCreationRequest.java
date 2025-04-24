package org.acalltoauction.dto.requests;

import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
public class LotCreationRequest {
    @Size(min = 3,message = "lot name must have at least 3 characters!")
    @Size(max = 20,message = "lot name must have most 20 characters")
    private String lotName;
    @Size(min = 60,message = "description must have at least 60 characters!")
    @Size(max = 150,message = "password must have most 150 characters")
    private String description;
    @Size(min = 3,message = "image url must have at least 3 characters!")
    @Size(max = 20,message = "image url must have most 20 characters")
    private String imageUrl;

}
