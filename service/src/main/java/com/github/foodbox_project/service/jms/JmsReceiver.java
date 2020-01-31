package com.github.foodbox_project.service.jms;

import com.github.foodbox_project.dto.ItemDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class JmsReceiver { // todo just for test. Move this class to the Notification server

    @JmsListener(destination = "${jms.receiver.destination}")
    public void receive(@Payload ItemDto message) {
        log.info("received message = '{}'", message);
    }
}
