package com.sgasecurity.messaging_service.producer;

import com.sgasecurity.messaging_service.DTO.SafaricomRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String topic, String message) {
        kafkaTemplate.send(topic, message);
    }

//    public void mpesaProducer(String topic, SafaricomRequestDTO message) {
//        kafkaTemplate.send(topic, message);
//    }
}
