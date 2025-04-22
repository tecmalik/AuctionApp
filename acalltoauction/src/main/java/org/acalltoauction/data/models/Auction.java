package org.acalltoauction.data.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.math.BigDecimal;
@Data
@Getter
@Setter
public class Auction {
    private BigDecimal price;
    private AuctionStatus auctionStatus;
    DBRef auctionRef;
    private Lot Lot;
}
