package com.sgasecurity.messaging_service.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sgasecurity.messaging_service.DTO.SafaricomRequestDTO;
import com.sgasecurity.messaging_service.producer.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class KafkaController {

    @Autowired
    private MessageProducer producer;

    @PostMapping(path = "/mpesa")
    public ResponseEntity<?> createMpesaEvent(@RequestBody SafaricomRequestDTO request) throws JsonProcessingException {
        producer.sendMessage(request.getTopic(), request);

        return ResponseEntity.status(HttpStatus.CREATED).body(request);
    }
}
