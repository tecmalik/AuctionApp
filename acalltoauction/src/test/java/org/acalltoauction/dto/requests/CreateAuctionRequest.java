package org.acalltoauction.dto.requests;

import lombok.Getter;
import lombok.Setter;
import org.acalltoauction.data.models.Lot;

import java.util.Date;

@Getter
@Setter
public class CreateAuctionRequest {
    private String Title;
    private String description;
    private String startingBid;
    private String date;
    private String time;
    private String duration;

}
