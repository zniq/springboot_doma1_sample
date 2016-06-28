package com.example.domain;

import java.util.List;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

@Named
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;

	public List<Customer> selectAll() {
		return customerRepository.selectAll();
	}

	public Customer selectById(int id) {
		return customerRepository.selectById(id);
	}

}
