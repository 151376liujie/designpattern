package com.java.learn.singleton;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

public class SingletonTest {

	@Test
	public void testSingleton() {
		List<Singleton> list = new ArrayList<Singleton>();
		for (int i = 0; i < 3; i++) {
			Singleton singleton = Singleton.getInstance();
			list.add(singleton);
		}
		Assert.assertFalse(list.isEmpty());
		Singleton singleton = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			Assert.assertEquals(singleton, list.get(i));
		}
	}

}
