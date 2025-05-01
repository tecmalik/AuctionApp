package org.acalltoauction.dto.requests;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import org.acalltoauction.data.models.Duration;

import java.util.Date;

@Getter
@Setter
public class AuctionRequest {
    @NotBlank (message = "Title required")
    private String Title;
    @NotBlank(message="starting Bid Price Is required")
    private String startingBidPrice;
    @NotBlank(message = "date is required")
    @JsonFormat(pattern = "yyyy-mm-dd")
    private String date;
    @NotBlank(message = "time required")
    private String time;
    @NotBlank(message = "duration required")
    private Duration duration;
    @NotBlank(message = "lotName required")
    private String lotName;
    @NotBlank(message = "auctionDate required")
    private Date auctionDate;


}
