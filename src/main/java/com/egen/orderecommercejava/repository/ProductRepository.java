package com.egen.orderecommercejava.repository;

import org.springframework.data.repository.CrudRepository;

import com.egen.orderecommercejava.model.Product;

public interface ProductRepository extends CrudRepository<Product, String> {
}