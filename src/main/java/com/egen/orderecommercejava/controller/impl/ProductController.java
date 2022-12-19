package com.egen.orderecommercejava.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.egen.orderecommercejava.controller.ProductControllerRestInterface;
import com.egen.orderecommercejava.dto.ProductDto;
import com.egen.orderecommercejava.service.ProductService;

public class ProductController implements ProductControllerRestInterface {
	@Autowired
	private ProductService productService;

	@Override
	public ResponseEntity<ProductDto> createOrder(ProductDto productDto) {
		return new ResponseEntity<>(productService.createProduct(productDto), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ProductDto> getProduct(String productId) {
		return new ResponseEntity<>(productService.getProduct(productId), HttpStatus.OK);
	}

}