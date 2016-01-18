package com.java.learn.builder;

import java.util.List;

public abstract class CarBuilder {

    protected abstract void setSequence(List<String> sequences);

    protected abstract Car getCar();

}
