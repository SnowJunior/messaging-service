package com.sgasecurity.messaging_service.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @KafkaListener(topics = "transactions", groupId = "omni-id")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}
