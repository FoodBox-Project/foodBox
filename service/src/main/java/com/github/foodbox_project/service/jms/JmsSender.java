package com.github.foodbox_project.service.jms;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class JmsSender {

    private final JmsTemplate jmsTemplate;
    @Value("${jms.sender.destination}")
    private String destination;

    public void send(Object message) {
        log.info("sending message='{}'", message);
        jmsTemplate.convertAndSend(destination, message);
    }
}
