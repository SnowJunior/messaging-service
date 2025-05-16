package com.sgasecurity.messaging_service.DTO;

import lombok.*;

@Getter
@Setter
public class SafaricomRequestDTO {
    public SafaricomRequestDTO(String topic, String merchantRequestId, String checkoutRequestId, String amount) {
        this.topic = topic;
        this.merchantRequestId = merchantRequestId;
        this.checkoutRequestId = checkoutRequestId;
        this.amount = amount;
    }

    private String topic;
    private String merchantRequestId;
    private String checkoutRequestId;
    private String amount;
}
