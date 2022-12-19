package com.egen.orderecommercejava.repository;

import org.springframework.data.repository.CrudRepository;

import com.egen.orderecommercejava.model.Payment;

public interface PaymentRepository extends CrudRepository<Payment, String> {
}