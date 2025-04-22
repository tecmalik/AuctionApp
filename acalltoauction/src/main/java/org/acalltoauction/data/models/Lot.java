package org.acalltoauction.data.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "lots")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lot {
    @Id
    private String id;
    @DBRef
    private User consignor;
    private String name;
    private String description;
    private String imageUrl;
    private LotStatus lotStatus;

}