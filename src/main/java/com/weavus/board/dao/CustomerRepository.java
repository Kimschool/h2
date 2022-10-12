package com.weavus.board.dao;

import org.springframework.data.repository.CrudRepository;

import com.weavus.board.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
