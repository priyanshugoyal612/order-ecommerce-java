package com.egen.orderecommercejava.repository;

import org.springframework.data.repository.CrudRepository;

import com.egen.orderecommercejava.model.OrderItem;
import com.egen.orderecommercejava.model.OrderItemPk;

public interface OrderItemRepository extends CrudRepository<OrderItem, OrderItemPk> {
}