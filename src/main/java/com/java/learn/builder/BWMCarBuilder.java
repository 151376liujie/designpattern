package com.java.learn.builder;

import java.util.List;

public class BWMCarBuilder extends CarBuilder {
    
    private BWMCar bwmCar = new BWMCar();
    
    public void setSequence(List<String> sequences) {
	bwmCar.setSequence(sequences);
    }
    
    public Car getCar() {
	return bwmCar;
    }

}
