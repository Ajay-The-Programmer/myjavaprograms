package com.nobel.spring.aop.service;

public class AccountService {
	
	
	public void validateCart(int cardNo) {
		
		if(cardNo==1324) {
			System.out.println("Card is valid......");
			
		}else {
			System.out.println("Invalid card.......");
		}
		
		
	}

}
