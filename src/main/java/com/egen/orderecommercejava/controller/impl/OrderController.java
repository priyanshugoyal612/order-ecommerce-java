package com.egen.orderecommercejava.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.egen.orderecommercejava.controller.OrderControllerRestInterface;
import com.egen.orderecommercejava.dto.OrderCreatedResponse;
import com.egen.orderecommercejava.dto.OrderDto;
import com.egen.orderecommercejava.service.OrderService;

public class OrderController implements OrderControllerRestInterface {

	@Autowired
	private OrderService orderService;

	@Override
	public OrderCreatedResponse createOrder(OrderDto orderDto) {
		return orderService.createOrder(orderDto);
	}

	@Override
	public OrderDto findOrderBy(String orderId) {
		return orderService.findOrderById(orderId);
	}

	@Override
	public void updateOrderStatus(String orderId, String orderStatus) {
		orderService.updateOrderStatus(orderId, orderStatus);
	}

}