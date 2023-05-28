package com.teamfive.productservice.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "t_product")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Product{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String skuCode;

  @Column(nullable = false)
  private String name;
  
  @Column(nullable = false)
  private String description;
  
  @Column(nullable = false)
  private BigDecimal price;
}
