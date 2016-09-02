package com.jonnyliu.proj.designpattern.singleton.ext;

import java.util.List;

import org.junit.Test;

public class MultiInstanceTest {

	@Test
	public void testGetMultiInstance() {
		for (int i = 0; i < 20; i++) {
			System.out.println(MultiInstance.getInstance());
		}
	}

	// 测试多线程情况下多例模式
	@Test
	public void testMultiThreadGetMultiInstance() {
		List<MultiInstance> list = MultiInstance.getList();
		Thread thread1 = new Thread(new GetInstanceTask(list));
		thread1.start();
		Thread thread2 = new Thread(new GetInstanceTask(list));
		thread2.start();
	}
}
