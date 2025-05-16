package com.sgasecurity.messaging_service.consumer;

import com.sgasecurity.messaging_service.DTO.SafaricomRequestDTO;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @KafkaListener(topics = "transactions", groupId = "omni-id")
    public void receiveMessage(SafaricomRequestDTO message) {
        System.out.println("Received message: " + message);
    }
}
