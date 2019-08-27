package com.tws.refactoring;

public class Police {
	private static final int TEST = 18;
    public boolean checkDriver(Driver driver) {
        if(driver.getAge() >= TEST) return true;
        else return false;
    }
}
