package com.sgasecurity.messaging_service.DTO;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class SafaricomRequestDTO {

    private String topic;
    private String merchantRequestId;
    private String checkoutRequestId;
    private String amount;
}
