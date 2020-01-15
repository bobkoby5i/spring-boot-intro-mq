package com.koby5i.inventory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * This is the queue listener class, its receiveMessage() method ios invoked with the
 * message as the parameter.
 */
@Component
public class ProductMessageListener {

    private static final Logger log = LogManager.getLogger(ProductMessageListener.class);

    /**
     * This method is invoked whenever any new message is put in the queue.
     * See  for more details @param message
     */
    public void receiveMessage(Map<String, String> message) {
        log.info("Received <" + message + ">");
        Long itemId = Long.valueOf(message.get("itemId"));
        log.info("Message processed... itemId="+itemId);
    }
}
