package org.acalltoauction.dto.response;

import lombok.Getter;
import lombok.Setter;
import org.acalltoauction.data.models.LotStatus;
@Getter
@Setter
public class LotStatusResponse {
    private LotStatus status;
}
