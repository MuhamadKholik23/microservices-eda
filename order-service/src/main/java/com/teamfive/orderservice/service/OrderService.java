package com.teamfive.orderservice.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamfive.orderservice.model.OrderRequest;
import com.teamfive.orderservice.model.Transaction;
import com.teamfive.orderservice.repository.TransactionRepository;

@Service
public class OrderService {
	
	@Autowired
	private TransactionRepository trxRepository;

	public void submitOrder(OrderRequest request) {

		Transaction trx = new Transaction();
		trx.setCreatedDate(new Date());
		trx.setQty(request.getQty());
		trx.setSkuCode(request.getSkuCode());
		trxRepository.save(trx);
	}
}
