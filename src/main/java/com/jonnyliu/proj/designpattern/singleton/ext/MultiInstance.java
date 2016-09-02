package com.jonnyliu.proj.designpattern.singleton.ext;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 单例模式扩展,多例模式
 * 
 * @author Administrator
 * 
 */
public class MultiInstance {
	private static final int instanceMaxSize = 3;
	private static final List<MultiInstance> instanceList = new ArrayList<MultiInstance>();
	static {
		for (int i = 0; i < instanceMaxSize; i++) {
			instanceList.add(new MultiInstance());
		}
	}

	public static MultiInstance getInstance() {
		int index = new Random().nextInt(instanceMaxSize);
		return instanceList.get(index);
	}

	public static List<MultiInstance> getList() {
		return instanceList;
	}
}
