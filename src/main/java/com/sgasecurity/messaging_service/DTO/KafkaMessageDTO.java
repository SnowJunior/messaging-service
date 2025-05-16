package com.sgasecurity.messaging_service.DTO;

import lombok.*;

@Getter
@Setter
public class KafkaMessageDTO {
    public KafkaMessageDTO(String topic, String message) {
        this.topic = topic;
        this.message = message;
    }

    private String topic;
    private String message;
}
