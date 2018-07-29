package com.activeweb.product.service;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.activeweb.product.beans.LoanApplication;

@Component
public class ApplicationDataPublishingService {

	@Autowired
	private JmsTemplate jmsTemplate;

	@Autowired
	private Queue processingQueue;
	
	public void publish(LoanApplication application) {
		jmsTemplate.convertAndSend(processingQueue, "Hello");
	}

}
