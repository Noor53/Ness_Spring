package com.ness.calsi.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorServiceTest {

	private static CalculatorService service;
	
	@BeforeAll
	public static void beforeAll() {

		System.out.println("Before All method() called..");

		service = new CalculatorService();
		
	}

	@BeforeEach
	public void before() {
		
		System.out.println("before each called...");
		
	}
	
	@AfterEach
	public void after() {
		
		System.out.println("after each called...");
		
	}
	
	
	
	@Test
	@DisplayName("add test")
	void testAdd() {
		
		System.out.println("add() tested..");

	int actual =	service.add(4, 3);
	
		System.out.println("actual value "+actual);
	
		assertEquals(7, actual);
		
		
	}

	@Test
	@DisplayName("sub testing")
	void testSub() {
		
		System.out.println("sub() tested...");
		
		int actual = service.sub(12,6); //6
		
		assertNotEquals(10, actual);

	}

	@Test
	void testMul() {
		
		System.out.println("mul() tested...");
		
		int actual = service.mul(3, 3);
				
		assertTrue(actual > 0);

	}

	@Test
	@Disabled
	void testDiv() {
		
		System.out.println("div() tested..");
		
		assertNotNull(service);

	}
	
	@AfterAll
	public static void afterAll() {
		
		System.out.println("afterAll() called..");
		
	}
	
	
	

}
