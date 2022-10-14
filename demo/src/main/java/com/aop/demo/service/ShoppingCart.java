package com.aop.demo.service;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
	
	
		public void  addProduct(String productName) {  // services or Join Point
			
			//logging
			//authen , authorization
			
			System.out.println("product added successfully "+productName);
		}
		
		public void checkout() {
			
				System.out.println("checkout success , checkout() is called...");
			
		}
	
		
		public String  bookingStatus() {
			
			
			return "Booking Success";
			
			
		}
		
		
	

}
