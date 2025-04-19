package org.calltoauction.data.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
public class Address {
    private String street;
    private String city;
    private String state;
    private String postalCode;
    private String country;



}
