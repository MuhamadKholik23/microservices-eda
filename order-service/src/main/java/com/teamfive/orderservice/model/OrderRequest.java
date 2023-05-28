package com.teamfive.orderservice.model;

import lombok.Data;

@Data
public class OrderRequest {

	private String skuCode;
	private Integer qty;
}
