package com.teamfive.inventoryservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teamfive.inventoryservice.model.Inventory;

@Repository("InventoryRepository")

public interface InventoryRepository extends JpaRepository<Inventory, Integer> {

}
