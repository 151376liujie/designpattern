package com.java.learn.builder;

import java.util.List;

public abstract class Car {
    
    private List<String> methodNameList;

    public final void setSequence(List<String> methodNameList) {
	this.methodNameList = methodNameList;
    }

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    public final void run() {
	for (String methodName : methodNameList) {
	    if (methodName.equalsIgnoreCase("start")) {
		start();
	    } else if (methodName.equalsIgnoreCase("stop")) {
		stop();
	    } else if (methodName.equalsIgnoreCase("alarm")) {
		alarm();
	    } else if (methodName.equalsIgnoreCase("engineBoom")) {
		engineBoom();
	    }
	}
    }

}
