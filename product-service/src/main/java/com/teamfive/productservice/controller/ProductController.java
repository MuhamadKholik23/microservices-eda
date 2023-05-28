package com.teamfive.productservice.controller;
import com.teamfive.productservice.model.Product;
import com.teamfive.productservice.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
  
  @Autowired
  ProductRepository productRepo ;

  @GetMapping
  @RequestMapping("/welcome")
  public String welcome (){
    return "welcome";
  }


  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  @RequestMapping("/listAll")
  public List<Product> findAll(){
    return productRepo.findAll();
  }

  @PostMapping("/create")
	public ResponseEntity<Object> create(@Valid @RequestBody Product body){
      productRepo.save(body);
			ResponseEntity<Object> result = respon(HttpStatus.ACCEPTED, 202, "add Watch Employee Success", body);
			return result;

	}



	//Response entity
	public ResponseEntity<Object> respon(HttpStatus status, int code, String message, Object data){
		Map<String, Object> map = new HashMap<String, Object>();

		 map.put("message", message); 
		 map.put("data", data);
		 map.put("status", code);
		 return new ResponseEntity<Object>(map, status);

	}
  
}
