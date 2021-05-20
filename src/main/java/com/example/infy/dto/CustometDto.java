package com.example.infy.dto;

import org.springframework.stereotype.Component;

@Component
public class CustometDto {
	private int custId;
	private String custName;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	

}
