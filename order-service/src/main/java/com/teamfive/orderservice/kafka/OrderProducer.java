package com.teamfive.orderservice.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.messaging.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.teamfive.basedomains.dto.OrderEvent;

@Service
public class OrderProducer {
  private static final Logger LOGGER = LoggerFactory.getLogger(OrderProducer.class);

  private NewTopic topic;
  private KafkaTemplate<String, OrderEvent> kafkaTemplate;

  public OrderProducer(NewTopic topic, KafkaTemplate<String, OrderEvent> kafkaTemplate) {
  this.topic = topic;
  this.kafkaTemplate = kafkaTemplate;
      }

  public void sendMessage(OrderEvent event, Message<OrderEvent> MessageBuilde){
  LOGGER.info(String.format("Order event => %s", event.toString()));

  //create message
  Message<OrderEvent> message = MessageBuilder
  .withPayload(event)
  .setHeader(KafkaHeaders.TOPIC, topic.name())
  .build();
  kafkaTemplate.send(message);

  }


}
