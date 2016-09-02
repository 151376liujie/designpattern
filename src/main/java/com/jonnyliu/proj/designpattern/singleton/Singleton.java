package com.jonnyliu.proj.designpattern.singleton;

/**
 * 单例模式
 * 
 * @author Administrator
 * 
 */
public class Singleton {

	private static final Singleton instance = new Singleton();

	private Singleton() {

	}

	public static Singleton getInstance() {
		return instance;
	}

}
