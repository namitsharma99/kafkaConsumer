package com.kafka.consumer.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.consumer.service.ConsumerService;

@RestController
public class ConsumerController {

	@Autowired
	ConsumerService consumerService;

	@GetMapping("/kafkaConsumerStatus")
	public String status() {
		return "kafkaConsumerStatus Up and Running on :: " + new Date();
	}

}
