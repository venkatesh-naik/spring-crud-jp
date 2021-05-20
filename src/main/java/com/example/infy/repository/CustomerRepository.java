package com.example.infy.repository;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.example.infy.dto.CustometDto;


@Component
public class CustomerRepository {
	
	List<CustometDto>customers=new ArrayList<>();
	
	@PostConstruct
	public void initialize() {
		CustometDto  customer=new CustometDto();
		customer.setCustId(1);
		customer.setCustName("venk");
		
		CustometDto  customer1=new CustometDto();
		customer.setCustId(2);
		customer.setCustName("naik");
		
		CustometDto  customer3=new CustometDto();
		customer.setCustId(3);
		customer.setCustName("Rajesh");
		
		customers.add(customer);
		customers.add(customer1);
		customers.add(customer3);
		
	}
	public List<CustometDto>fetchCustomer(){
			return customers;
	}
	

}
