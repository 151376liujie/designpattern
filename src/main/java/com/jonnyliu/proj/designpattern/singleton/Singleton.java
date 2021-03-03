package com.jonnyliu.proj.designpattern.singleton;

/**
 * 单例模式
 *
 * @author Administrator
 *
 */
public class Singleton {

	private Singleton() {
	}

	public static Singleton getInstance() {
		return SingletonHolder.INSTANCE;
	}

	private static class SingletonHolder {
		private static final Singleton INSTANCE = new Singleton();
	}

}
