package com.kafka.consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

	@KafkaListener(topics = "KAFKA_TEST")
	public void listen(@Payload String message) {
		System.out.println("Message received :::: " + message);
	}

}
