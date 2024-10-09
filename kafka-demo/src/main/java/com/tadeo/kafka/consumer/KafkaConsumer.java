package com.tadeo.kafka.consumer;


import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "tadeo", groupId = "myGroup")
    public void consumeMessage(String message) {
        log.info(String.format("#### -> Consumed message from tadeo Topic -> %s", message));
    }
}
