package com.cg.demoone;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;


/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
	
	private static ICalculatorService service;
    
	@BeforeAll
	public static void setup() {
	    System.out.println("@BeforeAll - executes once before all test methods in this class");
	    service = new CalculatorServiceImpl();
	}
	 
	@BeforeEach
	public void init() {
	    System.out.println("@BeforeEach - executes before each test method in this class");
	}
	
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest()
    {
        
    }
    
    @Test
    public void testAddition() {
    	System.out.println("inside testAddition");
    	service = new CalculatorServiceImpl();
        assertEquals(10.0, service.addition(7, 3));
    }
    
    @Test
    public void testSubtraction() {
    	System.out.println("inside testSubtraction");
    	service = new CalculatorServiceImpl();
    	assertEquals(-4.0, service.subTraction(7, 3));
    }

    @Test
    public void testMultiplication() {
    	System.out.println("inside testMultiplication");
    	service = new CalculatorServiceImpl();
    	 assertEquals(21.0, service.mulTiplication(7, 3));
    }
    
    @Test
    public void testDivision() {
    	System.out.println("inside testDivision");
    	service = new CalculatorServiceImpl();
    	assertEquals(3.0, service.division(9, 3));
    }
    
    
    @AfterEach
    public void tearDown() {
        System.out.println("@AfterEach - executed after each test method.");
    }
     
    @AfterAll
    public static void done() {
        System.out.println("@AfterAll - executed after all test methods.");
        service = null;
    }
}
