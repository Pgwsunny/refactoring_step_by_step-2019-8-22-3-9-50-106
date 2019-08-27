package com.tws.refactoring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class driverTest {
	public static Police police;
	@BeforeAll
	public static void init() {
		police = new Police();
	}
	@Test
    public void should_return_true_when_input_age_morethan_18() {
        //given   	
    	Driver driver = new Driver(19);  	 	
        //when
    	Boolean temp = police.checkDriver(driver);   
        //then
    	assertEquals(true, temp);
    }
	
	@Test
    public void should_return_false_when_input_age_lessthan_18() {
        //given
//    	Police police = new Police();
    	Driver driver = new Driver(17);  	 	
        //when
    	Boolean temp = police.checkDriver(driver);   
        //then
    	assertEquals(false, temp);
    }
}
