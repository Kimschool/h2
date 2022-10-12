package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.entity.Customer;

@RestController
public class CustomerController {

	private CustomerRepository repo;
	
	public CustomerController(CustomerRepository repo) {
		super();
		this.repo = repo;
	}
	
	
	@DeleteMapping("/customer")
	public void deleteCustomer(int id) {
		repo.deleteById(id);
	}

	
	@PostMapping("/customer")
	public Customer postCustomer(Customer customer) {
		return repo.save(customer);
	}


	@PutMapping("/customer")
	public Customer putCustomer(Customer customer) {
		return repo.save(customer);
	}

	@GetMapping("/customer")
	public Customer getCustomer(int id) {
		return repo.findById(id).orElse(null);
	}
	
	@GetMapping("/customer/list")
	public Iterable<Customer> getCustomerList() {
		return repo.findAll();
	}
}
