package com.teamfive.basedomains.dto;

import lombok.Data;

@Data
public class Order {

  private String orderId;
  private String name;
  private int tqy;
  private double price;
  
}
