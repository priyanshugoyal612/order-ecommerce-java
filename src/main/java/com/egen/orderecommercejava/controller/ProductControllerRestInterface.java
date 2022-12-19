package com.egen.orderecommercejava.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.egen.orderecommercejava.dto.ProductDto;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping({ "/api/v1" })
public interface ProductControllerRestInterface {

	@PostMapping({ "/products" })
	@Operation(summary = "Create a product", description = "Create a product")
	public ResponseEntity<ProductDto> createOrder(@RequestBody ProductDto productDto);

	@GetMapping({ "/products/{productId}" })
	@Operation(summary = "Get a product", description = "Get a product")
	public ResponseEntity<ProductDto> getProduct(@PathVariable(name = "productId") String productId);

}