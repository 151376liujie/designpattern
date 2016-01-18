package com.java.learn.builder;

import java.util.Arrays;

public class CarClient {

    /**
     * @param args
     */
    public static void main(String[] args) {
	CarBuilder carBuilder = new BWMCarBuilder();
	carBuilder.setSequence(Arrays.asList(new String[] { "alarm", "start",
		"engineBoom", "stop" }));
	Car car = carBuilder.getCar();
	car.run();
	System.out.println("--------------------------------");
	
	CarBuilder benZCar = new BenZCarBulider();
	benZCar.setSequence(Arrays.asList("start", "engineBoom", "stop"));
	Car benzCar = benZCar.getCar();
	benzCar.run();
    }

}
