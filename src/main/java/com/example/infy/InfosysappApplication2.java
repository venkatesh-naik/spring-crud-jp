package com.example.infy;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;

import com.example.infy.dto.CustometDto;
import com.example.infy.service.CustomerService;

@SpringBootApplication
public class InfosysappApplication2 {

	public static void main(String[] args) {
		AbstractApplicationContext context = (AbstractApplicationContext) SpringApplication
				.run(InfosysappApplication2.class, args);
		CustomerService service = context.getBean("customerService", CustomerService.class);
		List<CustometDto> customers = service.fetchCustomers();
		customers.forEach(e -> System.out.println(e.getCustName()));

	}

}
