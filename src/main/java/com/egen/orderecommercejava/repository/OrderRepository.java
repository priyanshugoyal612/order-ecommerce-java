package com.egen.orderecommercejava.repository;

import org.springframework.data.repository.CrudRepository;

import com.egen.orderecommercejava.model.Order;

public interface OrderRepository extends CrudRepository<Order, String>{

}
