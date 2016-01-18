package com.java.learn.builder;

public class BWMCar extends Car {

    @Override
    protected void start() {
	System.out.println("宝马车开动了...");
    }

    @Override
    protected void stop() {
	System.out.println("宝马车停止了...");
    }

    @Override
    protected void alarm() {
	System.out.println("宝马车喇叭响了...");
    }

    @Override
    protected void engineBoom() {
	System.out.println("宝马车引擎响了...");
    }

}
