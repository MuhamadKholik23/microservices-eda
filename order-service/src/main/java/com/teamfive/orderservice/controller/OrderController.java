package com.teamfive.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teamfive.orderservice.model.OrderRequest;
import com.teamfive.orderservice.service.OrderService;

@RestController
@RequestMapping("/api/order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@PostMapping
	public ResponseEntity<Object> submitOrder(@RequestBody OrderRequest request) {
		orderService.submitOrder(request);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
