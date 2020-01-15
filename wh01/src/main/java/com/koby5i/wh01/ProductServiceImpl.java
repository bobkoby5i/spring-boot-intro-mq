package com.koby5i.wh01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    private static final Logger log = LoggerFactory.getLogger(ProductServiceImpl.class);

    private RabbitTemplate rabbitTemplate;

    @Autowired
    public ProductServiceImpl(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }



    @Override
    public void sendProductMessage(String itemId) {
        Map<String, String> actionmap = new HashMap<>();
        actionmap.put("itemId", itemId);
        log.info("Sending the index request through queue message itemId:" + itemId );
        rabbitTemplate.convertAndSend(Wh01Application.MY_MESSAGE_QUEUE, actionmap);
    }
}
