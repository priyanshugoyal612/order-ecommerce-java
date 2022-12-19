package com.egen.orderecommercejava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.egen.orderecommercejava.dto.OrderCreatedResponse;
import com.egen.orderecommercejava.dto.OrderDto;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api/v1")
public interface OrderControllerRestInterface {
	
	
	
	@PostMapping("/orders")
	@Operation(summary = "Create an order", description = "Create an order")
	OrderCreatedResponse createOrder(@RequestBody  OrderDto orderDto);
	
	
	@GetMapping("/orders/{orderId}")
	OrderDto findOrderBy(@PathVariable(name = "orderId")  String orderId);
	
	@PatchMapping("/orders/{orderId}")
	void updateOrderStatus(@PathVariable("orderId") String orderId, @RequestParam(name = "orderStatus")  String orderStatus);

}