package com.github.foodbox_project.service.jms;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class JmsReceiver { // todo just for test. Move this class to the Notification server

    @JmsListener(destination = "${jms.receiver.destination}")
    public void receive(String message) {
        log.debug("received message = '{}'", message);
    }
}
