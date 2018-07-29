package com.activeweb.product.config;

import javax.jms.Queue;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jms.core.JmsTemplate;


@Configuration
@PropertySource("classpath:application.properties") // Optional element, default value is this
public class ServiceConfiguration {

	@Bean
	public JmsTemplate getJmsTemplate() {
		return new JmsTemplate(new ActiveMQConnectionFactory());
	}
	
	@Value("${loanapp-req-queue}")
	private String queueName;
	
	@Bean
	public Queue getDestinationQueue() {
		return new ActiveMQQueue(queueName);
	}
	
}
