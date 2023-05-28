package com.teamfive.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teamfive.orderservice.model.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, String> {

}
