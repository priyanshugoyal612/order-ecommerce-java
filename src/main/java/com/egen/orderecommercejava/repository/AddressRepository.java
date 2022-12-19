package com.egen.orderecommercejava.repository;

import org.springframework.data.repository.CrudRepository;

import com.egen.orderecommercejava.model.Address;

public interface AddressRepository extends CrudRepository<Address, String> {
}
