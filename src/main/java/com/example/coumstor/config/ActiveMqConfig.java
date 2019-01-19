package com.example.coumstor.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;

@Configuration
public class ActiveMqConfig {

    @Value("${queues}")
    private String queues;

    @Bean
    public Queue queue(){
        return new ActiveMQQueue(queues);
    }

}
