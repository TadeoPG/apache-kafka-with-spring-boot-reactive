package org.tadeo.wikimedia.consumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@KafkaListener(topics = "wikimedia-stream", groupId = "myGroup")
public class WikimediaConsumer {

    @KafkaHandler
    public void consumeMessage(String message) {
        log.info(String.format("#### -> Consumed string message from wikimedia-stream Topic -> %s", message));
    }
}
