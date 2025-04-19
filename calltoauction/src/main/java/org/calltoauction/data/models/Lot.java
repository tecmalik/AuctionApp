package org.calltoauction.data.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "lots")
@Data
@NoArgsConstructor
public class Lot {
    @Id
    private String id;
    private String userID;
    private String name;
    private String description;

}
