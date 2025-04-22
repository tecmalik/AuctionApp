package org.acalltoauction.data.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
@Data
@Getter
@Setter
@Document(collection = "auction")
public class Auction {
    @Id
    private String id;
    DBRef userRef;
    private User user;
    private BigDecimal StartingBid;
    private String description;
    private String title;
    private AuctionStatus auctionStatus;
    DBRef lotRef;
    private Lot Lot;
    private BigDecimal currentBidPrice;
}
