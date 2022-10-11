package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
