package com.ness.calsi;

import com.ness.calsi.service.CalculatorService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        CalculatorService service = new CalculatorService();
        
        System.out.println(service.add(5, 4));
        
        System.out.println(service.sub(10, 5));
        
        
    }
}
