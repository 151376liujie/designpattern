package com.jonnyliu.proj.designpattern.builder;

public class BenZCar extends Car {

    @Override
    protected void start() {
	System.out.println("奔驰车开动了...");
    }

    @Override
    protected void stop() {
	System.out.println("奔驰车停止了...");
    }

    @Override
    protected void alarm() {
	System.out.println("奔驰车喇叭响了...");
    }

    @Override
    protected void engineBoom() {
	System.out.println("奔驰车引擎响了...");
    }

}
