package com.teamfive.inventoryservice.model;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "t_inventory")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String skuCode;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer stock;
}
