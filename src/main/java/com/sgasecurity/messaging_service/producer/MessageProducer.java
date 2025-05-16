package com.sgasecurity.messaging_service.producer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sgasecurity.messaging_service.DTO.SafaricomRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {

    @Autowired
    private KafkaTemplate<String, SafaricomRequestDTO> kafkaTemplate;

    public void sendMessage(String topic, SafaricomRequestDTO message) throws JsonProcessingException {

        kafkaTemplate.send(topic, message);
    }
}
