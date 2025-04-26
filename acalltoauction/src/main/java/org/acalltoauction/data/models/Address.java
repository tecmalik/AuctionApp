package org.acalltoauction.data.models;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@NoArgsConstructor
public class Address {

    private String street;
    private String city;
    private String state;
    private String postalCode;
    private String country;

}