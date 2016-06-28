package com.example;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Customer;
import com.example.domain.CustomerService;

@RestController
public class IndexController {

	@Inject
	CustomerService service;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Customer> index() {
		return service.selectAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Customer id(@PathVariable int id) {
		return service.selectById(id);
	}

}
