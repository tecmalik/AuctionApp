package org.acalltoauction.data.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Data
@Getter
@Setter
@Document(collection = "auction")
public class Auction {
    @Id
    private String id;
    private BigDecimal StartingBid;
    private String title;
    private Duration duration;
    private AuctionStatus auctionStatus;
    private String lotName;
    private String userId;
    private Date auctionDate;
    private LocalDate auctionStarTime;
    private LocalDate auctionEndTime;
    private BigDecimal currentBidPrice;

}
