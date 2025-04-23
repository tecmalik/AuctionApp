package org.acalltoauction.dto.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
public class LotCreationRequest {
    private String lotName;
    private String description;
    private String imageUrl;

}
