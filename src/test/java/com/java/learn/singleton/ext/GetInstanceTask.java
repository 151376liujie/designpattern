package com.java.learn.singleton.ext;

import java.util.List;

public class GetInstanceTask implements Runnable {
	private List<MultiInstance> list;

	public GetInstanceTask(List<MultiInstance> list) {
		this.list = list;
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			MultiInstance instance = MultiInstance.getInstance();
			String name = Thread.currentThread().getName();
			for (int j = 0; j < list.size(); j++) {
				if (list.get(j).equals(instance)) {
					System.out.println("wow...");
					break;
				}
			}
			System.out.println(name + "--->" + instance);
		}
	}
}
