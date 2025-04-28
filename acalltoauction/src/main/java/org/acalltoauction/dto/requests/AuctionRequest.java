package org.acalltoauction.dto.requests;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AuctionRequest {
    private String Title;
    private String startingBidPrice;
    @JsonFormat(pattern = "yyyy-mm-dd")
    private String date;
    private String time;
    private String duration;
    private String lot;
    private Date auctionDate;


}
