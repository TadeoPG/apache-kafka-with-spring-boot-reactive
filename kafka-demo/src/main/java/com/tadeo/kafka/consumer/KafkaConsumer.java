package com.tadeo.kafka.consumer;


import com.tadeo.kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@KafkaListener(topics = "tadeo", groupId = "myGroup")
public class KafkaConsumer {

    @KafkaHandler
    public void consumeMessage(String message) {
        log.info(String.format("#### -> Consumed string message from tadeo Topic -> %s", message));
    }

    @KafkaHandler
    public void consumeJsonMessage(Student student) {
        log.info(String.format("#### -> Consumed Student message from tadeo Topic -> %s", student));
    }
}
