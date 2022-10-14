package com.aop.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aop.demo.service.ShoppingCart;

public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
    	
    			ShoppingCart cart =		context.getBean(ShoppingCart.class);
    
    				cart.addProduct("Mobile");
    				
    				cart.checkout();
    				
    				cart.bookingStatus();
    			
    }
}
