package com.example.coumstor.coumoster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import java.util.Queue;

@Component
public class Coumoster {
   @JmsListener( destination = "${queues}")
    public void getMessage(String message){
        System.out.println(message);
    }
}
