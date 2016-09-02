package com.jonnyliu.proj.designpattern.builder;

import java.util.List;

public class BenZCarBulider extends CarBuilder {

    private BenZCar benZCar = new BenZCar();

    @Override
    protected void setSequence(List<String> sequences) {
	benZCar.setSequence(sequences);
    }

    @Override
    protected Car getCar() {
	return benZCar;
    }

}
