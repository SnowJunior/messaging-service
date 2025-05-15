package com.sgasecurity.messaging_service.controller;

import com.sgasecurity.messaging_service.producer.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    private MessageProducer producer;


    @PostMapping(path = "/send")
    public String sendMessage(@RequestBody String message) {
        producer.sendMessage("transactions", message);
        return "Sent message: " + message;
    }
}
