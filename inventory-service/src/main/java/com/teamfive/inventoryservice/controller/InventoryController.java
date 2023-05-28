package com.teamfive.inventoryservice.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.teamfive.inventoryservice.model.Inventory;
import com.teamfive.inventoryservice.repository.InventoryRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor

public class InventoryController {

    private final InventoryRepository inventoryRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Inventory> findAll() {
        return inventoryRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody Inventory inventory) {
        inventoryRepository.save(inventory);
    }

}
