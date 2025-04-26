package org.acalltoauction.dto.requests;

import lombok.Getter;
import lombok.Setter;
import org.acalltoauction.data.models.Lot;

@Getter
@Setter
public class CreateAuctionRequest {
    private String Title;
    private String description;
    private String startingBid;
    private Lot lot ;
    private String Date;

}
