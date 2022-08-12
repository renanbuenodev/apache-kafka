package com.renan.strproducer.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Log4j2
@RequiredArgsConstructor
@Service
public class StringProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        log.info("Send message {}", message);
            kafkaTemplate.send("str-topic", message);
//                    .addCallback(
//                    success -> {
//                        if(success != null) {
//                            log.info("Send message successful {}", message);
//                            log.info("Partition {}, Offset {}",
//                                    success.getRecordMetadata().partition(),
//                                    success.getRecordMetadata().offset());
//                        }
//                    },
//                    error -> log.info("Error sending message")
//            );
    }
}
