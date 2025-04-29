package org.acalltoauction.data.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
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
    private User user;
    private String lotName;
    private String description;
    private String imageUrl;
    private LotStatus lotStatus;

}