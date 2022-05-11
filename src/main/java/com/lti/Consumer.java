package com.lti;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
	
	@KafkaListener(groupId = "five", topics = "five")
	public void processMessage(String content, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition) {
		System.out.println("Partition: " + partition);
		
		System.out.println("Message Received 1: " + content);
	}
}