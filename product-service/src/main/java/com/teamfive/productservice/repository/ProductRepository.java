package com.teamfive.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teamfive.productservice.model.Product;

@Repository("ProductRepository")
public interface ProductRepository extends JpaRepository<Product, Long>{
  
}

