package com.example.infy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.infy.dto.CustometDto;
import com.example.infy.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository repo;
	
	public List<CustometDto> fetchCustomers(){
		return repo.fetchCustomer();
		
	}
	

}
