package com.egen.orderecommercejava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.egen.orderecommercejava.dto.OrderCreatedResponse;
import com.egen.orderecommercejava.dto.OrderDto;
import com.egen.orderecommercejava.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	/*
	 * @Autowired private OrderDetailsMapper orderDetailsMapper;
	 * 
	 * @Autowired private OrderItemRepository orderItemRepository;
	 */
	public OrderCreatedResponse createOrder(OrderDto orderDto) {
		// TODO Auto-generated method stub
		return null;
	}

	public OrderDto findOrderById(String orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateOrderStatus(String orderId, String orderStatus) {
		// TODO Auto-generated method stub

	}

}
